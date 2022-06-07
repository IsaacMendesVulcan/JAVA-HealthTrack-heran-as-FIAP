package herançaHT;

public class Nutrição extends ResumoDia {
	

	private double caloriasRefeicao1;
	private double caloriasRefeicao2;
	private double caloriasRefeicao3;
	private double caloriasRefeicao4 ;
	private double total = caloriasRefeicao1 + caloriasRefeicao2 + caloriasRefeicao3 + caloriasRefeicao4;
	
	public Nutrição() {
	}
	
	public Nutrição( double caloriasRefeicao1,double caloriasRefeicao2,double caloriasRefeicao3,double caloriasRefeicao4, double total) {

		this.caloriasRefeicao1 = caloriasRefeicao1;
		this.caloriasRefeicao2 = caloriasRefeicao2;
		this.caloriasRefeicao3 = caloriasRefeicao3;
		this.caloriasRefeicao4 = caloriasRefeicao4;
		this.setTotal(total);

		
		
	}
	public double total (double total) {
		total = caloriasRefeicao1 + caloriasRefeicao2 + caloriasRefeicao3 + caloriasRefeicao4;
		return total;
		
	}
	

	

	public double getCaloriasRefeicao1() {
		return caloriasRefeicao1;
	}

	public void setCaloriasRefeicao1(double caloriasRefeicao1) {
		this.caloriasRefeicao1 = caloriasRefeicao1;
	}

	public double getCaloriasRefeicao2() {
		return caloriasRefeicao2;
	}

	public void setCaloriasRefeicao2(double caloriasRefeicao2) {
		this.caloriasRefeicao2 = caloriasRefeicao2;
	}

	public double getCaloriasRefeicao3() {
		return caloriasRefeicao3;
	}

	public void setCaloriasRefeicao3(double caloriasRefeicao3) {
		this.caloriasRefeicao3 = caloriasRefeicao3;
	}

	public double getCaloriasRefeicao4() {
		return caloriasRefeicao4;
	}

	public void setCaloriasRefeicao4(double caloriasRefeicao4) {
		this.caloriasRefeicao4 = caloriasRefeicao4;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}





	}
