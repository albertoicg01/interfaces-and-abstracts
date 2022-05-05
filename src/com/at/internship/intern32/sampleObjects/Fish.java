package com.at.internship.intern32.sampleObjects;

import com.at.internship.intern32.abstracts.Animal;
import com.at.internship.intern32.constants.ConstantsEnum;

public class Fish extends Animal {

    @Override
    public void movement() {
        System.out.println(ConstantsEnum.fish1+" "+ConstantsEnum.method1fish);
    }
}
