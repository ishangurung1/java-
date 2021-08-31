
/**
 * Write a description of class ds here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StaffHire   // this is the super class,parent class  
{    
    //variable decleration 
private int Vacancynumber; 
     private String Designation; 
     private String JobType;     
    // creating the constructor class  
    StaffHire(int Vacancynumber,String Designation,String JobType) 
    { 
      this.Vacancynumber=Vacancynumber; 
      this.Designation=Designation; 
      this.JobType=JobType; 
    } 
 
    //Setter and getter method of staffHire class's variable  
    public void setVacancynumber(int Vacacancynumber) 
    { 
        this.Vacancynumber=Vacacancynumber; 
    } 

     
    public int getVacancynumber() 
    { 
       return Vacancynumber;  
    } 
     
    public void setDesignation(String Designation) 
    { 
        this.Designation=Designation; 
    } 
     
    public String getDesignation() 
    { 
       return Designation;  
    } 
     
    public String getJobType() 
    { 
        return JobType; 
    } 
     
    public void setJobType(String JobType) 
    { 

        this.JobType=JobType; 
    } 
    //end of getter and setter  
     
    public void display()// creating method for value display 
    { 
        System.out.println("Vacancy Number="+this.getVacancynumber());//callling getters method for the display 
        System.out.println("Designation="+this.getDesignation()); 
        System.out.println("Job Type="+this.getJobType()); 
    } 
} 