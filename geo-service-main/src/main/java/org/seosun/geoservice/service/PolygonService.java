package org.seosun.geoservice.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import org.seosun.geoservice.client.WikiMapiaClient;
import org.seosun.geoservice.dto.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@AllArgsConstructor
public class PolygonService {

    private final static String FORMAT_JSON = "json";
    private final static String CATEGORY_GET_ALL = "place.getbyarea";
    @Autowired
    private final WikiMapiaClient wikiMapiaClient;

    public Area getByArea(String bbox) throws JsonProcessingException {
        Area area = wikiMapiaClient.getPolygonsByArea(Arrays.asList(CATEGORY_GET_ALL, "box"), bbox, 100L, 1L, FORMAT_JSON);

        return area;
    }

}
