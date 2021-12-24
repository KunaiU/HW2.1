package com.company;

public class Main {

    public static void main(String[] args) {
Parameters(21,-1);
Parameters(0,2);
Parameters(40,20);
Parameters(90,-16);
Parameters(11,18);

    }
    public static String Parameters(int age, int temperature){
        String word = " ";

        if (Parameters (age > 20, temperature<30)){
             if (Parameters(age < 45, temperature > -10)){}
             if (Parameters(age < 20, temperature > 0 || temperature < 28)){}

            System.out.println("Можно гулять");

        }
        if (Parameters(age > 24, temperature > -10 || temperature < 25)){
            System.out.println("Оставайтесь дома");
        }


        return word;
    }

    private static boolean Parameters(boolean b, boolean b1) {
        return b;
    }

    private static void Parameters(boolean b) {

    }
}
