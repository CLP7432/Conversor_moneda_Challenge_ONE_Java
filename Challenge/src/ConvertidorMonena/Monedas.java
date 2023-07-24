package ConvertidorMonena;

public enum Monedas {

	Dolar("Dolar"),
	Euros("Euro"),
	LibrasEsterlinas("Libras Esterlinas"),
	YenJapones("Yen Japones"),
	WonSurCoreano("Won Coreano"),
	Peso("Peso");
	
	private final String valor;	//opcion actual del menu
	
	//constructor
	private Monedas(String valor) {
		this.valor = valor;
	}	//fin del constructor
	
	
}
