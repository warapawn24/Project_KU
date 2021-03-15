package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMsBuildingOne is a Querydsl query type for MsBuildingOne
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMsBuildingOne extends EntityPathBase<MsBuildingOne> {

    private static final long serialVersionUID = 1827751128L;

    public static final QMsBuildingOne msBuildingOne = new QMsBuildingOne("msBuildingOne");

    public final NumberPath<Long> buildingId = createNumber("buildingId", Long.class);

    public final NumberPath<Long> floorId = createNumber("floorId", Long.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> roomId = createNumber("roomId", Long.class);

    public QMsBuildingOne(String variable) {
        super(MsBuildingOne.class, forVariable(variable));
    }

    public QMsBuildingOne(Path<? extends MsBuildingOne> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMsBuildingOne(PathMetadata metadata) {
        super(MsBuildingOne.class, metadata);
    }

}

