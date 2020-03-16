package OOPS2;

public abstract class CarMaruthi800 implements Car {
	
	public void engine() {
		System.out.println("Engine implemented");
	}
	public void gears() {
		System.out.println("Gears implemented");
	}
	public void audio() {
		System.out.println("Audio implemented");
	}
	public void windows() {
		System.out.println("Windows implemented");
	}
	public void airbags() {
		System.out.println("Airbags implemented");
	}
	
	public abstract void doorlock();

}
