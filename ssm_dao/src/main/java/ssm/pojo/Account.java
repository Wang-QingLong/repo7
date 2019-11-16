package ssm.pojo;

import java.util.Date;

/**
 * @version V1.0
 * @author: WangQingLong
 * @date: 2019/11/9 9:15
 * @description: ’Àªß¿‡
 */
public class Account {
    private  int id;
    private  String name;
    private  double money;
    private Date birthday;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", birthday=" + birthday +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Account() {
    }

    public Account(int id, String name, double money, Date birthday) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.birthday = birthday;
    }
}
