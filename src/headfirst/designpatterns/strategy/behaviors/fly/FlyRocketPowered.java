package headfirst.designpatterns.strategy.behaviors.fly;

public class FlyRocketPowered implements FlyBehavior {
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}
}
