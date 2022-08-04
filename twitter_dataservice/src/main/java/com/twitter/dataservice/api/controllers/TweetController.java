//package com.twitter.dataservice.api.controllers;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.twitter.dataservice.api.entities.Tweet;
//import com.twitter.dataservice.api.services.TweetService;
//
//@RestController
//public class TweetController {
//	
//	@Autowired
//	TweetService tweetService;
//	
////	@PostMapping("/v1/tweet")
////	public Tweet postTweetId(@PathVariable(name = "tweet_id") Long tweet_id) {
////		return tweetService.postTweetById(tweet_id);
////		
////	}
//	
//	@GetMapping("/v1/tweet")
//	public List<Tweet> getAllTweets() {
//		return tweetService.getAllTweets();
//	}
//	
//	@GetMapping("/v1/tweet/{tweet_id}")
//	public Tweet getTweetById(@PathVariable(name = "tweet_id") Long tweet_id) {
//		return tweetService.getTweetById(tweet_id);
//	}
//	
//}
