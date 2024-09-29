# MiniProject1_PBO

Deskripsi Program
Program Sistem Penjadwalan Praktikum Kelas B digunakan untuk mengelola penjadwalan praktikum. ini memiliki fitur CRUD (Create, Read, Update, Delete) untuk mempermudah pengelolaan data jadwal praktikum.

package main program
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

package model dengan class praktikum

package model;

/**
 *
 * @author MyBook Hype AMD
 */
public class Praktikum {

    private String kodePraktikum;
    private String namaPraktikum;
    private String jadwal;

    // Constructor
    public Praktikum(String kodePraktikum, String namaPraktikum, String jadwal) {
        this.kodePraktikum = kodePraktikum;
        this.namaPraktikum = namaPraktikum;
        this.jadwal = jadwal;
    }

    // Getter dan Setter
    public String getKodePraktikum() {
        return kodePraktikum;
    }

    public void setKodePraktikum(String kodePraktikum) {
        this.kodePraktikum = kodePraktikum;
    }

    public String getNamaPraktikum() {
        return namaPraktikum;
    }

    public void setNamaPraktikum(String namaPraktikum) {
        this.namaPraktikum = namaPraktikum;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    // Method menampilkan informasi praktikum
    public void displayInfo() {
        System.out.println("Kode Praktikum: " + kodePraktikum);
        System.out.println("Nama Praktikum: " + namaPraktikum);
        System.out.println("Jadwal Praktikum: " + jadwal);
    }  
}

package service dengan class penjadwalan

package service;
import model.Praktikum;
import java.util.ArrayList;

/**
 *
 * @author MyBook Hype AMD
 */
public class PenjadwalanService {
    private static ArrayList<Praktikum> daftarPraktikum = new ArrayList<>();

    // Method untuk menambah praktikum
    public static void tambahPraktikum(Praktikum praktikum) {
        daftarPraktikum.add(praktikum);
        System.out.println("Praktikum berhasil ditambahkan!");
    }

    // Method untuk menampilkan semua praktikum
    public static void tampilkanPraktikum() {
        System.out.println("\nDaftar Praktikum:");
        for (Praktikum praktikum : daftarPraktikum) {
            praktikum.displayInfo();
            System.out.println("------------------------");
        }
    }

    // Method untuk menghapus praktikum berdasarkan kode
    public static void hapusPraktikum(String kodePraktikum) {
        for (Praktikum praktikum : daftarPraktikum) {
            if (praktikum.getKodePraktikum().equals(kodePraktikum)) {
                daftarPraktikum.remove(praktikum);
                System.out.println("Praktikum dengan kode " + kodePraktikum + " berhasil dihapus!");
                return;
            }
        }
        System.out.println("Praktikum tidak ditemukan!");
    }

    // Method untuk mengubah jadwal praktikum
    public static void ubahJadwalPraktikum(String kodePraktikum, String jadwalBaru) {
        for (Praktikum praktikum : daftarPraktikum) {
            if (praktikum.getKodePraktikum().equals(kodePraktikum)) {
                praktikum.setJadwal(jadwalBaru);
                System.out.println("Jadwal praktikum berhasil diubah!");
                return;
            }
        }
        System.out.println("Praktikum tidak ditemukan!");
    } 
}







