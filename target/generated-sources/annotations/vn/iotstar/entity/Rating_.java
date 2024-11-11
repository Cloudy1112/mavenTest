package vn.iotstar.entity;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Rating.class)
public abstract class Rating_ {

	public static final String BOOKS = "books";
	public static final String RATING = "rating";
	public static final String REVIEW_TEXT = "review_text";
	public static final String USERS = "users";

	
	/**
	 * @see vn.iotstar.entity.Rating#books
	 **/
	public static volatile SingularAttribute<Rating, Books> books;
	
	/**
	 * @see vn.iotstar.entity.Rating#rating
	 **/
	public static volatile SingularAttribute<Rating, Boolean> rating;
	
	/**
	 * @see vn.iotstar.entity.Rating#review_text
	 **/
	public static volatile SingularAttribute<Rating, String> review_text;
	
	/**
	 * @see vn.iotstar.entity.Rating
	 **/
	public static volatile EntityType<Rating> class_;
	
	/**
	 * @see vn.iotstar.entity.Rating#users
	 **/
	public static volatile SingularAttribute<Rating, Users> users;

}

