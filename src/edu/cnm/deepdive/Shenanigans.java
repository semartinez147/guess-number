package edu.cnm.deepdive;

public class Shenanigans {

  public static void main (String[] args) {
    int[] nums = {1,3,9,5,7,9};
    int count = 0;

    for (int i = 0; i < nums.length; i++){
      if (nums[i] == 9) {
        count++;
      }
    }
    System.out.println(count);
  }

}
