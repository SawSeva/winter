package org.seosun.geoservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.Getter;
import lombok.Setter;
import org.seosun.geoservice.dto.Area;
import org.seosun.geoservice.service.PolygonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/polygon")
@Getter
@Setter
public class PolygonController {

    private final PolygonService polygonService;

    private final String bbox = "";

    @Autowired
    public PolygonController(PolygonService polygonService) {
        this.polygonService = polygonService;
    }

    @GetMapping("/byArea")
    public Area findAllBySurface(@RequestParam String bbox) throws JsonProcessingException {
        return polygonService.getByArea(bbox);
    }
}
