package WeekendSpecial;

public class StarTriangle {

	public void makeTriangle(int n){
		if(n<1){
			return;
		}
		makeTriangle(n-1);
		for(int i=1;i<=n;i++){
			System.out.print("*");
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
			StarTriangle s = new StarTriangle();
			s.makeTriangle(5);

	}

}
