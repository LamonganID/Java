
import javax.swing.DefaultBoundedRangeModel;

public class prak2_3 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int bil;
        System.out.print("Masukkan nilai 1  - 3 =");
        bil = input.nextInt();
        switch (bil){
            case 1:
                System.out.println("Anda memilih 1");
                break;
            case 2:
                System.out.println("Anda memilih 2");
                break;
            case 3:
                System.out.println("Anda memilih 3");
                break;
            default:
                System.out.println("Pilihan tidak valid, silakan pilih antara 1 - 3");
                break;
        
        }
    }

}
