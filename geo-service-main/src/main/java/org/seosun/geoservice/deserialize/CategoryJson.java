package org.seosun.geoservice.deserialize;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_ABSENT)
public record CategoryJson(@JsonProperty("id") Long id,
                           @JsonProperty("name") String name,
                           @JsonProperty("amount") Long amount,
                           @JsonProperty("icon") String icon,
                           @JsonProperty("description") String description,
                           @JsonProperty("synonyms") @JsonInclude(JsonInclude.Include.NON_EMPTY) List<SynonymJson> synonyms) {
}
