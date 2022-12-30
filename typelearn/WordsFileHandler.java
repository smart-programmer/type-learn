package typelearn;

import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner; 
import java.util.ArrayList;
import java.util.List;

public class WordsFileHandler {
    List<String> wordsArray;
    final String filePath = "src/main/java/resources/words.txt"; // relative to prject base path
    
    String filePathGetter (){
        String filePath = new File("src/main/java/resources").getAbsolutePath();
        return filePath.concat(this.filePath);
    }
    
    public WordsFileHandler(){
        this.wordsArray = new ArrayList<>();
    }
    
    // return an array of all words read from words file
    public String[] readWordsFile(){
        try {
            File fileObj = new File(filePath);
            Scanner fileReader = new Scanner(fileObj);
            // treat each file line as an array word entry
            while (fileReader.hasNextLine()) {
                String word = fileReader.nextLine();
                this.wordsArray.add(word);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        // return converted array of read words
        return (String[]) this.wordsArray.toArray(new String[0]);
    }
}
