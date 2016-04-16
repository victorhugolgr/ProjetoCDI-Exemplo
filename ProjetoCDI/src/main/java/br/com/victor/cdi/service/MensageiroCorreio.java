package br.com.victor.cdi.service;

public class MensageiroCorreio implements Mensageiro {

	@Override
	public void enviarMensagem(String texto) {
		System.out.println("Enviando mensagem por correio: " + texto);
	}

}
