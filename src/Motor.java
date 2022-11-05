public class Motor extands Mesin {
    protected String nama;
    protected int plat_nomor;
    protected int cc;

    public Motor(String nama, int plat_nomor, int cc) {
        this.nama = nama;
        this.plat_nomor = plat_nomor;
        this.cc = cc;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPlat_nomor() {
        return plat_nomor;
    }

    public void setPlat_nomor(int plat_nomor) {
        this.plat_nomor = plat_nomor;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
}
