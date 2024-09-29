/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
