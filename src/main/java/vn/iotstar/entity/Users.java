package vn.iotstar.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="users")
public class Users implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int userid;
	
	private String email;
	
	@Column(name = "fullname", columnDefinition = "nvarchar(50)")
	private String fullname;
	
	private int Phone;
	@Column(name = "passwd", columnDefinition = "varchar(32)")
	private Date signup_date;
	private Date last_login;
	private Boolean is_admin;
	
	@OneToMany(mappedBy = "users")
	private List<Rating> ratings;
	
	
}
