import java.util.ArrayList;

public class lcm {
    //find the lcm of an arraylist of ints

    public static ArrayList<Integer> input = new ArrayList<Integer>();
    public static ArrayList<Integer> one = new ArrayList<Integer>();
    public static ArrayList<Integer> two = new ArrayList<Integer>();

    public static void main(String[] args){

        input.add(4);
        input.add(3);
        input.add(2);

        mergeSort(input,input.size());
        System.out.println(input);

        System.out.println(one.get(one.size()-1)); //THIS IS THE TOTAL LCM

    }

    //McKee if you're reading this Andrew Xie wrote the modified mergesort + lcm

    //code from includehelp.com
    public static int lcm(int First_number, int Second_number) {
        int x,max=0,min=0,lcm=0;
        if(First_number>Second_number)
        {
            max=First_number;
            min=Second_number;
        }
        else
        {
            max=Second_number;
            min=First_number;
        }
        for(int i=1;i<=min;i++)
        {
            x=max*i;
            if(x%min==0)
            {
                lcm=x;
                break;
            }
        }
        return lcm;
    }



    //Original code from Baeldung, modifications by Andrew Xie (to work with array lists and to lcm an arraylist instead of lcm)
    public static void mergeSort(ArrayList<Integer> a, int n) { //n is the "Array length"
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        ArrayList<Integer> l = new ArrayList<Integer>(); //length mid
        ArrayList<Integer> r = new ArrayList<Integer>(); //length n-mid

        for (int i = 0; i < mid; i++) {
            l.add(i,a.get(i));
        }
        for (int i = mid; i < n; i++) {
            r.add(i - mid, a.get(i));
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        a.add(lcm(l.get(0),r.get(0)));
        one.add(lcm(l.get(0),r.get(0)));    }
}