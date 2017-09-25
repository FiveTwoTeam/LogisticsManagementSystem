package lms.model;

import java.math.BigDecimal;
import java.util.List;

public class LmsDeliveryStaff {
    private Long id;

    private String name;

    private BigDecimal phone;

    private Long stationId;

    private List<LmsStation> stationList;

    public List<LmsStation> getStationList() {
        return stationList;
    }

    public void setStationList(List<LmsStation> stationList) {
        this.stationList = stationList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getPhone() {
        return phone;
    }

    public void setPhone(BigDecimal phone) {
        this.phone = phone;
    }

    public Long getStationId() {
        return stationId;
    }

    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"phone\":")
                .append(phone);
        sb.append(",\"stationId\":")
                .append(stationId);
        sb.append(",\"stationList\":")
                .append(stationList);
        sb.append('}');
        return sb.toString();
    }
}