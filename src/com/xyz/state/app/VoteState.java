package com.xyz.state.app;

/**
 * 投票状态接口，处理不同投票状态的情况
 * <p>Title: VoteState</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public interface VoteState {
    /**
     * 
     * @param user 投票人
     * @param voteItem 投票项
     * @param vm 投票管理类,用于回调
     */
    public void handleVote(String user, String voteItem, VoteManager vm);
}
