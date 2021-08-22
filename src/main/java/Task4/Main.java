/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task4;

/**
 *
 * @author Aleksey
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] array = new int[100];
       int countPos = 0, countNeg = 0;
       for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 100)-50);
            System.out.println(array[i]);
        }
       System.out.println(String.format("Next"));
       for (int i = 0; i < array.length; i++) {
           if (array[i] >= 0) countPos++;
           if (array[i] < 0) countNeg++;
       }
       int[] arrayPos = new int[countPos];
       int[] arrayNeg = new int[countNeg];
       for (int i = 0; i < arrayPos.length; i++){
           if (array[i] >= 0) arrayPos[i]= array[i];
       }
       for (int i = 0; i < arrayNeg.length; i++){
           if (array[i] < 0) arrayNeg[i]= array[i];
       }
       System.out.println(String.format("Positive array :"));
       for (int i = 0; i < arrayPos.length; i++) {
            System.out.println(arrayPos[i]);
        }
       System.out.println(String.format("Negative array :"));
       for (int i = 0; i < arrayNeg.length; i++) {
            System.out.println(arrayNeg[i]);
        }
    }
    
}
