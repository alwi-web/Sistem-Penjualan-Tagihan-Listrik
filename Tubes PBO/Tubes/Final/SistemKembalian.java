package Final;

import java.util.Scanner;

public class SistemKembalian extends Harga{
    void viewTotal() {
        boolean ulang = true;
        int uangmasuk, jumlah;
        Scanner input = new Scanner(System.in);
        while(ulang){
            System.out.println("|=========[ PEMBAYARAN ]=========|");
            System.out.println("Total : Rp." + Total);
            System.out.print("Total Uang yang Dibayar: Rp ");
            uangmasuk = input.nextInt();
            jumlah = uangmasuk - Total;
            if(uangmasuk>= Total){
                ulang = false;
                System.out.println("Kembali Rp "+jumlah);
            }else if(uangmasuk< Total){
                System.out.println("Maaf, Uang yang Dibayar Masih Kurang ...");
                System.out.println("Kekurangan Sebesar Rp "+Math.abs(jumlah));
            }
        }    
    }
}
