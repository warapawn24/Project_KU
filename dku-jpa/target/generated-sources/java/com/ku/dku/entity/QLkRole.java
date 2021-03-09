package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QLkRole is a Querydsl query type for LkRole
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLkRole extends EntityPathBase<LkRole> {

    private static final long serialVersionUID = 554152137L;

    public static final QLkRole lkRole = new QLkRole("lkRole");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final StringPath roleName = createString("roleName");

    public QLkRole(String variable) {
        super(LkRole.class, forVariable(variable));
    }

    public QLkRole(Path<? extends LkRole> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLkRole(PathMetadata metadata) {
        super(LkRole.class, metadata);
    }

}

