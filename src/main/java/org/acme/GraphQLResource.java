package org.acme;

import javax.inject.Inject;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@GraphQLApi
public class GraphQLResource {

    @Inject
    ReadNavigationService navService;

    @Inject
    ObjectMapper mapper;

    @Query("navigation")
    public Navigation performance() {
        return navService.getNavigation();

    }

    @Query("json")
    public String json() throws JsonProcessingException {

        return mapper.writeValueAsString(navService.getNavigation());
    }
}
