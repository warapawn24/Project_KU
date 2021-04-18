package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMsBuildingTwo is a Querydsl query type for MsBuildingTwo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMsBuildingTwo extends EntityPathBase<MsBuildingTwo> {

    private static final long serialVersionUID = 1827756222L;

    public static final QMsBuildingTwo msBuildingTwo = new QMsBuildingTwo("msBuildingTwo");

    public final NumberPath<Long> buildingId = createNumber("buildingId", Long.class);

    public final NumberPath<Integer> buildingTotal = createNumber("buildingTotal", Integer.class);

    public final NumberPath<Long> floorId = createNumber("floorId", Long.class);

    public final NumberPath<Integer> number = createNumber("number", Integer.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> roomId = createNumber("roomId", Long.class);

    public final NumberPath<Long> typeId = createNumber("typeId", Long.class);

    public QMsBuildingTwo(String variable) {
        super(MsBuildingTwo.class, forVariable(variable));
    }

    public QMsBuildingTwo(Path<? extends MsBuildingTwo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMsBuildingTwo(PathMetadata metadata) {
        super(MsBuildingTwo.class, metadata);
    }

}

