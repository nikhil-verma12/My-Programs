 class Animal {
 // Method to be overridden
 void makeSound() {
 System.out.println("Animal makes a sound");
 }
 }
 class Dog extends Animal {
 // Overriding the parent class method
 @Override
 void makeSound() {
 System.out.println("Dog barks");
 }
 }
  class Cat extends Animal {
 // Overriding the parent class method
 @Override
 void makeSound() {
 System.out.println("Cat meows");
 }
 }
 public class TestOverriding {
 public static void main(String[] args) 
{
 Animal myAnimal;  // Reference of parent class
 myAnimal = new Dog();
 myAnimal.makeSound();  // Calls Dog's makeSound()
 myAnimal = new Cat();
 myAnimal.makeSound();  // Calls Cat's makeSound()
 }
 }

