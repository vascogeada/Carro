package es;
/**
 * A classe Carro cont�m m�todos para verificar o comb�stivel, verificar o consumo, a capacidade do dep�sito, abastecer, andar, parar e obterAutonomia.
 * 
 * 
 * <ul>
 * <li>getConsumo</li>
 * <li>getQuantidadeCombustivel</li>
 * <li>getCapacidadeDeposito</li>
 * <li>meterCombustivel</li>
 * <li>meterCombustivel</li>
 * <li>andar</li>
 * <li>parar</li>
 * <li>obterAutonomia</li>
 * </ul>
 * 
 * @author Vasco Geada
 *
 */

public class Carro {
	
	static private final double consumo=5.5; // litros por 100 klm
	
	private double quantidadeCombustivel;
	private double capacidadeDeposito;
	
	// Construtor por defeito 
	/**
	 * Construtor com indica��es de f�brica
	 */
	public Carro() {
		super();
	
		quantidadeCombustivel = 0;
		capacidadeDeposito = 40.0;
	}
	
	// Acessores 

	/**
	 * Vai buscar o valor do consumo do ve�culo
	 * 
	 * @return consumo do ve�culo
	 */
	public static double getConsumo() {
		return consumo;
	}

	/**
	 * Vai buscar a quantidade do combust�vel do ve�culo
	 * 
	 * @return quantidade do combust�vel do ve�culo
	 */
	public double getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	/**
	 * Vai buscar a capacidade do dep�sito do ve�culo
	 * 
	 * @return capacidade do dep�sito do ve�culo
	 */
	public double getCapacidadeDeposito() {
		return capacidadeDeposito;
	}
	
	// M�todos 
	
	/**
	 * Mete a quantidade de combust�vel pretendida no carro, medido em litros.
	 * 
	 * @param quantidade valor do abastecimento medido em litros
	 */
	public double  meterCombustivel( double quantidade) { 		
		
		// Devia testar se Transborda o dep�sito
		// Podia retornar os Litros Metidos 
		return quantidadeCombustivel = quantidadeCombustivel + quantidade;
		
		
	}
	
	/**
	 * Mete combust�vel no carro sem saber a quantidade que se pretende colocar at� encher, medido em litros.
	 * 
	 * @return retorna a quantidade de combust�vel que falta para encher o dep�sito
	 */
	// atestar o dep�sito
	public double meterCombustivel() {
		
		double litrosMeter = capacidadeDeposito - quantidadeCombustivel;
		
		// ou quantidadeCombustivel = capacidadeDeposito;
		meterCombustivel(litrosMeter);
		
		return litrosMeter;
	}
	
	
	// distancia em klm
	/**
	 * Simula o andamento do carro.
	 * 
	 * @param distancia dist�ncia em km que o carro vai andar
	 * 
	 * @return retorna true e o carro pode andar
	 * @return retorna false e o carro n�o pode andar ou anda at� ficar sem combust�vel
	 */
	public boolean andar( double distancia ) {
		
		// Verificar se tem combustivel para a distancia que se pretende andar 
		if( distancia < obterAutonomia() ) {
			
			quantidadeCombustivel -= getConsumo() * (distancia / 100); 
			return true;
		}
		else {
			
			// Aqui ou simplesmente n�o percorre qualquer distancia 
			// ou anda at� parar porque fica sem combust�vel 
			return false;
		}
			
			
	}
	
	/**
	 * P�ra o andamento do carro.
	 * 
	 * @return retorna true e o carro p�ra
	 */
	public boolean parar() {
		
		// se estiver a andar p�ra 
		// falta a flag que indica se o carro est� em andamento
		return true;
	}
	
	// kmCombustivel( )    
	/**
	 * Obter a autonomia do carro, em km.
	 * 
	 * @return retorna a autonomia, medido em km
	 */
	public double obterAutonomia() {
		
		return ( quantidadeCombustivel / getConsumo() ) * 100;
		
	}

}
