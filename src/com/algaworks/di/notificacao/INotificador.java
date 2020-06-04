package com.algaworks.di.notificacao;

import com.algaworks.di.modelo.Cliente;

public interface INotificador {
	
	void notificar(Cliente cliente, String mensagem);

}
