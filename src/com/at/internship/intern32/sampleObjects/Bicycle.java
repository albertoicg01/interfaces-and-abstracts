package com.at.internship.intern32.sampleObjects;
import com.at.internship.intern32.constants.ConstantsEnum;
import com.at.internship.intern32.interfaces.IWheel;

public class Bicycle implements IWheel {

    public void advance() {
        System.out.println(ConstantsEnum.method1Bicycle);
    }


    public void stop() {
        System.out.println(ConstantsEnum.method2Bicycle);
    }
}
