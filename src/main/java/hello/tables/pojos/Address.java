/*
 * This file is generated by jOOQ.
 */
package hello.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Address implements Serializable {

    private static final long serialVersionUID = -2140249243;

    private Integer   addressId;
    private String    address;
    private String    address2;
    private String    district;
    private Short     cityId;
    private String    postalCode;
    private String    phone;
    private Timestamp lastUpdate;

    public Address() {}

    public Address(Address value) {
        this.addressId = value.addressId;
        this.address = value.address;
        this.address2 = value.address2;
        this.district = value.district;
        this.cityId = value.cityId;
        this.postalCode = value.postalCode;
        this.phone = value.phone;
        this.lastUpdate = value.lastUpdate;
    }

    public Address(
        Integer   addressId,
        String    address,
        String    address2,
        String    district,
        Short     cityId,
        String    postalCode,
        String    phone,
        Timestamp lastUpdate
    ) {
        this.addressId = addressId;
        this.address = address;
        this.address2 = address2;
        this.district = district;
        this.cityId = cityId;
        this.postalCode = postalCode;
        this.phone = phone;
        this.lastUpdate = lastUpdate;
    }

    public Integer getAddressId() {
        return this.addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return this.address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Short getCityId() {
        return this.cityId;
    }

    public void setCityId(Short cityId) {
        this.cityId = cityId;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Timestamp getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Address (");

        sb.append(addressId);
        sb.append(", ").append(address);
        sb.append(", ").append(address2);
        sb.append(", ").append(district);
        sb.append(", ").append(cityId);
        sb.append(", ").append(postalCode);
        sb.append(", ").append(phone);
        sb.append(", ").append(lastUpdate);

        sb.append(")");
        return sb.toString();
    }
}
