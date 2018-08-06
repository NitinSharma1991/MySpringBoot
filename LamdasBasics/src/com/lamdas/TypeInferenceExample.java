package com.lamdas;

public class TypeInferenceExample {

    static void perform(AddLamda addLamda){
        System.out.print(addLamda.add(60,70));
    }

    public static void main(String[] args){

        AddLamda addLamda = (a,b)->a+b;

perform(addLamda);
   //     System.out.print(addLamda.add(20,70));

    }
}
