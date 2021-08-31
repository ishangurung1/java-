
/**
 * Write a description of class df here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FullTimeStaffHire extends StaffHire//loading of super class in sub class or parent class in sub class 
{ 
    //insance variable deceleration 
    private int salary; 
    private int workingHour; 
    private String staffName; 
    private String joiningDate; 
    private String qualification; 
    private String appointedBy; 
    private boolean joined; 
     
    //creating constructor class 
    FullTimeStaffHire( int Vacancynumber, String Designation,String JobType,int salary,int workingHour) 
    { 
         super(Vacancynumber,Designation,JobType);//calling super class variable 
         this.salary=salary; 
         this.workingHour=workingHour; 
         this.staffName=""; 
         this.joiningDate=""; 
         this.qualification=""; 
         this.appointedBy=""; 
    } 
     
    //getter method 
    public int getsalary() 
    { 
           return salary; 
    } 
   
    public int getworkingHour() 
 
    { 
           return workingHour; 
    } 
    
    public String getstaffName() 
    { 
           return staffName; 
    } 
     
    public String getjoiningDate() 
    { 
           return joiningDate; 
    } 
     
    public String getqualification() 
    { 
           return qualification; 
    } 
     
    public String  getappointedBy() 
    { 
           return appointedBy ; 
    } 

     
    public boolean getjoined() 
    { 
           return joined; 
    } 
       
    /**setter method for values changing according to condition*/ 
     public void  setsalary(int salary) 
     {  
      this.salary=salary; 
      if (joined==true) 
      { 
         System.out.println("You have been appointed so, cannot change the salary value"+salary); 
      } 
    } 
      
    /**setter method for values changing according to condition*/ 
    public void setworkingHour(int workingHour) 
    { 
        this.workingHour=workingHour; 
        System.out.println("The new working hour is"+workingHour); 

    } 
     
    /**new method for value changing according to conditions*/ 
    public void hirefulltimestaff(String staffName,String joiningDate,String qualification, String appointedBy) 
    {   
        this.staffName=staffName; 
        this.joiningDate=joiningDate; 
       if(joined==true) 
       { 
           System.out.println("Staff Name="+staffName); 
           System.out.println("Joining Date="+joiningDate); 
           System.out.println("This Staff is already appointed"); 
       } 
       else 
       { 
           this.staffName=staffName; 
           this.joiningDate=joiningDate; 
           this.qualification=qualification; 
           this.appointedBy=appointedBy; 
           joined=true; 
            
       } 

    } 
      
    //display method for displaying attributes values 
    public void display() 
    { 
        super.display(); 
        if(joined==true) 
        { 
            System.out.println("Staff Name="+this.getstaffName());//calling of getters method 
            System.out.println("Salary="+this.getsalary()); 
            System.out.println("Working Hour="+this.getworkingHour()); 
            System.out.println("Joining Date="+this.getjoiningDate()); 
            System.out.println("Qualification="+this.getqualification()); 
            System.out.println("Appointed by="+this.getappointedBy()); 
        } 
    }        
} 
 
