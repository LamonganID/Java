import java.util.Scanner;

public class soalprak2_1 {
//      Buat program untuk menentukan kriteria kegemukan dengan menggunakan Indeks
//      Massa Tubuh (IMT), yang dihitung berdasarkan rumus :
//      IMT = b / t2 dengan b : berat badan (kg) dan t : tinggi badan (m)
//      Kriteria penentuan berat berdasarkan IMT adalah sebagai berikut :
//      Nilai IMT Kriteria
//      IMT ≤ 18.5 Kurus
//      18.5 < IMT ≤ 25 Normal
//      25 < IMT ≤ 30 Gemuk
//      IMT > 30 Kegemukan (Obesitas)
    public static void main(String[] args)
    {
        java.util.Scanner masukan = new Scanner(System.in);
        double beratBadan, tinggiBadan, imt;
        System.out.print("Masukan berat badan (kg) = ");
        beratBadan = masukan.nextDouble();
        System.out.print("Masukan tinggi badan (m) = ");
        tinggiBadan = masukan.nextDouble();
        imt = beratBadan / (tinggiBadan * tinggiBadan);
        System.out.printf("Nilai IMT = %.2f\n", imt);
        if (imt <= 18.5){
            System.out.println("Kriteria: kurus");
        }else if (imt <= 25) {
            System.out.println("Kriteria: ideal");
        }else if (imt <=30){
            System.out.println("Kriteria: obesitas");
        }
    }
}
