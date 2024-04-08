package org.seosun.geoservice.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "category")
@Data
public class Category {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private Long amount;

    @Column
    private String icon;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Synonym> synonyms;
}
