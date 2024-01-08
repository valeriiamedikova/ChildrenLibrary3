package entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(LendingOfBook.class)
public abstract class LendingOfBook_ {

	public static volatile SingularAttribute<LendingOfBook, Date> date;
	public static volatile SingularAttribute<LendingOfBook, Date> dateReturn;
	public static volatile SingularAttribute<LendingOfBook, String> remark;
	public static volatile SingularAttribute<LendingOfBook, User> usersLogin;
	public static volatile SingularAttribute<LendingOfBook, Integer> id;
	public static volatile SingularAttribute<LendingOfBook, Book> bookId;

}

