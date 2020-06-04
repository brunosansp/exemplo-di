package com.algaworks.di.notificacao;

import com.algaworks.di.modelo.Cliente;

public class NotificadorEmail implements INotificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s por E-MAIL através do e-mail %s: %s\n",
			cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
