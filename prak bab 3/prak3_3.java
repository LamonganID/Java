public class prak3_3 {
    public static void main(String[] args)
    {
        java.util.Scanner masukan = new java.util.Scanner(System.in);
        System.out.println("masukan sebuah bilangan = ");
        int bil = masukan.nextInt();
        boolean prima = true;
        for (int i = 2; i < bil; i++){
            if ((bil % i ) == 0){
                prima = false;
                break;
            }
        }
        if (prima)
        {
            System.out.print(bil +" adalah bilangan prima");
        }else
        {
            System.out.print(bil + " bukan bilangan prima");
        }
    }
}
