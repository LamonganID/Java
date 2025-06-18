import java.util.Scanner;
public class soalprak2_3 {
    //Buat program untuk menentukan kuadran dari suatu titik koordinat. Nilai inputnya
    // adalah nilai X dan Y suatu titik, dan outputnya adalah nomor kuadran dari koordinat
    // tersebut
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double x, y;

        System.out.print("Masukkan nilai X: ");
        x = input.nextDouble();

        System.out.print("Masukkan nilai Y: ");
        y = input.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Titik berada di Kuadran I");
        } else if (x < 0 && y > 0) {
            System.out.println("Titik berada di Kuadran II");
        } else if (x < 0 && y < 0) {
            System.out.println("Titik berada di Kuadran III");
        } else if (x > 0 && y < 0) {
            System.out.println("Titik berada di Kuadran IV");
        } else if (x == 0 && y == 0) {
            System.out.println("Titik berada di pusat koordinat (0,0)");
        } else if (x == 0) {
            System.out.println("Titik berada di sumbu Y");
        } else if (y == 0) {
            System.out.println("Titik berada di sumbu X");
        }
        input.close();
    }
}
