package Final;

public class Harga {
    public int Total;
    protected int jumlah, pilihan;
    static final String selamat = "         ~> [Token Listrik] <~";

    int hitungTotal (int jml) {
        int Harga;
        switch(pilihan) {
        case 0 :
            System.exit(0);
            break;
        case 1 :
            Harga = 22000;
            Total = Harga;
            break;
        case 2 :
            Harga = 27000;
            Total = Harga;
            break;
        case 3 :
            Harga = 52000;
            Total = Harga;
            break;
        case 4 :
            Harga = 101500;
            Total = Harga;
            break;
        case 5 :
            Harga = 251000;
            Total = Harga;
            break;
        case 6 :
            Harga = 500000;
            Total = Harga;
            break;
        case 9 :
            break;
        default :
            System.out.println("ERROR : Input yang anda masukkan salah !");
            break;
        }
        return Total;
    }
}