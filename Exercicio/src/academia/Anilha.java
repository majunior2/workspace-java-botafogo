package academia;


public class Anilha {
	// atributos
	
	private double peso;
	private String material;
	private String tipoFuracao;
	
	//getters e setters
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getTipoFuracao() {
		return tipoFuracao;
	}
	public void setTipoFuracao(String tipoFuracao) {
		this.tipoFuracao = tipoFuracao;
	}
	


	// métodos
	
    public void levantar() {
    	System.out.println("Levantando a anilha de " + peso + "kg.");
    }

    public void trocarMaterial(String novoMaterial){
    	this.material = novoMaterial;
    	System.out.println("Material da anilha trocado para: " + novoMaterial);
    	}

    public void exibirInformacoes() {
    	System.out.printf("Peso: %.2f kg\nMaterial: %s\nTipo de Furação: %s\n", peso, material, tipoFuracao);
    }
}