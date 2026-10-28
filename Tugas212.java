import java.util.Scanner;

public class Tugas212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int totalAngka = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n*i; j+=i) {
                System.out.print("  " + j + "  ");
                totalAngka += j;
            }
            System.out.println();
        }
        System.out.println("Jumlah seluruh angka: " + totalAngka);
        sc.close();
    }    
}
