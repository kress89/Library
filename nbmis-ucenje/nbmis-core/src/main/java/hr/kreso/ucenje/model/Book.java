package hr.kreso.ucenje.model;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    private long bookId;
    private String title;
    private Integer categoryId;
    private Date publicationDate;
    private Integer copiesOwned;
    private StatusEnum statusEnum;
    private String description;

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Integer getCopiesOwned() {
        return copiesOwned;
    }

    public void setCopiesOwned(Integer copiesOwned) {
        this.copiesOwned = copiesOwned;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StatusEnum getStatusEnum() {
        return statusEnum;
    }

    public void setStatusEnum(StatusEnum statusEnum) {
        this.statusEnum = statusEnum;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", categoryId=" + categoryId +
                ", publicationDate=" + publicationDate +
                ", copiesOwned=" + copiesOwned +
                ", statusEnum=" + statusEnum +
                ", description='" + description + '\'' +
                '}';
    }
}
