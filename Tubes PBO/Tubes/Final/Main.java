package Final; 
import java.util.Scanner;

import Final.Menu;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulang = true;
        boolean ulang2 = true;
        char pilihan = 'Y';
        Menu tampilan = new Menu();
        System.out.println("Kelompok    : Kelompok 8");
        System.out.println("Program     : UAS - Penjualan Tagihan Listrik");
        System.out.println("Update      : 13 Desember 2022");
        while(ulang){
            System.out.println();
            tampilan.inputDataDiri();
            tampilan.menu();
            ulang = true;
            ulang2 = true;
            while(ulang2){
                System.out.println("Apakah anda ingin kembali ke menu sebelumnya?");
                System.out.print("Silahkan tekan [Y]kembali atau [T]keluar : ");
                pilihan = input.next().charAt(0);
                if (pilihan == 'Y'){
                    ulang2 = false;
                    break;
                } else if (pilihan == 'T'){
                    System.exit(0);
                } else {
                    System.out.println("Pilihan yang anda masukkan salah");
                }
            }
        }
    }
}


