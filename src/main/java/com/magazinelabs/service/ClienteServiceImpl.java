package com.magazinelabs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.magazinelabs.data.entity.Cliente;
import com.magazinelabs.interfaces.ClienteRepositoryPageable;
import com.magazinelabs.interfaces.ClienteService;


@Service
public class ClienteServiceImpl implements ClienteService{
	
	private ClienteRepositoryPageable clienteRepositoryPageable;
	
	@Autowired
	public ClienteServiceImpl(ClienteRepositoryPageable clienteRepositoryPageable){
		this.clienteRepositoryPageable = clienteRepositoryPageable;
	}
	
	@Override 
	public Page<Cliente> listaPorPagina(Pageable pageable) {
		return this.clienteRepositoryPageable.findAll(pageable);
	}
}
