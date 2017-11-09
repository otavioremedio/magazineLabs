package com.magazinelabs.interfaces;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.magazinelabs.data.entity.Cliente;

public interface ClienteRepositoryPageable extends PagingAndSortingRepository<Cliente, Integer> {
	
}
