/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.latihanukl_erfano;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;

public class LatihanUkl_Erfano {

    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.println("No 1 soal mudah");

        double jarak, berat, panjang, lebar, tinggi, volume;
        System.out.println("Masukkan jarak tempuh(km): ");
        jarak = inputan.nextDouble();
        System.out.println("Masukkan berat paket(kg): ");
        berat = inputan.nextDouble();
        System.out.println("Masukkan panjang paket(cm): ");
        panjang = inputan.nextDouble();
        System.out.println("Masukkan lebar paket(cm): ");
        lebar = inputan.nextDouble();
        System.out.println("Masukkan tinggi paket(cm): ");
        tinggi = inputan.nextDouble();
        volume = (panjang * lebar * tinggi);
        System.out.println("Hasil Volume: " + volume);

        double hargaperKg = 0;
        if (jarak <= 10) {
            hargaperKg = 4250;
        } else {
            hargaperKg = 6000;
        }

        double totalBiaya;
        totalBiaya = (berat * hargaperKg);
        if (volume > 100) {
            totalBiaya = (totalBiaya + 50000);
        }

        System.out.println("Total biaya pengiriman: Rp" + (int) totalBiaya);

        System.out.println("No 2  soal mudah");

        int bilangan1;
        System.out.println("Masukkan Bilangan : ");
        bilangan1 = inputan.nextInt();

        if (bilangan1 % 2 == 0) {
            System.out.println("Bilangan Genap : ");
            System.out.println("Bilangan ini bisa dibagi 2");
        } else {
            System.out.println("Bilangan Ganjil");
            System.out.println("Bilangan ini tidak bisa " + "dibagi 2");
            System.out.println("Karena hasil bagi sisa 1");
        }

        System.out.println("No 1 soal sedang");
        System.out.println("Masukkan bilangan positif :");
        int n = inputan.nextInt();
        int faktorial = 1;
        for (int i = 1; i <= n; i++) {
            faktorial = faktorial * i;
        }
        System.out.println("Hasil faktorial dari " + n + " adalah: " + faktorial);

        System.out.println("No 2 soal sedang");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jari -jari tabung (cm):");
        double jari = input.nextDouble();
        System.out.print("Masukkan tinggi tabung (cm): ");
        double tinggiT = input.nextDouble();
        double volumeT = hitungVolume(jari, tinggiT);
        System.out.println("Volume tabung adalah: " + volumeT + " cm³");

        System.out.println("No 1 soal sulit");
        System.out.println("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        double totalNilai = 0;

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }

        double rataRata = totalNilai / jumlahSiswa;

        System.out.println("Nilai rata-rata seluruh siswa adalah: " + rataRata);

        System.out.println("No 2 Soal sulit");

        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();
        int[][] A = new int[baris][kolom];
        int[][] B = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];
        System.out.println("Masukkan elemen-elemen Matriks A:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = input.nextInt();
            }
        }
        System.out.println("Masukkan elemen-elemen Matriks B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Hasil penjumlahan matriks A + B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + " ");
            }

        }
    }

    static double hitungVolume(double jari, double tinggiT) {
        double volume = 3.14 * jari * jari * tinggiT;
        return volume;
    }

}
    