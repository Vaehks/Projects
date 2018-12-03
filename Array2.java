/*
 Victor Diaz
12/03/18
CST-105
Lisa Hebert
 */
package Projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String filename = in.nextLine();
        try (Scanner fin = new Scanner(new File(filename))) {
            char arr[][] = new char[20][45];
            char defaultCharacter = ' ';
            for(int i = 0; i < arr.length; ++i) {
                for(int j = 0; j < arr[i].length; ++j) {
                    if(fin.hasNext()) {
                        arr[i][j] = fin.next().charAt(0);
                    } else {
                        arr[i][j] = defaultCharacter;
                    }
                }
            }
            String str = "";
            for(int i = 0; i < arr[0].length; ++i) {
                for(int j = 0; j < arr.length; ++j) {
                    str += arr[j][i];
                }
            }
            System.out.println(str);
        }
    }

}