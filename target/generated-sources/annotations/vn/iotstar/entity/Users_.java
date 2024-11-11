package vn.iotstar.entity;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.sql.Date;

@StaticMetamodel(Users.class)
public abstract class Users_ {

	public static final String IS_ADMIN = "is_admin";
	public static final String SIGNUP_DATE = "signup_date";
	public static final String PHONE = "Phone";
	public static final String LAST_LOGIN = "last_login";
	public static final String RATINGS = "ratings";
	public static final String FULLNAME = "fullname";
	public static final String USERID = "userid";
	public static final String EMAIL = "email";

	
	/**
	 * @see vn.iotstar.entity.Users#is_admin
	 **/
	public static volatile SingularAttribute<Users, Boolean> is_admin;
	
	/**
	 * @see vn.iotstar.entity.Users#signup_date
	 **/
	public static volatile SingularAttribute<Users, Date> signup_date;
	
	/**
	 * @see vn.iotstar.entity.Users#Phone
	 **/
	public static volatile SingularAttribute<Users, Integer> Phone;
	
	/**
	 * @see vn.iotstar.entity.Users#last_login
	 **/
	public static volatile SingularAttribute<Users, Date> last_login;
	
	/**
	 * @see vn.iotstar.entity.Users#ratings
	 **/
	public static volatile ListAttribute<Users, Rating> ratings;
	
	/**
	 * @see vn.iotstar.entity.Users#fullname
	 **/
	public static volatile SingularAttribute<Users, String> fullname;
	
	/**
	 * @see vn.iotstar.entity.Users
	 **/
	public static volatile EntityType<Users> class_;
	
	/**
	 * @see vn.iotstar.entity.Users#userid
	 **/
	public static volatile SingularAttribute<Users, Integer> userid;
	
	/**
	 * @see vn.iotstar.entity.Users#email
	 **/
	public static volatile SingularAttribute<Users, String> email;

}

