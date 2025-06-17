public class prak2_1 {
    public static void main (String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        int nilai;

        System.out.print("Masukkan nilai akhir mata kuliahnya = ");
        nilai = input.nextInt();
        if (nilai < 65)
        {
            System.out.println("Tidak lulus");
        }else if (nilai > 65)
        {
            System.out.println("Lulus");
        }
    }

}
