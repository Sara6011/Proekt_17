package zadacaaa16;
import java.util.Scanner;
public class vezba3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Da se vnesat broevi koi ne se delivi so brojot 3");
		System.out.println("Vnesi broj na clenovi vo nizata");
		int n=input.nextInt();
		int niza[]=new int[n];
		System.out.println("Vnesi gi clenovite vo nizata:");
		for (int i = 0; i < niza.length; i++) {
			System.out.println(i + "-->");
			niza[i] = input.nextInt();//vcitaj niza[i] - i-ti clen vo niza
		}
		for (int i = 0; i < niza.length; i++) {
			if(niza[i] %3 !=0)
			System.out.println("niza["+ i + "]=" + niza[i]);
		}
		}
}
