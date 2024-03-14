import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Input the First number: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Input the Second number: ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Input the Third number: ");
        int c = new Scanner(System.in).nextInt();
        int max, min;
    /*
        the first way
        max = Math.max(a, Math.max(b,c));
        min = Math.min(a, Math.min(b,c));
    */

    /*
        the second way
        if(a <= b) {
            max = b;
            min = a;
            if (max < c)
                max = c;
            else if (min > c)
                min = c;
        }
        else{
            max = a;
            min = b;
            if(max < c)
                max = c;
            else if (min > c)
                min = c;
        }
    */
        //the third way
        if(a < b) {
            max = b;
            min = a;
        }else{
            max = a;
            min = b;
        }
        if(max < c)
            max = c;
        else if(min > c)
            min = c;

        System.out.println("The Greatest: "+ max);
        System.out.println("The Lowest: "+ min);

    }
}

