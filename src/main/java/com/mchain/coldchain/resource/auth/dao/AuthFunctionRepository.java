package com.mchain.coldchain.resource.auth.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.mchain.coldchain.resource.auth.entity.AuthFunction;

public interface AuthFunctionRepository extends JpaSpecificationExecutor<AuthFunction>, PagingAndSortingRepository<AuthFunction, String> {

}


