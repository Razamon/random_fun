package com.fun.tictactoe;

public class Piece {

	char represent;
	
	public Piece(char rep){
		represent = rep;
	}
	
	public String toString(){
		return represent+"";
	}
	
	public void setRep(char rep){
		represent = rep;
	}
}
