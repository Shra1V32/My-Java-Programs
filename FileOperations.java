import java.io.*;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.print.Doc;
import javax.swing.text.html.HTMLDocument.Iterator;

import javafx.stage.StageStyle;

public class FileOperations {
    public static void main(String[] args) {
        File f1 = new File(".", "file.txt");
        System.out.println("Name of the file: "+ f1.getName());
        System.out.println("Path of the File: " + f1.getPath());
        System.out.println("Parent Directory: "+f1.getParent());
        System.out.println("Does the file exist? " + f1.exists());
        System.out.println("Is file readable? " + f1.canRead());
        System.out.println("Is file writable? " +f1.canWrite());
        System.out.println("Is the path directory? "+f1.isDirectory());
        System.out.println("Is the path a file? " + f1.isFile());
        System.out.println("When was the file last modified? " + f1.lastModified());
        System.out.println("Size of the file "+f1.length());
        System.out.println("Is the file deleted? " + f1.delete());
        
        
    }
}
