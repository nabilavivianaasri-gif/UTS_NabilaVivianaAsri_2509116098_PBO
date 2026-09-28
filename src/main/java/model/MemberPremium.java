package model;

public class MemberPremium extends Member {
    private final int biayaTambahan = 500000;

    public MemberPremium(String idMember, String nama, int usia, PaketGym paket) {
        super(idMember, nama, usia, paket);
    }

    public int getBiayaTambahan() {
        return biayaTambahan;
    }

    @Override
    public String getJenisMember() {
        return "Premium";
    }

    @Override
    public String getFasilitas() {
        return "Akses gym 24 jam + semua alat/zona eksklusif\n"
                + "Personal trainer (beberapa sesi gratis per bulan)\n"
                + "Konsultasi & program latihan dan nutrisi personal\n"
                + "Akses ke semua cabang (multi-branch)\n"
                + "Fasilitas tambahan: sauna & kolam renang\n"
                + "Loker pribadi dengan kunci";
    }

    @Override
    public int getBiaya() {
        return super.getBiaya() + getBiayaTambahan();
    }
}
