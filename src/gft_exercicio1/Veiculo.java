package gft_exercicio1;

public class Veiculo {
        private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float Km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;
	
        public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getKm() {
		return Km;
	}
	public void setKm(float km) {
		Km = km;
	}
	public boolean isLigado() {
		return isLigado;
	}
	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}
	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}
	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void acelerar () {
	      this.velocidade = velocidade + 20;
	      
	}
     public void abastecer (int combustivel) {
	     this.litrosCombustivel += combustivel;
	     if (litrosCombustivel > 60) {
	     this.litrosCombustivel = 60;
	     }
        	}
	     
    
	public void frear () {
	   this.velocidade = velocidade - 20;
		}

	
	public void pintar (String cor) {
            this.cor = cor;
	}
	public void ligar() {
	  this.isLigado();
	  if (isLigado = true) {
	System.out.println("O veículo está ligado");
	  }
	} 
	public void desligar () {
	if (velocidade > 0) {
		System.out.println ("O veículo não pode ser desligado em movimento");
	} else if (velocidade == 0) {
	    isLigado = false;
	    System.out.println("Veículo foi desligado");
	}
} 
}
