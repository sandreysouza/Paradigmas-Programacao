
public class RendaAnual {
	double salario;
	double prestacaoServico;
	double ganhoCapital;
	double gastosMedicos;
	double gastosEducacionais;
	
	
	public RendaAnual(double salario, double prestacaoServico, double ganhoCapital, double gastosMedicos, double gastosEducacionais) {
		this.salario = salario;
		this.prestacaoServico = prestacaoServico;
		this.ganhoCapital = ganhoCapital;
		this.gastosMedicos = gastosMedicos;
		this.gastosEducacionais = gastosEducacionais;
	    }
	
	public double getSalario() {
        return salario;
    }

    public double getPrestacaoServico() {
        return prestacaoServico;
    }

    public double getGanhoCapital() {
        return ganhoCapital;
    }

    public double getGastosMedicos() {
        return gastosMedicos;
    }

    public double getGastosEducacionais() {
        return gastosEducacionais;
    }
}	
		
	

