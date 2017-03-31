package com.xyz.state.app;

import java.util.Map;

public class NormalVoteState implements VoteState {

    @Override
    public void handleVote(String user, String voteItem, VoteManager vm) {
        vm.getMapVote().put(user, voteItem);
        System.out.println("投票成功");
    }

}
