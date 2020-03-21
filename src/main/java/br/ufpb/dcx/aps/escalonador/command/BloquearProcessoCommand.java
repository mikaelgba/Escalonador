package br.ufpb.dcx.aps.escalonador.command;

import br.ufpb.dcx.aps.escalonador.EscalonadorBase;

public class BloquearProcessoCommand implements Command {

    private EscalonadorBase escalonadorBase;
    private String nomeProcesso;

    public BloquearProcessoCommand(String nomeProcesso){  	
        this.nomeProcesso = nomeProcesso;
    }

    @Override
    public String executar() {
        getEscalonador().bloquearProcesso(nomeProcesso);
        return null;
    }
    @Override
    public EscalonadorBase getEscalonador() {
        return this.escalonadorBase;
    }
    @Override
    public void setEscalonador(EscalonadorBase escalonadorBase) {
        this.escalonadorBase = escalonadorBase;
    }
}
