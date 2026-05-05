package latihan_pbo.latihan5_15april;

public class Main {
    public static void main(String[] args) {

        MenuItem[] Menu = new MenuItem[3];

        Menu[0] = new MenuItem("ketoprak", 12000, 4);
        Menu[1] = new MenuItem("nasi goreng", 15000, 5);
        Menu[2] = new MenuItem("soda gembira", 8000, 6);

        double totalSemua = 0;

        for (MenuItem m : Menu) {
            m.tampilkanRingkas();
            totalSemua += m.hitungTotal();
        }

        System.out.println("total = " + totalSemua);
    }
}