import java.util.*;

public class soalprak5_1 {
// Buat sebuah program yang memiliki menu sebagai berikut :
// Menu Utama :
// 1. Input Data
// 2. Tampilkan Data
// 3. Distribusi Frekuensi
// 4. Statistik
// 5. Keluar
// Dimana input data adalah memasukkan data nilai (antara 0 sampai 100) ke dalam suatu
// array. Menampilkan data adalah menampilkan semua isi array. Distribusi frekuensi adalah
// mencari nilai frekuensi untuk masing-masing range nilai (dengan interval 20) . Statistik
// adalah mencari nilai mean, minimum dan maksimum dari data.
    static ArrayList<Integer> data = new ArrayList<>(); // untuk menyimpan nilai

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\n** Menu Utama **");
            System.out.println("1. Input Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Distribusi Frekuensi");
            System.out.println("4. Statistik");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = masukan.nextInt();

            switch (menu) {
                case 1:
                    inputData(masukan);
                    break;
                case 2:
                    tampilkanData();
                    break;
                case 3:
                    distribusiFrekuensi();
                    break;
                case 4:
                    statistik();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (menu != 0);

        masukan.close();
    }

    private static void inputData(Scanner masukan) {
        System.out.println("Masukkan data nilai (0-100). Masukkan -1 untuk selesai:");
        while (true) {
            System.out.print("Nilai: ");
            int nilai = masukan.nextInt();
            if (nilai == -1) break;
            if (nilai >= 0 && nilai <= 100) {
                data.add(nilai);
            } else {
                System.out.println("Nilai harus antara 0-100!");
            }
        }
    }

    private static void tampilkanData() {
        if (data.isEmpty()) {
            System.out.println("Tidak ada data yang ditampilkan.");
        } else {
            System.out.println("Data yang telah diinputkan:");
            for (int nilai : data) {
                System.out.print(nilai + " ");
            }
            System.out.println("\nJumlah data: " + data.size());
        }
    }

    private static void distribusiFrekuensi() {
        if (data.isEmpty()) {
            System.out.println("Belum ada data.");
            return;
        }

        int[] frekuensi = new int[5]; // [0-19], [20-39], [40-59], [60-79], [80-100]

        for (int nilai : data) {
            if (nilai <= 19) frekuensi[0]++;
            else if (nilai <= 39) frekuensi[1]++;
            else if (nilai <= 59) frekuensi[2]++;
            else if (nilai <= 79) frekuensi[3]++;
            else frekuensi[4]++;
        }

        System.out.println("Distribusi Frekuensi:");
        System.out.println("0 - 19   : " + frekuensi[0]);
        System.out.println("20 - 39  : " + frekuensi[1]);
        System.out.println("40 - 59  : " + frekuensi[2]);
        System.out.println("60 - 79  : " + frekuensi[3]);
        System.out.println("80 - 100 : " + frekuensi[4]);
    }

    private static void statistik() {
        if (data.isEmpty()) {
            System.out.println("Belum ada data.");
            return;
        }

        int total = 0;
        int min = data.get(0);
        int max = data.get(0);

        for (int nilai : data) {
            total += nilai;
            if (nilai < min) min = nilai;
            if (nilai > max) max = nilai;
        }

        double mean = (double) total / data.size();

        System.out.println("Statistik Data:");
        System.out.println("Rata-rata (Mean): " + mean);
        System.out.println("Minimum         : " + min);
        System.out.println("Maksimum        : " + max);
    }
}
