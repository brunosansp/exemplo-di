package com.algaworks.di.service;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.modelo.Produto;
import com.algaworks.di.notificacao.INotificador;

public class EmissaoNotaFiscalService {
	
	private INotificador notificador;
	
	public EmissaoNotaFiscalService(INotificador notificador) {
		this.notificador = notificador;
	}
	
	public void emitir(Cliente cliente, Produto produto) {
		// TODO: Emite a nota fiscal aqui...
		
//		NotificadorEmail notificador = new NotificadorEmail();
		this.notificador.notificar(cliente, "Nota fiscal do produto " + produto.getNome() + " foi emitida!");
	}

}
