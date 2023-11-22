/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question1_the;

public abstract class EstateAgent implements IEstateAgent {
   @Override
 
   public double EstateAgentSales(double[] propertySales) {
        double totalSales = 0;
        for (double sale : propertySales) {
            totalSales += sale;
        }
        return totalSales;
    }

    @Override
    //this method will calculate their commission from the sales
    public double EstateAgentCommission(double propertySales) {
        return 0.02 * propertySales;
    }

    @Override
    //this method will compare the agent's total sales and then tell you which one is the best performing one
    public int TopEstateAgent(double[] totalSales) {
        int topAgent = 0;
        double maxSales = totalSales[0];
        for (int i = 1; i < totalSales.length; i++) {
            if (totalSales[i] > maxSales) {
                maxSales = totalSales[i];
                topAgent = i;
            }
        }
        return topAgent;
    } 
 
}
