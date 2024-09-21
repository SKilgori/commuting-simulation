package station;

import car.Car;

public class StationsPool {
	    private static StationsPool instance;

	        private StationsPool() {}

		    public static StationsPool getInstance() {
			            if (instance == null) {
					                instance = new StationsPool();
							        }
				            return instance;
					        }

		        public void refuelAtNearestStation(Car car) {
				        car.refuel(50); // Simulate refueling.
							//     }
							//     }
