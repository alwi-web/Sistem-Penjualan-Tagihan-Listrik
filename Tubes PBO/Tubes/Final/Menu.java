package Final;

import java.util.*;
public class Menu extends SistemKembalian{
    Scanner input =  new Scanner(System.in);
    private String nomerHp;

    private void SetNomerHp(String angka){
        this.nomerHp = angka;
    }

    private String GetNomerHp(){
        return this.nomerHp;
    }

    public void menu() {
        System.out.println(Harga.selamat);
        do {
            System.out.println("| ========= Token ========  | ===== Harga ===== |");
            System.out.println("| 1.Voucher 20.000          | Rp.22.000         |");
            System.out.println("| 2.Voucher 25.000          | Rp.27.000         |");
            System.out.println("| 3.Voucher 50.000          | Rp.52.000         |");
            System.out.println("| 4.Voucher 100.000         | Rp.101.500        |");
            System.out.println("| 5.Voucher 250.000         | Rp.251.000        |");
            System.out.println("| 6.Voucher 500.000         | Rp.501.000        |");
            System.out.println("|===============================================|");
            System.out.println("| 9.Selesai                                     |");
            System.out.println("| 0.Keluar Program                              |");
            System.out.println("|===============================================|");
            System.out.print("Masukkan Pilihan  : ");
            pilihan = input.nextInt();
            hitungTotal(jumlah);
        }while(pilihan != 9);

        viewTotal();
        
    }

    public void inputDataDiri(){
        Scanner input = new Scanner(System.in);
        String pembeliNama, pembeliNoPelanggan, pembeliNoTelp;
        System.out.println();
        System.out.println("Selamat Datang");
        System.out.println("Silahkan isi data dibawah ini");
        System.out.print("Nama: ");
        pembeliNama = input.nextLine();
        System.out.print("NoPelanggan: ");
        pembeliNoPelanggan = input.nextLine();
        System.out.print("Nomor Telepon: ");
        pembeliNoTelp = input.nextLine();
        SetNomerHp(pembeliNoTelp);        
        System.out.println();
        System.out.println("Data Diri");
        System.out.println("Nama : " + pembeliNama);
        System.out.println("NoPelanggan : " + pembeliNoPelanggan);
        System.out.println("Nomor Telepon : " + GetNomerHp());
    }
}


