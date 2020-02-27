    
import java.util.Scanner;

public class ClassDemo {
	public static void main(String[] args) {
 
		
		//Add code to create an object repeatedly
		
		String name,ans;
		int age;
		Person p;
		Scanner input = new Scanner(System.in);
		int[] b= new int[10];
		int i=0;
		int d=0;
		int x=0;
		
		do {

			System.out.println("Enter name :");
			name = input.nextLine();
			System.out.println("Enter age :");
			age = input.nextInt();
			b[i]=age;
			p = new Person(name,b[i],20);
			System.out.println(p.getName() + 
					   " You are " +p.getAge() + " Years old");
			input.nextLine();
			System.out.println("Do you want to continue?");
			ans = input.nextLine();
			i++;
			d=i;
		}while (ans.equals("y") && i<b.length );
		for (i=0; i<d; i++) {
		
			System.out.println(b[i]);
			x=x+b[i];
			}
		double average=(x/d);
		System.out.println("average = "+ average);
		input.close();
	}
}