import java.util.*;

class Cafe {
    String nama;
    int espresso; // dalam ml
    int susu;     // dalam ml
    int foam;     // dalam ml

    void mix() {

        System.out.println("\n=== HASIL RACIKAN ===");

        // Kondisi khusus berdasarkan takaran asli café
        if (espresso == 30 && susu == 60 && foam == 15) {
            nama = "Moccachino";
        }
        else if (espresso == 30 && susu == 90 && foam == 10) {
            nama = "Latte";
        }
        else if (espresso == 30 && susu == 30 && foam == 30) {
            nama = "Cappuccino";
        }

        // Perbandingan kekuatan kopi
        else if (espresso > susu) {
            nama = "Strong Coffee";
        }
        else if (susu > espresso) {
            nama = "Milky Coffee";
        }
        else if (espresso == susu) {
            nama = "Balanced Coffee";
        }
        else {
            nama = "Custom Coffee";
        }

        System.out.println("Minuman jadi : " + nama);
        System.out.println("Takaran:");
        System.out.println("Espresso : " + espresso + " ml");
        System.out.println("Susu     : " + susu + " ml");
        System.out.println("Foam     : " + foam + " ml");
    }
}

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Cafe kopi = new Cafe();

        System.out.println("=== INPUT TAKARAN KOPI (ml) ===");

        System.out.print("Masukkan espresso (ml): ");
        kopi.espresso = input.nextInt();

        System.out.print("Masukkan susu (ml): ");
        kopi.susu = input.nextInt();

        System.out.print("Masukkan foam (ml): ");
        kopi.foam = input.nextInt();

        kopi.mix();
    }
}