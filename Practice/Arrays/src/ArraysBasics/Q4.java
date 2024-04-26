package ArraysBasics;

//Search a user input value index in Array

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Q4 obj =new Q4();
        int[] a = {12, 34, 56, 78, 90, 10};
        System.out.print("Enter an Index:");
        int id = input.nextInt();

        int i=obj.searchIndex(a,id);
        System.out.println("Index is: "+i);

    }
    public int searchIndex(int[]a,int val){
        for (int i=0;i<a.length;i++){
            if (a[i]==val){
                return i;
            }
        }
        return -1; // If any value not found in array return -1.
    }
}
