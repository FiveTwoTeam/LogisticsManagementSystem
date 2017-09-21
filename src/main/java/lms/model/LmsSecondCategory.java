package lms.model;

public class LmsSecondCategory {
    private Long id;

    private String name;

    private Long lmsFirstCategoryId;

    private String description;

    private LmsFirstCategory lmsFirstCategory;

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

    public Long getLmsFirstCategoryId() {
        return lmsFirstCategoryId;
    }

    public void setLmsFirstCategoryId(Long lmsFirstCategoryId) {
        this.lmsFirstCategoryId = lmsFirstCategoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public LmsFirstCategory getLmsFirstCategory() {
        return lmsFirstCategory;
    }

    public void setLmsFirstCategory(LmsFirstCategory lmsFirstCategory) {
        this.lmsFirstCategory = lmsFirstCategory;
    }

    @Override
    public String toString() {
        return "LmsSecondCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lmsFirstCategoryId=" + lmsFirstCategoryId +
                ", description='" + description + '\'' +
                ", lmsFirstCategory=" + lmsFirstCategory +
                '}';
    }
}