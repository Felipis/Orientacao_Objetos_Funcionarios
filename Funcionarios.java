package projeto03;

public class Funcionarios {

	String Nome;
	double SalarioBruto;
	double Imposto;
	double Aumento;
	
	
double SalarioLiquido() {	
	return SalarioBruto - Imposto;
}

double AumentoSalarial() {	
	return SalarioBruto + Aumento;
	}
}
