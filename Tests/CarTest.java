package car;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

	    @Test
	        public void testElectricCarRefuelDoesNotExceed100() {
			        ElectricCar electricCar = new ElectricCar();
				        electricCar.refuel(50);
					        assertEquals(100, electricCar.getEnergy());
						        
						        electricCar.refuel(10); // Trying to over-refuel.
										//         assertEquals(100, electricCar.getEnergy());
										//             }
										//             }
