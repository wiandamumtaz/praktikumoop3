package main1;

import java.util.Scanner;

public class Kendaraan {
     String merk,warna;
        int tahunkeluaran;
    void masukkandatakendaraan(){
                
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan Data Kendaraan");
        
        System.out.println("Masukkan Merk Mobil :");
        merk = input.nextLine();
        System.out.println("Masukkan Warna Mobil :");
        warna = input.nextLine();
        System.out.println("Masukkan Tahun Keluaran :");
        tahunkeluaran = input.nextInt();
    }
    void keluaran (){
        System.out.print("");
        System.out.println("Merk : "+merk);
        System.out.println("Warna : "+warna);
        System.out.println("Tahun Keluaran : "+tahunkeluaran);
               
    }
    }

