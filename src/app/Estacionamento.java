package app;

import model.Carro;

public class Estacionamento{

	public static void main(String[] args) {
	
		Carro carro01 = new Carro();
		Carro carro02 = new Carro();
		Carro carro03 = new Carro();
		Carro carro04 = new Carro();
		Carro carro05 = new Carro();
		Carro carro06 = new Carro();
		Carro carro07 = new Carro();
		
		carro01.setNome("Corsa");
		carro01.setCor("Prata");
		carro01.setPlaca("LOL-5502");
		carro01.setVelocidadeMaxima(150);
		
		carro02.setNome("Camaro");
		carro02.setCor("Amarelo");
		carro02.setPlaca("FUL-9941");
		carro02.setVelocidadeMaxima(250);
		
		carro03.setNome("Chevet");
		carro03.setCor("Azul");
		carro03.setPlaca("Gof-3303");
		carro03.setVelocidadeMaxima(150);
		
		carro04.setNome("Gol");
		carro04.setCor("Azul Marinho");
		carro04.setPlaca("PDL-1278");
		carro04.setVelocidadeMaxima(180);
		
		carro05.setNome("UNO");
		carro05.setCor("Branco");
		carro05.setPlaca("CRU-4875");
		carro05.setVelocidadeMaxima(300);
		
		carro06.setNome("Civic");
		carro06.setCor("Rosa");
		carro06.setPlaca("HJK-9308");
		carro06.setVelocidadeMaxima(240);
		
		carro07.setNome("CrossFox");
		carro07.setCor("Amarelo");
		carro07.setPlaca("GGT-6664");
		carro07.setVelocidadeMaxima(210);
		
		imprimirFicha(carro01);
		imprimirFicha(carro02);
		imprimirFicha(carro03);
		imprimirFicha(carro04);
		imprimirFicha(carro05);
		imprimirFicha(carro06);
		imprimirFicha(carro07);
		
	}

	public static void imprimirFicha(Carro carro){
		
		System.out.println("Carro: "+carro.getNome());
		System.out.println("Cor: " +carro.getCor());
		System.out.println("Placa: " +carro.getPlaca());
		System.out.println("Velocidade Máxia: " +carro.getVelocidadeMaxima() +"Km/h \n");
		
	}
	
}
