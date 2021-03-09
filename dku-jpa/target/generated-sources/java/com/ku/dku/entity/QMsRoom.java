package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMsRoom is a Querydsl query type for MsRoom
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMsRoom extends EntityPathBase<MsRoom> {

    private static final long serialVersionUID = 590169557L;

    public static final QMsRoom msRoom = new QMsRoom("msRoom");

    public final NumberPath<Long> buildingId = createNumber("buildingId", Long.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> roomAmount = createNumber("roomAmount", Long.class);

    public final NumberPath<Long> roomFloor = createNumber("roomFloor", Long.class);

    public final NumberPath<Long> roomId = createNumber("roomId", Long.class);

    public final NumberPath<Long> roomPrice = createNumber("roomPrice", Long.class);

    public final NumberPath<Integer> roomStatus = createNumber("roomStatus", Integer.class);

    public final StringPath roomTerm = createString("roomTerm");

    public final StringPath roomType = createString("roomType");

    public QMsRoom(String variable) {
        super(MsRoom.class, forVariable(variable));
    }

    public QMsRoom(Path<? extends MsRoom> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMsRoom(PathMetadata metadata) {
        super(MsRoom.class, metadata);
    }

}

