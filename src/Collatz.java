import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by vineet on 6/24/14.
 * This is a problem related to http://en.wikipedia.org/wiki/Collatz_conjecture
 *
 */
public class Collatz {
  public static int find(int j){
    int count = 1;
    int init = j;

    while(init != 1){
      if(init % 2 == 0)
        init >>= 1;
      else
        init = 3* init + 1;

      count++;
    }
    return count;
  }

  public static int getCollatz(int i , int j){
    int max = 0;
    for( int k = i ; k <= j ; k++){
      int temp = find(k);
      if(max < temp)
        max = temp;
    }

    return max;
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);


    while(sc.hasNextLine()){
      String line = sc.nextLine();
      String []ints = line.split(" ");
      int i = Integer.parseInt(ints[0]);
      int j = Integer.parseInt(ints[1]);

      int out = 0;
      if(i < j)
        out = getCollatz(i , j);
      else
        out = getCollatz(j , i);


      System.out.println(i + " " + j + " "+ out);
    }
  }

}
