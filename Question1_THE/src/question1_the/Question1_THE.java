/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package question1_the;

//ZaireMashaba
public class Question1_THE {

    
    public static void main(String[] args) {
     double[][] sales = {
            {800000, 1500000, 2000000},
            {700000, 1200000, 1600000}
        };

        EstateAgent agent;
        agent = new EstateAgent() {};

        double[] totalSales = new double[2];
        double[] commissions = new double[2];

        for (int i = 0; i < 2; i++) {
            totalSales[i] = agent.EstateAgentSales(sales[i]);
            commissions[i] = agent.EstateAgentCommission(totalSales[i]);
        }

        var topAgent = agent.TopEstateAgent(totalSales);
        System.out.println("ESTATE AGENTS SALES REPORT");
System.out.println("------------------------------------------------------");
        System.out.println("Estate Agent\t\tJanuary\t\tFebruary\t\tMarch");
        System.out.println("------------------------------------------------------");
        System.out.println("Joe Bloggs\t\t" + sales[0][0] + "\t\t" + sales[0][1] + "\t" + sales[0][2]);
        System.out.println("Jane Doe\t\t" + sales[1][0] + "\t\t" + sales[1][1] + "\t\t" + sales[1][2]);
        System.out.println("\t");
        System.out.println("Total Sales For Joe Bloggs: R"+totalSales[0]);
        
         System.out.println("Total Sales For Jane Doe: R"+totalSales[1]);
        System.out.println("\t"); 
         System.out.println("Sales Commission For Joe Bloggs: R"+commissions[0]);
         System.out.println("Sales Commission For Jane Doe: R"+commissions[1]);
System.out.println("\t\t");
        System.out.println("Top performing agent: " + (topAgent == 0 ? "Joe Bloggs" : "Jane Doe"));
    }
}
    

