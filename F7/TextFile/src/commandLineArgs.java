import java.io.IOException;
import java.io.PrintWriter;

public class commandLineArgs {

    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter(args[0]); //Click the green play icon, use Modify run config to input CLA. If not using terminal!
        writer.close();
    }
}
