public class Main {
    public static void main(String[] args) {
        System.out.println("SERVICE MOTOR JAYA");
        Pelanggan pl = new Pelanggan();
        pl.getNama();
        pl.getNo_hp();
        pl.pengecekan();


        Motor mtr = new Motor();
        mtr.jenis();
        mtr.harga();
        pl.display();
        mtr.display();



    }
}