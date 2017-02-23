// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.schoolofnet.repository;

import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import com.schoolofnet.domain.Client;
import com.schoolofnet.domain.QClient;
import com.schoolofnet.repository.ClientRepositoryCustom;
import com.schoolofnet.repository.ClientRepositoryImpl;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

privileged aspect ClientRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare parents: ClientRepositoryImpl implements ClientRepositoryCustom;
    
    declare @type: ClientRepositoryImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     */
    private static final String ClientRepositoryImpl.NAME = "name";
    
    /**
     * TODO Auto-generated attribute documentation
     */
    private static final String ClientRepositoryImpl.EMAIL = "email";
    
    /**
     * TODO Auto-generated attribute documentation
     */
    private static final String ClientRepositoryImpl.COMPANY_NAME = "companyName";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Client> ClientRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        
        QClient client = QClient.client;
        
        JPQLQuery<Client> query = from(client);
        
        Path<?>[] paths = new Path<?>[] {client.name,client.email,client.companyName};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(NAME, client.name)
			.map(EMAIL, client.email)
			.map(COMPANY_NAME, client.companyName);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, client);
    }
    
}
