package station;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import car.ElectricCar;

public class StationsPoolTest {

	    @Test
	        public void testRefuelAtNearestStation() {
			        ElectricCar electricCar = new ElectricCar();
				        electricCar.refuel(30);
					        
					        StationsPool.getInstance().refuelAtNearestStation(electricCar);
						        
						        assertEquals(80, electricCar.getEnergy()); // Should be 80 after refueling.
												   //     }
												   //     }
