import java.util.Arrays;

public class maxmin {
    public static void main (String[] args){
    int a[]={11,21,34,46,68};
    int sum= a[0]+a[1]+a[2]+a[3]+a[4];
    int average=sum*5/100;
    int maximum=Arrays.stream(a).max().getAsInt();
    int minimum=Arrays.stream(a).max().getAsInt();
    System.out.println("Sum of Array of scores: "+sum);
    System.out.println("Average of Array of scores: "+average);
    System.out.println("Maximum of Array of scores: "+maximum);
    System.out.println("Minimum of Array of scores: "+minimum);


    }
}