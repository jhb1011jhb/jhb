package com.bobo.jhb.vo;


import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.List;

@ApiModel(
        description = "分页"
)
public class PageVO<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(
            notes = "总条数"
    )
    private long totalCount;
    @ApiModelProperty(
            notes = "每页条数"
    )
    private long size;
    @ApiModelProperty(
            notes = "总页数"
    )
    private long totalPage;
    @ApiModelProperty(
            notes = "当前页数"
    )
    private long current;
    @ApiModelProperty(
            notes = "列表数据"
    )
    private List<T> list;

    public PageVO(IPage<T> page) {
        this.list = page.getRecords();
        this.totalCount = page.getTotal();
        this.size = page.getSize();
        this.current = page.getCurrent();
        this.totalPage = page.getPages();
    }

    public PageVO() {
    }

    public long getTotalCount() {
        return this.totalCount;
    }

    public long getSize() {
        return this.size;
    }

    public long getTotalPage() {
        return this.totalPage;
    }

    public long getCurrent() {
        return this.current;
    }

    public List<T> getList() {
        return this.list;
    }

    public void setTotalCount(final long totalCount) {
        this.totalCount = totalCount;
    }

    public void setSize(final long size) {
        this.size = size;
    }

    public void setTotalPage(final long totalPage) {
        this.totalPage = totalPage;
    }

    public void setCurrent(final long current) {
        this.current = current;
    }

    public void setList(final List<T> list) {
        this.list = list;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof PageVO)) {
            return false;
        } else {
            PageVO<?> other = (PageVO)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getTotalCount() != other.getTotalCount()) {
                return false;
            } else if (this.getSize() != other.getSize()) {
                return false;
            } else if (this.getTotalPage() != other.getTotalPage()) {
                return false;
            } else if (this.getCurrent() != other.getCurrent()) {
                return false;
            } else {
                Object this$list = this.getList();
                Object other$list = other.getList();
                if (this$list == null) {
                    if (other$list != null) {
                        return false;
                    }
                } else if (!this$list.equals(other$list)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PageVO;
    }



    public String toString() {
        return "PageVO(totalCount=" + this.getTotalCount() + ", size=" + this.getSize() + ", totalPage=" + this.getTotalPage() + ", current=" + this.getCurrent() + ", list=" + this.getList() + ")";
    }
}
