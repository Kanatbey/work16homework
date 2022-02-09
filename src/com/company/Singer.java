package com.company;

public class Singer extends Person {
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void singing() {
        System.out.println(" Yr yrdait");
    }

    public void playGitar(){
        System.out.println("gitara chertuu\n**************************************************************************************");
    }

    @Override
    public String toString() {
        return "Singer {" + super.toString() +
                "bandName = '" + bandName + '\'' +
                "} ";
    }
}
