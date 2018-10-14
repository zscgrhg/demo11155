package com.example.demo;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.File;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Debug {
     public static void main(String[] args) {
        JavaCompiler javac = ToolProvider.getSystemJavaCompiler();
        File dir=new File("C:\\Users\\CLASSWORLDS\\IdeaProjects\\demo11155\\target\\out");
        if(!dir.exists()){
            dir.mkdirs();
        }
         File[] jarFiles = new File("C:\\Users\\CLASSWORLDS\\IdeaProjects\\demo11155\\lib").listFiles();
         String classpath = Stream.of(jarFiles)
                 .map(File::getAbsolutePath)
                 .collect(Collectors.joining(";"));
         System.out.println("classpath="+classpath);
         int rc = javac.run(null, null, null,

                "-classpath", classpath,
                "-d","C:\\Users\\CLASSWORLDS\\IdeaProjects\\demo11155\\target\\out",
               // "-parameters",
                "C:\\Users\\CLASSWORLDS\\IdeaProjects\\demo11155\\src\\main\\ops\\com\\example\\ps\\HelloContract.java",
                "C:\\Users\\CLASSWORLDS\\IdeaProjects\\demo11155\\src\\main\\ops\\com\\example\\ps\\HelloProvider.java");
    }
}
