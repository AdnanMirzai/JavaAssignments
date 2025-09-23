import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class spamGenerator {
    public static void main(String[] args) throws IOException {

        if(args.length != 3) {
            System.out.println("java spamGenerator error");
            System.exit(1);
        }

        BufferedReader fin = null;
        FileWriter fw = null;

        try {
            fin = new BufferedReader(new FileReader(args[0]));
            fw = new FileWriter(args[1]);

            String line = fin.readLine();
            while(line != null) {
                line = line.replaceAll("#N#", args[2]);
                fw.write(line + "\n");
                System.out.println(line);
                line = fin.readLine();
            }
        }
        finally {
            if(fin != null) fin.close();
            if(fw != null) fw.close();
        }

    }
}
