/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typelearn;

/**
 *
 * @author User
 */
public class Utils {
    
    static double spellingFaultPercentage(String[] originalWordsArray, String[] userWordArray){
        // calculate number of wrongly spelled words in user array devided by prompted number of words
        int wronglySpelledWordsCount = 0;
        for (int i = 0; i < originalWordsArray.length; i++){
            if (!originalWordsArray[i].equals(userWordArray[i]))
                wronglySpelledWordsCount++;
        }
        return (((double)wronglySpelledWordsCount / originalWordsArray.length) * 100);
    }
}
