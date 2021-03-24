package projeto03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
		Funcionarios FuncPedro = new Funcionarios();
		
		//Funcionario Pedro
		FuncPedro.Nome = "Pedro";
		FuncPedro.SalarioBruto = 2500.00;
		FuncPedro.Imposto = 142.80;
		FuncPedro.SalarioLiquido();
		System.out.println("Funcinario "+FuncPedro.Nome+ ", quanto será o aumento salarial?");
		FuncPedro.Aumento = ler.nextDouble();
		FuncPedro.AumentoSalarial();
		
		//Funcionario Vagner
		Funcionarios FuncVagner = new Funcionarios();
		FuncVagner.Nome = "Vagner";
		FuncVagner.SalarioBruto = 4300.00;
		FuncVagner.Imposto = 636.13;
		FuncVagner.SalarioLiquido();
		System.out.println("Funcionario "+FuncVagner.Nome+", quanto será o aumento salarial?");
		FuncVagner.Aumento = ler.nextDouble();
		FuncVagner.AumentoSalarial();
		
		
		//Encaminhar tela para os usuários
		System.out.println("Funcionario "+FuncPedro.Nome+ " seu salário Líquido é R$" +FuncPedro.SalarioLiquido());
		System.out.println("Seu Aumento Salarial é de R$"+FuncPedro.Aumento+" então seu salário bruto fica R$" +FuncPedro.AumentoSalarial());
		System.out.println();
		System.out.println("Funcionario "+FuncVagner.Nome+ " seu salário Líquido é R$" +FuncVagner.SalarioLiquido());
		System.out.println("E seu Aumento Salarial é de R$"+FuncVagner.Aumento+" então seu salário bruto fica R$" +FuncVagner.AumentoSalarial());

		
		ler.close();
		
	}

}
