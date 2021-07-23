package com.science.foundation;

public final class Atom {

    private Electron [] electrons  = null;
    private Proton [] protons = null;
    private  Neutron [] neutron = null;

    public Atom(Electron [] electrons, Proton [] protons, Neutron [] neutron){
        this.electrons = electrons;
        this.protons = protons;
        this.neutron = neutron;
    }

    public void getMass(){
        // add the weight of protons and neutrons
    }



}
