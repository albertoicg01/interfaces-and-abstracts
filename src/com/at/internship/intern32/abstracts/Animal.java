package com.at.internship.intern32.abstracts;

public abstract class Animal {
    private String animalName;


    public abstract void movement();

    public void setAnimalName(String animalName){
        this.animalName=animalName;
    }

    public String getAnimalName(){
        return this.animalName;
    }


}
