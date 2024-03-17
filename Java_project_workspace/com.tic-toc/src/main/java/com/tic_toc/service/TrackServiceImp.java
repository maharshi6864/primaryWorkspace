package com.tic_toc.service;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;
import org.hibernate.id.CompositeNestedGeneratedValueGenerator.GenerationPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tic_toc.dto.Game;
import com.tic_toc.dto.TrackPostion;
import com.tic_toc.model.Tracker;

@Transactional
@Service
public class TrackServiceImp implements TrackService {

	int otp = 0;
	String player1 = "null";
	String player2 = "null";
	Game game = new Game();
	TrackPostion track = new TrackPostion();
	char match[];
	Match tool = new Match();

	@Override
	public List<Tracker> track() {

		return null;
	}

	@Override
	public ResponseEntity<Response> generateOtp(Game dto) {
		Response response = new Response();
		Random rand = new Random();
		otp = rand.nextInt(9999 - 1000 + 1) + 1000;
		game.setGameid(otp);
		track.setGameid(otp);
		player1 = dto.getPlayer1();
		game.setPlayer1(player1);
		track.setPlayer1Name(player1);
		track.setMatch(null);
		track.setPlayer1Turn(false);
		track.setPlayer2Turn(false);
		track.setPlayer1Position("d10");
		track.setPlayer2Position("d10");
		response.setData(game);
		response.setMessage("Game id Gnerated Successfully");
		response.setStatus(true);
		System.out.println(game.getPlayer2());
		System.out.println(game.getPlayer1());
		System.out.println(game.getGameid());
		// track=null;
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Response> waitForPlayer2() {
		Response response = new Response();
		response.setData(game);
		response.setMessage("waiting for player2 ");
		response.setStatus(true);
		System.out.println(game.getPlayer2());
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Response> savePlayer2(Game dto) {
		Response response = new Response();
		if (dto.getGameid() == otp) {
			player2 = dto.getPlayer2();
			game.setPlayer2(player2);
			track.setPlayer2Name(player2);
			System.out.println(game.getPlayer2());
			System.out.println("Player2 displayed on player1 screen");
		}
		game.setPlayer2(dto.getPlayer2());
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

	public ResponseEntity<Response> setPosition(TrackPostion dto) {
		Response response = new Response();
		track = dto;
		track=tool.checkWinning(track);
		response.setData(dto);
		response.setMessage("postion from player");
		response.setStatus(true);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

	public ResponseEntity<Response> getPosition() {
		game.setPlayer1("null");
		game.setPlayer2("null");
		game.setGameid(0);
		Response response = new Response();
		response.setData(track);	
		response.setMessage("postion from player");
		response.setStatus(true);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

}
