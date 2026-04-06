package latihan_pbo.tugasinheritance;

public class Main {
    public static void main(String[] args) {

        // sesuai soal:
        double panjang = 10;
        double lebar = 5;
        double tinggi = 4;

        BangunRuang br = new BangunRuang(panjang, lebar, tinggi);

        System.out.println("Luas Alas: " + br.hitungLuas());
        System.out.println("Volume: " + br.hitungVolume());
    }
}