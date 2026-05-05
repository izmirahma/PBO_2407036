import java.util.Scanner;

public class KalkulatorBangunDatar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BangunDatar bd = new BangunDatar();

        System.out.println("=== KALKULATOR BANGUN DATAR ===");

        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.print("Pilih (1-4): ");

        int pilih = input.nextInt();

        switch (pilih) {

            case 1:
                System.out.print("Masukkan sisi: ");
                double sisi = input.nextDouble();
                bd.hitungPersegi(sisi);
                break;

            case 2:
                System.out.print("Masukkan panjang: ");
                double p = input.nextDouble();

                System.out.print("Masukkan lebar: ");
                double l = input.nextDouble();

                bd.hitungPersegiPanjang(p, l);
                break;

            case 3:
                System.out.print("Masukkan alas: ");
                double a = input.nextDouble();

                System.out.print("Masukkan tinggi: ");
                double t = input.nextDouble();

                bd.hitungSegitiga(a, t);
                break;

            case 4:
                System.out.print("Masukkan jari-jari: ");
                double r = input.nextDouble();

                bd.hitungLingkaran(r);
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}

class BangunDatar {
    public void hitungPersegi(double sisi) {

        double luas = sisi * sisi;
        double keliling = 4 * sisi;

        tampilkanHasil("Persegi", luas, keliling);
    }

    public void hitungPersegiPanjang(double panjang, double lebar) {

        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        tampilkanHasil("Persegi Panjang", luas, keliling);
    }

    public void hitungSegitiga(double alas, double tinggi) {

        double luas = 0.5 * alas * tinggi;
        double keliling = 3 * alas;
        tampilkanHasil("Segitiga", luas, keliling);
    }

    public void hitungLingkaran(double r) {

        double luas = Math.PI * r * r;
        double keliling = 2 * Math.PI * r;
        tampilkanHasil("Lingkaran", luas, keliling);
    }

    protected void tampilkanHasil(String nama, double luas, double keliling) {

        System.out.println("\n=== HASIL ===");
        System.out.println("Bangun   : " + nama);
        System.out.println("Luas     : " + luas);
        System.out.println("Keliling : " + keliling);
    }
}