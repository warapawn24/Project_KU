package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QLkFloor is a Querydsl query type for LkFloor
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLkFloor extends EntityPathBase<LkFloor> {

    private static final long serialVersionUID = -12321255L;

    public static final QLkFloor lkFloor = new QLkFloor("lkFloor");

    public final NumberPath<Long> floorId = createNumber("floorId", Long.class);

    public final StringPath floorName = createString("floorName");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public QLkFloor(String variable) {
        super(LkFloor.class, forVariable(variable));
    }

    public QLkFloor(Path<? extends LkFloor> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLkFloor(PathMetadata metadata) {
        super(LkFloor.class, metadata);
    }

}

