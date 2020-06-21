
public class RunChain {
    public static void main(String[] args){
    	
        Chain chainOrder1 = new OutOfCountry();
        Chain chainOrder2 = new InCountry();
        Chain chainOrder3 = new InTown();
        

        chainOrder1.setNextChain(chainOrder2);
        chainOrder2.setNextChain(chainOrder3);
        
       
        Packages request = new Packages("Urugwai","Rose Oil","OutOfCountry");  
        
        Packages request2 = new Packages("Varna","Sugar","InCountry");  
          
        Packages request3 = new Packages("Urugwai","Sea Salt","InTown");
        
        

        chainOrder1.calculate(request);
        chainOrder1.calculate(request2);
        chainOrder1.calculate(request3);


    }
}