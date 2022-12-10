
import java.util.Scanner;


public class Pelanggan {
    public String nama;
    public int no_hp;

    public void display(){
        System.out.println("Nama pelanggan : "+getNama());
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

    public int getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(int no_hp) {
        this.no_hp = no_hp;
    }
}
