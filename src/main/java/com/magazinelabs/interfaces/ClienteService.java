package com.magazinelabs.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.magazinelabs.data.entity.Cliente;

public interface ClienteService {
	public Page<Cliente> listaPorPagina (Pageable pageable);
}
