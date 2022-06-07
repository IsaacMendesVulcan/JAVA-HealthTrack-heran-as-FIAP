package herançaHT;

public class Teste {
	
	public static void main(String[] args) {
		
		ResumoDia resumo = new ResumoDia();
		resumo.setMeta(2400);
		resumo.setRealizado(2250);
		
		System.out.println("RESUMO - Meta de calorias do dia: " + resumo.getMeta());
		System.out.println("RESUMO - Calorias do dia: " + resumo.getRealizado());
		

		if (resumo.getRealizado() > resumo.getMeta()){
			System.out.println("RESUMO - Calorias que falta gastar: " + resumo.pendente(0) + "\n");
		}else {
			System.out.println("RESUMO - Calorias que falta consumir: " + resumo.pendente(0)+ "\n");
		}
		
		Nutrição nutri = new Nutrição();
			nutri.setMeta(2800);
			nutri.setCaloriasRefeicao1(600);
			nutri.setCaloriasRefeicao2(600);
			nutri.setCaloriasRefeicao3(600);
			nutri.setCaloriasRefeicao4(600);
		System.out.println("NUTRIÇÃO - Meta de calorias consumidas: " + nutri.getMeta());
		System.out.println("NUTRIÇÃO - Calorias consumidas: " + nutri.total(0));
		//System.out.println("NUTRIÇÃO - Caloriais que faltam consumir: " + (nutri.getMeta() - nutri.total(0)) + "\n");
		if (nutri.total(0) > nutri.getMeta()){
			System.out.println("NUTRIÇÃO - Calorias que falta gastar: " + (nutri.getMeta() - nutri.total(0)) + "\n");
		}else {
			System.out.println("NUTRIÇÃO - Calorias que falta consumir: " + (nutri.getMeta() - nutri.total(0)) + "\n");
		}
		
		
		Atividade at = new Atividade();
		at.setMeta(400);
		at.setFicarEmPe(50);
		at.setMovimento(50);
		at.setExercicio(50);
		
		System.out.println("ATIVIDADE - Meta de gasto calórico: " + at.getMeta());
		System.out.println("ATIVIDADE - Gasto Calórico: " + at.total(0));
		//System.out.println("ATIVIDADE - Gasto Calorico Pendente: " + (at.getMeta() - at.total(0)) + "\n");
		if (at.total(0) > at.getMeta()){
			System.out.println("NUTRIÇÃO - Calorias que gastou a mais: " + (at.getMeta() - at.total(0)) + "\n");
		}else {
			System.out.println("NUTRIÇÃO - Calorias que falta gastar: " + (at.getMeta() - at.total(0)) + "\n");
		}
		
		
		
		
		
		
		
		
			
		
		
		
	
	
		
}
}
