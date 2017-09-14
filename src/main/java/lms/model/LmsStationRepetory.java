package lms.model;

import java.math.BigDecimal;

public class LmsStationRepetory {
    private Long id;

    private String name;

    private String address;

    private BigDecimal phone;

    private Long lmsAdminId;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public BigDecimal getPhone() {
        return phone;
    }

    public void setPhone(BigDecimal phone) {
        this.phone = phone;
    }

    public Long getLmsAdminId() {
        return lmsAdminId;
    }

    public void setLmsAdminId(Long lmsAdminId) {
        this.lmsAdminId = lmsAdminId;
    }
}