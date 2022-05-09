package w1d1;

import java.io.*;

public class Readwitharray {
    public static void main ( String [] args ) throws IOException {

        File abdoulFile = new File ("story.txt");
        FileReader abdoulFileReader = new FileReader(abdoulFile);
        char [] charArray = new char[1000];
        int numCharacters = 0;
        boolean readingFile = true;

        File fixedFile = new File ("fixedFile.txt");
        FileWriter fixedFileWriter = new FileWriter(fixedFile);

        while(readingFile){
            int readByteFromFile = abdoulFileReader.read();
            if(readByteFromFile == '_'){
                readByteFromFile = ' ';

            }
            if (readByteFromFile == -1){
                readingFile = false;

            }
            else{
                charArray[numCharacters] = (char) readByteFromFile;
                numCharacters++;


            }
        }
        for(int i=0; i < numCharacters; i++){

            System.out.print(charArray[i]);
            //System.out.print(Character.toUpperCase(charArray[i]));
           // System.out.print(Character.toLowerCase(charArray[i]));

        }
        fixedFileWriter.close();

    }

}
