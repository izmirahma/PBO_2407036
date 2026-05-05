package latihan_pbo.tugas_13april;

public class PersegiPanjang extends BangunDatar {

    public PersegiPanjang(double varA, double varB) {
        super(varA, varB);
    }

    @Override
    public double hitungLuas() {
        return varA * varB;
    }

    @Override
    public void tampilkan() {
        System.out.println("Persegi Panjang");
        System.out.println("====================");
        System.out.println("Panjang: " + varA);
        System.out.println("Lebar: " + varB);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("====================");
    }
}