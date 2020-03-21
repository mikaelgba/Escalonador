package br.ufpb.dcx.aps.escalonador;

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
}
