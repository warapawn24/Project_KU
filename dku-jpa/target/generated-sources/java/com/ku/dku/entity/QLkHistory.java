package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QLkHistory is a Querydsl query type for LkHistory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLkHistory extends EntityPathBase<LkHistory> {

    private static final long serialVersionUID = -1557827743L;

    public static final QLkHistory lkHistory = new QLkHistory("lkHistory");

    public final NumberPath<Long> fileId = createNumber("fileId", Long.class);

    public final StringPath historyText = createString("historyText");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public QLkHistory(String variable) {
        super(LkHistory.class, forVariable(variable));
    }

    public QLkHistory(Path<? extends LkHistory> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLkHistory(PathMetadata metadata) {
        super(LkHistory.class, metadata);
    }

}

