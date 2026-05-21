import java.io.FileReader;

public class ReadFile {
    public static void main(String args[]) {
        try {
            FileReader fr = new FileReader("marks.txt");

            int i;

            while((i = fr.read()) != -1) {
                System.out.print((char)i);
            }

            fr.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}