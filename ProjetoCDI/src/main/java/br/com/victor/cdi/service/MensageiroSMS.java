package br.com.victor.cdi.service;

@Urgente
public class MensageiroSMS implements Mensageiro {

	@Override
	public void enviarMensagem(String texto) {
		System.out.println("Enviando Mensagem por SMS: " + texto);
	}

}
