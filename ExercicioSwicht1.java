package javaInicial;

import java.util.Scanner;

public class ExercicioSwicht1 {

	public static void main(String[] args) {
	int codigo;
	String cargo, nomeFuncionario;
	double novoSalario, ajuste, salario;
	
	Scanner receba = new Scanner(System.in);
	
	System.out.println("Informe o nome do funcionário: ");
	nomeFuncionario = receba.next();
	System.out.println("Informe o seu sálario: ");
	salario = receba.nextDouble();
	System.out.println("Informe o código do cargo: ");
	codigo = receba.nextInt();
	
	
	   switch(codigo) {
	     case 1:
		    cargo = "Gerente";
		    ajuste = 0.10;
		  break;
	     case 2:
		    cargo = "Vendedor";
		    ajuste = 0.07;
		  break;
	     case 3:
		    cargo = "Supervisor";
		    ajuste = 0.09;
		  break;
	    case 4:
		    cargo = "Motorista";
		    ajuste = 0.06;
		  break;
	     case 5:
		     cargo = "Estoquista";
		     ajuste = 0.05;
		   break;
	     case 6:
		     cargo = "Técnico de TI";
		     ajuste = 0.08;
		  break;
	    default: 
		     cargo = "Invalido";
		     ajuste = 0;
		System.out.println("Opção de cargo inválida!");
	}
	novoSalario = salario + (salario*ajuste);
	if (cargo!="Invalido")	{	
System.out.println("Funcionário: "+nomeFuncionario+"\nCargo do funcionário: "+cargo+"\nSalário após ajuste: R$ "+novoSalario);
	
	}else{
		System.out.println(" ");
		
	
	}

}
}