package roratearray;

/**
 * Created by Mez on 29/06/2016.
 */
public class RotateArrayApp {

    public static void main(String[] args){

        String[] original = {"somethi","thing","cool", "else"};
        RotateArrayMod rotateArrayMod = new RotateArrayMod();
        String[] rotatedResult = rotateArrayMod.rotate(original, 3);

        System.out.println(rotatedResult[0] + " " + rotatedResult[1] + " " + rotatedResult[2]);

    }
}
