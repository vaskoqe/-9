import java.util.Scanner;
public class д9 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("Провери, дали числото/а се дели/ят на 9 и разбери колко е, ако се дели");
		System.out.println("Въведи числото а: ");
		long a= input.nextLong();
		if (a%9==0) {
			System.out.println("Числото " + a + " се дели на 9 и е: ");
		System.out.println(a/9);;}
		else 
			System.out.println("Числото "+ a+ " не се дели на 9!");
		input.close();
		

	}

}
