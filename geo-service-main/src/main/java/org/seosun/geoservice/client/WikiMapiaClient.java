package org.seosun.geoservice.client;

import org.seosun.geoservice.dto.Area;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@FeignClient(value = "wikimapia", url = "${wikimapia.url}", configuration = WikiMapiaAuth.class)
public interface WikiMapiaClient {

    @GetMapping
    String getCategories(@RequestParam String function, @RequestParam String name, @RequestParam String format);

    @GetMapping
    String getCategoryById(@RequestParam String function,
                           @RequestParam Long id,
                           @RequestParam String format);

    @GetMapping
    Area getPolygonsByArea(@RequestParam List<String> function,
                           @RequestParam String bbox,
                           @RequestParam Long count,
                           @RequestParam Long page,
                           @RequestParam String format);
}
