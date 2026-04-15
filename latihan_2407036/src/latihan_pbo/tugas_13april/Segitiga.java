package latihan_pbo.tugas_13april;

public class Segitiga extends BangunDatar {

    public Segitiga(double varA, double varB) {
        super(varA, varB);
    }

    @Override
    public double hitungLuas() {
        return 0.5 * varA * varB;
    }

    @Override
    public void tampilkan() {
        System.out.println("Segitiga");
        System.out.println("====================");
        System.out.println("Alas: " + varA);
        System.out.println("Tinggi: " + varB);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("====================");
    }
}