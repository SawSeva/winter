package org.seosun.geoservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import org.seosun.geoservice.dto.Area;
import org.seosun.geoservice.service.PolygonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/polygon")
@AllArgsConstructor
public class PolygonController {

    @Autowired
    private final PolygonService polygonService;

    @GetMapping("/byArea")
    public Area findAllBySurface(@RequestParam String bbox) throws JsonProcessingException {
        return polygonService.getByArea(bbox);
    }
}
