package br.ufpb.dcx.aps.escalonador.command;

import br.ufpb.dcx.aps.escalonador.EscalonadorBase;

public class FinalizarProcessoCommand implements Command {

    private EscalonadorBase escalonadorBase;
    private String nomeProcesso;

    public FinalizarProcessoCommand(String nomeProcesso){
        this.nomeProcesso = nomeProcesso;
    }

    @Override
    public String executar() {
        getEscalonador().finalizarProcesso(nomeProcesso);
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
