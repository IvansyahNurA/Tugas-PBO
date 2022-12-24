import java.util.Scanner;
public class Motor extends Service {
    public String jns;
    public String hrg;

    public void display(){
        System.out.println("Service Motor             : "+jns);
        System.out.println("Total harga Service motor : "+hrg);
    }
    @Override
    public void jenis(){
        System.out.println("------------------------");
        System.out.println("|Pilihan Service Motor |");
        System.out.println("|1. Ganti Oli          |");
        System.out.println("|2. Ganti Kampas Rem   |");
        System.out.println("|3. Periksa Minyak Rem |");
        System.out.println("|4. Periksa Suspensi   |");
        System.out.println("|5. Periksa Ban        |");
        System.out.println("------------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jenis Service yang diinginkan : ");
        jns = input.nextLine();

    }

    @Override
    public void harga(){
        Scanner input = new Scanner(System.in);
        System.out.println("Harga total service motor : ");
        hrg = input.nextLine();
    }

}
