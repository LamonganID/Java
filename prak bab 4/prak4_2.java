public class prak4_2 {
    public static void main(String[] args)
    {
        java.util.Scanner masukan = new java.util.Scanner(System.in);
        int bil1, bil2, bil3;
        System.out.print("Masukan Bilangan Pertama = ");
        bil1 = masukan.nextInt();
        System.out.print("Masukan Bilangan Kedua = ");
        bil2 = masukan.nextInt();
        System.out.print("Masukan Bilangan Ketiga = ");
        bil3 = masukan.nextInt();

        System.out.println();
        System.out.println("Jumlah " + bil1 + " + " + bil2 + " = " + (jumlah(bil1, bil2)));
        System.out.println("Jumlah " + bil2 + " + " + bil3 + " = " + (jumlah(bil2, bil3)));
        System.out.println("Jumlah " + bil1 + " + " + bil3 + " = " + (jumlah(bil1, bil3)));
    }
    private  static int jumlah(int a, int b)
    {
        int hasil;
        hasil = a + b;
        return hasil;
    }
}
