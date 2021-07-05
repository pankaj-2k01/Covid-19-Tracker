/* Name  : Pankaj Kumar
   Roll no :2019262

   Assumption:
   1. Reported date should be in dd/MM/yyyy format otherwise it throws a error
   2 I Store the data on the basis of Tower

 */




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Covid19 {
    public static void main(String[] args) {
        Swing obj=new Swing();
        Parents o=new Parents();
    }

}
class Parents {
    String[] A={"Flora","Caery","Bob","Smith","Robertz"};
    String[] B={"Denys","David","Pearson","Anderson","Julie"};
    String[] C={"Jim","Rachel","Thomas"};
    String[] D={"Hazel","Kevim","Tom","Mary","Johnson","Edith","John"};

    int[] A_age={6,72,74,89,50};
    int[] B_age={24,7,47,62,86};
    int[] C_age={42,48,21};
    int[] D_age={87,37,67,17,10,42,95};

    String[] A_date={"01/04/2020","01/06/2020","04/07/2020","07/08/2020","09/08/2020"};
    String[] B_date={"01/04/2020","14/06/2020","04/06/2020","27/07/2020","02/05/2020"};
    String[] C_date={"18/05/2020","24/07/2020","11/06/2020"};
    String[] D_date={"23/06/2020","05/06/2020","20/06/2020","21/06/2020","01/08/2020","07/06/2020","01/06/2020"};
}
class Swing extends JFrame implements ActionListener  {
    JTextField Tow;
    JCheckBox A,B,C,D;
    JTextField report;
    JLabel header;
    public Swing(){

        report =new JTextField(20);

        JButton b=new JButton("Fetch data");
        setLayout(new FlowLayout());

        JLabel Tower =new JLabel("Tower");

        JLabel report_date=new JLabel("Reporting Date : ");

        A=new JCheckBox("Tower : A");
        B=new JCheckBox("Tower : B");
        C=new JCheckBox("Tower : C");
        D=new JCheckBox("Tower : D");
        add(Tower);
        add(A);
        add(B);
        add(C);
        add(D);
        add(report_date);

        add(report);
        add(b);
        b.addActionListener(this);

        setVisible(true);
        setSize(500,770);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        Parents object=new Parents();
        String rep_date=report.getText();
       // JLabel patientdate=new JLabel(" Reported Date ");

        //----------------------------------------------A selected--------------------------------------------
        if(A.isSelected()){

            String act_date="";
           JLabel LabelA= new JLabel("---------------------------------------   Tower A   --------------------------------------------");
           //header = new JLabel("Name    Age     Reported Date       Recovery Date       Status");
            int active=0;
            int recovered=0;


            add(LabelA);
            for(int i=0;i< object.A_date.length;i++){

                try {
                     act_date=adddays(object.A_date[i]);
                } catch (ParseException parseException) {
                    parseException.printStackTrace();
                }
                try {
                    //JLabel act_status =new JLabel("Active :");
                    JLabel rec_status =new JLabel("Recovered  ");
                    JLabel agge =new JLabel("Age : ");
                    JLabel space=new JLabel("\n ");
                    JLabel t=new JLabel("Tower A");
                    if(datecompare(act_date,rep_date)){
                        JLabel recdate=new JLabel("Recovery date :       ");
                        JLabel patientname=new JLabel(object.A[i]+"");
                        JLabel patientage=new JLabel(object.A_age[i]+"");
                        add(space);
                        add(patientname);
                        add(t);
                        add(agge);
                        add(patientage);
                        add(rec_status);
                        add(recdate);
                        JLabel actualdate=new JLabel(act_date+"");
                        add(actualdate);
                        JLabel patientdate=new JLabel(" Reported Date ");
                        add(patientdate);
                        JLabel pat =new JLabel(object.A_date[i]+"");
                        add(pat);
                        setVisible(true);
                        recovered++;

                    }
                    else{
                        JLabel agge1 =new JLabel("Age : ");
                        JLabel recdate=new JLabel("Recovery date :        ");
                        JLabel act_status =new JLabel("Active  ");
                        active++;
                        JLabel patientname=new JLabel(object.A[i]+"");
                        JLabel patientage=new JLabel(object.A_age[i]+"");
                        add(space);
                        add(patientname);
                        add(t);
                        add(agge1);
                        add(patientage);
                        add(act_status);
                        add(recdate);
                        JLabel actualdate=new JLabel(act_date+"");
                        add(actualdate);
                        JLabel patientdate=new JLabel(" Reported Date ");
                        add(patientdate);
                        JLabel pat =new JLabel(object.A_date[i]+"");
                        add(pat);
                        setVisible(true);
                    }
                } catch (ParseException parseException) {
                    parseException.printStackTrace();
                }

            }
            JLabel activeno=new JLabel("No of active cases are :  "+active);
            JLabel recno=new JLabel("No of Recovered cases are :  "+recovered);
            add(activeno);
            add(recno);


        }
        //----------------------------------------------------Tower D-------------------------------------
        if(D.isSelected()){

            String act_date="";
            JLabel LabelA= new JLabel("---------------------------------------   Tower D   ---------------------------------");
            int active=0;
            int recovered=0;


            add(LabelA);
            for(int i=0;i< object.D_date.length;i++){

                try {
                    act_date=adddays(object.D_date[i]);
                } catch (ParseException parseException) {
                    parseException.printStackTrace();
                }
                try {
                    //JLabel act_status =new JLabel("Active :");
                    JLabel rec_status =new JLabel("Recovered  ");
                    JLabel agge =new JLabel("Age : ");
                    JLabel space=new JLabel("\n ");
                    JLabel t=new JLabel("Tower D");
                    if(datecompare(act_date,rep_date)){
                        JLabel recdate=new JLabel("Recovery date :       ");
                        JLabel patientname=new JLabel(object.D[i]+"");
                        JLabel patientage=new JLabel(object.D_age[i]+"");
                        add(space);
                        add(patientname);
                        add(t);
                        add(agge);
                        add(patientage);
                        add(rec_status);
                        add(recdate);
                        JLabel actualdate=new JLabel(act_date+"");
                        add(actualdate);
                        JLabel patientdate=new JLabel(" Reported Date ");
                        add(patientdate);
                        JLabel pat =new JLabel(object.D_date[i]+"");
                        add(pat);
                        setVisible(true);
                        recovered++;

                    }
                    else{
                        JLabel agge1 =new JLabel("Age : ");
                        JLabel recdate=new JLabel("Recovery date : ");
                        JLabel act_status =new JLabel("Active  ");
                        active++;
                        JLabel patientname=new JLabel(object.D[i]+"");
                        JLabel patientage=new JLabel(object.D_age[i]+"");
                        add(space);
                        add(patientname);
                        add(t);
                        add(agge1);
                        add(patientage);
                        add(act_status);
                        add(recdate);
                        JLabel actualdate=new JLabel(act_date+"");
                        add(actualdate);
                        JLabel patientdate=new JLabel(" Reported Date ");
                        add(patientdate);
                        JLabel pat =new JLabel(object.D_date[i]+"");
                        add(pat);
                        setVisible(true);
                    }
                } catch (ParseException parseException) {
                    parseException.printStackTrace();
                }

            }
            JLabel activeno=new JLabel("No of active cases are :  "+active);
            JLabel recno=new JLabel("No of Recovered cases are :  "+recovered);
            add(activeno);
            add(recno);


        }

        //-----------------------------------------------------Tower C------------------------------------
        if(C.isSelected()){

            String act_date="";
            JLabel LabelA= new JLabel("---------------------------------------   Tower C   -----------------------------------");
            int active=0;
            int recovered=0;


            add(LabelA);
            for(int i=0;i< object.C_date.length;i++){

                try {
                    act_date=adddays(object.C_date[i]);
                } catch (ParseException parseException) {
                    parseException.printStackTrace();
                }
                try {
                    //JLabel act_status =new JLabel("Active :");
                    JLabel rec_status =new JLabel("Recovered  ");
                    JLabel agge =new JLabel("Age : ");
                    JLabel space=new JLabel("\n ");
                    JLabel t=new JLabel("Tower C");
                    if(datecompare(act_date,rep_date)){
                        JLabel recdate=new JLabel("Recovery date : ");
                        JLabel patientname=new JLabel(object.C[i]+"");
                        JLabel patientage=new JLabel(object.C_age[i]+"");
                        add(space);
                        add(patientname);
                        add(t);

                        add(agge);
                        add(patientage);
                        add(rec_status);
                        add(recdate);
                        JLabel actualdate=new JLabel(act_date+"");
                        add(actualdate);
                        JLabel patientdate=new JLabel(" Reported Date ");
                        add(patientdate);
                        JLabel pat =new JLabel(object.C_date[i]+"");
                        add(pat);
                        setVisible(true);
                        recovered++;

                    }
                    else{
                        JLabel agge1 =new JLabel("Age : ");
                        JLabel recdate=new JLabel("Recovery date : ");
                        JLabel act_status =new JLabel("Active  ");
                        active++;
                        JLabel patientname=new JLabel(object.C[i]+"");
                        JLabel patientage=new JLabel(object.C_age[i]+"");
                        add(space);
                        add(patientname);
                        add(t);
                        add(agge1);
                        add(patientage);
                        add(act_status);
                        add(recdate);
                        JLabel actualdate=new JLabel(act_date+"");
                        add(actualdate);
                        JLabel patientdate=new JLabel(" Reported Date ");
                        add(patientdate);
                        JLabel pat =new JLabel(object.C_date[i]+"");
                        add(pat);
                        setVisible(true);
                    }
                } catch (ParseException parseException) {
                    parseException.printStackTrace();
                }

            }
            JLabel activeno=new JLabel("No of active cases are :  "+active);
            JLabel recno=new JLabel("No of Recovered cases are :  "+recovered);
            add(activeno);
            add(recno);



        }

        //-----------------------------------------------------------B selected--------------------------------------------------
        if(B.isSelected()){

            String act_date="";
            JLabel LabelA= new JLabel("---------------------------------------   Tower B   ---------------------------------");
            int active=0;
            int recovered=0;


            add(LabelA);
            for(int i=0;i< object.B_date.length;i++){

                try {
                    act_date=adddays(object.B_date[i]);
                } catch (ParseException parseException) {
                    parseException.printStackTrace();
                }
                try {
                    //JLabel act_status =new JLabel("Active :");
                    JLabel rec_status =new JLabel("Recovered  ");
                    JLabel agge =new JLabel("Age : ");
                    JLabel space=new JLabel("\n ");
                    JLabel t=new JLabel("Tower B");
                    if(datecompare(act_date,rep_date)){
                        JLabel recdate=new JLabel("Recovery date : ");
                        JLabel patientname=new JLabel(object.B[i]+"");
                        JLabel patientage=new JLabel(object.B_age[i]+"");
                        add(space);
                        add(patientname);
                        add(t);
                        add(agge);
                        add(patientage);
                        add(rec_status);
                        add(recdate);
                        JLabel actualdate=new JLabel(act_date+"");
                        add(actualdate);
                        JLabel patientdate=new JLabel(" Reported Date ");
                        add(patientdate);
                        JLabel pat =new JLabel(object.B_date[i]+"");
                        add(pat);
                        setVisible(true);
                        recovered++;

                    }
                    else{
                        JLabel agge1 =new JLabel("Age : ");
                        JLabel recdate=new JLabel("Recovery date : ");
                        JLabel act_status =new JLabel("Active  ");
                        active++;
                        JLabel patientname=new JLabel(object.B[i]+"");
                        JLabel patientage=new JLabel(object.B_age[i]+"");
                        add(space);
                        add(patientname);
                        add(t);
                        add(agge1);
                        add(patientage);
                        add(act_status);
                        add(recdate);
                        JLabel actualdate=new JLabel(act_date+"");
                        add(actualdate);
                        JLabel patientdate=new JLabel(" Reported Date ");
                        add(patientdate);
                        JLabel pat =new JLabel(object.B_date[i]+"");
                        add(pat);
                        setVisible(true);
                    }
                } catch (ParseException parseException) {
                    parseException.printStackTrace();
                }

            }
            JLabel activeno=new JLabel("No of active cases are :  "+active);
            JLabel recno=new JLabel("No of Recovered cases are :  "+recovered);
            add(activeno);
            add(recno);

        }


    }

    public static boolean datecompare(String first ,String Second)throws ParseException{
        SimpleDateFormat test = new SimpleDateFormat("dd/MM/yyyy");
        Date start = test.parse(first);
        Date end = test.parse(Second);
        //System.out.println(start.before(end));
        return start.before(end);
    }
    public static String adddays(String d) throws ParseException  {
        SimpleDateFormat getformat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = getformat.parse(d);
        getformat.format(date);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, 22);
        return getformat.format(c.getTime());
    }

}
