package org.gege.forjava;

import org.springframework.stereotype.Component;

import java.util.List;

public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Loney Herts Club Band";
    private String aslist = "The Beatles";
    private List<Object> l;

    public List<Object> getL() {
        return l;
    }

    public void setL(List<Object> l) {
        this.l = l;
    }

    public SgtPeppers(String title, String aslist) {
        this.title = title;
        this.aslist = aslist;
    }

    public SgtPeppers() {
    }

    public void player() {
        System.out.println("Playing " + title + " by " + aslist);
    }
}
