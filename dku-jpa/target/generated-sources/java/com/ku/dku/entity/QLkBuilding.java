package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QLkBuilding is a Querydsl query type for LkBuilding
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLkBuilding extends EntityPathBase<LkBuilding> {

    private static final long serialVersionUID = -1148853881L;

    public static final QLkBuilding lkBuilding = new QLkBuilding("lkBuilding");

    public final NumberPath<Long> buildingId = createNumber("buildingId", Long.class);

    public final StringPath buildingName = createString("buildingName");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public QLkBuilding(String variable) {
        super(LkBuilding.class, forVariable(variable));
    }

    public QLkBuilding(Path<? extends LkBuilding> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLkBuilding(PathMetadata metadata) {
        super(LkBuilding.class, metadata);
    }

}

