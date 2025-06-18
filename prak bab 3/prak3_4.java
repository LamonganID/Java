public class prak3_4 {
    public static void main(String[] args)
    {
        java.util.Scanner masukan = new java.util.Scanner(System.in);
        System.out.print("Masukkan batas bilangan = ");
        int batas = masukan.nextInt();
        int hasil = 0;
        for (int i = 1; i<= batas; i++)
        {
            hasil += i;
            System.out.println("Total penjumlahan adalah =" + hasil);
        }
    }

}
