package ServletPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class callPython {
	public static void myMethod(){
		try
        {
            ProcessBuilder pb = new ProcessBuilder("//Commutatus//pythonfile//movie_names.py");
            Process p = pb.start();

            BufferedReader bfr = new BufferedReader(new InputStreamReader(p.getInputStream()));

            System.out.println(".........start   process.........");
            String line = "";
            while ((line = bfr.readLine()) != null)
                {
                    System.out.println("Python Output: " + line);
                }
            System.out.println("........end   process.......");

        } catch (Exception e)
        {
            System.out.println(e);
        }
	}

}
