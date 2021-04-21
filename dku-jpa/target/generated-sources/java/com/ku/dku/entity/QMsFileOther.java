package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMsFileOther is a Querydsl query type for MsFileOther
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMsFileOther extends EntityPathBase<MsFileOther> {

    private static final long serialVersionUID = -259527110L;

    public static final QMsFileOther msFileOther = new QMsFileOther("msFileOther");

    public final ArrayPath<byte[], Byte> fileData = createArray("fileData", byte[].class);

    public final StringPath fileName = createString("fileName");

    public final StringPath fileType = createString("fileType");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public QMsFileOther(String variable) {
        super(MsFileOther.class, forVariable(variable));
    }

    public QMsFileOther(Path<? extends MsFileOther> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMsFileOther(PathMetadata metadata) {
        super(MsFileOther.class, metadata);
    }

}

