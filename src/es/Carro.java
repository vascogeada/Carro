package es;
/**
 * A classe Carro contém métodos para verificar o combústivel, verificar o consumo, a capacidade do depósito, abastecer, andar, parar e obterAutonomia.
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
	 * Construtor com indicações de fábrica
	 */
	public Carro() {
		super();
	
		quantidadeCombustivel = 0;
		capacidadeDeposito = 40.0;
	}
	
	// Acessores 

	/**
	 * Vai buscar o valor do consumo do veículo
	 * 
	 * @return consumo do veículo
	 */
	public static double getConsumo() {
		return consumo;
	}

	/**
	 * Vai buscar a quantidade do combustível do veículo
	 * 
	 * @return quantidade do combustível do veículo
	 */
	public double getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	/**
	 * Vai buscar a capacidade do depósito do veículo
	 * 
	 * @return capacidade do depósito do veículo
	 */
	public double getCapacidadeDeposito() {
		return capacidadeDeposito;
	}
	
	// Métodos 
	
	/**
	 * Mete a quantidade de combustível pretendida no carro, medido em litros.
	 * 
	 * @param quantidade valor do abastecimento medido em litros
	 */
	public double  meterCombustivel( double quantidade) { 		
		
		// Devia testar se Transborda o depósito
		// Podia retornar os Litros Metidos 
		return quantidadeCombustivel = quantidadeCombustivel + quantidade;
		
		
	}
	
	/**
	 * Mete combustível no carro sem saber a quantidade que se pretende colocar até encher, medido em litros.
	 * 
	 * @return retorna a quantidade de combustível que falta para encher o depósito
	 */
	// atestar o depósito
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
	 * @param distancia distância em km que o carro vai andar
	 * 
	 * @return retorna true e o carro pode andar
	 * @return retorna false e o carro não pode andar ou anda até ficar sem combustível
	 */
	public boolean andar( double distancia ) {
		
		// Verificar se tem combustivel para a distancia que se pretende andar 
		if( distancia < obterAutonomia() ) {
			
			quantidadeCombustivel -= getConsumo() * (distancia / 100); 
			return true;
		}
		else {
			
			// Aqui ou simplesmente não percorre qualquer distancia 
			// ou anda até parar porque fica sem combustível 
			return false;
		}
			
			
	}
	
	/**
	 * Pára o andamento do carro.
	 * 
	 * @return retorna true e o carro pára
	 */
	public boolean parar() {
		
		// se estiver a andar pára 
		// falta a flag que indica se o carro está em andamento
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
