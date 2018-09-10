package com.beercafeguy.java.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathOperations {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("C:\\Users\\hchandra\\git\\java-playground\\java7demo\\file2.txt");


        //path to file and file to Path
        File file=path.toFile();
        Path pathBack=file.toPath();


        //check if the path exists
        System.out.println("Path Exists: "+ Files.exists(path));

        //create a new file
        Path path5= Paths.get("C:\\Users\\hchandra\\git\\java-playground\\java7demo\\file5.txt");
        System.out.println("Path Exists: "+Files.exists(path5));
        Files.createFile(path5);
        System.out.println("Path Exists: "+Files.exists(path5));

        //create dir
        Path dir1= Paths.get("C:\\Users\\hchandra\\git\\java-playground\\java7demo\\niodemo\\");
        System.out.println("Dir Exists: "+Files.exists(dir1));
        Files.createDirectories(dir1);
        System.out.println("Dir Exists: "+Files.exists(dir1));

        //copy,move,delete
        Path source1=Paths.get("C:\\Users\\hchandra\\git\\java-playground\\java7demo\\file2.txt");
        Path source2=Paths.get("C:\\Users\\hchandra\\git\\java-playground\\java7demo\\file3.txt");
        Path target=Paths.get("C:\\Users\\hchandra\\git\\java-playground\\java7demo\\target_merge.txt");
        Files.copy(source1,target);
        Files.copy(source2,target, StandardCopyOption.REPLACE_EXISTING);
        Files.delete(target);
        //or
        Files.move(source1,target);
        Files.deleteIfExists(target);


        //get information from path
        System.out.println("File Name: "+path5);
        System.out.println("Parent: "+path5.getParent().getFileName());


    }
}
