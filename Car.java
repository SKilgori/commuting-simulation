package car;

public abstract class Car {
	    protected double energy;

	        public Car(double energy) {
			        this.energy = energy;
				    }

		    public double getEnergy() {
			            return energy;
				        }

		        public abstract void refuel(double amount);
}
