import java.util.Scanner;

public class Tugas312 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        while (jumlahToko < 1) {
            System.out.print("Jumlah toko minimal 1. Masukkan ulang: ");
            jumlahToko = sc.nextInt();
        }

        int totalBarangSeluruhToko = 0;
        int maxBarang = -1;
        int tokoTerbanyak = 1;

        String ringkasanToko = "";

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.print("Masukkan jumlah pelanggan untuk Toko " + i + ": ");
            int jumlahPelanggan = sc.nextInt();

            while (jumlahPelanggan < 0) {
                System.out.print("Jumlah pelanggan tidak boleh negatif. Masukkan ulang: ");
                jumlahPelanggan = sc.nextInt();
            }

            int totalBarangToko = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("  Masukkan jumlah barang yang dibeli pelanggan ke-" + j + ": ");
                int barang = sc.nextInt();

                while (barang < 0) {
                    System.out.print("  Jumlah barang tidak boleh negatif. Masukkan ulang: ");
                    barang = sc.nextInt();
                }

                totalBarangToko += barang;
            }

            ringkasanToko += "Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko + "\n";

            totalBarangSeluruhToko += totalBarangToko;

            if (i == 1 || totalBarangToko > maxBarang) {
                maxBarang = totalBarangToko;
                tokoTerbanyak = i;
            }
        }

        System.out.println("\n========================================");
        System.out.print(ringkasanToko);
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
}