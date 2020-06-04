package com.algaworks.di.service;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.INotificador;

public class AtivacaoClienteService {
	
	private INotificador notificador;
	
	public AtivacaoClienteService(INotificador notificador) {
		this.notificador = notificador;
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo.");
		
//		NotificadorEmail notificadorEmail = new NotificadorEmail();
//		notificadorEmail.notificar(cliente, "Seu cadastro no sistema está ativo.");
	}

}
