package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Scratch {
    public String[] fizzBuzz(Integer n){
        String[] res = new String[n];
        for(int i=0;i<n;i++){
            res[i] = Integer.toString(i+1);

            if((i+1)%5 == 0 && (i+1)%3 ==0) {
                res[i] = "FIZZBUZZ";
            }
            else if((i+1)%5 == 0){
                res[i] = "BUZZ";
            }
            else if ((i+1)%3 == 0){
                res[i] = "FIZZ";
            }

        }
        return res;
    }
    public Integer[] fibonacii(Integer n){
        int a=0,b=1;
        int i = 2;
        Integer[] ans = new Integer[n];
        ans[0] = 0;
        ans[1] = 1;
        while(i<n){
            ans[i] = a+b;
            int temp = a;
            a = b;
            b = ans[i];
            i += 1;
        }
        return ans;

    }

    public Map<String,Integer> countFrequencies(String s){

        String[] words = s.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<words.length; i++)
        {
            if(map.containsKey(words[i]))
                map.put(words[i], map.get(words[i])+1);
            else
                map.put(words[i], 1);
        }
        return map;
    }

}



public class Main {

    public static void main(String[] args) {
        Scratch s = new Scratch();
        String[] res = s.fizzBuzz(15);
        Integer[] fiboRes = s.fibonacii(10);


        // count frequencies
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sting");
        Map<String,Integer> count ;
        count = s.countFrequencies(sc.nextLine());
        for (Map.Entry<String,Integer> entry : count.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        /*
        
        // FizzBuzz
        for(int i=0;i< res.length;i++){
            System.out.println("ans is :"+res[i]);
        }

         */


        // Fibonacii
        for(int i=0;i< fiboRes.length;i++){
            System.out.println("fibo :"+ fiboRes[i]);
        }


    }
}
