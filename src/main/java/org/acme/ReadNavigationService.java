package org.acme;

import java.io.File;
import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

import org.jboss.logging.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.quarkus.runtime.Startup;

@Startup
@ApplicationScoped
public class ReadNavigationService {

    static final Logger LOG = Logger.getLogger(ReadNavigationService.class);

    private Navigation toReturn;

    @PostConstruct
    public void readFromJson() throws JsonParseException, JsonMappingException, IOException {
        LOG.info("Reading navigation file from json..");
        File file = new File(ReadNavigationService.class.getResource("/navigation.json").getPath());
        ObjectMapper mapper = new ObjectMapper();
        Navigation navigation = mapper.readValue(file, Navigation.class);
        toReturn = navigation;

    }

    public Navigation getNavigation() {
        return toReturn;
    }
}
