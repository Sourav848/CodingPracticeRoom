package com.sourav.java.examples;

//Java program to demonstrate Tight and loose coupling 

public class Tight_Loose_Coupling {
	
	
	//Tight Coupling Example - we can't directly access Engine class method, we have to create instance
   //of car to access engine method. We have interdependency.
	class Car {
	    private Engine engine; // Tight coupling

	    public Car() {
	        engine = new Engine(); // Direct instantiation
	    }

	    public void start() {
	        engine.start();
	    }

	    public void stop() {
	        engine.stop();
	    }
	}

	class Engine {
	    public void start() {
	        // Complex engine start logic
	    }

	    public void stop() {
	        // Complex engine stop logic
	    }
	}
	
	//Loose Coupling - Below whichever class object will be passed in Powertrain interface, will be
	//access directly.we are independent.
	
	interface Powertrain {
	    void start();
	    void stop();
	}

	class ManualEngine implements Powertrain {
	    @Override
	    public void start() {
	        // Complex engine start logic
	    }

	    @Override
	    public void stop() {
	        // Complex engine stop logic
	    }
	}

	class ElectricEngine implements Powertrain {
	    @Override
	    public void start() {
	        // Electric engine start logic
	    }

	    @Override
	    public void stop() {
	        // Electric engine stop logic
	    }
	}

	class Cars {
	    private Powertrain powertrain; // Loose coupling -

	    public Cars(Powertrain powertrain) {
	        this.powertrain = powertrain;
	    }

	    public void start() {
	        powertrain.start();
	    }

	    public void stop() {
	        powertrain.stop();
	    }
	}

}
