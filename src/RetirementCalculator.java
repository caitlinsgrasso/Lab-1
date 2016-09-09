import java.util.Scanner;

public class RetirementCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

double yearsToWork;
double returnOnInvestments;
double yearsRetired;
double annualReturn;
double requiredIncome;
double monthlySSI;


System.out.println("How many years do you plan to work?");
yearsToWork=input.nextDouble();

do {
System.out.println("What is your expected average return on investment during this time?");
returnOnInvestments=input.nextDouble();
} while (returnOnInvestments<=0 || returnOnInvestments>20);

System.out.println("How many years will you be in retirement");
yearsRetired=input.nextDouble();

do {
System.out.println("What is your expected annual return?");
annualReturn=input.nextDouble();
} while (annualReturn<=0 || annualReturn>3);

System.out.println("What is your required income during retirement?");
requiredIncome=input.nextDouble();

System.out.println("What is your expected monthly Social Security Income?");
monthlySSI=input.nextDouble();

input.close();

double moneyNeeded = (requiredIncome-monthlySSI)*((1-(1/(Math.pow(1+(annualReturn/100)/12,yearsRetired*12)))))/((annualReturn/100)/12);
returnOnInvestments = (returnOnInvestments/100)/12;
double monthlySaving = moneyNeeded*((returnOnInvestments)/(Math.pow((1+returnOnInvestments), (yearsToWork*12))-1));

System.out.print("You will need $"); 
System.out.printf("%.2f", moneyNeeded);
System.out.println(" total.");
System.out.print("You will need $");
System.out.printf("%.2f", monthlySaving);
System.out.println(" per month.");
	}

}
