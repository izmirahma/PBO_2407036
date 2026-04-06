package latihan_pbo.tugasinheritance;

public class BangunRuang extends BangunDatar {

    private double tinggi;

    // constructor
    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar); // ambil dari BangunDatar
        this.tinggi = tinggi;
    }

    // method hitung volume
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }
}
