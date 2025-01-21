import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SpellChecker
   {
      private String[] dictionary;
      
      // WRITE Your Methods HERE!
      public SpellChecker() {
        try
        {
            dictionary = readLines("dictionary.txt");
        }
        catch(IOException e)
        {
            // Print out the exception that occurred
            System.out.println("Unable to access "+e.getMessage());              
        }
        
      }

      public static String[] readLines(String filename) throws IOException 
      {
        FileReader fileReader = new FileReader(filename);
         
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line = null;
         
        while ((line = bufferedReader.readLine()) != null) 
        {
            lines.add(line);
        }
         
        bufferedReader.close();
         
        return lines.toArray(new String[lines.size()]);
      }
      
    
   
   public void print10(){
     for(int i = 0; i<10; i++){
       System.out.println(dictionary[i]);
     }
   }
  
  public boolean spellCheck(String s){
    boolean response = false;
    for(int i = 0; i< dictionary.length; i++){
      if(dictionary[i].equals(s)){
        response = true;
      }
    }
    return response;
  }
  public void printStartsWith(String l){
    for(int i = 0; i< dictionary.length; i++){
      if(dictionary[i].startsWith(l)){
        System.out.println(dictionary[i]);
      }
    }
  }
}