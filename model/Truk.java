package model;

public class Truk extends Kendaraan implements Kargoable {
    private int jumlahRoda;

    public Truk(String nama, int jumlahRoda) {
        super(nama, BahanBakar.DIESEL, 3); // Bahan bakar selalu diesel, kapasitas selalu 3
        this.jumlahRoda = jumlahRoda;
    }

    public int getJumlahRoda() {
        return jumlahRoda;
    }

    @Override
    public String getDetails() {
        return "Truk " + getNama() + ", kapasitas orang: " + getKapasitasOrang() + ", Jumlah Roda: " + jumlahRoda;
    }

    @Override
    public void loadKargo() {
        System.out.println("Truk " + getNama() + " sedang memuat kargo.");
    }

    @Override
    public void unloadKargo() {
        System.out.println("Truk " + getNama() + " sedang menurunkan kargo.");
    }
}