package com.tic_toc.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.tic_toc.dto.Game;
import com.tic_toc.dto.TrackPostion;
import com.tic_toc.model.Tracker;

public interface TrackService {

	List<Tracker> track();
	
	ResponseEntity<Response> generateOtp(Game dto);
	
	ResponseEntity<Response> savePlayer2(Game dto);
	
	ResponseEntity<Response> waitForPlayer2();
	
//	ResponseEntity<Response> allowPlayer2(Game dto);
	
	ResponseEntity<Response> setPosition(TrackPostion dto);
	
	ResponseEntity<Response> getPosition();
}
