package typelearn;

import java.util.Scanner;

/*
    descipriton(user story): a timed speed typing program where
    words are shown to the users and they have to type them, each word 
    is sperated by a space, the user can delete the letters that they typed in the current
    word to correct themselves but as soon as they press space to go 
    to the next word they cant delete the previous one.
    
*/

/*
    task 1: write a txt file reader that reads words(line seperated text) loads them into mem then
    displays them as space seperated
    task 2: write the typing functionality where user input is read and stored in an array
    task 3: write a timer that starts from first sentence prompt and ends with last sentense typed
    task 4: write the fault percentage functionality where the file words array is simply compared with
    the user input array
*/


public class Main {
    public static void main(String[] args){
        WordsFileHandler handler = new WordsFileHandler();
        String[] words = handler.readWordsFile();
 
//        System.out.println(handler.filePathGetter());
    }
}
