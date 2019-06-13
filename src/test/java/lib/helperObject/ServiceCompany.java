package lib.helperObject;

import lib.base.BaseUtil;

public class ServiceCompany extends BaseUtil {

    private BaseUtil base;

    public String numberOfproviders;
    public String name;
    public String address1;
    public String city;
    public String state;
    public String zipCode;

    public ServiceCompany(
            BaseUtil base,
            String numberOfproviders,
            String serviceCompanyAddress1,
            String serviceCompanyCity,
            String serviceCompanyState,
            String serviceCompanyZipCode)
    {
        this.base = base;

        this.numberOfproviders = numberOfproviders;
        this.name = "SC" + this.base.timeStamp;
        this.address1 = serviceCompanyAddress1;
        this.city = serviceCompanyCity;
        this.state = serviceCompanyState;
        this.zipCode = serviceCompanyZipCode;
    }
}
