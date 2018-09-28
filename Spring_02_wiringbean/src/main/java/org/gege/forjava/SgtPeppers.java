package org.gege.forjava;

import org.springframework.stereotype.Component;

public class SgtPeppers implements CompactDisc {
    private String title ="Sgt. Pepper's Loney Herts Club Band";
    private String aslist ="The Beatles";
    public void player() {
        System.out.println("Playing "+ title+" by "+ aslist);
    }
}
