import java.util.Scanner;

public class soalprak3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan prima yang ingin ditampilkan: ");
        int jumlah = input.nextInt();

        int hitung = 0;
        int angka = 2;

        System.out.println("Bilangan prima sebanyak " + jumlah + " adalah:");

        while (hitung < jumlah) {
            if (apakahPrima(angka)) {
                System.out.print(angka + " ");
                hitung++;
            }
            angka++;
        }

        input.close();
    }

    // Fungsi untuk mengecek apakah suatu bilangan adalah prima
    public static boolean apakahPrima(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
