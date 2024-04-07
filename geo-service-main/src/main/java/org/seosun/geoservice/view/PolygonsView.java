package org.seosun.geoservice.view;

import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.model.map.*;
import org.seosun.geoservice.controller.PolygonController;
import org.seosun.geoservice.dto.Area;
import org.seosun.geoservice.dto.Folder;

import java.io.Serializable;

@Named
@ViewScoped
@Getter
@Setter
public class PolygonsView implements Serializable {

    private MapModel<Long> polygonModel;

    private String bbox = "";

    @Inject
    private PolygonController polygonController;

    @PostConstruct
    public void init() {
        polygonModel = new DefaultMapModel<>();
    }

    public void submit() throws JsonProcessingException {
        Area area = polygonController.findAllBySurface(bbox);

        polygonModel = new DefaultMapModel<>();

        for(Folder folder: area.getFolder()) {
            Polygon<Long> polygon = new Polygon<>();
            for(org.seosun.geoservice.dto.Polygon p: folder.getPolygon()) {
                LatLng coord = new LatLng(p.getY(), p.getX());
                polygon.getPaths().add(coord);
            }
            polygon.setData(1L);

            polygon.setStrokeColor("#FF0000");
            polygon.setFillColor("#FF0000");
            polygon.setStrokeOpacity(0.7);
            polygon.setFillOpacity(0.7);
            polygon.setId(folder.getName());
            polygonModel.addOverlay(polygon);
        }
    }

    public MapModel getPolygonModel() {
        return this.polygonModel;
    }

}
