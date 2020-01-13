package com.fh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("t_text")
public class Text {
    @TableId(value = "id", type = IdType.AUTO)
    private int id;
    private String name;
    private int sex;
    private Date shijian;
    private String img;
    private int aaaid;

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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getShijian() {
        return shijian;
    }

    public void setShijian(Date shijian) {
        this.shijian = shijian;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getAaaid() {
        return aaaid;
    }

    public void setAaaid(int aaaid) {
        this.aaaid = aaaid;
    }
}
