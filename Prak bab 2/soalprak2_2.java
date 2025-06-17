public class soalprak2_2 {
    // Buat program untuk menentukan gaji seorang karyawan berdasarkan waktu/jam
    // kerjanya, dengan aturan bahwa batasan jam kerja normal adalah 50 sampai 60
    // jam/minggu dengan upah Rp.5000/jam. Jika lebih dari batas tersebut, maka kelebihan
    // perjamnya dibayar Rp 7500/jam. Tetapi jika jam kerjanya kurang dari 50 jam/minggu,
    // maka dikenakan potongan Rp.2500/jam nya. (Input : jam kerja/minggu, dan output : total
    // gaji)
    public static void main(String[] args) {
        java.util.Scanner masukan = new java.util.Scanner(System.in);
        int jamKerja;
        System.out.print("Masukkan jam kerja karyawan (jam/minggu) = ");
        jamKerja = masukan.nextInt();
        int gaji;
        if (jamKerja >= 50 && jamKerja <= 60) {
            gaji = jamKerja * 5000;
        } else if (jamKerja > 60) {
            gaji = (50 * 5000) + ((jamKerja - 50) * 7500);
        } else {
            gaji = jamKerja * 5000 - (jamKerja * 2500);
        }
        System.out.printf("Total gaji karyawan = Rp.%,d\n", gaji);
        masukan.close();
    }
}
