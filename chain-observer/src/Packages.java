public class Packages 
{
    private String packageDestination;
    private String packageName;   
    private String checkWanted;

    public Packages(String newPackageDestination, String newPackageName, String newCheckWanted)
    {    
    	packageDestination = newPackageDestination;
    	packageName = newPackageName;
    	checkWanted = newCheckWanted;    
    }

    public String getPackageDestination(){ return packageDestination; }
    public String getPackageName(){ return packageName; }
    public String getCheckWanted(){ return checkWanted; }

}
