package com.tunhy.twiter.service;

import java.util.List;

import com.tunhy.twiter.exception.TwitException;
import com.tunhy.twiter.exception.UserException;
import com.tunhy.twiter.model.Twit;
import com.tunhy.twiter.model.User;
import com.tunhy.twiter.request.TwitReplyReques;

public interface TwitService {

	
	public Twit createTwit(Twit req, User user) throws UserException;
	public List<Twit> findAllTwit();
	public Twit retwit(Long twitId, User user) throws UserException, TwitException;
	public Twit findById(Long twitId) throws TwitException;
	
	public void deleteTwitById(Long twitId, Long userId) throws TwitException, UserException;
	
	public Twit removeFromRetwit(Long twitId, User user) throws TwitException, UserException;
	
	public Twit createdReply(TwitReplyReques req, User user) throws TwitException;
	
	public List<Twit> getUserTwit(User user);
	
	public List<Twit> findByLikesContaisUser(User user);
}
