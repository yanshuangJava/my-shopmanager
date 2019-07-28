package com.sitech.myshopcommondomain;

import javax.persistence.*;

@Table(name = "sys_user_info")
public class SysUserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * �û���
     */
    private String username;

    /**
     * ����
     */
    private String password;

    /**
     * ����
     */
    private String name;

    /**
     * ��Ƭ
     */
    private String pic;

    /**
     * ������ֵ
     */
    private String solt;

    /**
     * �ձ�
     */
    private Integer sex;

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
     * ��ȡ�û���
     *
     * @return username - �û���
     */
    public String getUsername() {
        return username;
    }

    /**
     * �����û���
     *
     * @param username �û���
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * ��ȡ����
     *
     * @return password - ����
     */
    public String getPassword() {
        return password;
    }

    /**
     * ��������
     *
     * @param password ����
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * ��ȡ����
     *
     * @return name - ����
     */
    public String getName() {
        return name;
    }

    /**
     * ��������
     *
     * @param name ����
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ��Ƭ
     *
     * @return pic - ��Ƭ
     */
    public String getPic() {
        return pic;
    }

    /**
     * ������Ƭ
     *
     * @param pic ��Ƭ
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * ��ȡ������ֵ
     *
     * @return solt - ������ֵ
     */
    public String getSolt() {
        return solt;
    }

    /**
     * ���ü�����ֵ
     *
     * @param solt ������ֵ
     */
    public void setSolt(String solt) {
        this.solt = solt;
    }

    /**
     * ��ȡ�ձ�
     *
     * @return sex - �ձ�
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * �����ձ�
     *
     * @param sex �ձ�
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }
}