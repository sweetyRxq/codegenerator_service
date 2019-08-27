package com.coldchain.resource.auth.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.coldchain.resource.auth.entity.AuthRole;

public interface AuthRoleRepository extends JpaSpecificationExecutor<AuthRole>, PagingAndSortingRepository<AuthRole, String> {

}

