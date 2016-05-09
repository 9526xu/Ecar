package com.Ecar.dal.model;

/**
 * Created by xiaohei on 16/4/27.
 */
public class EcarCarInfoPicDo {
    private String picId;
    private String carId;
    private String picUrl;

    public String getPicId() {
        return picId;
    }

    public void setPicId(String picId) {
        this.picId = picId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EcarCarInfoPicDo that = (EcarCarInfoPicDo) o;

        if (picId != null ? !picId.equals(that.picId) : that.picId != null) return false;
        if (carId != null ? !carId.equals(that.carId) : that.carId != null) return false;
        if (picUrl != null ? !picUrl.equals(that.picUrl) : that.picUrl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = picId != null ? picId.hashCode() : 0;
        result = 31 * result + (carId != null ? carId.hashCode() : 0);
        result = 31 * result + (picUrl != null ? picUrl.hashCode() : 0);
        return result;
    }
}
