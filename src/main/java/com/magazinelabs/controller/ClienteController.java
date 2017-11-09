package com.magazinelabs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.magazinelabs.data.entity.Cliente;
import com.magazinelabs.interfaces.ClienteService;

@Controller
@RequestMapping(value="/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(method=RequestMethod.GET)
    @ResponseBody
	public Page<Cliente> listaCliente( Pageable pageable){
		Page<Cliente> clienteList = clienteService.listaPorPagina(pageable);
		
		return clienteList;
	} 

}
