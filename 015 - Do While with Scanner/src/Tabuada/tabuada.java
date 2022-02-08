package Tabuada;

public class tabuada {
	public static void main(String[] args) {
		int cont=1, num=1;
		
		for(cont=1; cont<=10; cont++) {
			for(num=1; num<=10; num++) {
				System.out.println(cont+"x"+num+" = " +cont*num);
			}
			System.out.println();
		}

	}

}
