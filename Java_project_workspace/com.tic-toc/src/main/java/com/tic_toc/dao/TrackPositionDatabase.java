package com.tic_toc.dao;

import java.util.List;

import com.tic_toc.model.Tracker;

public interface TrackPositionDatabase {

	List<Tracker> getPostion(int id);
	
	List<Tracker> setPostion();
}
