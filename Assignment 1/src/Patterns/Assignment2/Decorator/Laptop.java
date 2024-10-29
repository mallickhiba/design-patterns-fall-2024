package Patterns.Assignment2.Decorator;
abstract class Laptop {

String description = "Base Laptop";

public String getDescription(){
    return description;

}

public abstract int getCost();

}