
package com.mycompany.guessingnumbergame;
import java.util.Random;
import java.util.Scanner;


class Game{
    int computer;
    private final int bound;
    public Game(){
        Random rand=new Random();
        computer=rand.nextInt(bound=100);
        System.out.println("Guess the number from 1 to 100");
    }
    public int computerNo(){return computer;}
    
}

public class GuessingNumberGame {
    static int takeuserinput(){
        int user;
        System.out.println("ENTER");
        Scanner sc=new Scanner(System.in);
        user=sc.nextInt();
        return user;
    }
    
    static void iscorrectnumber(int i,int j){
        if(i==j){
            System.out.println("CORRECT NUMBER GUESS");
        }
        else if(i>j){
            System.out.println("YOUR NUMBER IS LARGER THAN COMPUTER NUMBER");
             }
        else{
            System.out.println("YOUR NUMBER IS SMALLER THAN COMPUTER NUMBER");
        }
    }

    public static void main(String[] args) {
        int user=0,computer=0,itteration=0;
        Game g=new Game();
        do{
            user=takeuserinput();
            computer=g.computerNo();
            iscorrectnumber(user,computer);
            itteration++;
        }while(user!=computer);
        System.out.println("YOUR GUESS NUMBER IN"+ itteration+" ITTERATIONS");
    }
}

