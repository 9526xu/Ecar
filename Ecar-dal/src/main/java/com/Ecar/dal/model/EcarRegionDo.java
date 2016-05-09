package com.Ecar.dal.model;

/**
 * Created by xiaohei on 16/4/27.
 */
public class EcarRegionDo {
    private String regId;
    private String name;
    private String simpleName;
    private String pRegId;
    private Integer type;
    private String lon;
    private String lat;

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public String getpRegId() {
        return pRegId;
    }

    public void setpRegId(String pRegId) {
        this.pRegId = pRegId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EcarRegionDo that = (EcarRegionDo) o;

        if (regId != null ? !regId.equals(that.regId) : that.regId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (simpleName != null ? !simpleName.equals(that.simpleName) : that.simpleName != null) return false;
        if (pRegId != null ? !pRegId.equals(that.pRegId) : that.pRegId != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (lon != null ? !lon.equals(that.lon) : that.lon != null) return false;
        if (lat != null ? !lat.equals(that.lat) : that.lat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regId != null ? regId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (simpleName != null ? simpleName.hashCode() : 0);
        result = 31 * result + (pRegId != null ? pRegId.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (lon != null ? lon.hashCode() : 0);
        result = 31 * result + (lat != null ? lat.hashCode() : 0);
        return result;
    }
}
