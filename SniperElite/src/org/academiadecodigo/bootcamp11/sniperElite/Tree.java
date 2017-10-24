package org.academiadecodigo.bootcamp11.sniperElite;

/**
 * Created by codecadet on 29/09/17.
 */
public class Tree extends GameObject {

    public Tree(){
        super();
    }

    @Override
    public String getMessage() {
        System.out.println("Don't shoot, I'm a tree");
        return null;
    }
}
