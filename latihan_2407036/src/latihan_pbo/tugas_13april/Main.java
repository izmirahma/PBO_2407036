package latihan_pbo.tugas_13april;

public class Main {
    public static void main(String[] args) {

        BangunDatar[] bd = new BangunDatar[3];

        bd[0] = new Persegi(5);
        bd[1] = new PersegiPanjang(10, 4);
        bd[2] = new Segitiga(6, 3);

        for (BangunDatar b : bd) {
            b.tampilkan();
        }
    }
}
