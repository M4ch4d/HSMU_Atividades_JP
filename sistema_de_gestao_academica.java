import java.util.Scanner;

public class sistema_de_gestao_academica {

	public static void main(String[] args) {
		System.out.println("Sistema de Avaliação");
		Scanner sn =  new Scanner(System.in);
		double prova1, projeto1, lista1, media1;  
		System.out.println("Digite sua nota da prova do 1° Bimestre: ");
			prova1 = sn.nextDouble();
	System.out.println("Digite sua nota do projeto do 1° bimestre: ");
			projeto1 = sn.nextDouble();
	System.out.println("Digite sua nota da lista do 1° bimestre: ");
			lista1 = sn.nextDouble();
		
			media1 = ((prova1 * 5) + (projeto1 * 3) + (lista1 * 2))/10;	
	System.out.println("Sua nota do 1° bimestre foi: " + media1);
	double prova2, projeto2, lista2, media2;  
	System.out.println("Digite sua nota da prova do 2° Bimestre: ");
		prova2 = sn.nextDouble();
System.out.println("Digite sua nota do projeto do 2° bimestre: ");
		projeto2 = sn.nextDouble();
System.out.println("Digite sua nota da lista do 2° bimestre: ");
		lista2 = sn.nextDouble();
	
		media2 = ((prova2 * 5) + (projeto2 * 3) + (lista2 * 2))/10;	
System.out.println("Sua nota do 2° bimestre foi: " + media2);
double prova3, projeto3, lista3, media3;  
System.out.println("Digite sua nota da prova do 3° Bimestre: ");
	prova3 = sn.nextDouble();
System.out.println("Digite sua nota do projeto do 3° bimestre: ");
	projeto3 = sn.nextDouble();
System.out.println("Digite sua nota da lista do 3° bimestre: ");
	lista3 = sn.nextDouble();

	media3 = ((prova3 * 5) + (projeto3 * 3) + (lista3 * 2))/10;	
System.out.println("Sua nota do 3° bimestre foi: " + media3);
 double semestral = (media1 + media2 + media3)/10;

	if (semestral >= 8 && semestral <= 10); 
	{
		System.out.println("Aluno Aprovado");
	}else if{ (semestral  <= 7.9 && semestral >= 4.9)
		System.out.println("Aluno deve realizar a Avaliação Final(AF)");
		
}
	else{
		System.out.println("Aluno reprovado");
	    }
	
	}
	
}
		
		

	
