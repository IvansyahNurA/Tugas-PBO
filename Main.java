import java.util.Scanner;

// ini merupakan comment pada java
/* ini merupakan comment multi pada java */
public class Main {
    public static void main(String[] args) {
        String nama;
        System.out.println("Masukkan nama : ");
        Scanner input = new Scanner(System.in);
        nama = input.next();

        System.out.println("Nama : "+ nama);

        int[] angka = new int[5];
        angka[0] = 1;
        angka[1] = 2;
        angka[2] = 3;
        angka[3] = 4;
        angka[4] = 5;
        System.out.print(angka[0]);
        System.out.print(angka[1]);
        System.out.print(angka[2]);
        System.out.print(angka[3]);
        System.out.print(angka[4]);

        System.out.println();
        for(int i = 1; i <= 5; i++){
            System.out.print(i);
        }

        System.out.println();
        int j = 1;
        while(j <= 5){
            System.out.print(j);
            j++;
        }
        System.out.println();
        int h = 1;
        do{
            System.out.print(h);
            h++;
        }while(h <= 5);
        System.out.println();
        String[][]huruf = {
                {"A","B","C"},
                {"D","E","F"},
                {"G","H","I"},
        };

        // Menampilkan isi array dengan perulangan
        for (int z=0;z<3;z++){
            for (int x=0;x<3;x++){
                System.out.print(huruf[z][x]+" ");
            }
            System.out.println();
        }
        int e;
        e = input.nextInt();

        if(e > 1){
            System.out.println("2 lebih besar dari 1");
        }else{
            System.out.println("1 lebih kecil dari 2");
        }
    }
}