package br.com.victor.cdi.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.victor.cdi.service.Mensageiro;
import br.com.victor.cdi.service.Urgente;

@Named
@RequestScoped
public class EnvioMensagemBean {

	@Inject @Urgente
	private Mensageiro mensageiro;
	
	private String texto;
	
	public void enviarMensagem(){
		mensageiro.enviarMensagem(getTexto());
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
