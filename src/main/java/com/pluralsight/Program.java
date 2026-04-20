package com.pluralsight;

import java.util.Scanner;

public class Program {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String[] quotes = {
                "I'm going to be King of the Pirates! – Monkey D. Luffy",
                "When do you think people die? When they are shot? No. When they eat a poisonous mushroom? No. It's when they are forgotten! – Dr. Hiluluk",
                "If you don’t take risks, you can’t create a future! – Monkey D. Luffy",
                "Scars on the back are a swordsman’s shame. – Roronoa Zoro",
                "Inherited will, the destiny of the age, and the dreams of its people… these things will never be stopped. – Gol D. Roger",
                "A man dies when he is forgotten. – Dr. Hiluluk",
                "If I give up now, I’m going to regret it. – Roronoa Zoro",
                "Miracles only happen to those who never give up. – Emporio Ivankov",
                "No matter how deep the night, it always turns to day, eventually. – Brook",
                "Being alone is more painful than getting hurt. – Monkey D. Luffy"
        };
        System.out.print("Select a number from 1 to 10: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        int quoteIndex = --option;
        try {
            System.out.println(quotes[quoteIndex]);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
