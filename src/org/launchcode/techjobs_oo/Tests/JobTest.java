package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.CoreCompetency;

import static junit.framework.Assert.assertNotSame;
import static junit.framework.TestCase.*;

public class JobTest {

    @Test
    public void testSettingJobId(){
        Job Test = new Job();
        Job Test2 = new Job();
        //Should return true
        assertNotSame(Test.getId(), Test2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job TryIt = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //Should all return true
        assertEquals("Product tester", TryIt.getName());
        assertEquals("ACME", TryIt.getEmployer().getValue());
        assertEquals("Desert", TryIt.getLocation().getValue());
        assertEquals("Quality control", TryIt.getPositionType().getValue());
        assertEquals("Persistence", TryIt.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job What = new Job("Slayer", new Employer("JC"), new Location("Underworld"), new PositionType("Killer"), new CoreCompetency("Sword Skills"));
        Job Who = new Job("Slayer", new Employer("JC"), new Location("Underworld"), new PositionType("Killer"), new CoreCompetency("Sword Skills"));
        //Should return true
        assertFalse(What.equals(Who));
    }

    @Test
    public void testToStringSpaces(){
        Job TryIt = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        char firstChar = TryIt.toString().charAt(0);
        char secondChar = TryIt.toString().charAt(TryIt.toString().length()-1);
        //Should return true
        assertTrue(firstChar == secondChar);
    }

}
