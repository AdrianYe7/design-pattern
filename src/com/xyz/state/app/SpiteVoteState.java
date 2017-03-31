package com.xyz.state.app;

public class SpiteVoteState implements VoteState {

    @Override
    public void handleVote(String user, String voteItem, VoteManager vm) {
        String item = vm.getMapVote().get(user);
        if(item != null) {
            vm.getMapVote().remove(user);
        }
        System.out.println("由于恶意投票，您被取消了投票资格，您之前的投票也作废");
    }

}
