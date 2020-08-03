package tech.aistar.day11;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/3 3:40 下午
 */
public class BookInfo {
    private int id;

    private String remark;

    public BookInfo() {
    }

    public BookInfo(int id, String remark) {
        this.id = id;
        this.remark = remark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookInfo bookInfo = (BookInfo) o;

        return id == bookInfo.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BookInfo{");
        sb.append("id=").append(id);
        sb.append(", remark='").append(remark).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
