package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMsBuildingEight is a Querydsl query type for MsBuildingEight
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMsBuildingEight extends EntityPathBase<MsBuildingEight> {

    private static final long serialVersionUID = -182168959L;

    public static final QMsBuildingEight msBuildingEight = new QMsBuildingEight("msBuildingEight");

    public final NumberPath<Long> buildingId = createNumber("buildingId", Long.class);

    public final NumberPath<Integer> buildingTotal = createNumber("buildingTotal", Integer.class);

    public final NumberPath<Long> floorId = createNumber("floorId", Long.class);

    public final NumberPath<Integer> number = createNumber("number", Integer.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> roomId = createNumber("roomId", Long.class);

    public final NumberPath<Long> typeId = createNumber("typeId", Long.class);

    public QMsBuildingEight(String variable) {
        super(MsBuildingEight.class, forVariable(variable));
    }

    public QMsBuildingEight(Path<? extends MsBuildingEight> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMsBuildingEight(PathMetadata metadata) {
        super(MsBuildingEight.class, metadata);
    }

}

