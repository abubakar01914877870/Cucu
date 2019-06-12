package lib.helperObject;

import lib.base.BaseUtil;

public class ServiceCompany extends BaseUtil {

    private BaseUtil base;

    public String serviceCompanyName;
    public String serviceCompanyAddress1;
    public String serviceCompanyCity;
    public String serviceCompanyState;
    public String serviceCompanyZipCode;

    public ServiceCompany(
            BaseUtil base,
            String serviceCompanyAddress1,
            String serviceCompanyCity,
            String serviceCompanyState,
            String serviceCompanyZipCode)
    {
        this.base = base;

        this.serviceCompanyName = "SC" + this.base.timeStamp;
        this.serviceCompanyAddress1 = serviceCompanyAddress1;
        this.serviceCompanyCity = serviceCompanyCity;
        this.serviceCompanyState = serviceCompanyState;
        this.serviceCompanyZipCode = serviceCompanyZipCode;
    }
}
