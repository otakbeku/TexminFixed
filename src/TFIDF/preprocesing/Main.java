/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TFIDF.preprocesing;

import java.io.File;

/**
 *
 * @author Kotak Hitam
 */
public class Main {

    public static void main(String[] args) {
        Preprocessing pcr = new Preprocessing(new File("doc1.txt"));
        System.out.println("hasil: "+pcr.getHasil());
    }
}
