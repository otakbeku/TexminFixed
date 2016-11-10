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
public class Preprocessing {
    Document dc = null;
    Parsing p = null;
    StopwordRemoval swr =null;
    Tokenizer tkn = null;
    
    public Preprocessing() {
    
    }
    
    public Preprocessing(File file) {
    dc = new Document(file);
    tkn = new Tokenizer(dc.getText());
    swr = new StopwordRemoval(tkn.getTokenToArrayList());
    }
    
    public String getHasil(){
        return swr.getTextToString();
    }
    
    
    
}
