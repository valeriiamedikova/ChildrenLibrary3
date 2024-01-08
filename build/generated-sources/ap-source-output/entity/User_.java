package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ {

	public static volatile CollectionAttribute<User, GroupUser> groupUserCollection;
	public static volatile SingularAttribute<User, String> pass;
	public static volatile SingularAttribute<User, String> login;
	public static volatile CollectionAttribute<User, LendingOfBook> lendingOfBookCollection;

}

