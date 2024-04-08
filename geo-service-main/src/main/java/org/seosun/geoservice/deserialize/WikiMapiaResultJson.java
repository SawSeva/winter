package org.seosun.geoservice.deserialize;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record WikiMapiaResultJson(@JsonProperty("category") CategoryJson category,
                                  @JsonProperty("categories") @JsonInclude(JsonInclude.Include.NON_EMPTY) List<CategoryJson> categories) {
}
