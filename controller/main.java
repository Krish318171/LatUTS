package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import model.*;
import view.KendaraanView;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();
        KendaraanView view = new KendaraanView();

        // Data dummy pengujian awal sesuai soal (parameter ditulis berurutan tanpa nama atribut)
        daftarKendaraan.add(new Mobil("CRV", BahanBakar.BENSIN, 5));
        daftarKendaraan.add(new Mobil("Fortuner", BahanBakar.BENSIN, 5));
        daftarKendaraan.add(new Truk("Sampah", 10));
        daftarKendaraan.add(new Pesawat("SU57", 1, true, 4));
        daftarKendaraan.add(new Pesawat("A380", 300, false, 22));
        daftarKendaraan.add(new Helikopter("Apache", 2, 8));

        int pilihan = -1;
        while (pilihan != 0) {
            view.tampilkanMenu();
            try {
                pilihan = scanner.nextInt();
                scanner.nextLine(); // clear buffer

                switch (pilihan) {
                    case 1:
                        view.cetakPesan("Tambah Mobil Baru:");
                        System.out.print("Masukkan nama mobil: ");
                        String namaMobil = scanner.nextLine();
                        System.out.print("Masukkan kapasitas orang: ");
                        int kapMobil = scanner.nextInt();
                        scanner.nextLine(); // clear buffer
                        
                        daftarKendaraan.add(new Mobil(namaMobil, BahanBakar.BENSIN, kapMobil));
                        view.cetakPesan("Mobil berhasil ditambahkan!");
                        break;

                    case 2:
                        view.tampilkanDaftar(daftarKendaraan);
                        break;

                    case 3:
                        Collections.sort(daftarKendaraan);
                        view.cetakPesan("Kendaraan berhasil diurutkan berdasarkan kapasitas!");
                        view.tampilkanDaftar(daftarKendaraan);
                        break;

                    case 0:
                        view.cetakPesan("Program selesai. Semoga sukses UTS-nya!");
                        break;

                    default:
                        view.cetakPesan("Pilihan tidak valid, silakan coba lagi.");
                }
            } catch (Exception e) {
                view.cetakPesan("Terjadi kesalahan input: " + e.getMessage());
                scanner.nextLine(); // clear invalid input
                pilihan = -1;
            }
        }
        scanner.close();
    }
}