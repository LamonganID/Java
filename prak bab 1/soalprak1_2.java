import java.util.Scanner;
public class soalprak1_2 {
    public static void main(String[] args)
    {
        // Buat program yang meminta inputan suatu nilai rupiah, yang kemudian dihitung nilai US Dollar dan Euro dari nilai rupiah tersebut. (mis : input rupiah = 1000000.00)
        Scanner input = new Scanner(System.in);

        double nilaiRupiah;
        System.out.print("Masukan mata uang (IDR) = ");
        nilaiRupiah = input.nextDouble();

        double USD = 16290.0;
        double Euro = 18857.0;

        final double nilaiUSD = nilaiRupiah / USD;
        final double nilaiEuro = nilaiRupiah / Euro;


        System.out.printf("Nilai usd dari %.2f rupiah adalah %.2f USD%n", nilaiRupiah, nilaiUSD);
        System.out.printf("Nilai Euro dari %.2f rupiah adalah %.2f Euro%n", nilaiRupiah, nilaiEuro);
        input.close();
    }

}
