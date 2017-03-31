package com.xyz.state.app;

public class Client {
    public static void main(String[] args) {
        VoteManager manager = new VoteManager();
        for(int i = 0; i < 9; i++) {
            manager.vote("zhangsan", "A");
        }
    }
}
