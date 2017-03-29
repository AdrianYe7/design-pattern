package com.xyz.iterator.out;

/**
 * 聚集角色：给出迭代子对象的接口
 * <p>Title: Aggregate</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public abstract class Aggregate {
    public abstract Iterator createIterator();//这里个人认为是窄接口，是提供给客户端用的
}
