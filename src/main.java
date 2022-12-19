
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		
		n++;
		
		if(esParell(n)) {
			System.out.print("Número: " + n);	
		}
		
	}
	
	public void saludar(String name) {
		System.out.println("Hola " + name);
	}
	
	public static boolean esParell(int n) {
		return n % 2 == 0;
	}

}
