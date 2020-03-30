import java.util.ArrayList;
import java.util.function.DoubleToIntFunction;

public class Homearray {
    public static void main(String[] args) {
        String[] s = new String[]{"hello", ", ", "it ", "is ", "a ", "reverse", "."};


        myreverse(s);
        task2();

        ArrayList<String> names = new ArrayList<>();
        names.add("nazar");
        names.add("crash");
        System.out.print(names);
    }

    public static void myreverse(String[] arr) {
        int lenofstring = arr.length;
        String temp_string;
        int k = 0;
        int aver = (int)lenofstring/2;
        System.out.println(aver);
        for (int i = lenofstring-1; i>aver;i--)
        {
            temp_string = arr[i];
            arr[i] = arr[k];
            arr[k] = temp_string;
            k++;
        }
        for(String x: arr)
            System.out.print(x);
    }
    public static void task2() {
        double[] first = new double[5];
        double[] second = new double[5];
        random(first);
        random(second);
        double averfirst = aver(first);
        double aversecond = aver(second);
        if(averfirst > aversecond)
            System.out.print("first aver is bigger");
        if(averfirst<aversecond)
            System.out.print("second aver is bigger");
        else
            System.out.print("first aver == second aver");

    }
    public static void random(double[] arr)
    {
        int len = arr.length;
        for(int i=0; i<len;i++)
        {
            arr[i] = (int)Math.round(Math.random()*6);
        }
        for(double t: arr)
            System.out.print(t+" ");
        System.out.println(" ");
    }
    public static double aver(double[]arr)
    {
        int len = arr.length;
        double sum =0;
        for(int i=0; i<len;i++)
        {
            sum += arr[i];
        }
        return sum/len;
    }



}
