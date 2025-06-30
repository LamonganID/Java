import java.io.*;
public class prak6_1 {
    public static void main(String[] args)
    {
        File file = new File("prak bab6/mhs.txt");
        System.out.println("Absolute path: " + file.getAbsolutePath());
        if (!file.exists() || !file.canRead()) {
            System.out.print("File tidak ditemukan atau tidak dapat dibaca." + "\n" + file);
            return;
        }
        try {
            int i=0;
            BufferedReader fIn = new BufferedReader(new FileReader(file));
            String line;
            try {
                while((line = fIn.readLine()) != null){
                    i++;
                    System.out.println(i + "=" + line);
                }
            } catch (IOException e) {
                System.out.println("Terjadi kesalahan saat membaca file.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File tidak di temukan.");
        }
    } 
}
