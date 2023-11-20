import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Random ran = new Random();
       int firstBox = ran.nextInt(200) + 100;
       int secondBox = ran.nextInt(200) + 100;
       int thirdBox = 713 - firstBox- secondBox;
       while(true) {
           int[] possibleLocations = new int[6];
           locations(possibleLocations);
           putBox(firstBox, possibleLocations);
           putBox(secondBox, possibleLocations);
           putBox(thirdBox, possibleLocations);
           System.out.println("\nEnter the first coordinate from 1 to 6: ");
           int firstGuess = sc.nextInt() - 1;
           while (firstGuess < 0 || firstGuess > 6) {
               System.out.println("Invalid coordinates. ");
               firstGuess = sc.nextInt() - 1;
           }
           System.out.println("Enter the second coordinate from 1 to 6: ");
           int secondGuess = sc.nextInt() - 1;
           while (secondGuess < 0 || secondGuess > 6 || secondGuess == firstGuess) {
               System.out.println("Invalid coordinates. ");
               secondGuess = sc.nextInt() - 1;
           }
           System.out.println("Enter the third coordinate from 1 to 6: ");
           int thirdGuess = sc.nextInt() - 1;
           while (thirdGuess < 0 || thirdGuess > 6 || thirdGuess == firstGuess || thirdGuess == secondGuess) {
               System.out.println("Invalid coordinates. ");
               thirdGuess = sc.nextInt() - 1;
           }
           int boxesNumber = foundBoxesNumber(possibleLocations, firstBox, secondBox, thirdBox, firstGuess, secondGuess, thirdGuess);
           if(boxesNumber == 3){
               break;
           } else if(boxesNumber == 2) {
               System.out.println("You got 2 right!");
           } else if (boxesNumber == 1) {
               System.out.println("You got 1 right");
           } else {
               System.out.println("Damn you are bad at it!");
           }
       }
        System.out.println("Yaay! U found them all!");
        System.out.println("Their weights are:");
        System.out.println(firstBox + " " + secondBox + " " + thirdBox);
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
    static int foundBoxesNumber(int[] possibleLocations, int firstBox, int secondBox, int thirdBox, int firstGuess, int secondGuess, int thirdGuess){
        int sum = possibleLocations[firstGuess] + possibleLocations[secondGuess] + possibleLocations[thirdGuess];
        if(sum == 713){
            return 3;
        } else if (sum == 713 - firstBox || sum == 713 - secondBox || sum == 713 - thirdBox) {
            return 2;
        } else if (sum == 713 - firstBox - secondBox || sum == 713 - secondBox - thirdBox || sum == 713 - firstBox - thirdBox) {
            return 1;
        }
        return 0;
    }
}