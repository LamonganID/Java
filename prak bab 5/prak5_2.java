public class prak5_2 {
    public static void main(String[] args)
    {
        int baris, kolom;
        java.util.Scanner masukan = new java.util.Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        baris = masukan.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        kolom = masukan.nextInt();
        System.out.println();
        System.out.println("Masukan data = ");
        System.out.println("Masukkan data pada matriks ke-1: ");
        int[][] matriks1 = new int[baris][kolom];
        for (int i = 0; i< baris; i++) {
            for (int j = 0; j < kolom; j++)
            {
                System.out.print("Masukkan data pada baris ke-" + (i + 1) + " kolom ke-" + (j + 1) + " = ");
                matriks1[i][j] = masukan.nextInt();
            }
        }
        System.out.println("Masukkan data pada matriks ke-2: ");
        int[][] matriks2 = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++)
            {
                System.out.print("Masukkan data pada baris ke-" + (i + 1) + " kolom ke-" + (j + 1) + " = ");
                matriks2[i][j] = masukan.nextInt();
            }
        }
        System.out.println("Data sebelum di jummblahkan = ");
        System.out.println("Matriks ke-1: ");
        for (int i = 0; i < baris; i++)
        {
            for (int j = 0; j < kolom; j++)
            {
                System.out.print(matriks1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matriks ke-2: ");
        for (int i = 0; i < baris; i++)
        {
            for (int j = 0; j < kolom; j++)
            {
                System.out.print(matriks2[i][j] + " ");
            }
            System.out.println();
        }
        int[][] hasil = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }
        System.out.println("Hasil penjumlahan matriks: ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }

}
