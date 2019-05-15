package entity;


import javax.persistence.*;

@Entity
@Table
public class UserTable {

//    1 вариант
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int id;

    // 2 вариант
//    @Id
//    @TableGenerator(
//            name="tgenerator",
//            allocationSize = 1,
//            initialValue = 1
//    )
//    @GeneratedValue(strategy = GenerationType.TABLE, generator = "tgenerator")
//    private int id;

    // 3 вариант
    @Id
    @SequenceGenerator(name = "sgenerator", allocationSize =  1, initialValue = 1)
    @GeneratedValue(strategy =  GenerationType.SEQUENCE, generator = "sgenerator")
    private int id;


    private String login;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


}
