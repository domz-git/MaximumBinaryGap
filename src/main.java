import java.util.*;
public class main {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter an integer to be converted into binary: ");
			int num = scanner.nextInt();
			int cnt1 = 0;
			int cnt2 = 0;
			ArrayList<Integer> numBin = new ArrayList<>();
			
			while(num != 0) {
				int bin = num%2;
				numBin.add(bin);
				num = num/2;
			}
			Collections.reverse(numBin);
			System.out.print(numBin);
			
			for(int i=0;i<numBin.size();i++) {
				
				if(numBin.get(i)==0) {
					cnt1++;
				}else if(numBin.get(i)==1) {
					if(cnt1>cnt2) {
						cnt2=cnt1;
					}
					cnt1=0;
				}
		}
			System.out.println("");
			System.out.print("The maximum binary gap is: "+cnt2+" zeros.");
		}
	}
}
