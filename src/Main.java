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
       int[] possibleLocations = new int[6];
       locations(possibleLocations);
        putBox(firstBox, possibleLocations);
        putBox(secondBox, possibleLocations);
        putBox(thirdBox, possibleLocations);
        System.out.println(firstBox + " " + secondBox + " " + thirdBox);
        for(int i = 0; i < 6; i++){
            System.out.print(possibleLocations[i] + " ");
        }
    }
    static void putBox(int box, int[] possibleLocations){
        Random ran = new Random();
        int place = ran.nextInt(5);
        while(possibleLocations[place] != 0) {
            place = ran.nextInt(5);
        }
        possibleLocations[place] = box;
    }
    static void locations(int [] possibleLocations){
        for(int i = 0; i < 6; i++){
            possibleLocations[i] = 0;
        }
    }
}