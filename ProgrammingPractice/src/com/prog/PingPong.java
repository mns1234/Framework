package com.prog;
/*1 b. Write a program print "ping" if a number is divisible by 3,"pong" if a number is 
divisible by 5, and "ping pong" if number is divisible by both, else print the number.*/

public class PingPong {
int i;
public void game(int i){
	if (i%3==0){
		System.out.println("ping");}
		else if(i%5==0){
		System.out.println("pong");	
		}
		else{
			System.out.println("pingpong");
		}
	}	
	public static void main(String[] args) {
		PingPong pg=new PingPong();
		pg.game(11);
	}

}
