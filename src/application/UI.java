package application;

import chess.ChessPiece;

public class UI {
	public static void printBoard(ChessPiece[][] pieces) {
		for (int x = 0; x < pieces.length; x++) {
			System.out.print((8 - x) + " ");
			for(int y = 0; y < pieces.length; y++) {
				printPiece(pieces[x][y]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	private static void printPiece(ChessPiece piece) {
		if(piece == null) {
			System.out.print("-");
		}
		else {
			System.out.print(piece);
		}
		
		System.out.print(" ");
	}

}
