package com.algaworks.di;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.service.AtivacaoClienteService;

public class Main {
	
	public static void main(String[] args) {
		Cliente joao = new Cliente("Joao", "joao@email.com", "21999995555");
		Cliente maria = new Cliente("Maria", "maria@email.com", "219999944444");
		
		AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService();
		ativacaoClienteService.ativar(joao);
		ativacaoClienteService.ativar(maria);
	}

}
