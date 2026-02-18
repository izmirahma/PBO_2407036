package latihan_pbo.latihan3;

class PersegiPanjang {
    private int panjang;
    private int lebar;

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    // Method untuk menghitung luas
    public int getLuas() {
        return panjang * lebar;
    }

    // Method untuk menghitung keliling
    public int getKeliling() {
        return 2 * (panjang + lebar);
    }
}

public class main {
    public static void main(String[] args) {
        PersegiPanjang p = new PersegiPanjang();
        p.setPanjang(9);
        p.setLebar(10);

        System.out.println("Panjang: " + p.getPanjang());
        System.out.println("Lebar: " + p.getLebar());
        System.out.println("Luas: " + p.getLuas());
        System.out.println("Keliling: " + p.getKeliling());
    }
}