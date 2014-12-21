package jp.isakmp2spring.booklist.domain.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "BOOK_DATA")
public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "BOOK_ID", unique = true, nullable = false)
    private Integer bookId;

    @Column(name = "BOOK_NAME", nullable = false)
    private String bookName;
    
    @Column(name = "BOOK_Author", nullable = true)
    private String bookAuthor;
    
    @Column(name = "BOOK_PUBLISHER", nullable = true)
    private String bookPublisher;
    
    @Column(name = "BOOK_ISBN10", nullable = true)
    private Integer bookIsbn10;
    
    @Column(name = "BOOK_ISBN13", nullable = true)
    private Integer bookIsbn13;
    
    @Column(name = "BOOK_TERM", nullable = true)//false
    private Integer bookTerm;
    
    @Column(name = "BOOK_STARED", nullable = true)//false
    private Long bookStared;
    
	@Column(name = "BOOK_INSERTED_AT", nullable = true)//false
    @Temporal(TemporalType.TIMESTAMP)
    private Date bookInsrtedAt;
    
    @Column(name = "BOOK_UPDATED_AT", nullable = true)//false
    @Temporal(TemporalType.TIMESTAMP)
    private Date bookUpdatedAt;

    public Integer getBookTerm() {
		return bookTerm;
	}

	public void setBookTerm(Integer bookTerm) {
		this.bookTerm = bookTerm;
	}
	
	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public Integer getBookIsbn10() {
		return bookIsbn10;
	}

	public void setBookIsbn10(Integer bookIsbn10) {
		this.bookIsbn10 = bookIsbn10;
	}

	public Integer getBookIsbn13() {
		return bookIsbn13;
	}

	public void setBookIsbn13(Integer bookIsbn13) {
		this.bookIsbn13 = bookIsbn13;
	}

	public Date getBookInsrtedAt() {
		return bookInsrtedAt;
	}

	public void setBookInsrtedAt(Date bookInsrtedAt) {
		this.bookInsrtedAt = bookInsrtedAt;
	}

	public Date getBookUpdatedAt() {
		return bookUpdatedAt;
	}

	public void setBookUpdatedAt(Date bookUpdatedAt) {
		this.bookUpdatedAt = bookUpdatedAt;
	}
    
  
}
