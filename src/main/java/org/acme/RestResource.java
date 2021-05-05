package org.acme;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.graphql.Query;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Path("/navigation")
public class RestResource {
    @Inject
    ReadNavigationService navService;

    @Inject
    ObjectMapper mapper;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Navigation performance() {
        return navService.getNavigation();
    }

}