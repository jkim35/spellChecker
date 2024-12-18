
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
    //Write a spellcheck( ) method that takes a word as a parameter and returns true if it is in the dictionary array. It should return false if it is not found.
    public boolean spellcheck(String word){
      boolean x = false;
      for(int j = 0; j<dictionary.length;j++){
        if(word.equals(dictionary[j])){
          x = true;
        }
      }
      return x;
    }
    public void printStartsWith(String phr){
      String dict ="";
      String k;
      for(int l = 0; l<dictionary.length;l++){
        dict = dictionary[l];
        if(dict.indexOf(phr)==0){
          System.out.println(dictionary[l]);
        }
      }
    }
   }