package gft_exercicio1;

public class GFT_Exercicio1 {

    public static void main(String[] args) {
        Veiculo veic = new Veiculo();
        veic.setMarca("Chevrolet");
        veic.setModelo("Opala");
        veic.setPlaca("CVQ-0300");
        veic.setCor("Preto");
        veic.setKm(15000);
        veic.setLitrosCombustivel(20);
        veic.setVelocidade(200);
        veic.setPreco(500000.00);
        veic.setLigado(true);
        
        System.out.println("-------------------------D E T A L H E S-------------------------");
        System.out.println("A marca do carro é: " + veic.getMarca());
        System.out.println("O modelo do carro é: " + veic.getModelo());
        System.out.println("A placa do carro é: " + veic.getPlaca());
        System.out.println("A cor do carro é: " + veic.getCor());
        System.out.println("A km do carro é: " + veic.getKm());
        System.out.println("O tanque está com " + veic.getLitrosCombustivel() + "L");
        System.out.println("A velocidade do carro está em: " + veic.getVelocidade() + "Km");
        System.out.println("O valor do carro é: " + veic.getPreco());
        System.out.println("O carro está ligado ou não ?" + veic.isLigado()+ "\n");
        
        System.out.println("-------------------S T A T U S------------------");
        veic.acelerar();
        System.out.println("A velocidade atual é: " + veic.getVelocidade());
        veic.frear();
        System.out.println("A velocidade atual é: " + veic.getVelocidade());
        veic.abastecer(20);
        System.out.println("O tanque está com " + veic.getLitrosCombustivel() + "L");
        veic.ligar();
        veic.desligar();
        veic.pintar("vermelho");
        System.out.println("Após a pintura, o carro está " + veic.getCor());
        

}
}