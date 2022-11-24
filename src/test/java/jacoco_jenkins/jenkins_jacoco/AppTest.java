package jacoco_jenkins.jenkins_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

import jacoco_jenkins.jenkins_jacoco.App;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	@Test
	public void test(){
        App p = new App();
        assertEquals("Hello DURGA", p.getMessage("DURGA"));

    }
}
