/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2_the;

/**
 *
 * @author lab_services_student
 */
public class EstateAgent implements iEstateAgent{

    @Override
    public double calculateCommission(String propertyPrice, String agentCommission) {
     double price = Double.parseDouble(propertyPrice);
        double commissionPercentage = Double.parseDouble(agentCommission);
        return price * (commissionPercentage / 100.0);   
    }

 
    
    @Override
    public boolean validateData(Data dataToValidate) {
   // Implement data validation logic
        String agentName = dataToValidate.getAgentName();
        double propertyPrice = dataToValidate.getPropertyPrice();
        double commissionPercentage = dataToValidate.getCommissionPercentage();
        String location = dataToValidate.getLocation();

        if (agentName.isEmpty() || propertyPrice.isEmpty() || commissionPercentage.isEmpty() || location.isEmpty()) {
            return false; // Empty fields are not allowed
        }

        try {
            double price = Double.parseDouble(propertyPrice);
            double commission = Double.parseDouble(commissionPercentage);
            if (price <= 0 || commission <= 0 || commission > 100) {
                return false; // Property price and commission percentage must be valid numbers
            }
        } catch (NumberFormatException e) {
            return false; // Invalid number format
        }

        return true; // All data is valid
    }
}

