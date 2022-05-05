package com.at.internship.intern32.sampleObjects;

import com.at.internship.intern32.abstracts.Animal;
import com.at.internship.intern32.constants.ConstantsEnum;
public class Dog extends Animal{

    public Dog(){
        super();
        setAnimalName(ConstantsEnum.dog1);
    }


    @Override
    public void movement(){
        System.out.println(ConstantsEnum.dog1+" "+ConstantsEnum.method1Dog);
    }

}
