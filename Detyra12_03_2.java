import javax.swing.*;
/**Detyra12_03_2 takes as an integer as an input and tells the user if the year given, is a leap year, or not. 
  * Era Ibrahimi */
public class Detyra12_03_2
{ public static void main(String[] args)
 { //first way - longer and more precise
   int year = new Integer(JOptionPane.showInputDialog("Type year.")).intValue();
   if (year%4==0)
      { if (year%100==0)
           {if (year%400==0)
               {JOptionPane.showMessageDialog(null, year+" is a leap year. This year has 366 day and Fabruary has 29 days.");}
              else{ JOptionPane.showMessageDialog(null, year+" is NOT a leap year. This year has 365 day and Fabruary has 28 days.");}
           }
       }
   else{ JOptionPane.showMessageDialog(null, year+" is NOT a leap year. This year has 365 day and Fabruary has 28 days.");}
 
   /**second way - not very precise     
   if (year%4==0)
      {JOptionPane.showMessageDialog(null, year+" is a leap year. This year has 366 day and Fabruary has 29 days.");}
    else{ JOptionPane.showMessageDialog(null, year+" is NOT a leap year. This year has 365 day and Fabruary has 28 days.");}*/
  }
}