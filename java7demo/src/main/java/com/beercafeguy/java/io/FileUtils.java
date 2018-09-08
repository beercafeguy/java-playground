package com.beercafeguy.java.io;

import java.io.File;
import java.io.IOException;

public class FileUtils {
    public static void main(String[] args) throws IOException {
        File file=new File("file.txt");
        if(!file.exists()){
            boolean r=file.createNewFile(); //if file does not exist create new file
            System.out.println("Result of file creation: "+r);
        }

        //creating dirs
        File dir=new File("C:\\Users\\hchandra\\git\\tmp\\");
        if(!dir.exists()){
            boolean r=dir.mkdirs();
            System.out.println("Result of Dir creation: "+r);
        }

        //write file inside a directory
        File fileinDir=new File(dir,"myfile.txt");
        if(!fileinDir.exists()){
            boolean r=fileinDir.createNewFile();
            System.out.println("Result of File in Dir creation: "+r);
        }

        //Delete file

\            fileinDir.delete();
        }

        //rename a file
        if(file.exists()) {
            file.renameTo(new File("fileRenames.txt"));
        }
    }
}
