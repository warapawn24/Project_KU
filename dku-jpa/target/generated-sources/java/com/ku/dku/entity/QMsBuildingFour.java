package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMsBuildingFour is a Querydsl query type for MsBuildingFour
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMsBuildingFour extends EntityPathBase<MsBuildingFour> {

    private static final long serialVersionUID = 825443572L;

    public static final QMsBuildingFour msBuildingFour = new QMsBuildingFour("msBuildingFour");

    public final NumberPath<Long> buildingId = createNumber("buildingId", Long.class);

    public final NumberPath<Integer> buildingTotal = createNumber("buildingTotal", Integer.class);

    public final NumberPath<Long> floorId = createNumber("floorId", Long.class);

    public final NumberPath<Integer> number = createNumber("number", Integer.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> roomId = createNumber("roomId", Long.class);

    public QMsBuildingFour(String variable) {
        super(MsBuildingFour.class, forVariable(variable));
    }

    public QMsBuildingFour(Path<? extends MsBuildingFour> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMsBuildingFour(PathMetadata metadata) {
        super(MsBuildingFour.class, metadata);
    }

}

