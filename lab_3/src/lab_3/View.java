package lab_3;

import java.util.Scanner;

public class View {
	public void printFlats(Model flats) {
		System.out.println(" _____________________________________________________________________________ ");
		System.out.println("|  number    |  square    |  floor     |  rooms     |  type      | lifespan   |");
		System.out.println("|____________|____________|____________|____________|____________|____________| ");
		System.out.print(flats.toString());
		System.out.println("|____________|____________|____________|____________|____________|____________| ");
	}
	
	public int menuChoice() {
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("1.Add Flats from existing collection.");
		System.out.println("2.Add Flat.");
		System.out.println("3.Remove Flat.");
		System.out.println("4.Show All.");
		System.out.println("5.Filter By Rooms.");
		System.out.println("6.Filter By Square and Floor.");
		System.out.println("7.Exit.\n");
		System.out.print("Choose the option that you need by entering number\"1-7\" and pressing Enter: ");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		System.out.println();
	//	scan.close();
		return choice;
	}
	
	public void wrongChoice() {
		System.out.println("There is no such menu choice.");
	}
	
	public int setNumber() {
		Scanner scan = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter Number: ");
			number = scan.nextInt();
		}while(number <= 0);
	//	scan.close();
		return number;
	}
	public int setSquare() {
		Scanner scan = new Scanner(System.in);
		int square;
		do {
			System.out.print("Enter Square: ");
			square = scan.nextInt();
		}while(square <= 0);
	//	scan.close();
		return square;
	}
	public int setFloor() {
		Scanner scan = new Scanner(System.in);
		int floor;
		do {
			System.out.print("Enter Floor: ");
			floor = scan.nextInt();
		}while(floor <= 0);
	//	scan.close();
		return floor;
	}
	public int setRooms() {
		Scanner scan = new Scanner(System.in);
		int rooms;
		do {
			System.out.print("Enter number of Rooms: ");
			rooms = scan.nextInt();
		}while(rooms <= 0);
	//	scan.close();
		return rooms;
	}
	public Type setType() {
		System.out.print("Enter Type(R/C/E/M): ");
		Scanner scan = new Scanner(System.in);
		String type = scan.nextLine();
	//	scan.close();
		switch(type) {
		case "C" : 
			return Type.COMMERCIAL;
		case "E" :
			return Type.EDUCANTIONAL;
		case "R" :
			return Type.RESIDENTIAL;
		case "M" :
			return Type.MEDICAL;
		default :
			return Type.RESIDENTIAL;
		}
		
	}
	public int setLifespan() {
		Scanner scan = new Scanner(System.in);
		int lifespan;
		do {
			System.out.print("Enter Lifespan: ");
			lifespan = scan.nextInt();
		}while(lifespan <= 0);
	//	scan.close(); 
		return lifespan;
	}
	
	public int getPosition() {
		Scanner scan = new Scanner(System.in);
		int position;
		do {
			System.out.print("Enter Position: ");
			position = scan.nextInt();
		}while(position <= 0);
	//	scan.close();
		return position-1;
	}
	
	public void noMatches() {
		System.out.println("No matches have been found.");
	}
	
	public void noSuchPosition(int quantity) {
		System.out.println("There are only "+ quantity +" flats in the table.");
	}
	
	public void emptyTable() {
		System.out.println("There are no elements yet.");
	}
}
