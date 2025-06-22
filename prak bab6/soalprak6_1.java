import java.io.BufferedReader;
import java.io.FileReader;

public class soalprak6_1 {
    public static void main(String[] args) throws Exception {
        String fileName = "mhs.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        
        String line;
        boolean firstLine = true; 

        while ((line = reader.readLine()) != null) {
            if (firstLine) {
                firstLine = false;
                continue; 
            }

            String[] data = line.trim().split("\\s+");

            if (data.length >= 5) {
                String nim = data[0];
                String nama = data[1];
                int tugas = Integer.parseInt(data[2]);
                int uts = Integer.parseInt(data[3]);
                int uas = Integer.parseInt(data[4]);

                System.out.println("NIM   : " + nim);
                System.out.println("Nama  : " + nama);
                System.out.println("Tugas : " + tugas);
                System.out.println("UTS   : " + uts);
                System.out.println("UAS   : " + uas);
                System.out.println("-------------------------");
            }
        }

        reader.close();
    }
}
