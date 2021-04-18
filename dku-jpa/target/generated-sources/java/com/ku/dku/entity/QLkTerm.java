package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QLkTerm is a Querydsl query type for LkTerm
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLkTerm extends EntityPathBase<LkTerm> {

    private static final long serialVersionUID = 554202303L;

    public static final QLkTerm lkTerm = new QLkTerm("lkTerm");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final StringPath termName = createString("termName");

    public QLkTerm(String variable) {
        super(LkTerm.class, forVariable(variable));
    }

    public QLkTerm(Path<? extends LkTerm> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLkTerm(PathMetadata metadata) {
        super(LkTerm.class, metadata);
    }

}

