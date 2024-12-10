package academia;


public class App {


	public static void main(String[] args) {
		Anilha anilha = new Anilha();
		
		anilha.setPeso(10);
		anilha.setMaterial("Ferro");
		anilha.setTipoFuracao("Olimpica");
		
		anilha.exibirInformacoes();
		anilha.levantar();
		anilha.trocarMaterial("Borracha");
		anilha.exibirInformacoes();
		
	}


}

