package OneToMany.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "author_info")
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "author_id", unique = true)
	private int aid;
	private String name;
	private int age;
	private String loc;
//	@OneToMany(mappedBy = "author")
//	private List<Books> books;

	public Author()
		{
			
		}

	public Author(String name, int age, String loc) {
			super();
//			this.pid = pid;
			this.name = name;
			this.age = age;
			this.loc = loc;
		}

	public int getPid() {
		return aid;
	}

	public void setPid(int pid) {
		this.aid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

//	public List<Author> getAuthor() {
//		return author;
//	}
//
//	public void setAuthor(List<Author> author) {
//		this.author = author;
//	}



}
