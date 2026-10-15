package model;

public abstract class Kendaraan implements Comparable<Kendaraan> {
    private String nama;
    private BahanBakar bahanBakar;
    private int kapasitasOrang;

    public Kendaraan(String nama, BahanBakar bahanBakar, int kapasitasOrang) {
        this.nama = nama;
        this.bahanBakar = bahanBakar;
        this.kapasitasOrang = kapasitasOrang;
    }

    public String getNama() {
        return nama;
    }

    public BahanBakar getBahanBakar() {
        return bahanBakar;
    }

    public int getKapasitasOrang() {
        return kapasitasOrang;
    }

    // Method dasar yang nanti di-override (Polymorphism)
    public String getDetails() {
        return "Nama: " + nama + ", kapasitas orang: " + kapasitasOrang;
    }

    // Untuk fitur sorting berdasarkan kapasitas (Menu 3)
    @Override
    public int compareTo(Kendaraan o) {
        return Integer.compare(this.kapasitasOrang, o.kapasitasOrang);
    }
}