package com.xyz.state.app;

public class RepeatVoteState implements VoteState {

    @Override
    public void handleVote(String user, String voteItem, VoteManager vm) {
        System.out.println("请不要重复投票");
    }

}
