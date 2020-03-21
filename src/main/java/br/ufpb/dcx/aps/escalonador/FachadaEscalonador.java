package br.ufpb.dcx.aps.escalonador;

import br.ufpb.dcx.aps.escalonador.command.Command;

public class FachadaEscalonador {
	
	private EscalonadorBase escalonadorBase;
	private CriadorTipo criadorTipo;
	
	public String execute(Command command){
		
		command.setEscalonador(this.escalonadorBase);
		return command.executar();
	}

	public FachadaEscalonador(TipoEscalonador tipoEscalonador) {
		
		if(tipoEscalonador == null) throw new EscalonadorException();
			
		criadorTipo = gerarTipo(tipoEscalonador);
		escalonadorBase = criadorTipo.criarEscalonador();
	}
	public FachadaEscalonador(TipoEscalonador tipoEscalonador, int quantum) {
		
		if(tipoEscalonador == null  && quantum <= 0) throw new EscalonadorException();
		
		criadorTipo = gerarTipo(tipoEscalonador);
		escalonadorBase = criadorTipo.criarEscalonador(quantum);
	}

	private CriadorTipo gerarTipo(TipoEscalonador tipoEscalonador){
		
		if (tipoEscalonador == TipoEscalonador.Fifo) {
			return new FifoBase();
			
		}else if (tipoEscalonador == TipoEscalonador.MaisCurtoPrimeiro ) {
			return new MaisCurtoPrimeiroBase();
			
		}else if( tipoEscalonador == TipoEscalonador.Prioridade){
			return new PrioridadeBase();
			
		}else if(tipoEscalonador == TipoEscalonador.RoundRobin){
			return new RoundRobinBase();
			
		}else{
			return null;
		}
	}
}
