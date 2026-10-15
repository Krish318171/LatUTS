package view;

import model.Kendaraan;
import java.util.ArrayList;

public class KendaraanView {
    public void tampilkanMenu() {
        System.out.println("\n--- MENU KENDARAAN ---");
        System.out.println("1. Tambah kendaraan");
        System.out.println("2. Tampilkan semua kendaraan");
        System.out.println("3. Urutkan kendaraan berdasarkan kapasitas");
        System.out.println("0. Keluar");
        System.out.print("Pilihan: ");
    }

    public void tampilkanDaftar(ArrayList<Kendaraan> list) {
        System.out.println("\n--- Daftar Kendaraan ---");
        if (list.isEmpty()) {
            System.out.println("Belum ada kendaraan yang tersimpan.");
        } else {
            for (Kendaraan k : list) {
                System.out.println(k.getDetails()); // Polymorphism
            }
        }
    }

    public void cetakPesan(String pesan) {
        System.out.println("[INFO] " + pesan);
    }
}