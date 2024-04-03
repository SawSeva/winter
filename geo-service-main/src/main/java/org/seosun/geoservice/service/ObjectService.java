package org.seosun.geoservice.service;

import org.seosun.geoservice.client.WikiMapiaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ObjectService {

    private final static String FORMAT_JSON = "json";

    @Autowired
    private final WikiMapiaClient wikiMapiaClient;
}
