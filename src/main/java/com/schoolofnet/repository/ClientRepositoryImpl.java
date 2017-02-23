package com.schoolofnet.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.schoolofnet.domain.Client;

/**
 * = ClientRepositoryImpl
 *
 * TODO Auto-generated class documentation
 *
 */ 
@RooJpaRepositoryCustomImpl(repository = ClientRepositoryCustom.class)
public class ClientRepositoryImpl extends QueryDslRepositorySupportExt<Client> {

    /**
     * TODO Auto-generated constructor documentation
     */
    ClientRepositoryImpl() {
        super(Client.class);
    }
}