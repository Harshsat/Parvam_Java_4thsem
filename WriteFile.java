import java.io.FileWriter;
public class WriteFile {
    public static void main(String args[]) {
        try {
            FileWriter fw = new FileWriter("marks.txt");

            fw.write("Harshita:90\n");
            fw.write("Jeff Satur:89\n");

            fw.close();

            System.out.println("Data written successfully");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}