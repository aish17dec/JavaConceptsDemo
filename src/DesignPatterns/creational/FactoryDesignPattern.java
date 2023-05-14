package DesignPatterns.creational;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        Animal animal =  AnimalFactory.getAnimalInstance("dog");
        System.out.println(animal.getSound());
    }
}


abstract class Animal{
    String sound;
    public abstract String getSound();
}


class Dog extends Animal {
    @Override
    public String getSound(){
        super.sound = "bark";
        return this.sound;
    }
}

class Cat extends Animal {
    @Override
    public String getSound(){
        super.sound = "meow";
        return this.sound;
    }
}

class AnimalFactory{
    public static Animal getAnimalInstance(String s){
        if(s.equalsIgnoreCase("dog")){
            return new Dog();
        }else if(s.equalsIgnoreCase("cat")){
            return new Cat();
        }
        return null;
    }
}