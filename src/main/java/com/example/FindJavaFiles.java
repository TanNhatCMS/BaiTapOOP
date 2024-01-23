package com.example;

import java.io.File;

public class FindJavaFiles {
    public static void main(String[] args) {
        File projectDir = new File(System.getProperty("user.dir"));
        findAndPrintJavaFiles(projectDir);
    }

    private static void findAndPrintJavaFiles(File directory) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles((dir, name) -> name.endsWith(".java") && !name.equals("MainMethodTest.java"));
            if (files != null) {
                for (File file : files) {
                    System.out.println("Found Java file: " + file.getAbsolutePath());
                }
            }

            File[] subdirectories = directory.listFiles(File::isDirectory);
            if (subdirectories != null) {
                for (File subdirectory : subdirectories) {
                    findAndPrintJavaFiles(subdirectory);
                }
            }
        }
    }
}
