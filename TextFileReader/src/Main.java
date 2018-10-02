import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		try {
		String fileName = "NamesAndNumebrs.txt";
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
        while (line != null)
        {
          System.out.println(line);
          line = br.readLine();
        }

        br.close();
	}
	catch (FileNotFoundException exception)
    {
       System.out.println ("The file was not found.");
    }
    catch (IOException exception)
    {
       System.out.println (exception);
    }
 }
	
}