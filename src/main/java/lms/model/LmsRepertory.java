package lms.model;

import java.math.BigDecimal;
import java.util.List;

public class LmsRepertory {
    private BigDecimal id;

    private String name;

    private String address;

    private BigDecimal lmsAdminId;

    private List<LmsAdmin> lmsAdminList;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public BigDecimal getLmsAdminId() {
        return lmsAdminId;
    }

    public void setLmsAdminId(BigDecimal lmsAdminId) {
        this.lmsAdminId = lmsAdminId;
    }

    public List<LmsAdmin> getLmsAdminList() {
        return lmsAdminList;
    }

    public void setLmsAdminList(List<LmsAdmin> lmsAdminList) {
        this.lmsAdminList = lmsAdminList;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "LmsRepertory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", lmsAdminId=" + lmsAdminId +
                ", lmsAdminList=" + lmsAdminList +
                '}';
    }
}