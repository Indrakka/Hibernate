
public class ExceptionExplain {

	public static void main(String[] args) {
		int a=10;
		int b=2;
		int c;
		 System.out.println("Before division");
		 try {
		 c=a/b;
		 System.exit(0);
		 }
		 catch(Exception e) {
			 System.out.println(e.getMessage());
			 //e.printStackTrace();
		 }
		 finally {
			 System.out.println("executes");
		 }
		 System.out.println("After division");
	}

}
