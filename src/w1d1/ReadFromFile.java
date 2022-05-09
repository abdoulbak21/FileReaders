package w1d1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
   public static void  main(String [] args) throws IOException {
       int numCharacters = 0;
       boolean readingFile = true;
       File abdoulFile = new File("story.txt");
       FileReader abdoulFileReader = new FileReader(abdoulFile);

       while(readingFile) {
           int readByteFromFile = abdoulFileReader.read();
           char readCharacterFromByte = (char) readByteFromFile;

           //char readUpper = (char) Character.toUpperCase(readByteFromFile);
           //char readLower = (char) Character.toLowerCase(readByteFromFile);


           if(readByteFromFile == -1){
               readingFile = false;
           }else{
               System.out.print(readCharacterFromByte);
               //System.out.print(readUpper);
               //System.out.print(readLower);
               numCharacters = numCharacters + 1;
           }

       }
       System.out.println('\n' + "Number of characters: " + numCharacters);

   }

}
