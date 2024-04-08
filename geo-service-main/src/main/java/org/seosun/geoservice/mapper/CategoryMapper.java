package org.seosun.geoservice.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.seosun.geoservice.deserialize.CategoryJson;
import org.seosun.geoservice.deserialize.SynonymJson;
import org.seosun.geoservice.entity.Category;
import org.seosun.geoservice.entity.Synonym;

@Mapper(componentModel = "spring", uses = SynonymMapper.class)
public interface CategoryMapper {

    @Mapping(source = "synonyms", target = "synonyms")
    Category categoryJsonToCategory(CategoryJson categoryJson);
}