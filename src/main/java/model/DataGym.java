package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DataGym {
    private final ArrayList<Member> daftarMember;
    private int nomorBerikutnya;

    public DataGym() {
        daftarMember = new ArrayList<>();
        nomorBerikutnya = 1;
        isiDummyData();
    }

    private void isiDummyData() {
        daftarMember.add(new MemberReguler("GYM001", "Alya Putri", 21, PaketGym.BULANAN));
        daftarMember.add(new MemberPremium("GYM002", "Raka Pratama", 23, PaketGym.TAHUNAN));
        nomorBerikutnya = 3;
    }

    public boolean kosong() {
        return daftarMember.isEmpty();
    }

    public int jumlahMember() {
        return daftarMember.size();
    }

    public int jumlahMemberAktif() {
        int jumlah = 0;
        for (Member member : daftarMember) {
            if (member.isAktif()) {
                jumlah++;
            }
        }
        return jumlah;
    }

    public int jumlahJenis(String jenis) {
        int jumlah = 0;
        for (Member member : daftarMember) {
            if (member.getJenisMember().equalsIgnoreCase(jenis)) {
                jumlah++;
            }
        }
        return jumlah;
    }

    public int jumlahPaket(PaketGym paket) {
        int jumlah = 0;
        for (Member member : daftarMember) {
            if (member.getPaket() == paket) {
                jumlah++;
            }
        }
        return jumlah;
    }

    public long totalNilaiPaket() {
        long total = 0;
        for (Member member : daftarMember) {
            total += member.getBiaya();
        }
        return total;
    }

    public Member tambahMember(String nama, int usia, PaketGym paket, int jenisMember) {
        String id = String.format("GYM%03d", nomorBerikutnya);
        Member member;

        if (jenisMember == 1) {
            member = new MemberReguler(id, nama, usia, paket);
        } else if (jenisMember == 2) {
            member = new MemberPremium(id, nama, usia, paket);
        } else {
            throw new IllegalArgumentException("Jenis member tidak tersedia.");
        }

        daftarMember.add(member);
        nomorBerikutnya++;
        return member;
    }

    public ArrayList<Member> getDaftarMember() {
        return new ArrayList<>(daftarMember);
    }

    public Member cariMember(String id) {
        String idDicari = id == null ? "" : id.trim().toUpperCase();
        for (Member member : daftarMember) {
            if (member.getIdMember().equals(idDicari)) {
                return member;
            }
        }
        return null;
    }

    public ArrayList<Member> cariBerdasarkanNama(String nama) {
        String kataKunci = nama == null ? "" : nama.trim().toLowerCase();
        ArrayList<Member> hasil = new ArrayList<>();

        for (Member member : daftarMember) {
            if (member.getNama().toLowerCase().contains(kataKunci)) {
                hasil.add(member);
            }
        }
        return hasil;
    }

    public boolean updateMember(String id, String nama, int usia, PaketGym paket, int jenisMember) {
        Member memberLama = cariMember(id);
        if (memberLama == null) {
            return false;
        }

        Member memberBaru;
        if (jenisMember == 1) {
            memberBaru = new MemberReguler(id, nama, usia, paket);
        } else if (jenisMember == 2) {
            memberBaru = new MemberPremium(id, nama, usia, paket);
        } else {
            throw new IllegalArgumentException("Jenis member tidak tersedia.");
        }

        int index = daftarMember.indexOf(memberLama);
        daftarMember.set(index, memberBaru);
        return true;
    }

    public boolean hapusMember(String id) {
        Member member = cariMember(id);
        if (member == null) {
            return false;
        }
        daftarMember.remove(member);
        return true;
    }

    public ArrayList<Member> urutkanNama() {
        ArrayList<Member> hasil = new ArrayList<>(daftarMember);
        hasil.sort(Comparator.comparing(Member::getNama, String.CASE_INSENSITIVE_ORDER));
        return hasil;
    }
}
