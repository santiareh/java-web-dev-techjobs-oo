package org.launchcode.techjobs_oo.Tests;

import org.launchcode.techjobs_oo.Job;

public class JobTest {

    @Test
    public void testSettingJobId(){
        Job Test = new Job();
        Job Test2 = new Job();
        assertEquals(Test.getId(), Test2.getId(), 1);
    }
}
