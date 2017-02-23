package com.schoolofnet.domain;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.validation.constraints.NotNull;

/**
 * = Client
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity
public class Client {

    /**
     * TODO Auto-generated field documentation
     *
     */
    @NotNull
    private String name;

    /**
     * TODO Auto-generated field documentation
     *
     */
    private String email;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @NotNull
    private String companyName;
}
