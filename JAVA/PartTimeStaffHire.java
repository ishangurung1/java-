    
    /**
     * Write a description of class PartTimeStaffHire here.
     * The is the child class of staffHire class.It has nine attributes.
     *constructor class is created with the paramenters of that class of different types of acess modifier.
     *in the constructor super class variables are called.
     *getter and setter method are called and a method is created to check the status of appointed staff and terminated staff.
     *finally a display method is created to print the output.
     * @author (Ishan gurung)
     * @version (30 dec 2019)
     */
    public class PartTimeStaffHire extends StaffHire
{
    //variable decleration
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
    
    /**
    *creating constructor class for variable initialization
    */
    PartTimeStaffHire(int Vacancynumber,String Designation,String JobType,int workingHour,int wagesPerHour,String shifts)
    {
       super(Vacancynumber,Designation,JobType);//accessing super class variables
       this.workingHour = workingHour;
       this.wagesPerHour = wagesPerHour;
       this.shifts = shifts;
       this.staffName = "";
       this.joiningDate = "";
       this.qualification = "";
       this.appointedBy = "";
       this.joined = false;
       this.terminated = false;
    }
        
        //getter method deceleration
    public int getworkingHour()
        {
           return workingHour;
        }
    
        public int getwagesPerHour()
        {
           return wagesPerHour;
        }   
    
        public String getstaffName()
        {
            return staffName;
        }
    
        public String getjoiningDate()
        {
            return joiningDate ;
        }
    
        public String getqualification()
        {
            return qualification;
        }
    
        public String  getappointedBy()
        {
           return appointedBy;
        }
    
        public String getshifts()
        {
           return shifts;
        }
    
        public boolean getjoined()
        {
           return joined;
        }
    
        public boolean getterminated()
        {
           return terminated;
        }
    
        /**
         * setter method for value changing according to given condition
         */
        public void setshifts(String shifts)
        {
            this.shifts=shifts;
            if(joined==true)
            {
                System.out.println("You have already been apointed so your shifts cannot be changed");
            }
        }  
        
        /**
         * method to check if the staff has already been appointed or not according to condition
         */
        public void hireparttimestaffhire(String staffName,String joiningDate,String qualification,String appointedBy)
        {
            if(joined==true)
            {
                System.out.println("This Staff is already appointed");
                System.out.println("Staff Name="+this.staffName);
                System.out.println("Joining Date="+this.joiningDate);
            }
            else
            {   
                this.staffName=staffName;
                this.qualification=qualification;
                this.joiningDate=joiningDate;
                this.appointedBy=appointedBy;
                joined=true;
                terminated=false;
            }
        }
            
        /**
         * method for staff has been appointed and print suitable output of the condition
         * else takes the new values
         */
        public void setterminated()
        {
            if(this.terminated==true)
            {
                System.out.println("This staff has already been terminated");
            }   
            else 
            {
                staffName="";
                joiningDate="";
                qualification="";
                appointedBy="";
                joined=false;
                terminated=true;        
            }
        }
        
        /**
         * display method to print all output of given condition
         */
        public void display()
        {
            super.display();//calling super class display method
            if(joined=true)
            {
                System.out.println("Staff Name="+this.getstaffName());//calling getter method for the dispaly
                System.out.println("Working Hour="+this.getworkingHour());
                System.out.println("Joining Date="+this.getjoiningDate());
                System.out.println("Wages Per Hour="+getwagesPerHour());
                System.out.println("Qualification="+this. getqualification());
                System.out.println("Appointed by="+this.getappointedBy());
                System.out.println("Income Per Day="+(wagesPerHour*workingHour));
            }
        }
    
}