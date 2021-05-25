package entities;

public class PessoaFisica extends Pessoa{

	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double imposto() {
		if (super.getRendaAnual() < 20000) {
			return 0.15 * super.getRendaAnual() - (0.5 * gastosSaude);
		}
		return 0.25 * super.getRendaAnual() - (0.5 * gastosSaude);
	}
	
	
}
