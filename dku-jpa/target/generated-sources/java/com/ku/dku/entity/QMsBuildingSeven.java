package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMsBuildingSeven is a Querydsl query type for MsBuildingSeven
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMsBuildingSeven extends EntityPathBase<MsBuildingSeven> {

    private static final long serialVersionUID = -169344513L;

    public static final QMsBuildingSeven msBuildingSeven = new QMsBuildingSeven("msBuildingSeven");

    public final NumberPath<Long> buildingId = createNumber("buildingId", Long.class);

    public final NumberPath<Long> floorId = createNumber("floorId", Long.class);

    public final NumberPath<Integer> number = createNumber("number", Integer.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> roomId = createNumber("roomId", Long.class);

    public QMsBuildingSeven(String variable) {
        super(MsBuildingSeven.class, forVariable(variable));
    }

    public QMsBuildingSeven(Path<? extends MsBuildingSeven> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMsBuildingSeven(PathMetadata metadata) {
        super(MsBuildingSeven.class, metadata);
    }

}

