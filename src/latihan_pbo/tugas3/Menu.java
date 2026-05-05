package latihan_pbo.tugas3;


public class Menu {
    private String nama;
    private double harga;

    // Constructor
    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    // Setter (Overloading)
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method yang akan dioverride
    public void detailMenu() {
        System.out.println(nama + " - " + harga);
    }
}
