import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;




public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double cord1x = sc.nextDouble();
        double cord1y = sc.nextDouble();
        double cord2x = sc.nextDouble();
        double cord2y = sc.nextDouble();
        double cord3x = sc.nextDouble();
        double cord3y = sc.nextDouble();
        double cord4x = sc.nextDouble();
        double cord4y = sc.nextDouble();

        double distInicial = Math.sqrt(Math.pow(cord1x - 0 , 2)+ Math.pow(cord1y - 0 , 2));
        double dist1to2 = Math.sqrt(Math.pow(cord2x - cord1x , 2 )+ Math.pow(cord2y - cord1y , 2));
        double dist2to3 = Math.sqrt(Math.pow(cord3x - cord2x , 2 )+ Math.pow(cord3y - cord2y , 2));
        double dist3to4 = Math.sqrt(Math.pow(cord4x - cord3x , 2 )+ Math.pow(cord4y - cord3y , 2));
        double distReturn = Math.sqrt(Math.pow(0 - cord4x , 2 )+ Math.pow(0 - cord4y , 2));

        System.out.println(Math.round(distInicial+dist1to2+dist2to3+dist3to4+distReturn));

    }

}
