package codingChallenges;

import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Random random = new Random();


        for (int i =0;i<10;i++){
            int r = random.nextInt(101);
            System.out.println(r);
        }
    }
}
