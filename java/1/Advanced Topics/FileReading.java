import java.io.*;

public class FileReading {
    public static void main(String[] args) {
        String fileName = "test.txt"; 

        FileReader reader = null;

        try{
            reader = new FileReader(fileName);
            int tmp;
            while (( tmp = reader.read())!= -1 ){
                System.out.print((char)tmp);
            }
                
        }catch(Exception e){
            System.out.println("Error: "+e.toString());
        }finally{
            try{
                reader.close();
            }catch(IOException e){
                System.out.println("Error closing reader "+e.toString());
            }
            
        }

    }
}
