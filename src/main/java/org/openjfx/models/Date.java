package org.openjfx.models;

public class Date {
    private int dag, måned, år;

    public Date(int dag, int måned, int år){
        this.dag = dag;
        this.måned = måned;
        this.år = år;
    }

    public int getDag() {
        return dag;
    }

    public void setDag(int dag) {
        this.dag = dag;
    }

    public int getMåned() {
        return måned;
    }

    public void setMåned(int måned) {
        this.måned = måned;
    }

    public int getÅr() {
        return år;
    }

    public void setÅr(int år) {
        this.år = år;
    }
}


