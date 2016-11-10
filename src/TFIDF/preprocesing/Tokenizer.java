/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TFIDF.preprocesing;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Kotak Hitam
 */
public class Tokenizer {

    String text;
    Scanner scn = null;

    public Tokenizer(String text) {
        this.text = text.toLowerCase(); // case folding
        scn = new Scanner(this.text);
        //delimiter
        scn.useDelimiter("[ 0-9,\\W]+");
        while (scn.hasNext()) {
            this.text += scn.next() + " ";
        }
        scn.close();
    }

    public ArrayList<String> getTokenToArrayList() {
        ArrayList<String> hasilToken = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(this.text);
        String[] temp = new String[1];
        while (st.hasMoreTokens()) {
            hasilToken.add(st.nextToken());
        }
        return hasilToken;
    }

    public String[] getTokenToArray() {
        String[] hasilToken = new String[999];
        StringTokenizer st = new StringTokenizer(this.text);
        int i = 0;
        String[] temp = new String[1];
        while (st.hasMoreTokens()) {
            hasilToken[i++] = st.nextToken();
        }
        return hasilToken;
    }

}
