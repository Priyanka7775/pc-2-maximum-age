package com.jap;

public class MaxAge {

   // Write the logic to calculate the maximum age from the given array
    //inside the below method and return the calculated maximum age.
    public int getMaxAge(int [] age){

        int maximum=0;
        for(int i=1;i<age.length;i++){
            if(maximum<age[i]){
                maximum=age[i];
            }
        }
        return maximum;
    }



    public static void main(String[] args) {
        int []age = {23,34,33,24,25,26,31};
        MaxAge maxAge= new MaxAge();
        int max= maxAge.getMaxAge(age);

        System.out.print(max);
    }
}
