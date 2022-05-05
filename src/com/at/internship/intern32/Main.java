package com.at.internship.intern32;
import com.at.internship.intern32.constants.ConstantsEnum;
import com.at.internship.intern32.sampleObjects.*;
public class Main {
    public static void main(String args[]){
        //Practicing interfaces
        Car car1 = new Car();
        Bicycle bicycle1=new Bicycle();
        car1.advance();
        bicycle1.advance();
        car1.stop();
        bicycle1.stop();
        System.out.println(ConstantsEnum.separator);
        //Practicing abstract classes
        Dog dog1=new Dog();
        dog1.movement();

        Bird bird1=new Bird();
        bird1.movement();

        Fish fish1=new Fish();
        fish1.movement();


    }

}
