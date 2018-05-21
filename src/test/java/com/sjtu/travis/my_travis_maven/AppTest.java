package com.sjtu.travis.my_travis_maven;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	App test1 = new App();
    	int i = test1.test();
        assertEquals(i, 1);
    }
}
