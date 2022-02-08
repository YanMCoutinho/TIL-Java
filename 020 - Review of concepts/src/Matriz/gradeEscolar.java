package Matriz;

public class gradeEscolar {

	public static void main(String[] args) {
		double gradeEscolar[][] = new double [3][4];
		String aluno[] = {"A","B","C"};;
		
		gradeEscolar[0][0] = 10;
		gradeEscolar[0][1] = 7;
		gradeEscolar[0][2] = 9;
		gradeEscolar[0][3] = 9.5;
		
		gradeEscolar[1][0] = 9;
		gradeEscolar[1][1] = 8;
		gradeEscolar[1][2] = 7;
		gradeEscolar[1][3] = 9;
		
		gradeEscolar[2][0] = 8;
		gradeEscolar[2][1] = 9;
		gradeEscolar[2][0] = 10;
		gradeEscolar[2][0] = 7;
		
		for (int linha=0; linha<(gradeEscolar.length); linha++ ) {
			System.out.print("Aluno " + aluno[linha] + " Notas: ");
		    for (int coluna=0;coluna<(gradeEscolar[linha].length);coluna++) {
		        System.out.print(gradeEscolar[linha][coluna]);
		        System.out.print((coluna<(gradeEscolar[linha].length-1))?"; ":".");
			}
			System.out.printf("%n");
		}
	}
}
