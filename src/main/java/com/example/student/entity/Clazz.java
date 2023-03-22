package com.example.student.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 班级表
 * @TableName class
 */
public class Clazz implements Serializable {
    /**
     * 班级ID
     */
    private Integer id;

    /**
     * 班级名称
     */
    private String name;

    /**
     * 创建
     */
    private Date createTime;

    /**
     * 更新
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * 班级ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 班级ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 班级名称
     */
    public String getName() {
        return name;
    }

    /**
     * 班级名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 创建
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Clazz other = (Clazz) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}