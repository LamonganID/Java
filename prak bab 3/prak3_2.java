public class prak3_2 {
    public static void main(String[] args) {
        java.util.Scanner masukan = new java.util.Scanner(System.in);
        System.out.print("Masukkan batas bilangan = ");
        int batas = masukan.nextInt();
        System.out.println("Bilangan genap dari 2 sampai bil tsb = ");
        for (int i = 2; i <= batas; i = i + 2) {
            System.out.print(i + " ");
        }
        masukan.close();
    }
}
