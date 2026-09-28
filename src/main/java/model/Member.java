package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Member {
    private static final DateTimeFormatter FORMAT_TANGGAL =
            DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.of("id", "ID"));

    private final String idMember;
    private String nama;
    private int usia;
    private PaketGym paket;
    private final LocalDate tanggalDaftar;
    private LocalDate tanggalBerakhir;

    public Member(String idMember, String nama, int usia, PaketGym paket) {
        validasiId(idMember);
        setNama(nama);
        setUsia(usia);
        setPaket(paket);
        this.idMember = idMember.trim().toUpperCase();
        this.tanggalDaftar = LocalDate.now();
        hitungTanggalBerakhir();
    }

    private void validasiId(String idMember) {
        if (idMember == null || idMember.isBlank()) {
            throw new IllegalArgumentException("ID member tidak boleh kosong.");
        }
        if (!idMember.trim().toUpperCase().matches("GYM\\d{3,}")) {
            throw new IllegalArgumentException("Format ID harus seperti GYM001.");
        }
    }

    public String getIdMember() {
        return idMember;
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public PaketGym getPaket() {
        return paket;
    }

    public LocalDate getTanggalDaftar() {
        return tanggalDaftar;
    }

    public LocalDate getTanggalBerakhir() {
        return tanggalBerakhir;
    }

    public void setNama(String nama) {
        if (nama == null || nama.isBlank()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong.");
        }

        String namaBersih = nama.trim().replaceAll("\\s+", " ");
        if (namaBersih.length() < 3) {
            throw new IllegalArgumentException("Nama minimal 3 karakter.");
        }
        if (namaBersih.length() > 50) {
            throw new IllegalArgumentException("Nama maksimal 50 karakter.");
        }
        if (!namaBersih.matches("[a-zA-ZÀ-ÿ .'-]+")) {
            throw new IllegalArgumentException("Nama hanya boleh berisi huruf dan tanda baca nama yang umum.");
        }
        this.nama = namaBersih;
    }

    public void setUsia(int usia) {
        if (usia < 15 || usia > 100) {
            throw new IllegalArgumentException("Usia harus antara 15 sampai 100 tahun.");
        }
        this.usia = usia;
    }

    public void setPaket(PaketGym paket) {
        if (paket == null) {
            throw new IllegalArgumentException("Paket gym wajib dipilih.");
        }
        this.paket = paket;
        if (tanggalDaftar != null) {
            hitungTanggalBerakhir();
        }
    }

    private void hitungTanggalBerakhir() {
        if (paket == PaketGym.BULANAN) {
            tanggalBerakhir = tanggalDaftar.plusMonths(1);
        } else {
            tanggalBerakhir = tanggalDaftar.plusYears(1);
        }
    }

    public String getJenisMember() {
        return "Member";
    }

    public String getFasilitas() {
        return "Akses alat gym standar";
    }

    public int getBiaya() {
        return paket.getHarga();
    }

    public boolean isAktif() {
        return !LocalDate.now().isAfter(tanggalBerakhir);
    }

    public String getStatus() {
        return isAktif() ? "AKTIF" : "NONAKTIF";
    }

    public String getTanggalDaftarFormatted() {
        return tanggalDaftar.format(FORMAT_TANGGAL);
    }

    public String getTanggalBerakhirFormatted() {
        return tanggalBerakhir.format(FORMAT_TANGGAL);
    }

    public void tampilkanInfo() {
        System.out.println("-----------------------------------------------");
        System.out.println("ID Member       : " + getIdMember());
        System.out.println("Nama            : " + getNama());
        System.out.println("Usia            : " + getUsia() + " tahun");
        System.out.println("Jenis Member    : " + getJenisMember());
        System.out.println("Paket           : " + getPaket().getNama());
        System.out.println("Biaya           : Rp" + formatRupiah(getBiaya()));
        System.out.println("Tanggal Daftar  : " + getTanggalDaftarFormatted());
        System.out.println("Berlaku Sampai  : " + getTanggalBerakhirFormatted());
        System.out.println("Status          : " + getStatus());
        System.out.println("-----------------------------------------------");
    }

    private String formatRupiah(int angka) {
        return String.format("%,d", angka).replace(',', '.');
    }
}
