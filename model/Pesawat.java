package model;

public class Pesawat extends Kendaraan implements Kargoable {
    private boolean pesawatTempur;
    private int jumlahRoda;

    public Pesawat(String nama, int kapasitasOrang, boolean pesawatTempur, int jumlahRoda) {
        super(nama, BahanBakar.AVTUR, kapasitasOrang); // Bahan bakar selalu avtur
        this.pesawatTempur = pesawatTempur;
        this.jumlahRoda = jumlahRoda;
    }

    public boolean isPesawatTempur() {
        return pesawatTempur;
    }

    public int getJumlahRoda() {
        return jumlahRoda;
    }

    @Override
    public String getDetails() {
        return "Pesawat " + getNama() + ", kapasitas orang: " + getKapasitasOrang() + ", Jumlah Roda: " + jumlahRoda;
    }

    @Override
    public void loadKargo() {
        System.out.println("Pesawat " + getNama() + " memuat kargo di bagasi.");
    }

    @Override
    public void unloadKargo() {
        System.out.println("Pesawat " + getNama() + " menurunkan kargo.");
    }
}