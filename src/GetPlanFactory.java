
public class GetPlanFactory {
	public plan getPlan(String planType) {  
      if(planType.equalsIgnoreCase("DOMESTICPLAN")) {  
             return new DomesticPlan();  
           }   
       else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){  
            return new CommercialPlan();  
        }   
      else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {  
            return new InstitutionalPlan();  
      }  
      return null;  
	}

}
