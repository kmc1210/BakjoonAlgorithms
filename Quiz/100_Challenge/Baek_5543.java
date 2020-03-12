

import java.util.*;


public class Baek_5543 { //상근날드
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] mac = new int [5];
		List sum = new ArrayList(); 
		for(int i=0; i<mac.length; i++) {
			mac[i] = sc.nextInt();
		}
		for(int i=0; i<3; i++) {
			for(int j=3; j<5; j++) {
				sum.add(mac[i]+mac[j]-50);
			}
		}
		Collections.sort(sum);
		System.out.println(sum.get(0));
	}
}
