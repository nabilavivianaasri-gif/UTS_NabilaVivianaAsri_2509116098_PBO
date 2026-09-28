package model;

public enum PaketGym {
    BULANAN("Bulanan", 350000, "30 hari"),
    TAHUNAN("Tahunan", 3500000, "365 hari");

    private final String nama;
    private final int harga;
    private final String durasi;

    PaketGym(String nama, int harga, String durasi) {
        this.nama = nama;
        this.harga = harga;
        this.durasi = durasi;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getDurasi() {
        return durasi;
    }

    public static PaketGym dariPilihan(int pilihan) {
        switch (pilihan) {
            case 1:
                return BULANAN;
            case 2:
                return TAHUNAN;
            default:
                throw new IllegalArgumentException("Pilihan paket tidak tersedia.");
        }
    }
}
