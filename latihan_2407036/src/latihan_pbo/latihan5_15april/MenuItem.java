package latihan_pbo.latihan5_15april;

public class MenuItem extends Menu {

    private int jumlah;

    public MenuItem(String nama, double harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    public double hitungTotal() {
        return harga * jumlah;
    }

    public void tampilkanRingkas() {
        System.out.println(nama + " = " + harga + "*" + jumlah + " = " + hitungTotal());
    }
}