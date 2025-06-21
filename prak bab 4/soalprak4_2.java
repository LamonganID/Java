public class soalprak4_2 {
// Buat program yang memiliki suatu fungsi rekursif untuk mencetak suatu deret
// fibbonacci. Deret fibbonacci adalah suatu deret dimana bilangan berikutnya merupakan
// penjumlahan 2 bilangan sebelumnya. (mis : 1, 1, 2, 3, 5, 8, 13, 21, 33,...)
    public static void main(String[] args)
    {
        java.util.Scanner masukan = new java.util.Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan Fibonacci yang ingin ditampilkan: ");
        int n = masukan.nextInt();
        System.out.print("Deret Fibonacci: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(fibonacci(i) + " ");
        }
        masukan.close();
        
    }

    // Recursive method to calculate nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
