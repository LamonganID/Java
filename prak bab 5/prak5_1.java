public class prak5_1 {
    public static void main(String[] args)
    {
        java.util.Scanner masukan = new java.util.Scanner(System.in);
        int total = 0, jumbil;
        float rata;
        System.out.print("Jumlah banyaknya bilangan = ");
        jumbil = masukan.nextInt();
        int data[] = new int[jumbil];
        for (int i = 0; i < jumbil; i++)
        {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + " = ");
            data[i] = masukan.nextInt();
            total += data[i];
        }
        System.out.println("Nilai rata-rata = ");
        for (int i = 0; i < (jumbil-1); i++)
        {
            System.out.print(data[i] + " + ");
        }
        System.out.print(data[jumbil - 1] + " = ");
        rata = (float) total / jumbil;
        System.out.println(rata);
    }
}
