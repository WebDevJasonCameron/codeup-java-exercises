package javaWarmups;

public class Practice {

    public static int subtractTen(int n){
        return n -10;
    }
    public static double average(int[] aNum){
        double output = 0;
        int div = aNum.length;
        for (int i = 0; i < aNum.length; i++) {
            output += (double) aNum[i];
        }
        return output / div;
    }
}

