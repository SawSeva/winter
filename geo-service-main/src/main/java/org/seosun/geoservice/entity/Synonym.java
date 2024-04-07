package org.seosun.geoservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "synonym")
@Data
public class Synonym {

    @Id
    private Long id;

    @Column
    private String name;

}
