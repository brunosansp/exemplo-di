package com.algaworks.di.service;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.NotificadorEmail;

public class AtivacaoClienteService {
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		NotificadorEmail notificadorEmail = new NotificadorEmail();
		notificadorEmail.notificar(cliente, "Seu cadastro no sistema est� ativo.");
	}

}