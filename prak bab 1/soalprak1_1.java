import java.util.Scanner;
public class soalprak1_1 {
    public static void main(String[] args)
    {
        // Buat program yang meminta inputan jari-jari, yang kemudian dihitung dan ditampilkan luas dan keliling lingkaran tersebut. (mis : input jari-jari = 5.5)
        Scanner input = new Scanner(System.in);

        double jariJari;
        
        System.out.print("Masukkan jari-jari lingkaran (cm): ");
        jariJari = input.nextDouble();
        
        double Luaslingkaran = Math.PI *jariJari * jariJari;
        double Kelilinglingkaran = 2 * Math.PI * jariJari;

        System.out.printf("Luas lingkaran dengan jari-jari %.2f cm adalah %.2f cm²%n", jariJari, Luaslingkaran);
        System.out.printf("Keliling lingkaran dengan jari-jari %.2f cm adalah %.2f cm%n", jariJari, Kelilinglingkaran);

        input.close();
    }
}
