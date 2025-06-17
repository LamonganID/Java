public class prak2_4 {
    public static void main(String[] args) {
        java.util.Scanner masukan = new java.util.Scanner(System.in);

        int matematika;
        System.out.print("Masukkan nilai matematika = ");
        matematika = masukan.nextInt();
        int fisika;
        System.out.print("MAsukan nilai fisika = ");
        fisika = masukan.nextInt();

        if ((matematika > 80 && fisika > 70)) {
            System.out.println("Anda lulus seleksi masuk perguruan tinggi");
        }else{
            System.out.println("Anda tidak lulus seleksi masuk perguruan tinggi");
        }
    }
}