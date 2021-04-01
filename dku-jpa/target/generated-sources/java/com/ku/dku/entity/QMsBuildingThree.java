package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMsBuildingThree is a Querydsl query type for MsBuildingThree
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMsBuildingThree extends EntityPathBase<MsBuildingThree> {

    private static final long serialVersionUID = -168335472L;

    public static final QMsBuildingThree msBuildingThree = new QMsBuildingThree("msBuildingThree");

    public final NumberPath<Long> buildingId = createNumber("buildingId", Long.class);

    public final NumberPath<Integer> buildingTotal = createNumber("buildingTotal", Integer.class);

    public final NumberPath<Long> floorId = createNumber("floorId", Long.class);

    public final NumberPath<Integer> number = createNumber("number", Integer.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> roomId = createNumber("roomId", Long.class);

    public QMsBuildingThree(String variable) {
        super(MsBuildingThree.class, forVariable(variable));
    }

    public QMsBuildingThree(Path<? extends MsBuildingThree> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMsBuildingThree(PathMetadata metadata) {
        super(MsBuildingThree.class, metadata);
    }

}

