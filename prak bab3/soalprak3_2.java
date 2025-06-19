import java.util.Scanner;

public class soalprak3_2 {
// Buat program untuk mengkonversi bilangan bulat ke bilangan romawi dengan input
// bilangan bulat dengan range 1- 5000.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat (1 - 5000): ");
        int angka = input.nextInt();

        if (angka < 1 || angka > 5000) {
            System.out.println("Angka harus di antara 1 hingga 5000.");
        } else {
            String romawi = konversiKeRomawi(angka);
            System.out.println("Angka Romawi: " + romawi);
        }

        input.close();
    }

    public static String konversiKeRomawi(int angka) {
        // Array angka dan romawi-nya
        int[] nilai =    {1000, 900, 500, 400, 100, 90,  50,  40, 10, 9, 5, 4, 1};
        String[] romawi = {"M", "CM","D", "CD","C", "XC","L", "XL","X","IX","V","IV","I"};

        StringBuilder hasil = new StringBuilder();

        for (int i = 0; i < nilai.length; i++) {
            while (angka >= nilai[i]) {
                angka -= nilai[i];
                hasil.append(romawi[i]);
            }
        }

        return hasil.toString();
    }
}
