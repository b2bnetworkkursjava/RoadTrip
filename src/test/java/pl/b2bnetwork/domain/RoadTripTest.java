package pl.b2bnetwork.domain;

import org.junit.Before;
import org.junit.Test;
import pl.b2bnetwork.domain.RoadTrip;
import pl.b2bnetwork.domain.SectionOfRoad;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class RoadTripTest {

    private RoadTrip trip;
    @Before
    public void init(){
        trip = new RoadTrip();
        trip.setName("KielceWarszawa");
        ArrayList<SectionOfRoad> sections = new ArrayList<>();
        SectionOfRoad e = new SectionOfRoad();
        e.setName("KielceRadom");
        sections.add(e);
        trip.setSections(sections);
    }

    @Test
    public void isExistSectionKielceRadomInRoadTripsSection(){
//        boolean isKielceRadom = false;
//        for (SectionOfRoad sect : trip.getSections()) {
//            if(sect.getName().equals("KielceRadom")){
//                isKielceRadom = true;
//            }
//        }

//
        SectionOfRoad e = new SectionOfRoad();
        e.setName("KielceRadom");
        assertThat(trip.getSections(), contains());
    }

    @Test
    public void isNameEqualsKielceWarszawa(){
        assertEquals("KielceWarszawa", trip.getName());
    }

    @Test
    public void isSectionOfRoadsIsEmpty(){
        trip.setSections(new ArrayList());
        assertTrue(trip.getSections().isEmpty());
    }

    @Test
    public void isSectionOfRoadEquals1AfterAddSection(){
        assertEquals(1, trip.getSections().size());
    }


}
