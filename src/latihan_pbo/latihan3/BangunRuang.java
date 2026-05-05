package latihan_pbo.latihan3;

public class BangunRuang {
        //encapsulasi
    private double sisi;
    private double panjang;
    protected double lebar;
    protected double tinggi;
    public int alas;

    //setter
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }
}
