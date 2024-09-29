/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistempenjadwalanpraktikum;

import model.Praktikum;
import service.PenjadwalanService;
import java.util.Scanner;
/**
 *
 * @author MyBook Hype AMD
 */
public class SistemPenjadwalanPraktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        
         do {
            System.out.println("\nSistem Penjadwalan Praktikum Kelas B");
            System.out.println("1. Tambah Praktikum");
            System.out.println("2. Lihat Daftar Praktikum");
            System.out.println("3. Hapus Praktikum");
            System.out.println("4. Ubah Jadwal Praktikum");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();  // Membaca newline

            switch (pilihan) {
                case 1:
                    // Tambah Praktikum
                    System.out.print("Masukkan kode praktikum: ");
                    String kode = scanner.nextLine();
                    System.out.print("Masukkan nama praktikum: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan jadwal praktikum: ");
                    String jadwal = scanner.nextLine();
                    Praktikum praktikumBaru = new Praktikum(kode, nama, jadwal);
                    PenjadwalanService.tambahPraktikum(praktikumBaru);
                    break;

                case 2:
                    // Tampilkan semua praktikum
                    PenjadwalanService.tampilkanPraktikum();
                    break;

                case 3:
                    // Hapus praktikum
                    System.out.print("Masukkan kode praktikum yang ingin dihapus: ");
                    String kodeHapus = scanner.nextLine();
                    PenjadwalanService.hapusPraktikum(kodeHapus);
                    break;

                case 4:
                    // Ubah jadwal praktikum
                    System.out.print("Masukkan kode praktikum yang ingin diubah: ");
                    String kodeUbah = scanner.nextLine();
                    System.out.print("Masukkan jadwal baru: ");
                    String jadwalBaru = scanner.nextLine();
                    PenjadwalanService.ubahJadwalPraktikum(kodeUbah, jadwalBaru);
                    break;

                case 5:
                    System.out.println("Keluar dari sistem...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 5);
       
    }
}
