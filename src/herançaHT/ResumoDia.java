package herançaHT;

public class ResumoDia {
	
	private double meta;
	private double realizado;
	private double pendente;

	public ResumoDia () {
	}
	
	public ResumoDia(double metaCaloria, double realizado, double pendente, double meta) {
		this.realizado = realizado;
		this.pendente = pendente;
		this.meta = meta;
	}
	
	
	
	public void setMeta (double meta) {
		this.meta = meta;
	}
	
	public double getMeta () {
		return meta;
	}
	
	public double pendente (double pendente) {
		pendente = meta - realizado;
		return this.pendente = pendente;
	}

	
	
	
	
	
	
	public double getRealizado() {
		return realizado;
	}

	public void setRealizado(double realizado) {
		this.realizado = realizado;
	}

	public double getPendente() {
		return pendente;
	}

	public void setPendente(double pendente) {
		this.pendente = pendente;
	}

	public double total(double total) {
		return total;
	}
	

	
	
	

	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	




	

	
	
}
