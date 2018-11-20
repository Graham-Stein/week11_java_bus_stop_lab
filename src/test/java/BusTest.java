import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    Person bill;
    Person ted;
    Person adventure;

    @Before
    public void before(){
        bus = new Bus("Castle Terrace", 4);
    }

    @Test
    public void hasDestination(){
        assertEquals("Castle Terrace", bus.getDestination());
    }

    @Test
    public void hasCapacity(){
        assertEquals(4, bus.getCapacity());
    }

    @Test
    public void hasNoPassengers(){
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void hasSomePassengers(){
        bus.addPassenger(person);
        bus.addPassenger(bill);
        bus.addPassenger(ted);
        bus.addPassenger(adventure);
        assertEquals(4, bus.getNumberOfPassengers());
    }

    @Test
    public void cannotAddMoreThanCapacity(){
        bus.addPassenger(person);
        bus.addPassenger(bill);
        bus.addPassenger(ted);
        bus.addPassenger(adventure);
        bus.addPassenger(adventure);
        assertEquals(4, bus.getNumberOfPassengers());
    }

    @Test
    public void canRemoveOnePerson(){
        bus.addPassenger(person);
        bus.addPassenger(bill);
        bus.addPassenger(ted);
        bus.addPassenger(adventure);
        bus.removePassenger();
        assertEquals(3, bus.getNumberOfPassengers());
    }

    @Test
    public void cannotRemovePeopleFromEmptyBus(){
        bus.removePassenger();
        assertEquals(0, bus.getNumberOfPassengers());
    }



}
