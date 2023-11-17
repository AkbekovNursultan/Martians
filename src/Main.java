import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Random ran = new Random();
       int firstBox = ran.nextInt(200)+100;
       int secondBox = ran.nextInt(200)+100;
       int thirdBox = ran.nextInt(200)+100;
       while(firstBox + secondBox + thirdBox != 713){
           firstBox = ran.nextInt(200)+100;
           secondBox = ran.nextInt(200)+100;
           thirdBox = ran.nextInt(200)+100;
       }
        System.out.println(firstBox + " " + secondBox + " " + thirdBox);
    }
}