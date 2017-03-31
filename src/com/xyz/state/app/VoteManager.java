package com.xyz.state.app;

import java.util.HashMap;
import java.util.Map;

/**
 * 投票上下文
 * <p>Title: VoteManager</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public class VoteManager {
    /**
     * 状态处理类
     */
    private VoteState state;
    /**
     * 存储投票结果，某人，某项
     */
    private Map<String, String> mapVote = new HashMap<String, String>();
    /**
     * 记录投票者投了多少次
     */
    private Map<String, Integer> mapVoteCount = new HashMap<String, Integer>();
    
    public Map<String, String> getMapVote() {
        return mapVote;
    }
    
    public void vote(String user, String item) {
        Integer count = mapVoteCount.get(user);
        count = ((count == null) ? 0 : count);
        mapVoteCount.put(user, ++count);
        
        if(count == 1) {
            state = new NormalVoteState();
        } else if(count > 1 && count < 5) {
            state = new RepeatVoteState();
        } else if(count > 5 && count < 8) {
            state = new SpiteVoteState();
        } else {
            state = new BlackVoteState();
        }
        state.handleVote(user, item, this);
    }
}
