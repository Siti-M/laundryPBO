/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

import java.util.Scanner;
import paket.*;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("JAYA LAUNDRY");
        System.out.print("Nama Pelanggan : ");
        String uname = input.nextLine();
        System.out.print("No Telp : ");
        String telp = input.nextLine();
        System.out.print("Berat Cucian (kg): ");
        int berat=input.nextInt();
        System.out.println("Menu :");
        System.out.println("1. Paket komplit");
        System.out.println("2. Setrika");
        System.out.print("Pilih : ");
        int kode= input.nextInt();
        switch(kode){
            case 1:
                
                komplit hitung =new  komplit();
                System.out.println("Kategori Cucian: ");
                System.out.println("1. Reguler (3 hari)");
                System.out.println("2. Express (1 hari)");
                System.out.print("Pilih Kategori  : ");
                int pilih = input.nextInt();
                if (pilih==1){
                    float total = hitung.reguler(berat);
                    System.out.println("Total : Rp" + total);
                    System.out.print("Bayar : Rp");
                    int bayar = input.nextInt();
                    bayar uang = new bayar();
                    System.out.println("Kembali : Rp" + uang.kembali(bayar,total));
                }
                else if(pilih==2){
                    System.out.println("Total : Rp" + hitung.ekspres(berat));
                    System.out.print("Bayar : Rp");
                    int bayar = input.nextInt();
                    bayar uang = new bayar();
                    System.out.println("Kembali : Rp" + uang.kembali(bayar,hitung.ekspres(berat)));
                }
                else 
                    System.out.println("Opsi tidak ada");
                break;
            case 2:
                    setrika baju= new setrika();
                    System.out.println("Biaya : Rp" + baju.paket2(berat));
                    System.out.print("Bayar : Rp");
                    int bayar = input.nextInt();
                    bayar uang = new bayar();
                    System.out.println("Kembali : Rp" + uang.kembali(bayar,baju.paket2(berat)));
                break;
            default:
                System.out.println("Opsi tidak tersedia");
                break;
        }
                
       
    }
    
}
