public class prak2_2 {
    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        int nilai;
        System.out.print("Masukan nilai akhir mata kuliah = ");
        nilai = input.nextInt();
        if (nilai >= 100){
            System.out.println("A");
        }else if (nilai >= 80){
            System.out.println("B");
        }else if (nilai >= 65){
            System.out.println("C");
        }else if (nilai <= 50){
            System.out.println("D");
        }
    }
}
