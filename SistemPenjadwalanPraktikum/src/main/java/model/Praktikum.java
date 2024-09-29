/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
