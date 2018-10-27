package bootserv.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by sultan on 2018/4/3.
 */
@Entity
@Table(name = "girl")
public class Girl implements Serializable {



    /**
     *
     */
    private static final long serialVersionUID = -4258005292424446961L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Integer age;
    @Column(name = "cup_size")
    private String cupSize;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }


}
