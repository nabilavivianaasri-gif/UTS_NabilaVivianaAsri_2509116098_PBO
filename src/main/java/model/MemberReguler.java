package model;

public class MemberReguler extends Member {
    public MemberReguler(String idMember, String nama, int usia, PaketGym paket) {
        super(idMember, nama, usia, paket);
    }

    @Override
    public String getJenisMember() {
        return "Standar";
    }

    @Override
    public String getFasilitas() {
        return "Akses alat gym (cardio & beban) pada jam operasional reguler\n"
                + "Loker harian (tanpa kunci pribadi)\n"
                + "Akses hanya di 1 cabang tempat daftar\n"
                + "Kamar mandi & shower standar";
    }
}
