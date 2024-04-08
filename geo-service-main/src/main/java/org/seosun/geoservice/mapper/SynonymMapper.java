package org.seosun.geoservice.mapper;

import org.mapstruct.Mapper;
import org.seosun.geoservice.deserialize.SynonymJson;
import org.seosun.geoservice.entity.Synonym;

@Mapper(componentModel = "spring")
public interface SynonymMapper {
    Synonym synonymJsonToSynonym(SynonymJson synonymJson);
}