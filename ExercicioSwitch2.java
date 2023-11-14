package javaInicial;
import java.util.Scanner;

public class ExercicioSwitch2 {

	public static void main(String[] args) {
		int codigoProduto, qtdProduto;
		double valorProduto=0, valorTotal;
		String produto;
		Scanner receba = new Scanner(System.in);
		
		System.out.println("Informe o código do produto que deseja consumir: ");
		codigoProduto = receba.nextInt();
		System.out.println("Informe quantos pedidos desse produto você deseja fazer: ");
		qtdProduto = receba.nextInt();
		
		switch(codigoProduto) {
		case 1:
			produto = "Cachorro Quente";
			valorProduto = 10.00;
		break;
		case 2:
			produto = "X-Salada";
			valorProduto = 15.00;
		break;
		case 3:
			produto = "X-Bacon";
			valorProduto = 18.00;
		break;
		case 4:
			produto = "Bauru";
			valorProduto = 12.00;
		break;
		case 5:
			produto = "Refrigerante";
			valorProduto = 8.00;
		break;
		case 6:
			produto = "Suco de Laranja";
			valorProduto = 13.00;
		break;
		default: 
			System.out.println("Não temos essa opção em nosso cardápio! Escolha novamente.");
		
		
		}
		valorTotal = qtdProduto*valorProduto;
		 System.out.println("Obrigado por comprar com a gente! \nO valor total de sua compra é: R$"+valorTotal+". Volte sempre!");
	}
  
}