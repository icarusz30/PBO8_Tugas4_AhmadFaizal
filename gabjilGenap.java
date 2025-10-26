import java.util.Scanner;

public class gabjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan;

        System.out.print("Masukkan bilangan: ");
        bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println("Bilangan " + bilangan + " adalah GENAP.");
        } else {
            System.out.println("Bilangan " + bilangan + " adalah GANJIL.");
        }

        input.close();
    }
}
