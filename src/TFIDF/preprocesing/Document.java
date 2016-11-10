/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TFIDF.preprocesing;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kotak Hitam
 */
public class Document {

    File file;

    public Document() {

    }

    public Document(File file) {
        this.file = file;
    }

    public String getText() {
        String text = "";
        if (!this.file.exists() && !this.file.canRead()) {
            System.out.println("File tidak ada dan tidak bisa dibaca");
        } else {
            try {
                BufferedReader in = new BufferedReader(new FileReader(this.file));
                String line;
                while ((line = in.readLine()) != null) {
                    text += line + "\n";
                }
                in.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Document.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                text = ex.toString();
            }
        }
        return text;
    }
}
