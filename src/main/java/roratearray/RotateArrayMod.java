package roratearray;

/**
 * Created by Mez on 29/06/2016.
 */
public class RotateArrayMod implements RotateArray{

    public String[] rotate(String[] array, int shift) {
        int mod = array.length;
        String[] rotatedArray = new String[mod];

        for(int i = 0; i < array.length; i++) {
            int newPosition = (i+shift)%mod;
            rotatedArray[newPosition] = array[i];
        }
        return rotatedArray;
    }

}
