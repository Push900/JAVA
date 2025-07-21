import java.util.Scanner;

class SumN{
    public static void main(String[] args) {
        perform p1= new perform();
        p1.getInput();
        p1.getSum();
    }
}
class perform{
	int n;
	void getInput(){
		Scanner sc = new Scanner(System.in);
        	System.out.println("Enter an integer:");
       		n = sc.nextInt();
	}
	
	void getSum(){
		int i,sum=0;
		if(n<0){
			System.out.println("INVALIDDDDD");	
		}
		else{
			for(i=0;i<n;i+=6){
				sum=sum+i;
			}
		}
		System.out.println("SUM= "+sum);
}

}
