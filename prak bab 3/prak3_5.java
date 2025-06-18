public class prak3_5 {
    public static void main(String[] args) {
        java.util.Scanner masukan = new java.util.Scanner(System.in);
        int n=0, total = 0, bil=9;
        while (bil!=0){
            n++;
            System.out.println("MAsukan bilangan ke "+-n+" =");
            bil = masukan.nextInt();
            total += bil;
        }
        // Mengurangi 1 karena bilangan terakhir yang dimasukkan adalah 0
        System.out.println("Total Jumlah "+(n-1)+ "bilangan tersebut = ");
        System.out.println(total);
        masukan.close();
    }
}
