/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TFIDF.preprocesing;

import java.util.ArrayList;
import org.apache.lucene.analysis.id.IndonesianStemmer;

/**
 *
 * @author Kotak Hitam
 */
public class Stemming {

    IndonesianStemmer IndStem = null;
    String kata = null;

    public Stemming() {
        IndStem = new IndonesianStemmer();
    }

    public Stemming(String text) {
        IndStem = new IndonesianStemmer();
    }

    public Stemming(ArrayList<String> text) {
        IndStem = new IndonesianStemmer();
    }
}
