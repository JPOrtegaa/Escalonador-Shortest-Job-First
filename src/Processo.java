
public class Processo extends Thread{
	private int id;
	private int arrivalTime;
	private int burstTime;
	private int finishTime;
	private int turnAround;
	private int tempoAtual;
	
	Processo(int id, int arrivalTime, int burstTime){
		this.id = id;
		this.arrivalTime = arrivalTime;
		this.burstTime = burstTime;
		this.finishTime = 0;
		this.turnAround = 0;
		this.tempoAtual = 0;
	}
	
	public void run() {
		this.tempoAtual += burstTime;
		this.finishTime = tempoAtual;
		this.turnAround = finishTime - arrivalTime;
	}
	
	public int getIdProcesso() {
		return this.id;
	}
	
	public int getBurstTime() {
		return this.burstTime;
	}
	
	public int getArrivalTime() {
		return this.arrivalTime;
	}
	
	public int getFinishTime() {
		return this.finishTime;
	}
	
	public int getTurnAround() {
		return this.turnAround;
	}
	
	public void setTurnAround(int turnAround) {
		this.turnAround = turnAround;
	}
	
	public void setFinishTime(int finishTime) {
		this.finishTime = finishTime;
	}
	
	public void setTempoAtual(int tempoAtual) {
		this.tempoAtual = tempoAtual;
	}

}
