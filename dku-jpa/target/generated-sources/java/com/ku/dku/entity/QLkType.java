package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QLkType is a Querydsl query type for LkType
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLkType extends EntityPathBase<LkType> {

    private static final long serialVersionUID = 554221453L;

    public static final QLkType lkType = new QLkType("lkType");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final StringPath typeName = createString("typeName");

    public QLkType(String variable) {
        super(LkType.class, forVariable(variable));
    }

    public QLkType(Path<? extends LkType> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLkType(PathMetadata metadata) {
        super(LkType.class, metadata);
    }

}

