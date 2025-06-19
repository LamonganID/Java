import java.util.Scanner;

public class soalprak3_1 {
// Buat program untuk menghitung angsuran hutang, dimana diinputkan besar
// hutang/pinjaman, lamanya angsuran (bulan), dan besarnya bunga perbulan. Bunga
// dihitung dari hutang/pinjaman yang tersisa. Tampilan daftar pembayaran mulai dari
// pembayaran pertama sampai terakhir (lunas).
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        double hutang, bungaPersen, bunga, angsuranPokok, totalBayar = 0;
        int lamaBulan;

        // Input data
        System.out.print("Masukkan besar hutang/pinjaman (Rp): ");
        hutang = masukan.nextDouble();

        System.out.print("Masukkan lamanya angsuran (bulan): ");
        lamaBulan = masukan.nextInt();

        System.out.print("Masukkan suku bunga per bulan (%): ");
        bungaPersen = masukan.nextDouble();

        angsuranPokok = hutang / lamaBulan;
        double sisaHutang = hutang;

        System.out.println("\n============================================");
        System.out.println("Bulan | Bunga   | Angsuran Pokok | Total Bayar | Sisa Hutang");
        System.out.println("============================================");

        for (int i = 1; i <= lamaBulan; i++) {
            bunga = sisaHutang * (bungaPersen / 100);
            double totalAngsuran = angsuranPokok + bunga;
            sisaHutang -= angsuranPokok;
            totalBayar += totalAngsuran;

            // Tampilkan rincian angsuran bulan ini
            System.out.printf("%5d | %7.2f | %14.2f | %11.2f | %12.2f\n",
                    i, bunga, angsuranPokok, totalAngsuran, Math.max(sisaHutang, 0));
        }

        System.out.println("============================================");
        System.out.printf("Total pembayaran seluruhnya: Rp%.2f\n", totalBayar);

        masukan.close();
    }
}
