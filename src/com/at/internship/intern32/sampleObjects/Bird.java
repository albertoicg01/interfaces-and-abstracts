package com.at.internship.intern32.sampleObjects;

import com.at.internship.intern32.abstracts.Animal;
import com.at.internship.intern32.constants.ConstantsEnum;

public class Bird extends Animal {
    public Bird(){
        super();
        setAnimalName(ConstantsEnum.bird1);
    }
    @Override
    public void movement(){
        System.out.println(ConstantsEnum.bird1+" "+ConstantsEnum.method1Bird);
    }
}
