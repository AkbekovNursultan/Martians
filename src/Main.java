import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Random ran = new Random();
       int firstBox = ran.nextInt(200) + 100;
       int secondBox = ran.nextInt(200) + 100;
       int thirdBox = 713 - firstBox- secondBox;
       int[] possibleLocations = new int[6];
       locations(possibleLocations);
       putBox(firstBox, possibleLocations);
       putBox(secondBox, possibleLocations);
       putBox(thirdBox, possibleLocations);
       System.out.println(firstBox + " " + secondBox + " " + thirdBox);
       for(int i = 0; i < 6; i++){
           System.out.print(possibleLocations[i] + " ");
       }
       System.out.println("Enter the coordinates from 1 to 6: ");
       int firstGuess = sc.nextInt()-1;
       while(firstGuess < 0 || firstGuess > 6){
           System.out.println("Invalid coordinates. ");
           firstGuess = sc.nextInt()-1;
       }
       System.out.println("Enter the second coordinate from 1 to 6: ");
       int secondGuess = sc.nextInt()-1;
       while(secondGuess < 0 || secondGuess > 6 || secondGuess == firstGuess){
           System.out.println("Invalid coordinates. ");
           secondGuess = sc.nextInt()-1;
       }
       System.out.println("Enter the third coordinate from 1 to 6: ");
       int thirdGuess = sc.nextInt()-1;
        while(thirdGuess < 0 || thirdGuess > 6 || thirdGuess == firstGuess || thirdGuess == secondGuess){
            System.out.println("Invalid coordinates. ");
            thirdGuess = sc.nextInt()-1;
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