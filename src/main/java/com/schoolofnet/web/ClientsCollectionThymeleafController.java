package com.schoolofnet.web;
import com.schoolofnet.domain.Client;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ClientsCollectionThymeleafController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Client.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class ClientsCollectionThymeleafController {
}
