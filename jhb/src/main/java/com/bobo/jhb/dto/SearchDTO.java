package com.bobo.jhb.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class SearchDTO {
    @ApiModelProperty(
            notes = "当前显示页数"
    )
    private Integer current;
    @ApiModelProperty(
            notes = "每页展示数据条数"
    )
    private Integer size;
    @ApiModelProperty(
            notes = "查询条件"
    )
    private String searchKey;

    public SearchDTO() {
    }

    public Integer getCurrent() {
        return this.current;
    }

    public Integer getSize() {
        return this.size;
    }

    public String getSearchKey() {
        return this.searchKey;
    }

    public void setCurrent(final Integer current) {
        this.current = current;
    }

    public void setSize(final Integer size) {
        this.size = size;
    }

    public void setSearchKey(final String searchKey) {
        this.searchKey = searchKey;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof SearchDTO)) {
            return false;
        } else {
            SearchDTO other = (SearchDTO)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label47: {
                    Object this$current = this.getCurrent();
                    Object other$current = other.getCurrent();
                    if (this$current == null) {
                        if (other$current == null) {
                            break label47;
                        }
                    } else if (this$current.equals(other$current)) {
                        break label47;
                    }

                    return false;
                }

                Object this$size = this.getSize();
                Object other$size = other.getSize();
                if (this$size == null) {
                    if (other$size != null) {
                        return false;
                    }
                } else if (!this$size.equals(other$size)) {
                    return false;
                }

                Object this$searchKey = this.getSearchKey();
                Object other$searchKey = other.getSearchKey();
                if (this$searchKey == null) {
                    if (other$searchKey != null) {
                        return false;
                    }
                } else if (!this$searchKey.equals(other$searchKey)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SearchDTO;
    }


}

