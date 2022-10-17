package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job instanceof Job);
        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1 == job2);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        assertEquals("\n", String.valueOf(job.getName().charAt(0)));
//        assertEquals("\n", String.valueOf(job.getEmployer().getValue().charAt(0)));
//        assertEquals("\n", String.valueOf(job.getLocation().getValue().charAt(0)));
//        assertEquals("\n", String.valueOf(job.getPositionType().getValue().charAt(0)));
//        assertEquals("\n", String.valueOf(job.getCoreCompetency().getValue().charAt(0)));
//
//        assertEquals("\n", String.valueOf(job.getName().charAt(job.getName().length()-1)));
//        assertEquals("\n", String.valueOf(job.getEmployer().getValue().charAt(job.getEmployer().getValue().length()-1)));
//        assertEquals("\n", String.valueOf(job.getLocation().getValue().charAt(job.getLocation().getValue().length()-1)));
//        assertEquals("\n", String.valueOf(job.getPositionType().getValue().charAt(job.getPositionType().getValue().length()-1)));
//        assertEquals("\n", String.valueOf(job.getCoreCompetency().getValue().charAt(job.getCoreCompetency().getValue().length()-1)));
        assertEquals("\n", String.valueOf(job.toString().charAt(0)));
        assertEquals("\n", String.valueOf(job.toString().charAt(job.toString().length()-1)));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\nID: 4\n" +
                "\nName: Product tester\n" +
                "\nEmployer: ACME\n" +
                "\nLocation: Desert\n" +
                "\nPosition Type: Quality control\n" +
                "\nCore Competency: Persistence\n",

                job.toString());
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job job = new Job(null, new Employer(null), new Location(null), new PositionType(null), new CoreCompetency(null));

        assertEquals("\nID: 3\n" +
                        "\nName: Data not available\n" +
                        "\nEmployer: Data not available\n" +
                        "\nLocation: Data not available\n" +
                        "\nPosition Type: Data not available\n" +
                        "\nCore Competency: Data not available\n",

                job.toString());
    }

}

