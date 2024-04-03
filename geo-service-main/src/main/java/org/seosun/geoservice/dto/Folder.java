package org.seosun.geoservice.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Data
public class Folder {
    private String id;
    private String name;
    private String url;
    private Location location;
    private List<Polygon> polygon;
}
