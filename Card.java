import java.io.*;
import java.util.*;

public class Card implements Comparable<Card>
{
	private String suit;
	private String figure;

	public Card(String s, String f) {
		suit = s; figure = f;
	}

	public int compareTo(Card that) {
		if( this.suit() > that.suit() ) 			return +1;
		if( this.suit() == that.suit() ) {
			if( this.figure() > that.figure() ) 		return +1;
			if( this.figure() < that.figure() ) 		return -1;
		}
		if( this.suit() < that.suit() ) 			return -1;
		return 0;
	}

	public int suit() {
		if(suit.equals("Spade")) 	return 5;
		if(suit.equals("Heart")) 	return 4;
		if(suit.equals("Diamond")) 	return 3;
		if(suit.equals("Club")) 	return 2;
		return 0;
	}

	public int figure() {
		if(figure.equals("Ace")) 	return 30;
		if(figure.equals("King")) 	return 20;
		if(figure.equals("Queen")) 	return 15;
		if(figure.equals("Jack")) 	return 11;
		if(figure.equals("Ten")) 	return 10;
		if(figure.equals("Nine")) 	return 9;
		if(figure.equals("Eight")) 	return 8;
		if(figure.equals("Seven")) 	return 7;
		if(figure.equals("Six")) 	return 6;
		if(figure.equals("Five")) 	return 5;
		if(figure.equals("Four")) 	return 4;
		if(figure.equals("Three")) 	return 3;
		if(figure.equals("Two")) 	return 2;
		if(figure.equals("One")) 	return 1;
		return 0;
	}

	public String toString() {
		return suit + " " + figure;
	}

	public static void main(String[] args) {

		Card[] a = new Card[10];
		a[0] = new Card("Heart", "Ace");
		a[1] = new Card("Diamond", "King");
		a[2] = new Card("Heart", "One");
		a[3] = new Card("Spade", "Three");
		a[4] = new Card("Heart", "Queen");
		a[5] = new Card("Club", "Jack");
		a[6] = new Card("Club", "Ten");
		a[7] = new Card("Spade", "Queen");
		a[8] = new Card("Diamond", "Nine");
		a[9] = new Card("Club", "Ace");

		System.out.println("Before insertion sort:");
		for(int j = 0; j < a.length; j ++) {
			System.out.println(a[j] + " ");
		}
		System.out.println();
		Insertion.sort(a);
		System.out.println("After insertion sort:");
		for(int k = 0; k < a.length; k ++) {
			System.out.println(a[k] + " ");
		}
		System.out.println();
	}

}