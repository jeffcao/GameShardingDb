package com.snowcattle.game.db.entity;

import com.snowcattle.game.db.common.annotation.EntitySave;
import com.snowcattle.game.db.common.annotation.FieldSave;
import com.snowcattle.game.db.common.annotation.MethodSaveProxy;

import java.util.Date;

/**
 * Created by jiangwenping on 17/3/16.
 */
@EntitySave
public abstract  class BaseEntity implements ISoftDeleteEntity<Long>{

    @FieldSave
    private boolean deleted;

    @FieldSave
    private Date deleteTime;

    @FieldSave
    private Long id;

    public boolean isDeleted() {
        return deleted;
    }

    @MethodSaveProxy(proxy="deleted")
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public Date getDeleteTime() {
        return deleteTime;
    }

    @MethodSaveProxy(proxy="deleteTime")
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    @Override
    public Long getId() {
        return id;
    }

    @MethodSaveProxy(proxy="id")
    public void setId(Long id) {
        this.id = id;
    }
}
