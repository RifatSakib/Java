package classes;
import java.util.*;
import Interfaces.*;

public class Visa extends Applicant implements visaInfo{
	
	String country;
	String visaType;
	
	public Visa(){
		
		
		
	}
	
	
	HashMap<String,Integer> feeByCountrySingleEntry(){
		
		HashMap<String,Integer> feeByCountry = new HashMap<>();
		
		
		feeByCountry.put("THAILAND",66);
		feeByCountry.put("TURKEY",58);
		feeByCountry.put("NEPAL",5);
		feeByCountry.put("UKRAIN",75);
		feeByCountry.put("UGANDA",50);
		feeByCountry.put("USA",160);
		feeByCountry.put("VIRGINIA ISLAND",0);
		feeByCountry.put("VIETNAM",25);
		feeByCountry.put("YEMEN",11);
		feeByCountry.put("SOUTH AFRICA",40);
		feeByCountry.put("ZIMBABWE",35);
		feeByCountry.put("UAE",39);
		feeByCountry.put("AUSTRALIA",150);
		feeByCountry.put("ARGENTINA",24);
		feeByCountry.put("CANADA",33);
		feeByCountry.put("HONG KONG",21);
		feeByCountry.put("INDIA",0);
		
		return feeByCountry;
		
		
		
		
	}
	
		
	HashMap<String,Integer> feeByCountryMultipleEntry(){
		
		HashMap<String,Integer> feeByCountry = new HashMap<>();
		
		
		feeByCountry.put("THAILAND",165);
		feeByCountry.put("TURKEY",194);
		feeByCountry.put("NEPAL",10);
		feeByCountry.put("UKRAIN",150);
		feeByCountry.put("UGANDA",50);
		feeByCountry.put("USA",160);
		feeByCountry.put("VIRGINIA ISLAND",0);
		feeByCountry.put("VIETNAM",30);
		feeByCountry.put("YEMEN",20);
		feeByCountry.put("SOUTH AFRICA",40);
		feeByCountry.put("ZIMBABWE",50);
		feeByCountry.put("UAE",100);
		feeByCountry.put("AUSTRALIA",150);
		feeByCountry.put("ARGENTINA",30);
		feeByCountry.put("CANADA",66);
		feeByCountry.put("HONG KONG",32);
		feeByCountry.put("INDIA",0);
		
		return feeByCountry;
		
		
		
		
	}
	
	
	boolean verifyInput(String country,String entry){
		
		HashMap<String,Integer> countryList = new HashMap<>();
		countryList = feeByCountrySingleEntry();
		
		if(countryList.containsKey(country)){
			
			if(entry.equals("SINGLE")||entry.equals("MULTIPLE")){
				
				return true;
				
			}
			
			
			
		}
		
		System.out.println("\nPlease specify the Country & Entry Type correctly\n");
		return false;
		
		
	}
	
	
	
	public double feeCalculation(String country,String entry){
		
		HashMap<String,Integer> fee = new HashMap<>();
		
		if(entry.equals("SINGLE")){
			
			fee = feeByCountrySingleEntry();
		}else if(entry.equals("MULTIPLE")){
			
			fee = feeByCountryMultipleEntry();
		}else{
			
			System.out.println("Not a valid Input!");
		}
		
		if(fee.containsKey(country)){
			
			double f = fee.get(country);
			
			return  f; 
			
		}
		
		
		
		return 000.0;
	}
}