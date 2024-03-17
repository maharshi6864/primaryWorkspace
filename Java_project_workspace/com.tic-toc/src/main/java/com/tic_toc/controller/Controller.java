package com.tic_toc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.tic_toc.dto.Game;
import com.tic_toc.dto.TrackPostion;
import com.tic_toc.model.Tracker;
import com.tic_toc.service.Response;
import com.tic_toc.service.TrackService;

@org.springframework.stereotype.Controller

@CrossOrigin(origins = "*")
@RestController
public class Controller {


	@Autowired
	public TrackService trackService;

	private String lastPostion = null;
	private String sign = null;
	private int count = 0;

	@GetMapping(value = "/track")
	public ResponseEntity<List> getPostion() {
		Tracker track = new Tracker();
		track.setPosition(lastPostion);
		track.setSign(sign);
		track.setId(count);
		Response response = new Response();
		response.setMessage("true");
		response.setData(track);
		response.setStatus(true);
		return new ResponseEntity(track, HttpStatus.OK);
	}

	@PostMapping(value = "/generateid")
	public ResponseEntity generateid(@RequestBody Game dto) {
		ResponseEntity<Response> response = this.trackService.generateOtp(dto);
		System.out.println("Game id generated");
		return new ResponseEntity(response, HttpStatus.OK);
	}

	@GetMapping(value = "/player2")
	public ResponseEntity player2() {
		ResponseEntity<Response> response = this.trackService.waitForPlayer2();
		System.out.println("player2 searching");
		return new ResponseEntity(response, HttpStatus.OK);
	}

	@PostMapping(value = "/joinplayer2")
	public ResponseEntity joinPlayer2(@RequestBody Game dto) {
		ResponseEntity<Response> response = this.trackService.savePlayer2(dto);
		System.out.println("player2 Saved");
		return new ResponseEntity(response, HttpStatus.OK);
	}
	
	@PostMapping(value = "/setposition")
	public ResponseEntity setPosition(@RequestBody TrackPostion dto) {
		ResponseEntity<Response> response = this.trackService.setPosition(dto);
		System.out.println("postion Recevied");
		return new ResponseEntity(response, HttpStatus.OK);
	}
	
	@GetMapping(value = "/getposition")
	public ResponseEntity getPosition() {
		ResponseEntity<Response> response = this.trackService.getPosition();
		System.out.println("postion Sent");
		return new ResponseEntity(response, HttpStatus.OK);
	}
}