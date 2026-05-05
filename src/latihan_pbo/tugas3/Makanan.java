package latihan_pbo.tugas3;


public class Makanan extends Menu {
    private String jenis;

    public Makanan(String nama, double harga, String jenis) {
        super(nama, harga);
        this.jenis = jenis;
    }

    @Override
    public void detailMenu() {
        System.out.println(getNama() + " (Makanan - " + jenis + ") - " + getHarga());
    }
}