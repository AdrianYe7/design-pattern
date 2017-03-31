package com.xyz.state.app;

public class BlackVoteState implements VoteState {

    @Override
    public void handleVote(String user, String voteItem, VoteManager vm) {
        System.out.println("您被加入黑名单，禁止登入该投票系统");
    }

}
