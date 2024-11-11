package vn.iotstar.entity;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="rating")

public class Rating implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
    @ManyToOne
    @JoinColumn(name = "userid", nullable = false)
    private Users users;

    @Id
    @ManyToOne
    @JoinColumn(name = "bookid", nullable = false)
    private Books books;

    private boolean rating;
    @Column(name = "review_text", columnDefinition = "TEXT")
    private String review_text;
	
}
