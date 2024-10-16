
public class ImpostoDeRenda {
	public RendaAnual rendaAnual;
	
	public ImpostoDeRenda (RendaAnual rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public double impostoSalario( ) {
		double salarioMensal = rendaAnual.getSalario() / 12;
		if (salarioMensal < 3000) {
			return 0;
		} else if (salarioMensal < 5000) {
			return rendaAnual.getSalario() * 0.10;
		} else {
			return rendaAnual.getSalario() * 0.20;
		}		
	
	}
	
	public double impostoServico() {
		return rendaAnual.getPrestacaoServico() * 0.15;
	}
	
	public double impostoGanhoCapital() {
		return rendaAnual.getGanhoCapital() * 0.20;
	}
	
	public double impostoBrutoTotal() {
		return impostoSalario() + impostoServico() + impostoGanhoCapital();
	}
	
	public double calculoMaximoDedutivel() {
		return impostoBrutoTotal() * 0.30;
	}
	
	public double calculoGastosDedutiveis() {
		return rendaAnual.getGastosMedicos() + rendaAnual.getGastosEducacionais();
	}
	
	public double abatimentoImposto() {
        double maximoDedutivel = calculoMaximoDedutivel();
        double gastosDedutiveis = calculoGastosDedutiveis();
        return Math.min(gastosDedutiveis, maximoDedutivel);
    }	
	
	public double impostoDevido() {
		return impostoBrutoTotal() - abatimentoImposto();
	}
}




