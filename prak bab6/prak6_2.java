import java.io.*;
public class prak6_2 {
    public static void main(String[] args ) throws Exception {
        File fileIn = new File("prak6_2.java");
        File fileOut = new File("prak6_2_out.java");
        if (!fileIn.exists() || !fileIn.canRead()) {
            System.out.println("File tidak ditemukan atau tidak dapat dibaca: " + fileIn);
            return;
        }
        try {
            int i = 0;
            BufferedReader fIn = new BufferedReader(new FileReader(fileIn));
            BufferedWriter fOut = new BufferedWriter(new FileWriter(fileOut));
            String line;
            while ((line = fIn.readLine()) != null) {
                i++;
                if (i <= 10)
                    fOut.write(i + "=" + line);
                else if (i < 100)
                    fOut.write("");
                fOut.write(i + "=" + line);
                fOut.newLine();
            }
            fIn.close();
            fOut.close();
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: ");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan IO: " + e.getMessage());
        }
    }
}
