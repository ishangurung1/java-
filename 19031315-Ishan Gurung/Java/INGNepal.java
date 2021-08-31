          
            /**
             * Write a description of class INGNepal here.
             *
             * @author (your name)Ishan Gurung
             * @version (a version number or a date)
             */
            
            import javax.swing.*;
            import java.awt.event.*;
            import java.util.*;
            
            
            
            public class INGNepal implements ActionListener
            {
                JFrame frm;
                
                JLabel title,title1,lblVacancyNumber, lblDesignation,lblJobType, lblSalary,lblWorkingHour,lblVacancyNumberApnt,
                    lblStaffName,lblJoinDate,lblQualification,lblApointedBy,lblVacancyNumber1, lblDesignaion1,lblJobType1, lblSalary1,
                    lblWorkingHour1,lblVacancyNumberApnt1,lblshifts,lblStaffName1,lblJoinDate1,lblQualification1,lblApointedBy1;
                
                JTextField txtVacancyNumber, txtDesignation,txtJobType, txtSalary,txtWorkingHour,txtVacancyNumberApnt,
                    txtStaffName,txtJoinDate,txtQualification,txtApointedBy,txtVacancyNumber1, txtDesignation1,txtJobTyp1e, txtSalary1,
                    txtWorkingHour1,txtVacancyNumberApnt1,
                    txtStaffName1,txtJoinDate1,txtQualification1,txtApointedBy1,txtshifts;
                
                JComboBox cmbJobType,cmbJobType1;
                JButton btnAddFullTimeVacancy, btnAddPartTimeVacancy, btnAppointFT,btnAppointFT1,btnDisplay,btnClear,btnTerminate;
                String VacancyNumber;
                ArrayList<StaffHire> list=new ArrayList<StaffHire>();
                
                public void StaffHireForm()
                {
                    frm=new JFrame("Staff Hire");
                    frm.setSize(800,600);
                    frm.setLayout(null);
                    
                    
                    title1=new JLabel("full time staff hire");
                    title1.setBounds(250,5,130,30);
                    frm.add(title1);
                    
                    lblVacancyNumber=new JLabel("Vacancy Number:");
                    lblVacancyNumber.setBounds(20,30,120,30);
                    frm.add(lblVacancyNumber);
                    
                    txtVacancyNumber=new JTextField();
                    txtVacancyNumber.setBounds(130,30,80,30);
                    frm.add(txtVacancyNumber);
                    
                    lblDesignation=new JLabel("Designation:");
                    lblDesignation.setBounds(220,30,130,30);
                    frm.add(lblDesignation);
                    
                    txtDesignation=new JTextField();
                    txtDesignation.setBounds(305,30,100,30);
                    frm.add(txtDesignation);
                    
                    lblJobType=new JLabel("JobType:");
                    lblJobType.setBounds(410,30,80,30);
                    frm.add(lblJobType);
                    
                    String jobType[]={"FullTime","PartTime"};
                    cmbJobType=new JComboBox(jobType);
                    cmbJobType.setBounds(470,30,80,30);
                    frm.add(cmbJobType);
                    
                    lblSalary=new JLabel("Salary:");
                    lblSalary.setBounds(20,65,120,30);
                    frm.add(lblSalary);
                    
                    txtSalary=new JTextField();
                    txtSalary.setBounds(130,65,80,30);
                    frm.add(txtSalary);
                    
                    lblWorkingHour=new JLabel("WorkingHour:");
                    lblWorkingHour.setBounds(220,65,100,30);
                    frm.add(lblWorkingHour);
                    
                    txtWorkingHour=new JTextField();
                    txtWorkingHour.setBounds(305,65,100,30);
                    frm.add(txtWorkingHour);
                    
                    btnAddFullTimeVacancy=new JButton("Add FullTime Vacancy");
                    btnAddFullTimeVacancy.setBounds(440,65,180,30);
                    frm.add(btnAddFullTimeVacancy);
                    btnAddFullTimeVacancy.addActionListener(this);
                    
                    lblVacancyNumberApnt=new JLabel("Vacancy Number:");
                    lblVacancyNumberApnt.setBounds(20,115,120,30);
                    frm.add(lblVacancyNumberApnt);
                    
                    txtVacancyNumberApnt=new JTextField();
                    txtVacancyNumberApnt.setBounds(130,115,80,30);
                    frm.add(txtVacancyNumberApnt);
                    
                    lblStaffName=new JLabel("Staff Name:");
                    lblStaffName.setBounds(220,115,100,30);
                    frm.add(lblStaffName);
                    
                    txtStaffName=new JTextField();
                    txtStaffName.setBounds(305,115,130,30);
                    frm.add(txtStaffName);
                    
                    lblJoinDate=new JLabel("Joining Date:");
                    lblJoinDate.setBounds(440,115,100,30);
                    frm.add(lblJoinDate);
                    
                    txtJoinDate=new JTextField();
                    txtJoinDate.setBounds(520,115,100,30);
                    frm.add(txtJoinDate);
                    
                    lblQualification=new JLabel("Qualification:");
                    lblQualification.setBounds(20,150,120,30);
                    frm.add(lblQualification);
                    
                    txtQualification=new JTextField();
                    txtQualification.setBounds(130,150,80,30);
                    frm.add(txtQualification);
                    
                    lblApointedBy=new JLabel("Appointed By:");
                    lblApointedBy.setBounds(220,150,100,30);
                    frm.add(lblApointedBy);
                    
                    txtApointedBy=new JTextField();
                    txtApointedBy.setBounds(305,150,130,30);
                    frm.add(txtApointedBy);
                    
                    btnAppointFT=new JButton("Appoint");
                    btnAppointFT.setBounds(450,150,130,30);
                    frm.add(btnAppointFT);
                    btnAppointFT.addActionListener(this);
                    
                    
                    title=new JLabel("Part time staff hire");
                    title.setBounds(250,200,130,30);
                    frm.add(title);
                    
                    lblVacancyNumber1=new JLabel("Vacancy Number:");
                    lblVacancyNumber1.setBounds(20,270,120,30);
                    frm.add(lblVacancyNumber1);
                    
                    txtVacancyNumber1=new JTextField();
                    txtVacancyNumber1.setBounds(130,270,80,30);
                    frm.add(txtVacancyNumber1);
                    
                    lblDesignaion1=new JLabel("Designation:");
                    lblDesignaion1.setBounds(220,270,130,30);
                    frm.add(lblDesignaion1);
                    
                    txtDesignation1=new JTextField();
                    txtDesignation1.setBounds(305,270,100,30);
                    frm.add(txtDesignation1);
                    
                    lblJobType1=new JLabel("JobType:");
                    lblJobType1.setBounds(410,270,80,30);
                    frm.add(lblJobType1);
                    
                    String jobType1[]={"FullTime","PartTime"};
                    cmbJobType1=new JComboBox(jobType);
                    cmbJobType1.setBounds(470,270,80,30);
                    frm.add(cmbJobType1);
                    
                    lblshifts=new JLabel("Shifts");
                    lblshifts.setBounds(550,270,80,30);
                    frm.add(lblshifts);
                    
                    txtshifts =new JTextField();
                    txtshifts.setBounds(590,270,80,30);
                    frm.add(txtshifts);
                    
                    
                    lblSalary1=new JLabel("wages per hour:");
                    lblSalary1.setBounds(20,310,120,30);
                    frm.add(lblSalary1);
                    
                    txtSalary1=new JTextField();
                    txtSalary1.setBounds(130,310,80,30);
                    frm.add(txtSalary1);
                    
                    lblWorkingHour1=new JLabel("WorkingHour:");
                    lblWorkingHour1.setBounds(220,310,100,30);
                    frm.add(lblWorkingHour1);
                    
                    txtWorkingHour1=new JTextField();
                    txtWorkingHour1.setBounds(305,310,100,30);
                    frm.add(txtWorkingHour1);
                    
                    btnAddPartTimeVacancy=new JButton("Add Part Time Vacancy");
                    btnAddPartTimeVacancy.setBounds(440,310,180,30);
                    frm.add(btnAddPartTimeVacancy);
                    btnAddPartTimeVacancy.addActionListener(this);
                    
                    lblVacancyNumberApnt1=new JLabel("Vacancy Number:");
                    lblVacancyNumberApnt1.setBounds(20,350,120,30);
                    frm.add(lblVacancyNumberApnt1);
                    
                    txtVacancyNumberApnt1=new JTextField();
                    txtVacancyNumberApnt1.setBounds(130,350,80,30);
                    frm.add(txtVacancyNumberApnt1);
                    
                    lblStaffName1=new JLabel("StaffName:");
                    lblStaffName1.setBounds(220,350,100,30);
                    frm.add(lblStaffName1);
                    
                    txtStaffName1=new JTextField();
                    txtStaffName1.setBounds(305,350,130,30);
                    frm.add(txtStaffName1);
                    
                    lblJoinDate1=new JLabel("Joining Date:");
                    lblJoinDate1.setBounds(440,350,100,30);
                    frm.add(lblJoinDate1);
                    
                    txtJoinDate1=new JTextField();
                    txtJoinDate1.setBounds(520,350,100,30);
                    frm.add(txtJoinDate1);
                    
                    lblQualification1=new JLabel("qualification:");
                    lblQualification1.setBounds(20,380,120,30);
                    frm.add(lblQualification1);
                    
                    txtQualification1=new JTextField();
                    txtQualification1.setBounds(130,385,80,30);
                    frm.add(txtQualification1);
                    
                    lblApointedBy1=new JLabel("Appointed By:");
                    lblApointedBy1.setBounds(220,380,100,30);
                    frm.add(lblApointedBy1);
                    
                    txtApointedBy1=new JTextField();
                    txtApointedBy1.setBounds(305,385,120,30);
                    frm.add(txtApointedBy1);
                    
                    btnAppointFT1=new JButton("Appoint");
                    btnAppointFT1.setBounds(450,385,130,30);
                    frm.add(btnAppointFT1);
                    btnAppointFT1.addActionListener(this);
                    
                    btnDisplay=new JButton("Display");
                    btnDisplay.setBounds(20,430,130,30);
                    frm.add(btnDisplay);
                    btnDisplay.addActionListener(this);
                    
                    btnTerminate =new JButton("Terminate");
                    btnTerminate.setBounds(220,430,130,30);
                    frm.add(btnTerminate);
                    btnTerminate.addActionListener(this);
                    
                    btnClear =new JButton("Clear");
                    btnClear.setBounds(450,430,130,30);
                    frm.add(btnClear);
                    btnClear.addActionListener(this);
                   

                    frm.setVisible(true);
                    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                
               
               public void actionPerformed(ActionEvent e)
            {
                   if (e.getSource()==btnAddFullTimeVacancy)
                {
                    addFullTimeVacancy();
                }
                if (e.getSource()==btnAddPartTimeVacancy)
                {
                    addPartTimeVacancy();
                }
                 else if(e.getSource()==btnAppointFT1)
                 {
                     appointFullTime();
                 }
                 else if(e.getSource()==btnAppointFT1)
                 {
                     appointPartTime();
                 }
                 else if(e.getSource()==btnDisplay)
                 {
                     Display();
                 }
                 else if(e.getSource()==btnTerminate)
                 {
                     Terminate();
                 }
                 else if (e.getSource()==btnClear)
                 {
                     Clear();
                 }
            
             }
        
        
        
            public void addFullTimeVacancy()
            {
    
                try{
                    int vno=Integer.parseInt(txtVacancyNumber.getText());
                    String designation=txtDesignation.getText();
                    int salary=Integer.parseInt(txtSalary.getText());
                    int workingHour=Integer.parseInt(txtWorkingHour.getText());
                    String jobType=(cmbJobType.getSelectedItem()).toString();
                    
                    boolean isDuplicateVno=false;
                    for(StaffHire var:list)
                    {
                        if(var.getVacancynumber()==vno){
                            isDuplicateVno=false;
                            break;
                        }
                    }
                    
                    if (isDuplicateVno==false){
                        FullTimeStaffHire obj=new FullTimeStaffHire(vno,designation,jobType,salary,workingHour);
                        list.add(obj);
                        JOptionPane.showMessageDialog(frm,"vacancy added");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(frm,"Input Vacancy no is already in the list."+list.size());
                    }
                }
                catch(Exception exp)
                {
                    JOptionPane.showMessageDialog(frm,"Input is invalid.");
                }
    
            }
            
             public void appointFullTime()
             {
        
                int vno=Integer.parseInt(txtVacancyNumberApnt.getText());
                String staffName=txtStaffName.getText();
                String joinDate=txtJoinDate.getText();
                String qualification=txtQualification.getText();
                String appointedBy=txtApointedBy.getText();
                
                boolean vnoFound=false;
                for(StaffHire obj:list){
                    if(obj.getVacancynumber()==vno){
                        vnoFound=true;
                        if(obj instanceof FullTimeStaffHire){
                            FullTimeStaffHire h1=(FullTimeStaffHire)obj;
                            if(h1.getjoined()==true){
                                JOptionPane.showMessageDialog(frm,"Staff already hired!");
                            }else{
                                h1.hirefulltimestaff(staffName,joinDate,qualification,appointedBy);
                                JOptionPane.showMessageDialog(frm,"Staff has been hired!");
                                break;
                            }
                        }else{
                            JOptionPane.showMessageDialog(frm,"It is not for Parttime staff Hire");
                            break;
                    }
                    if(!vnoFound){JOptionPane.showMessageDialog(frm,"invalid vacancy");
                    }
                }
            }
        }
            
            public void Display()
            {
                for(StaffHire obj:list)
                {
                    if(obj instanceof FullTimeStaffHire)
                    {
                        obj=(FullTimeStaffHire)obj;
                        obj.display();
                    }
                    else if(obj instanceof PartTimeStaffHire)
                    {
                        PartTimeStaffHire obj11 =(PartTimeStaffHire)obj;
                        obj11.display();
                    }
                }
                
            }
            
                public void Terminate()
                {
                 int Vno = Integer.parseInt(txtVacancyNumberApnt.getText());
                   for(StaffHire obj:list){
                        if(obj.getVacancynumber()== Vno)
                       {
                            if(obj instanceof PartTimeStaffHire)
                            { 
                                PartTimeStaffHire hre= (PartTimeStaffHire)obj;
                                if(hre.getterminated()== true)
                                {
                                    JOptionPane.showMessageDialog(frm,"Part time already terminated");
                                    break;
                                }
                                else
                                {
                                    hre.setterminated();
                                    JOptionPane.showMessageDialog(frm,"Part time terminated");
                                    break;
                                }
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(frm,"Not for part time");
                                break;
                            }
                   
                       }
                       else
                       {
                           JOptionPane.showMessageDialog(frm,"Enter vacancy Number");
                       }
                   }
                }
                
             public void Clear()
            { 
             txtVacancyNumber.setText(" ");
             txtDesignation.setText(" ");
             cmbJobType.setSelectedIndex(0);
             txtSalary.setText(" ");
             txtWorkingHour.setText(" ");


             txtVacancyNumberApnt.setText(" ");
             txtStaffName.setText(" ");
             txtJoinDate.setText(" ");
             txtQualification.setText(" ");
             txtApointedBy.setText(" ");



             txtVacancyNumber1.setText(" ");
             txtDesignation1.setText(" ");
             cmbJobType1.setSelectedIndex(0);
             txtshifts.setText(" ");
             txtSalary1.setText(" ");
             txtWorkingHour1.setText(" ");


             txtVacancyNumberApnt1.setText(" ");
             txtStaffName1.setText(" ");
             txtJoinDate1.setText(" ");
             txtQualification1.setText(" ");
             txtApointedBy1.setText(" ");

            
            JOptionPane.showMessageDialog(frm,"Text fields cleared");
        }
    
        
          public void addPartTimeVacancy()
        {

            try{
                int vacancynumber=Integer.parseInt(txtVacancyNumber1.getText());
                String designation=txtDesignation1.getText();
                int wagesperhour=Integer.parseInt(txtSalary1.getText());
                int workingHour=Integer.parseInt(txtWorkingHour1.getText());
                String jobType=(cmbJobType1.getSelectedItem()).toString();
                String shifts=txtshifts.getText();
                boolean isDuplicateVno=false;
                for(StaffHire var:list)
                {
                    if(var.getVacancynumber()==vacancynumber){
                        isDuplicateVno=false;
                        break;
                    }
                }
                
                if (isDuplicateVno==false){
                    PartTimeStaffHire obj=new PartTimeStaffHire (vacancynumber,designation,jobType,wagesperhour,workingHour,shifts);
                    list.add(obj);
                    JOptionPane.showMessageDialog(frm,"vacancy added");
                }
                else
                {
                    JOptionPane.showMessageDialog(frm,"Input Vacancy no is already in the list.");
                }
            }
            catch(Exception exp)
            {
                JOptionPane.showMessageDialog(frm,"Input is invalid.");
            }

        }
        
         public void appointPartTime()
         {
    
            int vacancynumber=Integer.parseInt(txtVacancyNumberApnt.getText());
            String staffName1=txtStaffName.getText();
            String joiningDate1=txtJoinDate.getText();
            String qualification1=txtQualification.getText();
            String appointedBy1=txtApointedBy.getText();
            
            boolean vnoFounds=false;
            for(StaffHire obj:list){
                if(obj.getVacancynumber()==vacancynumber){
                    vnoFounds=true;
                    if(obj instanceof PartTimeStaffHire){
                        PartTimeStaffHire h2=(PartTimeStaffHire)obj;
                        if(h2.getjoined()==true){
                            JOptionPane.showMessageDialog(frm,"Staff already hired!");
                            break;
                        }else{
                            h2. hireparttimestaffhire(staffName1,joiningDate1,qualification1,appointedBy1);
                            JOptionPane.showMessageDialog(frm,"Staff has been hired!");
                            break;
                        }
                    }else{
                        JOptionPane.showMessageDialog(frm,"It is not for Parttime staff Hire");
                        break;
                    }
                }
               else{JOptionPane.showMessageDialog(frm,"invalid vacancy");
                }
            }
         }
            

        
        public static void main(String[]args)
        {
            INGNepal A=new INGNepal();
            A.StaffHireForm();
        }
    }






                           
                                    
        

      
   