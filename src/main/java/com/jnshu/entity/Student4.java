package com.jnshu.entity;

import javax.persistence.*;

public class Student4 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ѧԱ����
     */
    @Id
    private String name;

    @Column(name = "profession_id")
    private Long professionId;

    /**
     * ״̬��0����ѧ,1:��ҵ
     */
    private Boolean state;

    /**
     * ͷ��ͼƬurl
     */
    private String img;

    /**
     * ְλ1:��ҵCEO,2:�������ʣ�3���߼�����ʦ��4���������ܣ�5�������ܼ�
     */
    private String position;

    /**
     * нˮ
     */
    private String salary;

    /**
     * ��ҵʱ��
     */
    @Column(name = "graduate_at")
    private Long graduateAt;

    /**
     * ��������
     */
    private String resume;

    /**
     * ������
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * ����ʱ��
     */
    @Column(name = "create_at")
    private Long createAt;

    /**
     * ������
     */
    @Column(name = "update_by")
    private String updateBy;

    /**
     * ����ʱ��
     */
    @Column(name = "update_at")
    private Long updateAt;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * ��ȡѧԱ����
     *
     * @return name - ѧԱ����
     */
    public String getName() {
        return name;
    }

    /**
     * ����ѧԱ����
     *
     * @param name ѧԱ����
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return profession_id
     */
    public Long getProfessionId() {
        return professionId;
    }

    /**
     * @param professionId
     */
    public void setProfessionId(Long professionId) {
        this.professionId = professionId;
    }

    /**
     * ��ȡ״̬��0����ѧ,1:��ҵ
     *
     * @return state - ״̬��0����ѧ,1:��ҵ
     */
    public Boolean getState() {
        return state;
    }

    /**
     * ����״̬��0����ѧ,1:��ҵ
     *
     * @param state ״̬��0����ѧ,1:��ҵ
     */
    public void setState(Boolean state) {
        this.state = state;
    }

    /**
     * ��ȡͷ��ͼƬurl
     *
     * @return img - ͷ��ͼƬurl
     */
    public String getImg() {
        return img;
    }

    /**
     * ����ͷ��ͼƬurl
     *
     * @param img ͷ��ͼƬurl
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * ��ȡְλ1:��ҵCEO,2:�������ʣ�3���߼�����ʦ��4���������ܣ�5�������ܼ�
     *
     * @return position - ְλ1:��ҵCEO,2:�������ʣ�3���߼�����ʦ��4���������ܣ�5�������ܼ�
     */
    public String getPosition() {
        return position;
    }

    /**
     * ����ְλ1:��ҵCEO,2:�������ʣ�3���߼�����ʦ��4���������ܣ�5�������ܼ�
     *
     * @param position ְλ1:��ҵCEO,2:�������ʣ�3���߼�����ʦ��4���������ܣ�5�������ܼ�
     */
    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    /**
     * ��ȡнˮ
     *
     * @return salary - нˮ
     */
    public String getSalary() {
        return salary;
    }

    /**
     * ����нˮ
     *
     * @param salary нˮ
     */
    public void setSalary(String salary) {
        this.salary = salary == null ? null : salary.trim();
    }

    /**
     * ��ȡ��ҵʱ��
     *
     * @return graduate_at - ��ҵʱ��
     */
    public Long getGraduateAt() {
        return graduateAt;
    }

    /**
     * ���ñ�ҵʱ��
     *
     * @param graduateAt ��ҵʱ��
     */
    public void setGraduateAt(Long graduateAt) {
        this.graduateAt = graduateAt;
    }

    /**
     * ��ȡ��������
     *
     * @return resume - ��������
     */
    public String getResume() {
        return resume;
    }

    /**
     * ���ø�������
     *
     * @param resume ��������
     */
    public void setResume(String resume) {
        this.resume = resume == null ? null : resume.trim();
    }

    /**
     * ��ȡ������
     *
     * @return create_by - ������
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * ���ô�����
     *
     * @param createBy ������
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return create_at - ����ʱ��
     */
    public Long getCreateAt() {
        return createAt;
    }

    /**
     * ���ô���ʱ��
     *
     * @param createAt ����ʱ��
     */
    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    /**
     * ��ȡ������
     *
     * @return update_by - ������
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * ���ø�����
     *
     * @param updateBy ������
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return update_at - ����ʱ��
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    /**
     * ���ø���ʱ��
     *
     * @param updateAt ����ʱ��
     */
    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }
}