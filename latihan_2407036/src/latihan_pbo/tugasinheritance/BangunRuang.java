package latihan_pbo.tugasinheritance;

public class BangunRuang extends BangunDatar {

    protected double tinggi;

    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }



    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }

    public double hitungVolume2() {
        return hitungVolume() * 2;
    }

    public void tampilkanInfoRuang() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Tinggi: " + tinggi);
    }
}