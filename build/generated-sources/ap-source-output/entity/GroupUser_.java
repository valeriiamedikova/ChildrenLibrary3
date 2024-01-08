package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(GroupUser.class)
public abstract class GroupUser_ {

	public static volatile SingularAttribute<GroupUser, User> userLogin;
	public static volatile SingularAttribute<GroupUser, String> name;
	public static volatile SingularAttribute<GroupUser, Integer> id;
	public static volatile CollectionAttribute<GroupUser, Book> bookCollection;

}

