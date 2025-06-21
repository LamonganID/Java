public class soalprak4_1 {
//Buat program yang memiliki suatu fungsi untuk menentukan apakah suatu bilangan itu
//termasuk bilangan prima atau bukan. Kemudian tampilkan bilangan prima dari 1 sampai
//100.
    public static void main(String[] args)
    {
        java.util.Scanner masukan = new java.util.Scanner(System.in);
        int i = 1;
        while (i <= 100)
        {
            if (prima(i))
            {
                System.out.print(i + " ");
            }
            
            i++;
        }
        masukan.close();
    }
    private static boolean prima(int Bilangan)
    {
        if (Bilangan <= 1) return false;
        for (int i = 2; i <= Math.sqrt(Bilangan); i++)
        {
            if (Bilangan % i == 0) return false;
        }
        return true;
    }
}