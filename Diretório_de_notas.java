import java.util.Scanner;

public class Diretório_de_notas {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		System.out.println("Sistema de Notas");
		
	System.out.print("Digite sua nota da prova1: ");
		int prova1 = sn.nextInt();
	System.out.print("Digite sua nota do trabalho1: ");
		int trabalho1 = sn.nextInt();
	System.out.print("Digite a nota da lista de excercicios do 1° Bimestre: ");	
		int excer1 = sn.nextInt();
	System.out.print("Digite sua nota de contribuição de projetos do 1° Bimestre: ");
		int contribu1 = sn.nextInt();
		
		int mediaB1 = ((prova1*3) + (trabalho1*3) + (excer1*2) + (contribu1*3))/10;
		
	System.out.print("Digite sua nota da prova 2: ");
		int prova2 = sn.nextInt();
	System.out.print("Digite sua nota do trabalho 2: ");
		int trabalho2 = sn.nextInt();
	System.out.print("Digite a nota da lista de excercicios do 2° Bimestre: ");
		int excer2 = sn.nextInt();
	System.out.print("Digite sua nota de contribuição de projetos do 2° Bimestre: ");
		int contribu2 = sn.nextInt();
		
		int mediaB2 = ((prova2*3) + (trabalho2*3) + (excer2*2) + (contribu2*3))/10;
		
	System.out.print("Digite sua nota da prova3: ");
		int prova3 = sn.nextInt();
	System.out.print("Digite sua nota do trabalho3: ");
		int trabalho3 = sn.nextInt();
	System.out.print("Digite a nota da lista de excercicios do 3° Bimestre: ");
		int excer3 = sn.nextInt();
	System.out.print("Digite sua nota de contribuição de projetos do 3° Bimestre: ");
		int contribu3 = sn.nextInt();
		
		int mediaB3 = ((prova3*3) + (trabalho3*3) + (excer3*2) + (contribu3*3))/10;
		
		int mediasemestral = ((mediaB1) + (mediaB2) + (mediaB3))/3;
		
	System.out.println("Sua média do 1°Bimestre foi: " + mediaB1);
		System.out.println("Sua média do 2°Bimestre foi: " + mediaB2);
		System.out.println("Sua média do 3°Bimestre foi: " + mediaB2);
		
		
	if (mediasemestral >= 8) {
			System.out.print("Status: Estudante aprovado. Sua media semestral foi de "+mediasemestral);
		} else {
			System.out.println("Status: Estudante ainda cursando a disciplina. Sua media semestral foi de "+ mediasemestral);
			int notaFinal = sn.nextInt();
			notaFinal = (10 - mediasemestral);
			// Favor digitar qualquer número seguido da tecla enter após a saída "Status: Estudante ainda cursando. Sua media semestral foi de 5". 
			System.out.print("Sua nota minima na prova final deve ser de: " + notaFinal);
		
		}
	}

}


