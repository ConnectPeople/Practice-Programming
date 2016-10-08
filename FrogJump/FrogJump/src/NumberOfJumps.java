import java.util.Scanner;

public class NumberOfJumps {
	public static int solution(int X, int Y, int D){
		int counter = 0;
		while(X<Y){
			X = X+D;
			counter++;
			System.out.println("X ="+ X);
			System.out.println("counter=" +counter);
		}
		return counter;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int x= input.nextInt();
		int y = input.nextInt();
		int d = input.nextInt();
		int numberOfSteps = solution(x,y,d);
		System.out.println(numberOfSteps);
	}
}
