package com.fun.tictactoe;

public class Board {

	/*
	 * ---
	 * ---
	 * ---
	 * 
	 */
	
	Piece[][] state;
	
	public Board(int width, int height){
		state = new Piece[width][height];
	}
	
	public void setSpace(int x, int y, Piece piece){
		state[x][y] = piece;
	}
	
	public String print(){
		String board = "";
		for(int i=0;i<state.length;i++){
			for(int j=0;j<state[i].length;j++){
				board+=state[i][j].toString()+" ";
			}
			board+="\n";
		}
		return board;
	}
	
}
