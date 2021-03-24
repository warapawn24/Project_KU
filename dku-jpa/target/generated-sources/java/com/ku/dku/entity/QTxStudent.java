package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTxStudent is a Querydsl query type for TxStudent
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTxStudent extends EntityPathBase<TxStudent> {

    private static final long serialVersionUID = -461976477L;

    public static final QTxStudent txStudent = new QTxStudent("txStudent");

    public final StringPath facultyCode = createString("facultyCode");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final StringPath studentBranch = createString("studentBranch");

    public final StringPath studentEmail = createString("studentEmail");

    public final StringPath studentFaculty = createString("studentFaculty");

    public final NumberPath<Long> studentFail = createNumber("studentFail", Long.class);

    public final StringPath studentFname = createString("studentFname");

    public final NumberPath<Long> studentId = createNumber("studentId", Long.class);

    public final StringPath studentLname = createString("studentLname");

    public final DateTimePath<java.util.Date> studentLogindate = createDateTime("studentLogindate", java.util.Date.class);

    public final StringPath studentPassword = createString("studentPassword");

    public final NumberPath<Long> studentRoom = createNumber("studentRoom", Long.class);

    public final StringPath studentStatus = createString("studentStatus");

    public final StringPath studentUsername = createString("studentUsername");

    public QTxStudent(String variable) {
        super(TxStudent.class, forVariable(variable));
    }

    public QTxStudent(Path<? extends TxStudent> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTxStudent(PathMetadata metadata) {
        super(TxStudent.class, metadata);
    }

}

