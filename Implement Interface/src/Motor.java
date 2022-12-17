import java.util.Scanner;
public class Motor extends Service {
    public String jns;
    public String hrg;

    public void display(){
        System.out.println("Service Motor  : "+jns);
        System.out.println("Total harga Service motor : "+hrg);
    }
    @Override
    public void jenis(){
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
