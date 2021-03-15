package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMsBuildingFive is a Querydsl query type for MsBuildingFive
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMsBuildingFive extends EntityPathBase<MsBuildingFive> {

    private static final long serialVersionUID = 825437824L;

    public static final QMsBuildingFive msBuildingFive = new QMsBuildingFive("msBuildingFive");

    public final NumberPath<Long> buildingId = createNumber("buildingId", Long.class);

    public final NumberPath<Long> floorId = createNumber("floorId", Long.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> roomId = createNumber("roomId", Long.class);

    public QMsBuildingFive(String variable) {
        super(MsBuildingFive.class, forVariable(variable));
    }

    public QMsBuildingFive(Path<? extends MsBuildingFive> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMsBuildingFive(PathMetadata metadata) {
        super(MsBuildingFive.class, metadata);
    }

}

