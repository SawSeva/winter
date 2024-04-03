package org.seosun.geoservice.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Area {
    private String version;
    private String language;
    private List<Folder> folder;
    private int page;
    private int count;
    private String found;
}
