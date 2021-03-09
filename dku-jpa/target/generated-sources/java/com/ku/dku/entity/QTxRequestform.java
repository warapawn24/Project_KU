package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTxRequestform is a Querydsl query type for TxRequestform
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTxRequestform extends EntityPathBase<TxRequestform> {

    private static final long serialVersionUID = -1307830789L;

    public static final QTxRequestform txRequestform = new QTxRequestform("txRequestform");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final StringPath requestAddress = createString("requestAddress");

    public final StringPath requestBranch = createString("requestBranch");

    public final DateTimePath<java.util.Date> requestDate = createDateTime("requestDate", java.util.Date.class);

    public final StringPath requestFaculty = createString("requestFaculty");

    public final StringPath requestName = createString("requestName");

    public final StringPath requestNote = createString("requestNote");

    public final StringPath requestPhone = createString("requestPhone");

    public final StringPath requestRoom = createString("requestRoom");

    public final StringPath requestSubject = createString("requestSubject");

    public final StringPath requestTo = createString("requestTo");

    public QTxRequestform(String variable) {
        super(TxRequestform.class, forVariable(variable));
    }

    public QTxRequestform(Path<? extends TxRequestform> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTxRequestform(PathMetadata metadata) {
        super(TxRequestform.class, metadata);
    }

}

