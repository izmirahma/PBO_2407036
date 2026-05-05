package latihan_pbo.tugas3;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // format rupiah
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        Cafe cafe = new Cafe("Cafe Nusantara");

        // Menu
        cafe.tambahMenu(new Makanan("Nasi Goreng", 15000, "Goreng"));
        cafe.tambahMenu(new Makanan("Mie Rebus", 12000, "Rebus"));
        cafe.tambahMenu(new Minuman("Es Teh", 5000, "M"));
        cafe.tambahMenu(new Minuman("Soda Gembira", 8000, "L"));

        ArrayList<Menu> pesanan = new ArrayList<>();
        ArrayList<Integer> jumlahList = new ArrayList<>();

        char lagi;
        do {
            cafe.tampilkanMenu();

            System.out.print("Pilih menu: ");
            int pilih = input.nextInt();

            System.out.print("Jumlah: ");
            int jumlah = input.nextInt();

            Menu m = cafe.getMenu(pilih - 1);

            pesanan.add(m);
            jumlahList.add(jumlah);

            System.out.print("Pesan lagi? (y/n): ");
            lagi = input.next().charAt(0);

        } while (lagi == 'y' || lagi == 'Y');

        // ===== STRUK =====
        System.out.println("\n===== STRUK PEMBELIAN =====");

        double totalSemua = 0;

        for (int i = 0; i < pesanan.size(); i++) {
            Menu m = pesanan.get(i);
            int jml = jumlahList.get(i);

            double subtotal = m.getHarga() * jml;
            totalSemua += subtotal;

            System.out.println(
                m.getNama() + " x" + jml + " = " + rupiah.format(subtotal)
            );
        }

        System.out.println("--------------------------");
        System.out.println("TOTAL BAYAR = " + rupiah.format(totalSemua));
    }
}
