package lesson09.homework;

import java.io.File;

public class delete {

    public static void deleteFolder(File file){
        for (File subFile : file.listFiles()) {
            if(subFile.isDirectory()) {
                deleteFolder(subFile);
            } else {
                subFile.delete();
            }
        }
        file.delete();
    }

    public static void main(String args[]) {

        File file = new File("C:\\lesson9");
        deleteFolder(file);

    }
}