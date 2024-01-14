package variaveis;

public class PontoFlutuante {
	public static void main(String[] args) {
		double hora = 3.2;
		
		double conta = 3.4 / 2;
		
		double conta2 = 3/2; 
		//aqui retorna 1.0 porque o java entende que dentro de operações tem dois numeros inteiros.. logo ele calcula normalmente como inteiro e por fim retorna como double;
		
		double conta3 = 3.0 / 2; 
		//aqui retorna o 1.5 corretamente; 
		System.out.println("agora são: " + hora + " horas");
	}
	
	
}
