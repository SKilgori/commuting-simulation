package person;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import car.ElectricCar;

public class PersonTest {

	    @Test
	        public void testCommuteWithLowEnergy() {
			        Person person = new Person(new ElectricCar());
				        person.getCar().refuel(10); // Low energy scenario.
								    //         
								    //                 person.commute(); // Simulate commute.
								    //                         
								    //                                 assertTrue(person.getCar().getEnergy() > 0); // Ensure energy remains positive.
								    //                                     }
								    //                                     }
