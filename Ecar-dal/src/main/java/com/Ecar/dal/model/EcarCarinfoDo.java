package com.Ecar.dal.model;

/**
 * Created by xiaohei on 16/4/27.
 */
public class EcarCarinfoDo {
    private String carId;
    private String name;
    private String brand;
    private String province;
    private String city;
    private String color;
    private Byte transferNum;
    private Integer age;
    private String otherInfo;
    private Byte upStatus;
    private Byte carStatus;
    private Long amount;

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Byte getTransferNum() {
        return transferNum;
    }

    public void setTransferNum(Byte transferNum) {
        this.transferNum = transferNum;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    public Byte getUpStatus() {
        return upStatus;
    }

    public void setUpStatus(Byte upStatus) {
        this.upStatus = upStatus;
    }

    public Byte getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(Byte carStatus) {
        this.carStatus = carStatus;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EcarCarinfoDo that = (EcarCarinfoDo) o;

        if (carId != null ? !carId.equals(that.carId) : that.carId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (brand != null ? !brand.equals(that.brand) : that.brand != null) return false;
        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (color != null ? !color.equals(that.color) : that.color != null) return false;
        if (transferNum != null ? !transferNum.equals(that.transferNum) : that.transferNum != null) return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        if (otherInfo != null ? !otherInfo.equals(that.otherInfo) : that.otherInfo != null) return false;
        if (upStatus != null ? !upStatus.equals(that.upStatus) : that.upStatus != null) return false;
        if (carStatus != null ? !carStatus.equals(that.carStatus) : that.carStatus != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = carId != null ? carId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (transferNum != null ? transferNum.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (otherInfo != null ? otherInfo.hashCode() : 0);
        result = 31 * result + (upStatus != null ? upStatus.hashCode() : 0);
        result = 31 * result + (carStatus != null ? carStatus.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }
}
