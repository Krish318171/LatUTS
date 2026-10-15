package model;

public class Mobil extends Kendaraan {
    private int jumlahRoda = 4;

    public Mobil(String nama, BahanBakar bahanBakar, int kapasitasOrang) {
        super(nama, bahanBakar, kapasitasOrang);
    }

    public int getJumlahRoda() {
        return jumlahRoda;
    }

    @Override
    public String getDetails() {
        return "Mobil " + getNama() + ", kapasitas orang: " + getKapasitasOrang() + ", Jumlah Roda: " + jumlahRoda;
    }
}