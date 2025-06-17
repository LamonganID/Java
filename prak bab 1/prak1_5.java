import java.util.Scanner;

public class prak1_5 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int var_a, var_b;

        System.out.print("Masukan nilai var A = ");
        var_a = masukan.nextInt();

        System.out.print("Masukan nilai var B = ");
        var_b = masukan.nextInt();

        System.out.println();
        System.out.println("Nilai var A = " + var_a);
        System.out.println("Nilai var B = " + var_b);
    }
}
