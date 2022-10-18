package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;


/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

//    Job job1;
//    Job job2;
//    Job job3;
////    @Before
////    public void preConstruct(){
////        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
////        job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
////        job3 = new Job(null, new Employer(null), new Location(null), new PositionType(null), new CoreCompetency(null));
////    }

    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job1 instanceof Job);
        assertTrue(job1.getName() instanceof String);
        assertTrue(job1.getEmployer() instanceof Employer);
        assertTrue(job1.getLocation() instanceof Location);
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Product tester", job1.getName());
        assertEquals("ACME", job1.getEmployer().getValue());
        assertEquals("Desert", job1.getLocation().getValue());
        assertEquals("Quality control", job1.getPositionType().getValue());
        assertEquals("Persistence", job1.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1 == job2);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals('\n', (job1.toString().charAt(0)));
        assertEquals('\n', (job1.toString().charAt(job1.toString().length()-1)));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\nID: " + job1.getId() +
                "\nName: " + job1.getName() +
                "\nEmployer: " + job1.getEmployer() +
                "\nLocation: " + job1.getLocation() +
                "\nPosition Type: " + job1.getPositionType() +
                "\nCore Competency: " + job1.getCoreCompetency() +
                "\n",

                job1.toString());
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job job3 = new Job(null, new Employer(null), new Location(null), new PositionType(null), new CoreCompetency(null));
        assertEquals("\nID: 3" +
                        "\nName: Data not available" +
                        "\nEmployer: Data not available" +
                        "\nLocation: Data not available" +
                        "\nPosition Type: Data not available" +
                        "\nCore Competency: Data not available" +
                        "\n",

                job3.toString());
    }

}

