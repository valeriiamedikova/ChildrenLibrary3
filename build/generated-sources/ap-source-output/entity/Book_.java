package entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Book.class)
public abstract class Book_ {

	public static volatile SingularAttribute<Book, Date> date;
	public static volatile CollectionAttribute<Book, GroupUser> groupUserCollection;
	public static volatile SingularAttribute<Book, String> author;
	public static volatile SingularAttribute<Book, String> remark;
	public static volatile SingularAttribute<Book, Integer> id;
	public static volatile SingularAttribute<Book, String> title;
	public static volatile SingularAttribute<Book, Integer> releaseYear;
	public static volatile CollectionAttribute<Book, LendingOfBook> lendingOfBookCollection;

}

