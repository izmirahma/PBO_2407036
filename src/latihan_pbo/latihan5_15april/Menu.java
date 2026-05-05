package latihan_pbo.latihan5_15april;

public class Menu {

    protected String nama;
    protected double harga;

    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public double hitungTotal() {
        return 0;
    }

    public void tampilkan() {
        System.out.println(nama + "=" + harga);
    }
}
