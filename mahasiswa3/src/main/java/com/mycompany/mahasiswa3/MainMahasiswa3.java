package com.mycompany.mahasiswa3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMahasiswa3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa3> dataMahasiswa = new ArrayList<>();
        ArrayList<Nilai3> dataNilai = new ArrayList<>();
        char jawab;

        Mahasiswa3.identitasKampus();
        Nilai3.komponenPenilaian();
        do {
            System.out.println("INPUT DATA MAHASASISWA");
            System.out.print("NPM               : ");
            String npm = input.nextLine();
            System.out.print("Nama              : ");
            String nama = input.nextLine();
            System.out.print("Kelas             : ");
            String kelas = input.nextLine();
            System.out.print("Prodi             : ");
            String prodi = input.nextLine();
            System.out.print("Semester          : ");
            int semester = input.nextInt();

            System.out.print("Nilai Tugas       : ");
            double tugas = input.nextDouble();
            System.out.print("Nilai UTS         : ");
            double uts = input.nextDouble();
            System.out.print("Nilai UAS         : ");
            double uas = input.nextDouble();
            System.out.print("Kehadiran (%)     : ");
            double hadir = input.nextDouble();
            input.nextLine();

            Mahasiswa3 mhs = new Mahasiswa3(npm, nama, kelas, prodi, semester);
            Nilai3 nilai = new Nilai3(tugas, uts, uas, hadir);
            dataMahasiswa.add(mhs);
            dataNilai.add(nilai);

            System.out.print("\nInput lagi (Y/T): ");
            jawab = input.nextLine().charAt(0);
            System.out.println();
        } while (jawab == 'Y' || jawab == 'y');

        System.out.println();
        System.out.println("=========== HASIL DATA ===========");
        for (int i = 0; i < dataMahasiswa.size(); i++) {
            System.out.println("----------------------------------------");
            dataMahasiswa.get(i).tampilMahasiswa();
            dataNilai.get(i).tampilNilai();
            System.out.println("----------------------------------------");
        }
    }
}