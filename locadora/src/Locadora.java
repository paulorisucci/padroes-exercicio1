//********** import para executar o código conforme modificações da lista01.2.1-GRASP-refactoring
import locadora.Cliente;
import locadora.Aluguel;
import locadora.DVD;
//********** import para executar o código conforme modificações da lista01.2.2-GRASP-refactoring
//import refactoring1.Cliente;
//************************************************************************************************
//********** import para executar o código conforme modificações da lista01.2.3-GRASP-refactoring
//import refactoring2.Cliente;
//import refactoring2.Aluguel;
//************************************************************************************************


public class Locadora {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Alex Sandro");		 

		c1.adicionaAluguel(new Aluguel(new DVD("O Atirador", DVD.Tipo.NORMAL), 10));
		c1.adicionaAluguel(new Aluguel(new DVD("Luca", DVD.Tipo.INFANTIL), 2));
		c1.adicionaAluguel(new Aluguel(new DVD("O Gato de Botas 2", DVD.Tipo.LANCAMENTO), 30));
		c1.adicionaAluguel(new Aluguel(new DVD("Arremessando Alto", DVD.Tipo.LANCAMENTO), 4));
		c1.adicionaAluguel(new Aluguel(new DVD("Moana", DVD.Tipo.INFANTIL), 10));
		c1.adicionaAluguel(new Aluguel(new DVD("Uma Noite no Museu", DVD.Tipo.NORMAL), 3));

		System.out.println(c1.extrato());
	}
}
