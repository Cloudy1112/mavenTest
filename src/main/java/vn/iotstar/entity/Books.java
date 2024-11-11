package vn.iotstar.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "books")
public class Books implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bookid")
	private int bookid;
	
	private int isbn;
	
	@Column(name = "title", length = 200)
    private String title;
	
	@Column(name = "publisher", length = 100)
    private String publisher;
	
	@Column(name = "price", precision = 6, scale = 2)
    private BigDecimal price;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    private Date publishDate;

    @Column(name = "cover_image", length = 100)
    private String coverImage;

    private Integer quantity;
	
    //Joincolumn se la cot luu khoa ngoai cua book_author 
    //tham chieu den books
    //inversecolumn xac dinh cot trong bang trung gian luu khoa ngoai
    // tham chieu den author
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name ="book_author", 
    joinColumns =@JoinColumn(name= "bookid", nullable=false),
    inverseJoinColumns = @JoinColumn(name ="authorid", nullable=false))
    private List<Author> authors; //Day la danh sach cac author lien quan den book
    							  // Moi book se co author tuong ung	
    
    @OneToMany(mappedBy = "books")
    private List<Rating> ratings;
	
	
}
