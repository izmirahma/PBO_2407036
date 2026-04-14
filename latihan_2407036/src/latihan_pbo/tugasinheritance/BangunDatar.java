package latihan_pbo.tugasinheritance;

public class BangunDatar {

    protected double panjang;
    protected double lebar;

    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }
}