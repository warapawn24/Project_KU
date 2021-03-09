package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTxLoginStudent is a Querydsl query type for TxLoginStudent
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTxLoginStudent extends EntityPathBase<TxLoginStudent> {

    private static final long serialVersionUID = -1088847510L;

    public static final QTxLoginStudent txLoginStudent = new QTxLoginStudent("txLoginStudent");

    public final StringPath loginError = createString("loginError");

    public final StringPath loginForm = createString("loginForm");

    public final DateTimePath<java.util.Date> loginTime = createDateTime("loginTime", java.util.Date.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> studentId = createNumber("studentId", Long.class);

    public final StringPath studentPassword = createString("studentPassword");

    public final StringPath studentUsername = createString("studentUsername");

    public QTxLoginStudent(String variable) {
        super(TxLoginStudent.class, forVariable(variable));
    }

    public QTxLoginStudent(Path<? extends TxLoginStudent> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTxLoginStudent(PathMetadata metadata) {
        super(TxLoginStudent.class, metadata);
    }

}

