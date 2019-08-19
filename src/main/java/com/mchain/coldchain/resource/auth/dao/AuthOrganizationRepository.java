package com.mchain.coldchain.resource.auth.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.mchain.coldchain.resource.auth.entity.AuthOrganization;

public interface AuthOrganizationRepository extends JpaSpecificationExecutor<AuthOrganization>, PagingAndSortingRepository<AuthOrganization, String> {

}



