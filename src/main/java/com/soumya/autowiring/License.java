package com.soumya.autowiring;

public class License {

    private int licenseId;

    @Override
    public String toString() {
        return "License{" +
                "licenseId=" + licenseId +
                '}';
    }

    public int getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(int licenseId) {
        this.licenseId = licenseId;
    }
}
