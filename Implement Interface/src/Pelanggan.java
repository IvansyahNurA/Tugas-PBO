
import java.util.Scanner;


public class Pelanggan implements Validasi{
    public String nama;
    public String no_hp;
    String cek;

     public void display(){
        System.out.println("Nama pelanggan : "+nama);
        System.out.println("No.HP          : "+no_hp);
        System.out.println("Membawa STNK   : "+cek);
    }

    public Pelanggan() {
        this.nama = nama;
        this.no_hp = no_hp;
    }

    public String getNama() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama pelanggan : ");
        nama = input.nextLine();
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNo_hp() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nomor hp : ");
        no_hp = input.nextLine();
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    @Override
    public void pengecekan(){
         Scanner input = new Scanner(System.in);
         System.out.println("Apakah membawa STNK : ");
         cek = input.nextLine();
    }
}
