package com.sitech.myshop.common.domain;

import javax.persistence.*;

@Table(name = "shop..sys_user_info")
public class SysUserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    private Integer age;

    /**
     * 姓名
     */
    private String name;

    /**
     * 照片
     */
    private String pic;

    /**
     * 加密盐值
     */
    private String solt;

    private String sex;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取照片
     *
     * @return pic - 照片
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置照片
     *
     * @param pic 照片
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * 获取加密盐值
     *
     * @return solt - 加密盐值
     */
    public String getSolt() {
        return solt;
    }

    /**
     * 设置加密盐值
     *
     * @param solt 加密盐值
     */
    public void setSolt(String solt) {
        this.solt = solt;
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }
}