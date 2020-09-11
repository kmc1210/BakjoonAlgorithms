import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] dice = new int[3];
		int cal = 0;
		for( int i =0; i<dice.length; i++) {
			dice[i] = sc.nextInt();}
		
			if(dice[0]==dice[1] && dice[1]==dice[2]) {
				cal = 10000+(1000*dice[0]);
			}else if(dice[0]==dice[1] && dice[1]!=dice[2]) {
				cal = 1000+(100*dice[0]);
			}else if(dice[1]==dice[2] && dice[0]!=dice[1]) {
				cal = 1000+(100*dice[1]);
			}else if(dice[2]==dice[0] && dice[1]!=dice[2]) {
				cal = 1000+(100*dice[2]);
			}else if(dice[0]!=dice[1] && dice[1]!=dice[2]) {
				if(dice[0]!=dice[2]) {
					Arrays.sort(dice);
					cal = dice[2]*100;
				}
			}
		System.out.println(cal);
		}
	}
