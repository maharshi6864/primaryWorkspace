package com.tic_toc.service;

import com.tic_toc.dto.TrackPostion;

public class Match {

	private char findMatch(char x, char y, char z) {
		if (x == 'X' && y == 'X' && z == 'X') {
			return 'x';
		}

		if (x == '0' && y == '0' && z == '0') {
			return '0';
		}
		return ' ';
	}

	public TrackPostion checkWinning(TrackPostion track) {
		String postion = track.getMatch();
		char results[] = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
		for (int i = 0; i < 9; i++) {
			System.out.println(postion.charAt(i));
		}
		results[0] = findMatch(postion.charAt(0), postion.charAt(1), postion.charAt(2));
		results[1] = findMatch(postion.charAt(3), postion.charAt(4), postion.charAt(5));
		results[2] = findMatch(postion.charAt(6), postion.charAt(7), postion.charAt(8));
		results[3] = findMatch(postion.charAt(0), postion.charAt(3), postion.charAt(6));
		results[4] = findMatch(postion.charAt(1), postion.charAt(4), postion.charAt(7));
		results[5] = findMatch(postion.charAt(2), postion.charAt(5), postion.charAt(8));
		results[6] = findMatch(postion.charAt(0), postion.charAt(4), postion.charAt(8));
		results[7] = findMatch(postion.charAt(2), postion.charAt(4), postion.charAt(6));
		for (int i = 0; i < 8; i++) {
			if (results[i] == 'x') {
				track.setPlayer2Score(track.getPlayer2Score()+1);
				track.setCount(0);
				track.setPlayer1Turn(true);
				track.setPlayer2Turn(false);
				track.setPlayer1Position("d10");
				track.setPlayer2Position("d10");
				track.setWinDetect(true);
				System.out.println("Player  2 detected !!");
				track.setMatch("         ");
			}
			if (results[i] == '0') {
				track.setPlayer1Score(track.getPlayer1Score()+1);
				track.setCount(0);
				track.setPlayer1Turn(true);
				track.setPlayer2Turn(false);
				track.setPlayer1Position("d10");
				track.setPlayer2Position("d10");
				track.setWinDetect(true);
				System.out.println("Player 1 detected !!");
				track.setMatch("         ");
			}

		}
		if (track.getCount() == 9) {
			track.setCount(0);
			track.setPlayer1Turn(true);
			track.setPlayer2Turn(true);
//			track.setPlayer1Position("d10");
//			track.setPlayer2Position("d10");
			System.out.println("Game Over!!");
			track.setMatch("         ");
		}
		return track;
	}

}
