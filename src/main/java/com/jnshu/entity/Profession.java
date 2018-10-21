package com.jnshu.entity;

import javax.persistence.*;

public class Profession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ѧԱidͨ��ѧԱid��ѯ����ѧרҵ
     */
    @Column(name = "student_id")
    private Long studentId;

    /**
     * ͼƬ����
     */
    private String img;

    /**
     * ϡȱ�̶�
     */
    @Column(name = "need_degree")
    private Integer needDegree;

    private String introduce;

    /**
     * ѧϰ����0��ǰ�˿�������1:��˷���2����ά����
     */
    private Byte direction;

    /**
     * ְҵ����
     */
    private String job;

    /**
     * ��ѧ�ż�0��һ�ǣ�2�ǣ����5��
     */
    private Byte door;

    /**
     * 0��1��,1:����
     */
    private Byte difficulty;

    /**
     * �ɳ�����
     */
    private String growth;

    /**
     * ��������
     */
    private Integer years;

    /**
     * нˮ
     */
    private Integer salary;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "create_at")
    private Long createAt;

    @Column(name = "update_by")
    private String updateBy;

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
     * ��ȡѧԱidͨ��ѧԱid��ѯ����ѧרҵ
     *
     * @return student_id - ѧԱidͨ��ѧԱid��ѯ����ѧרҵ
     */
    public Long getStudentId() {
        return studentId;
    }

    /**
     * ����ѧԱidͨ��ѧԱid��ѯ����ѧרҵ
     *
     * @param studentId ѧԱidͨ��ѧԱid��ѯ����ѧרҵ
     */
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    /**
     * ��ȡͼƬ����
     *
     * @return img - ͼƬ����
     */
    public String getImg() {
        return img;
    }

    /**
     * ����ͼƬ����
     *
     * @param img ͼƬ����
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * ��ȡϡȱ�̶�
     *
     * @return need_degree - ϡȱ�̶�
     */
    public Integer getNeedDegree() {
        return needDegree;
    }

    /**
     * ����ϡȱ�̶�
     *
     * @param needDegree ϡȱ�̶�
     */
    public void setNeedDegree(Integer needDegree) {
        this.needDegree = needDegree;
    }

    /**
     * @return introduce
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     * @param introduce
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    /**
     * ��ȡѧϰ����0��ǰ�˿�������1:��˷���2����ά����
     *
     * @return direction - ѧϰ����0��ǰ�˿�������1:��˷���2����ά����
     */
    public Byte getDirection() {
        return direction;
    }

    /**
     * ����ѧϰ����0��ǰ�˿�������1:��˷���2����ά����
     *
     * @param direction ѧϰ����0��ǰ�˿�������1:��˷���2����ά����
     */
    public void setDirection(Byte direction) {
        this.direction = direction;
    }

    /**
     * ��ȡְҵ����
     *
     * @return job - ְҵ����
     */
    public String getJob() {
        return job;
    }

    /**
     * ����ְҵ����
     *
     * @param job ְҵ����
     */
    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    /**
     * ��ȡ��ѧ�ż�0��һ�ǣ�2�ǣ����5��
     *
     * @return door - ��ѧ�ż�0��һ�ǣ�2�ǣ����5��
     */
    public Byte getDoor() {
        return door;
    }

    /**
     * ������ѧ�ż�0��һ�ǣ�2�ǣ����5��
     *
     * @param door ��ѧ�ż�0��һ�ǣ�2�ǣ����5��
     */
    public void setDoor(Byte door) {
        this.door = door;
    }

    /**
     * ��ȡ0��1��,1:����
     *
     * @return difficulty - 0��1��,1:����
     */
    public Byte getDifficulty() {
        return difficulty;
    }

    /**
     * ����0��1��,1:����
     *
     * @param difficulty 0��1��,1:����
     */
    public void setDifficulty(Byte difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * ��ȡ�ɳ�����
     *
     * @return growth - �ɳ�����
     */
    public String getGrowth() {
        return growth;
    }

    /**
     * ���óɳ�����
     *
     * @param growth �ɳ�����
     */
    public void setGrowth(String growth) {
        this.growth = growth == null ? null : growth.trim();
    }

    /**
     * ��ȡ��������
     *
     * @return years - ��������
     */
    public Integer getYears() {
        return years;
    }

    /**
     * ���ù�������
     *
     * @param years ��������
     */
    public void setYears(Integer years) {
        this.years = years;
    }

    /**
     * ��ȡнˮ
     *
     * @return salary - нˮ
     */
    public Integer getSalary() {
        return salary;
    }

    /**
     * ����нˮ
     *
     * @param salary нˮ
     */
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    /**
     * @return create_by
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * @return create_at
     */
    public Long getCreateAt() {
        return createAt;
    }

    /**
     * @param createAt
     */
    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    /**
     * @return update_by
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * @param updateBy
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * @return update_at
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    /**
     * @param updateAt
     */
    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }
}