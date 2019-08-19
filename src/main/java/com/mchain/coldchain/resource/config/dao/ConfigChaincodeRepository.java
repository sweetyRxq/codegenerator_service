package com.mchain.coldchain.resource.config.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.mchain.coldchain.resource.config.entity.ConfigChaincode;

public interface ConfigChaincodeRepository extends JpaSpecificationExecutor<ConfigChaincode>, PagingAndSortingRepository<ConfigChaincode, String> {

}

