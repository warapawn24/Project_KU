package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMsBuilding is a Querydsl query type for MsBuilding
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMsBuilding extends EntityPathBase<MsBuilding> {

    private static final long serialVersionUID = 1374866094L;

    public static final QMsBuilding msBuilding = new QMsBuilding("msBuilding");

    public final NumberPath<Long> buildingId = createNumber("buildingId", Long.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> romFloor = createNumber("romFloor", Long.class);

    public final NumberPath<Long> roomId = createNumber("roomId", Long.class);

    public QMsBuilding(String variable) {
        super(MsBuilding.class, forVariable(variable));
    }

    public QMsBuilding(Path<? extends MsBuilding> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMsBuilding(PathMetadata metadata) {
        super(MsBuilding.class, metadata);
    }

}

