/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TFIDF.preprocesing;

import java.util.*;
import java.io.File;

/**
 *
 * @author Kotak Hitam
 */
public class StopwordRemoval {

    String text;
    ArrayList<String> wordList = new ArrayList<String>();
    Document dc = new Document(new File("stopword-1.txt"));
    static String[] stopWords = null;

    public StopwordRemoval() {
        stopWords = dc.getText().split("\n");
        if (text.isEmpty()) {
            System.out.println("Text tidak tersedia");
        }
    }

    public StopwordRemoval(String text) {
        stopWords = dc.getText().split("\n");
        this.text = text;
        removeStopword();
    }

    public StopwordRemoval(ArrayList<String> text) {
        stopWords = dc.getText().split("\n");
        removeStopword(text);
    }

    private void removeStopword() {
        this.text = this.text.trim().replace("\\s", " ");
        String[] kata = this.text.split(" ");

        for (String i : kata) {
            wordList.add(i);
        }

        for (int i = 0; i < wordList.size(); i++) {
            for (int j = 0; j < stopWords.length; j++) {
                if (wordList.contains(stopWords[j])) {
                    wordList.remove(stopWords[j]);
                    wordList.remove("");
                }
            }
        }
    }

    private void removeStopword(ArrayList<String> hasilToken) {
        this.wordList = hasilToken;
        for (int i = 0; i < hasilToken.size(); i++) {
            for (int j = 0; j < stopWords.length; j++) {
                if (wordList.contains(stopWords[j])) {
                    wordList.remove(stopWords[j]);
                    wordList.remove("");
                }
            }
        }
    }

    public String getTextToString() {
        return this.wordList.toString();
    }
    
    public ArrayList<String> getTextToArrayList(){
        return this.wordList;
    }
    
    public String[] getTextToArray(){
        return (String[]) this.wordList.toArray();
    }
}
