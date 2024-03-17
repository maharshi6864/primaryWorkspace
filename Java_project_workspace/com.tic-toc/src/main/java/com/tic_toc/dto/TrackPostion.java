package com.tic_toc.dto;

public class TrackPostion {

	private int gameid;

	private int count;

	private String player1Name;

	private String player2Name;

	private int player1Score = 0;

	private int player2Score = 0;

	private String match;

	private String player2Position;

	private String player1Position;

	private String player2Sign;

	private String player1Sign;

	private Boolean player1Turn = false;

	private Boolean player2Turn = false;
	
	private Boolean winDetect= false;

	public int getPlayer1Score() {
		return player1Score;
	}

	public void setPlayer1Score(int player1Score) {
		this.player1Score = player1Score;
	}

	public int getPlayer2Score() {
		return player2Score;
	}

	public void setPlayer2Score(int player2Score) {
		this.player2Score = player2Score;
	}

	public Boolean getPlayer1Turn() {
		return player1Turn;
	}

	public void setPlayer1Turn(Boolean player1Turn) {
		this.player1Turn = player1Turn;
	}

	public Boolean getPlayer2Turn() {
		return player2Turn;
	}

	public void setPlayer2Turn(Boolean player2Turn) {
		this.player2Turn = player2Turn;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getPlayer1Name() {
		return player1Name;
	}

	public void setPlayer1Name(String player1Name) {
		this.player1Name = player1Name;
	}

	public String getPlayer2Name() {
		return player2Name;
	}

	public void setPlayer2Name(String player2Name) {
		this.player2Name = player2Name;
	}

	public int getGameid() {
		return gameid;
	}

	public void setGameid(int gameid) {
		this.gameid = gameid;
	}

	public String getPlayer2Sign() {
		return player2Sign;
	}

	public void setPlayer2Sign(String player2Sign) {
		this.player2Sign = player2Sign;
	}

	public String getPlayer1Sign() {
		return player1Sign;
	}

	public void setPlayer1Sign(String player1Sign) {
		this.player1Sign = player1Sign;
	}

	public String getMatch() {
		return match;
	}

	public void setMatch(String match) {
		this.match = match;
	}

	public String getPlayer1Position() {
		return player1Position;
	}

	public void setPlayer1Position(String player1Position) {
		this.player1Position = player1Position;
	}

	public String getPlayer2Position() {
		return player2Position;
	}

	public void setPlayer2Position(String player2Position) {
		this.player2Position = player2Position;
	}

	public Boolean getWinDetect() {
		return winDetect;
	}

	public void setWinDetect(Boolean winDetect) {
		this.winDetect = winDetect;
	}
}
