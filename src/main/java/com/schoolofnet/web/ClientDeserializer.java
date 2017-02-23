package com.schoolofnet.web;
import com.schoolofnet.domain.Client;
import com.schoolofnet.service.api.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ClientDeserializer
 *
 * TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Client.class)
public class ClientDeserializer extends JsonObjectDeserializer<Client> {

    /**
     * TODO Auto-generated field documentation
     *
     */
    public ClientService clientService;

    /**
     * TODO Auto-generated field documentation
     *
     */
    public ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param clientService
     * @param conversionService
     */
    @Autowired
    public ClientDeserializer(ClientService clientService, ConversionService conversionService) {
        this.clientService = clientService;
        this.conversionService = conversionService;
    }
}
