package testvertex;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {

    public static void filingList(ArrayList list, int amount){

        Random r = new Random();

        for (int i = 0; i < amount; i++){

            list.add(r.nextInt(100));
        }
    }

    public static int amountString(String fileName) throws IOException{

        int result = 0;

        FileReader fw = new FileReader(fileName);
        Scanner scan = new Scanner(fw);
        while (scan.hasNextLine()){
            scan.nextLine();
            result++;
        }
        fw.close();
        return result;
    }

    public static int[][] fillingArray(int[][] arr){

        for (int i = 0; i < arr.length; i++){

            for (int j = 0; j < arr.length; j++){

                arr[i][j] = arr.length * i + j + 1;
            }
        }

        return arr;
    }

    public static boolean isPalindrome(String str){

        boolean res;
        String temp = str.replaceAll("[\\pP\\s]", "");
        res = temp.equalsIgnoreCase(new StringBuilder(temp).reverse().toString());

        return res;
    }

    public static void fillOddElementsOfArrayByZero(int[] arr){

        for (int i = 0; i < arr.length; i++){

            if (i % 2 == 0){
                arr[i] = i + 1;
            }
            else {
                arr[i] = 0;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
