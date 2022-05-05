package com.at.internship.intern32.sampleObjects;

import com.at.internship.intern32.constants.ConstantsEnum;
import com.at.internship.intern32.interfaces.IWheel;

public class Car implements IWheel {
    //Constructor
    public Car(){

    }

    public void advance(){
        System.out.println(ConstantsEnum.method1Car);
    }

    public void stop(){
        System.out.println(ConstantsEnum.method2Car);
    }

}
