import java.util.Scanner;

public class LuasBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        double luas = 0;

        System.out.println("=== PROGRAM LUAS BANGUN DATAR ===");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.print("Pilih bangun datar (1-4): ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi: ");
                double sisi = input.nextDouble();
                luas = sisi * sisi;
                System.out.println("Luas persegi = " + luas);
                break;

            case 2:
                System.out.print("Masukkan panjang: ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = input.nextDouble();
                luas = panjang * lebar;
                System.out.println("Luas persegi panjang = " + luas);
                break;

            case 3:
                System.out.print("Masukkan alas: ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();
                luas = 0.5 * alas * tinggi;
                System.out.println("Luas segitiga = " + luas);
                break;

            case 4:
                System.out.print("Masukkan jari-jari: ");
                double r = input.nextDouble();
                luas = 3.14 * r * r;
                System.out.println("Luas lingkaran = " + luas);
                break;

            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }

        input.close();
    }
}
