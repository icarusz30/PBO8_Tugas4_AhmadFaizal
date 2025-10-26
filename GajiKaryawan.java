import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String NIK, nama, status;
        int kodeGolongan, jumlahAnak;
        double gajiPokok = 0, tunjanganPasangan = 0, tunjanganAnak = 0, gajiBersih;

        System.out.print("Masukkan NIK: ");
        NIK = input.nextLine();
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan Kode Golongan (1-4): ");
        kodeGolongan = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Status Pernikahan (Menikah / Belum / Cerai): ");
        status = input.nextLine();
        System.out.print("Masukkan Jumlah Anak: ");
        jumlahAnak = input.nextInt();

        if (kodeGolongan == 1) {
            gajiPokok = 1200000;
        } else if (kodeGolongan == 2) {
            gajiPokok = 1500000;
        } else if (kodeGolongan == 3) {
            gajiPokok = 1750000;
        } else if (kodeGolongan == 4) {
            gajiPokok = 2000000;
        } else {
            System.out.println("Kode golongan tidak valid!");
            System.exit(0);
        }

        if (status.equalsIgnoreCase("Menikah")) {
            tunjanganPasangan = 0.1 * gajiPokok; 
        } else {
            tunjanganPasangan = 0;
        }

        
        tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;
        gajiBersih = gajiPokok + tunjanganPasangan + tunjanganAnak;

        System.out.println("\n=== Data Gaji Karyawan ===");
        System.out.println("NIK\t\t: " + NIK);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Golongan\t: " + kodeGolongan);
        System.out.println("Status\t\t: " + status);
        System.out.println("Jumlah Anak\t: " + jumlahAnak);
        System.out.println("-----------------------------");
        System.out.println("Gaji Pokok\t: Rp" + gajiPokok);
        System.out.println("Tunjangan Pasangan: Rp" + tunjanganPasangan);
        System.out.println("Tunjangan Anak\t: Rp" + tunjanganAnak);
        System.out.println("-----------------------------");
        System.out.println("Gaji Bersih\t: Rp" + gajiBersih);

        input.close();
    }
}
