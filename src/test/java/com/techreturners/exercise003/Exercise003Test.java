package com.techreturners.exercise003;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Exercise003Test {

    private Exercise003 ex003;
    private Exercise003 ex003b;

    @Before
    public void setup() {
        ex003 = new Exercise003();
        ex003b = new Exercise003(true);
    }


    @Test
    public void checkGetIceCreamCodeForMintChocolateChip() {
        String iceCreamFlavour = "Mint Chocolate Chip";
        int expected = 3;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
        assertEquals(expected, ex003b.getIceCreamCode(iceCreamFlavour, true));
    }


    @Test
    public void checkGetIceCreamCodeForMangoSorbet() {
        String iceCreamFlavour = "Mango Sorbet";
        int expected = 5;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
        assertEquals(expected, ex003b.getIceCreamCode(iceCreamFlavour, true));
    }


    @Test
    public void checkGetIceCreamCodeForRaspberryRipple() {
        String iceCreamFlavour = "Raspberry Ripple";
        int expected = 1;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
        assertEquals(expected, ex003b.getIceCreamCode(iceCreamFlavour, true));

        String iceCreamFlavour2 = "Mango Sorbet";
        int expected2 = 5;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
        assertEquals(expected, ex003b.getIceCreamCode(iceCreamFlavour, true));
    }


    @Test
    public void checkPickMultipleIceCreamFlavours() {

        String[] expected = {"Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet"};
//	assertEquals on Arrays is deprecated
        assertArrayEquals(expected, ex003.iceCreamFlavours());
        assertArrayEquals(expected, ex003b.iceCreamFlavours(true));
    }


}
