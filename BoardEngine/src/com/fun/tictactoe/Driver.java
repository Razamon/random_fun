package com.fun.tictactoe;

public class Driver {

	/*
	 * Board
	 * Players
	 * Turns ?  Light Switch    boolean
	 * Pieces (X's and O's) ? character
	 * 
	 * Winner/Loser
	 * 
	 */
	
	
	public void setUp(){

		Board tictactoe = new Board(3,3);
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				Piece holder = new Piece('-');
				tictactoe.setSpace(i, j, holder);
			}
		}

		System.out.println(tictactoe.print());
	}
	
	public static void main(String[]args){
		Driver d = new Driver();
		d.setUp();
	}
	
}
