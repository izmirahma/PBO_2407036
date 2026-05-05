package latihan_pbo.tugas3;


public class Minuman extends Menu {
    private String ukuran;

    public Minuman(String nama, double harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }

    @Override
    public void detailMenu() {
        System.out.println(getNama() + " (Minuman - " + ukuran + ") - " + getHarga());
    }
}
