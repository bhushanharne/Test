package Data;

public class rev_num {

	public static void main(String[] args) {


		int num=53436;
		int rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
			System.out.println(rev);
		}
	}

}
