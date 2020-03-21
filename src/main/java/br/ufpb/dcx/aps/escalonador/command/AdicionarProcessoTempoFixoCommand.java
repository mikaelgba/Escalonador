package br.ufpb.dcx.aps.escalonador.command;

import br.ufpb.dcx.aps.escalonador.EscalonadorBase;

public class AdicionarProcessoTempoFixoCommand implements Command {

    private EscalonadorBase escalonadorBase;
    private String nomeProcesso;
    private int duracao;

    public AdicionarProcessoTempoFixoCommand(String nomeProcesso, int duracao){
    	
        this.nomeProcesso = nomeProcesso;
        this.duracao = duracao;
    }

    @Override
    public String executar() {
        getEscalonador().adicionarProcessoTempoFixo(nomeProcesso, duracao);
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
