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
    public static void main(String[] args)
    {
        java.util.Scanner masukan = new java.util.Scanner(System.in);
        int menu = 9;
        do { 
            System.out.println("\n **Menu Utama** \n");
            System.out.println("1. Input Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Distribusi Frekuensi");
            System.out.println("4. Statistik");
            System.out.println("0. Keluar");
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

    private static int[] data = new int[0];

    private static void inputData(java.util.Scanner masukan)
    {
        System.out.print("Masukkan jumlah data yang ingin diinput: ");
        int jumlahData = masukan.nextInt();
        data = new int[jumlahData];
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + " (antara 0 sampai 100): ");
            int nilai = masukan.nextInt();
            while (nilai < 0 || nilai > 100) {
                System.out.print("Nilai tidak valid. Masukkan nilai antara 0 sampai 100: ");
                nilai = masukan.nextInt();
            }
            data[i] = nilai;
        }
    }
    private static void tampilkanData()
    {
        System.out.println("Data yang telah diinput:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Data ke-" + (i + 1) + ": " + data[i]);
        }
    }
    private static void distribusiFrekuensi()
    {
        // Implementasi untuk distribusi frekuensi
    }
    private static void statistik()
    {
        // Implementasi untuk statistik
    }
}
