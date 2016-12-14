package OldProjekts;
import java.util.Scanner;
public class zahlenraten {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Willkommen beim Zahlenraten. \nIch denke mir eine Zahl zwischen 1 und 100. Rate diese Zahl!");
		 int secret = (int)(Math.random() * 100) + 1;
		 //System.out.println(secret);
		 System.out.print("1. Versuch: ");
		 int input = in.nextInt();
		 int i = 2;
		 while (input != secret) {
			 if (input < secret) {
				 System.out.println("Meine Zahl ist größer!");
				 System.out.print(i +". Versuch: ");
			 }
			
			 if (input > secret) {
				System.out.println("Meine Zahl ist kleiner!");
				System.out.print(i +". Versuch: ");
				
			 }			 
			 input = in.nextInt();
			 i++;
			 
		 }
		 in.close();
		  System.out.println("Herzlichen glückwunsch \ndu hast meine Zahl beim "+--i+" Versuch erraten.");


	}

}
