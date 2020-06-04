package com.algaworks.di;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.INotificador;
import com.algaworks.di.notificacao.NotificadorEmail;
import com.algaworks.di.service.AtivacaoClienteService;

public class Main {
	
	public static void main(String[] args) {
		Cliente joao = new Cliente("Joao", "joao@email.com", "21999995555");
		Cliente maria = new Cliente("Maria", "maria@email.com", "219999944444");
		
		//INotificador notificador = new NotificadorSMS();
		INotificador notificador = new NotificadorEmail();
		
		AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificador);
		ativacaoClienteService.ativar(joao);
		ativacaoClienteService.ativar(maria);
	}

}
