public class BangunDatar {

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