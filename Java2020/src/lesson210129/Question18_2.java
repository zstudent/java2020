package lesson210129;

public class Question18_2 {

}

class Car {  // Car has-an-engine
	Wheel[] wheels = new Wheel[4];
	Engine engine;
	Chassis chassis;
}

class Wheel {}
class Engine {}
class Chassis {}

class Truck extends Car {}  // Truck is-a-Car
