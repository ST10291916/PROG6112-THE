/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package question1_the;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class EstateAgentTest {
    
    public EstateAgentTest() {
    }

    /**
     * Test of EstateAgentSales method, of class EstateAgent.
     */
    @Test
    public void testEstateAgentSales() {
    }

    /**
     * Test of EstateAgentCommission method, of class EstateAgent.
     */
    @Test
    public void testEstateAgentCommission() {
    EstateAgent agent;
        agent = new EstateAgent() {};
        double[] sales = {800000, 1500000, 2000000};
        double totalSales = agent.EstateAgentSales(sales);
        assertEquals(4300000, totalSales, 0.001);    
    }

    /**
     * Test of TopEstateAgent method, of class EstateAgent.
     */
    @Test
    public void testTopEstateAgent() {
    EstateAgent agent = new EstateAgent() {};
        double commission = agent.EstateAgentCommission(4300000);
        assertEquals(86000, commission, 0.001);    
    }

    public class EstateAgentImpl extends EstateAgent {
       
    }
    
}
