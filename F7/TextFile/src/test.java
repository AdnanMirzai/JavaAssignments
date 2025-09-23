import java.io.IOException;
import java.io.PrintWriter;

public class test {
    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter("test.txt");
        writer.write("Text to write to the file i just created! ");
        writer.close();
    }
}
