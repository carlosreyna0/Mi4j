package mi4j.interpreter;
import java.io.*;

public class Parser{
    public static String parse(File program){
        String contents = "";

        try(BufferedReader reader = new BufferedReader(new FileReader(program))) {
            String line;
            while((line = reader.readLine()) != null)
            {
                contents += line += '\n';
            }
        }catch(IOException e)
        {
            e.printStackTrace();
        }

        return contents;
    }
}