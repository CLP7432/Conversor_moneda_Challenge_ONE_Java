package ConvertidorMonena;

public class Convertidor {
	
	private String origen;
	private String destino;
	private double cantidad;
	
	public Convertidor(String origen, String destino, double cantidad) {
		this.origen = origen;
		this.destino = destino;
		this.cantidad = cantidad;
	}

	public  String convertirMonedas() {
		double moneda =cantidad;
		double resultado;
		if(origen.equals("Dolar")) 	{		
			switch(destino) {
				case "Euros":
					resultado = moneda * 0.92;
					return  String.format("%.3f", resultado)  + " Euros";
				case "LibrasEsterlinas": 
					resultado = moneda * 0.79;
					return  String.format("%.3f", resultado) + " Libra Esterlina";
				case "YenJapones": 
					resultado = moneda * 144.34;
					return String.format("%.3f", resultado) + " Yen Japones";
				case "WonSurCoreano": 
					resultado =moneda * 1316.30;
					return String.format("%.3f", resultado) + " Won Sur Coreano";
				case "Peso": 
					resultado = moneda * 17.12;
					return String.format("%.3f", resultado) + " Peso";
			}   
		} if(origen.equals("Euros")) {
			switch(destino) {
				case "Dolar": 
					resultado = moneda * 1.09;
					return  String.format("%.3f", resultado) + " Dolar";
				case "LibrasEsterlinas" : 
					resultado = moneda * 0.86;
					return String.format("%.3f", resultado) + " Libras Esterlinas";
				case "YenJapones" : 
					resultado = moneda * 157.62;
					return String.format("%.3f", resultado) + " Yen Japones";
				case "WonSurCoreano" : 
					resultado = moneda * 1436.35;
					return  String.format("%.3f", resultado) + " Won SurCoreano";
				case "Peso" : 
					resultado = moneda * 18.55;
					return  String.format("%.3f", resultado) + " Peso";
			}
		} if(origen.equals("LibrasEsterlinas")) {
			switch(destino) {
				case "Dolar" :
					resultado = moneda * 1.27;
					return String.format("%.3f", resultado) + " Dolar";
				case "Euros": 
					resultado = moneda * 1.16;
					return String.format("%.3f", resultado) +  " Euros";
				case "YenJapones" :
					resultado = moneda * 183.40;
					return String.format("%.3f", resultado) + " Yen Japones";
				case "WonSurCoreano" :
					resultado = moneda * 1672.56;
					return String.format("%.3f", resultado) + " Won Sur Coreano";
				case "Peso" : 
					resultado = moneda * 21.76;
					return String.format("%.3f", resultado) + " Peso";
			}
		} if(origen.equals("YenJapones")) {
			switch(destino) {
				case "Dolar" : 
					resultado = moneda * 0.0069;
					return String.format("%.3f", resultado) + " Dolar";
				case "Euros" : 
					resultado = moneda * 0.0063;
					return String.format("%.3f", resultado) + " Eruros";
				case "LibrasEsterlinas" : 
					resultado = moneda * 0.0055;
					return String.format("%.3f", resultado) + " Libras Esterlinas";
				case "WonSurCoreano" :
					resultado =  moneda * 9.12;
					return String.format("%.3f", resultado) + "Won Sur Coreano";
				case "Peso" : 
					resultado = moneda * 0.12;
					return String.format("%.3f", resultado) + " Peso";
			}
		} if(origen.equals("WonSurCoreano")) {
			switch(destino) {
				case "Dolar" : 
					resultado = moneda * 0.00076;
					return String.format("%.3f", resultado) + " Dolar";
				case "Euros": 
					resultado = moneda * 0.00070;
					return String.format("%.3f", resultado) + " Euros";
				case "LibrasEsterlinas" :
					resultado = moneda * 0.00060;
					return String.format("%.3f", resultado) + "Libras Esterlinas";
				case "YenJapones" : 
					resultado = moneda * 0.11;
					return String.format("%.3f", resultado) + " Yen Japones";
				case "Peso" : 
					resultado =  moneda * 0.013;
					return String.format("%.3f", resultado) + " Peso";
			}
		} if(origen.equals("Peso")) {
			switch(destino) {
			case "Dolar" : 
				resultado = moneda * 0.058;
				return  String.format("%.3f", resultado) + " Dolar";
			case "Euros" : 
				resultado = moneda * 0.053;
				return String.format("%.3f", resultado) + " Euros";
			case "LibrasEsterlinas" : 
				resultado = moneda * 0.046;
				return  String.format("%.3f", resultado) + " Libras esterlinas";
			case "YenJapones" : 
				resultado = moneda * 8.43;
				return String.format("%.3f", resultado) + "Yen Japones";
			case "WonSurCoreano" : 
				resultado = moneda * 76.86;
				return String.format("%.3f", resultado) + "Won Sur Coreano";	
			}
		}
		return "";		
	}	
}
