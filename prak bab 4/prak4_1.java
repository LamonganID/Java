public class prak4_1 {
    public static void main(String[] args)
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int pilihan = 9;
        do { 
            System.out.println("\nMENU\n");
            System.out.println("1. Menghitung Luas Persegi Panjang");
            System.out.println("2. Menghitung Luas Lingkaran");
            System.out.println("0. Keluar");
            pilihan = scanner.nextInt();
            switch (pilihan){
                case 1:
                    LuasPersegiPanjang(scanner);
                    break;
                case 2:
                    LuasLingkaran(scanner);
                    break;
            }
        } while (pilihan != 0);
        float panjang , lebar, luas;
        System.out.print("Masukkan nilai panjang: ");
        panjang = scanner.nextFloat();
        System.out.print("Masukkan nilai lebar: ");
        lebar = scanner.nextFloat();
        luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + luas);
    }
    private static void LuasLingkaran(java.util.Scanner scanner) {
        float jariJari, luasLingkaran;
        System.out.print("Masukkan nilai jari-jari: ");
        jariJari = scanner.nextFloat();
        luasLingkaran = (float) (Math.PI * jariJari * jariJari);
        System.out.println("Luas Lingkaran: " + luasLingkaran);
    }
    private static void LuasPersegiPanjang(java.util.Scanner scanner) {
        float panjang, lebar, luas;
        System.out.print("Masukkan nilai panjang: ");
        panjang = scanner.nextFloat();
        System.out.print("Masukkan nilai lebar: ");
        lebar = scanner.nextFloat();
        luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + luas);
        scanner.close();
    }

}
