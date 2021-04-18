package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMsBuildingSix is a Querydsl query type for MsBuildingSix
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMsBuildingSix extends EntityPathBase<MsBuildingSix> {

    private static final long serialVersionUID = 1827754836L;

    public static final QMsBuildingSix msBuildingSix = new QMsBuildingSix("msBuildingSix");

    public final NumberPath<Long> buildingId = createNumber("buildingId", Long.class);

    public final NumberPath<Integer> buildingTotal = createNumber("buildingTotal", Integer.class);

    public final NumberPath<Long> floorId = createNumber("floorId", Long.class);

    public final NumberPath<Integer> number = createNumber("number", Integer.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> roomId = createNumber("roomId", Long.class);

    public final NumberPath<Long> typeId = createNumber("typeId", Long.class);

    public QMsBuildingSix(String variable) {
        super(MsBuildingSix.class, forVariable(variable));
    }

    public QMsBuildingSix(Path<? extends MsBuildingSix> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMsBuildingSix(PathMetadata metadata) {
        super(MsBuildingSix.class, metadata);
    }

}

