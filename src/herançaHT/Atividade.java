package herançaHT;

public class Atividade extends ResumoDia {
	
	private double ficarEmPe;
	private double movimento;
	private double exercicio;
	
	public Atividade() {
	}
	
	public Atividade(double ficarEmPe, double movimento, double exercicio ) {
		this.ficarEmPe = ficarEmPe;
		this.movimento = movimento;
		this.exercicio = exercicio;
		
	}
	@Override
	public double total (double total) {
		total = ficarEmPe + movimento + exercicio;
		return super.total(total);
		
	}

	
	
	
	
	
	
	public double getFicarEmPe() {
		return ficarEmPe;
	}

	public void setFicarEmPe(double ficarEmPe) {
		this.ficarEmPe = ficarEmPe;
	}

	public double getMovimento() {
		return movimento;
	}

	public void setMovimento(double movimento) {
		this.movimento = movimento;
	}

	public double getExercicio() {
		return exercicio;
	}

	public void setExercicio(double exercicio) {
		this.exercicio = exercicio;
	}
	
	
	
	
	
	
	
}
