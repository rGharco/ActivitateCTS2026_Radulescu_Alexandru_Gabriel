package tests;

import org.junit.Assert;

public class CalatorAbonatTest {

    @org.junit.Test
    public void testPlatesteBilet() {
        CalatorAbonat calator = new CalatorAbonat("Dan");
        calator.setSold(10.0f);
        calator.platesteBilet(1f);
        Assert.assertEquals(9.0f, calator.getSold(), 0.001f);
    }

    @org.junit.Test
    public void testPlatesteBiletInsuficient() {
        CalatorAbonat calator = new CalatorAbonat("Dan");
        calator.setSold(10.0f);
        calator.platesteBilet(11f);
        Assert.assertEquals(10.0f, calator.getSold(), 0.001f);
    }
}