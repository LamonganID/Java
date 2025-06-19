public class prak3_6 {
// Pernyataan do..while memiliki prinsip kerja yang sama seperti pernyataan while.
// Perbedaannya hanya pada pengujian kondisi perulangan, dimana do..while
// pengujiannya dilakukan pada akhir blok perintah. Buatlah program di atas dengan
// menggunakan pernyataan do..while
    public static void main(String[] args)
    {
        java.util.Scanner masukan = new java.util.Scanner(System.in);
        int n=0, total =0, bil=9;
        do{
            n++;
            System.out.println("Masukan bilangan ke "+-n+" =");
            bil = masukan.nextInt();
            total += bil;

        }while(bil!=0);
        System.out.print("Total Jumlah "+(n-1)+ "bilangan tersebut = " + total);
    }
}
