import java.util.Scanner;
import java.util.Arrays;
public class processo_Seletivo {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
		
		double[] semana1 = new double[7];
		double[] semana2 = new double[7];
		double[] semana3 = new double[7];
		double[] semana4 = new double[7];
		
		double ms1=  0;
		double ms2 = 0;
		double ms3 = 0;
	    double ms4 = 0;
		
		for(int i1=0;i1<=semana1.length -1 ;i1++) {
			System.out.println("digite o valor da cota��o no dia:");
			semana1[i1] = sc.nextDouble();
		} for(int n1=0;n1<=semana1.length -1;n1++) {
	        	ms1= ms1 + semana1[n1];
	    } ms1 = ms1/7;
		for(int k1=0;k1<=semana1.length -1;k1++) {
	    	System.out.println("o valor do dia "+ (k1+1) +" da semana 1 s�o: "+semana1[k1]);
	    }
	
	    
	    
	    for(int i2=0;i2<=semana2.length-1;i2++) {
			System.out.println("digite o valor da cota��o no dia:");
			semana2[i2] = sc.nextDouble();
		} for(int n2=0;n2<=semana2.length-1;n2++) {
	        	ms2= ms2 + semana2[n2];
	    } ms2 = ms2/7;
		for(int k2=0;k2<=semana1.length-1;k2++) {
	    	System.out.println("o valor do dia "+ (k2+1) +" da semana 2 s�o: "+semana2[k2]);
	    } 
	    
	    
	    
	    for(int i3=0;i3<=semana3.length-1;i3++) {
			System.out.println("digite o valor da cota��o no dia:");
			semana3[i3] = sc.nextDouble();
		} for(int n1=0;n1<=semana1.length-1;n1++) {
	        	ms3= ms3 + semana3[n1];
	    } ms3 = ms3/7;
		for(int k1=0;k1<=semana1.length-1;k1++) {
	    	System.out.println("o valor do dia "+ (k1+1) +" da semana 3 s�o: "+semana3[k1]);
	    } 
	    
	    
	    
	    for(int i1=0;i1<=semana1.length-1;i1++) {
			System.out.println("digite o valor da cota��o no dia:");
			semana4[i1] = sc.nextDouble();
		} for(int n1=0;n1<=semana1.length-1;n1++) {
	        	ms4= ms4 + semana4[n1];
	    } ms4 = ms4/7;
		for(int k1=0;k1<=semana1.length-1;k1++) {
	    	System.out.println("o valor do dia "+ (k1+1) +" da semana 4 s�o: "+semana4[k1]);
		} 
	    
		
		double [] mediasSem = new double[4];
		mediasSem[0] = ms1;
		mediasSem[1] = ms2;
		mediasSem[2] = ms3;
		mediasSem[3] = ms4;
		
		for(int u=0;u<=mediasSem.length-1;u++) {
			System.out.printf("o valor da m�dia semanal da semana "+(u+1)+" �: = %.2f %n",(mediasSem[u]));
		}
		
		Arrays.sort(mediasSem);	
		
		double mm = (ms1+ms2+ms3+ms4)/4;
		
		System.out.printf("a maior m�dia semanal �: = %.2f %n",(mediasSem[3]));
		System.out.printf("a menor m�dia semanal �: =%.2f %n",(mediasSem[0]));
		System.out.printf("e a m�dia mensal �: =%.2f %n ",(mm));
	
	    
sc.close();
	}

}
