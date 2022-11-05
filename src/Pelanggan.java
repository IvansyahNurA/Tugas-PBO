public class Pelanggan {
    protected String nama;
    protected int no_hp;

    public Pelanggan(String nama, int no_hp) {
        this.nama = nama;
        this.no_hp = no_hp;
    }

    public String getNama() {
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
