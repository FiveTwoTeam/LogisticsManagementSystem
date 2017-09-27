package lms.model;

import java.math.BigDecimal;

public class LmsSupplier {
    private Long id;

    private String name;

    private String address;

    private String contactMan;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"address\":\"")
                .append(address).append('\"');
        sb.append(",\"contactMan\":\"")
                .append(contactMan).append('\"');
        sb.append(",\"phone\":")
                .append(phone);
        sb.append(",\"bank\":\"")
                .append(bank).append('\"');
        sb.append(",\"bankAccount\":")
                .append(bankAccount);
        sb.append(",\"fax\":\"")
                .append(fax).append('\"');
        sb.append(",\"postCode\":")
                .append(postCode);
        sb.append(",\"legalMan\":\"")
                .append(legalMan).append('\"');
        sb.append(",\"description\":\"")
                .append(description).append('\"');
        sb.append('}');
        return sb.toString();
    }

    private BigDecimal phone;

    private String bank;

    private BigDecimal bankAccount;

    private String fax;

    private Long postCode;

    private String legalMan;

    private String description;

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

    public String getContactMan() {
        return contactMan;
    }

    public void setContactMan(String contactMan) {
        this.contactMan = contactMan == null ? null : contactMan.trim();
    }

    public BigDecimal getPhone() {
        return phone;
    }

    public void setPhone(BigDecimal phone) {
        this.phone = phone;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public BigDecimal getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BigDecimal bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public Long getPostCode() {
        return postCode;
    }

    public void setPostCode(Long postCode) {
        this.postCode = postCode;
    }

    public String getLegalMan() {
        return legalMan;
    }

    public void setLegalMan(String legalMan) {
        this.legalMan = legalMan == null ? null : legalMan.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

}