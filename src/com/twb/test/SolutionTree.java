package com.twb.test;

public class SolutionTree {
    public int solution(Tree T) {

        if(T == null) return -1;
        if(T.l == null && T.r==null) return 0;
        return Math.max(1+ solution(T.l), 1+ solution(T.r));
    }

    public static void main(String[] args) {
        // (5, (3, (20, None, None), (21, None, None)), (10, (1, None, None), None))
        //        Tree T = new Tree(5, new Tree(3, new Tree(10, null, null), new Tree(21, null, null)),
//                new Tree(10, new Tree(1, null, null), null));
//        System.out.println("\nTree height: "+sol.solution(T));
    }
}

class Tree {
    public int x;
    public Tree l;
    public Tree r;

    public Tree(){}
    public Tree(int x){
        this.x = x;
    }
    public Tree(int x, Tree l, Tree r){
        this.x = x;
        this.l = l;
        this.r = r;
    }
}
