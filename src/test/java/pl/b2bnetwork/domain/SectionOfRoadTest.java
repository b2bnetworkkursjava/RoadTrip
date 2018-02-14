package pl.b2bnetwork.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SectionOfRoadTest {

    @Test
    public void isNameSectionEqualsKielceWarszawa() {
        SectionOfRoad section = new SectionOfRoad();
        section.setName("KielceWarszawa");
        assertEquals("KielceWarszawa", section.getName());
    }

    @Test
    public void isSpedLimitEquals200() {
        SectionOfRoad section = new SectionOfRoad();
        section.setSpeedLimit(200);
        assertEquals(200, section.getSpeedLimit(), 0);
    }



}
