package model;

public class Helikopter extends Kendaraan {
    private int jumlahBalingBaling;

    public Helikopter(String nama, int kapasitasOrang, int jumlahBalingBaling) {
        super(nama, BahanBakar.AVTUR, kapasitasOrang); // Bahan bakar selalu avtur
        this.jumlahBalingBaling = jumlahBalingBaling;
    }

    public int getJumlahBalingBaling() {
        return jumlahBalingBaling;
    }

    @Override
    public String getDetails() {
        return "Helikopter " + getNama() + ", kapasitas orang: " + getKapasitasOrang() + ", Jumlah Baling-Baling: " + jumlahBalingBaling;
    }
}