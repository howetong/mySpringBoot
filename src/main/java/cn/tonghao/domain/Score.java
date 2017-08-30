package cn.tonghao.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by tonghao on 2017/8/30.
 */
@Entity
@Table(name="score")
public class Score implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, name="userId")
    private int userId;

    @Column(nullable = false)
    private float sc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public float getSc() {
        return sc;
    }

    public void setSc(float sc) {
        this.sc = sc;
    }
}
