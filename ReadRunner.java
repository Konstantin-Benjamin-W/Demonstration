import java.io.*;

public class ReadRunner {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Enter your name and press 'Enter': ");
            String name = br.readLine();
            System.out.println("Hello, " + name);
        } catch (IOException e){
            System.err.print("Error! " + e);
        }
    }
}
