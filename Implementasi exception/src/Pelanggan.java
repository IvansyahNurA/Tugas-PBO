
import java.io.File;
import java.io.IOException;
//import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Pelanggan implements Validasi{
    public String nama;
    public String no_hp;
    String cek;

     public void display(){
        System.out.println("Nama pelanggan           : "+nama);
        System.out.println("No.HP                    : "+no_hp);
        System.out.println("Membawa STNK             : "+cek);
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

    public void testing(){
        try{
            File file = new File("output.txt");
            PrintWriter inp = new PrintWriter(file);
            inp.println("Nama          : "+nama);
            inp.println("No Hp         : "+no_hp);
            inp.println("STNK          : "+cek);
            inp.close();
        }catch(Exception e){
            System.err.println(e);
        }

        try {
            System.out.println("Read File");
            File open = new File("E:\\output.txt");
            Scanner scan = new Scanner(open);
            while (scan.hasNextLine()){
                String getDataString = scan.nextLine();
                System.out.println(getDataString);
            }scan.close();
        }catch (Exception e){
            System.err.println(e);
        }
    }


}
