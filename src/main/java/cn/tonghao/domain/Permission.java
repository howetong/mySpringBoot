package cn.tonghao.domain;

import javax.persistence.*;

/**
 * Created by tonghao on 2017/9/1.
 */
@Entity
@Table(name = "t_permission")
public class Permission {

    @Id
    @GeneratedValue
    private Integer id;

    private String permissionname;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;// 一个权限对应一个角色

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionname() {
        return permissionname;
    }

    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
