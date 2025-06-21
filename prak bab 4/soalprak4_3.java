public class soalprak4_3 {
// Buat program untuk mencetak bilangan amisabel dari 1 sampai 1000. Bilangan amisabel
// adalah bilangan yang jumlah faktor-faktornya sama dengan bilangan itu sendiri.
// Contoh : 1 = 1
// 6 = 1 + 2 + 3
// 28 = 1 + 2 + 4 + 7 + 14
    public static void main(String[] args) {
        System.out.println("Bilangan amisabel dari 1 sampai 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (isAmisabel(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isAmisabel(int number) {
        int sumOfFactors = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfFactors += i;
            }
        }
        return sumOfFactors == number;
    }
}
