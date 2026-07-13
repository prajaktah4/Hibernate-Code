## HIBERNATE

Hibernate is a Java-based ORM (Object-Relational Mapping) framework that helps developers interact with a database using Java objects instead of writing complex SQL queries.

It automatically maps Java classes (objects) to database tables, and Java fields (variables) to table columns — making database operations like insert, update, delete, and fetch much easier.



**Full Form:

ORM = Object Relational Mapping
➡ It means converting Java objects into database rows and vice versa.



## Key Features of Hibernate:

1. ✅ ORM support – Maps Java objects to database tables automatically.


2. Automatic table generation – Hibernate can create tables based on your Java classes.


3.  HQL (Hibernate Query Language) – You can write database queries using Java-like syntax instead of SQL.


4.  Caching – Improves performance by storing frequently used data.


5.  Transaction management – Handles commit and rollback automatically.


6.  Database independence – Works with many databases (MySQL, Oracle, PostgreSQL, etc.).



## Why Use Hibernate?

No need to write repetitive SQL code.

Easy to switch between databases.

Reduces development time.

Automatically manages database relationships (one-to-one, one-to-many, etc.).


##Example:

Suppose you have a Java class:

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String course;
}

Hibernate will automatically map this class to a database table like:

students
-----------------------
id | name | course
-----------------------
1  | Prajakta | Java

And you can easily save an object using:

Session session = factory.openSession();
session.beginTransaction();
session.save(student);
session.getTransaction().commit();
session.close();

No need to write SQL like:

INSERT INTO students (name, course) VALUES ('Prajakta', 'Java');
