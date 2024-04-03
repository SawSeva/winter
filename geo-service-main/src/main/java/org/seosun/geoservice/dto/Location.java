package org.seosun.geoservice.dto;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Data
public class Location {
    private float north;
    private float south;
    private float east;
    private float west;
    private float lon;
    private float lat;
}
