package lib.helperObject;

import lib.base.BaseUtil;

public class Provider extends BaseUtil{

    public String first_name;
    public String last_name;
    public String phone;
    public String email;
    public String password;
    public String Which_best_describes_your_business_needs;
    public String Number_of_service_providers;
    public String Primary_type_of_work;
    public String Zip_Code;
    public String Country;

    public Provider() {
    }

    //For sign up form one
    public Provider(String first_name,
                    String last_name,
                    String phone,
                    String email,
                    String password,
                    String which_best_describes_your_business_needs)
    {
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone = phone;
        this.email = email;
        this.password = password;
        Which_best_describes_your_business_needs = which_best_describes_your_business_needs;

        //Set provider email address
        if(email.equals("email")){
            this.email="provider" + getTimeStamp() +"@yopmail.com";
        }
    }

    //For sign up form two
    public Provider(
            String number_of_service_providers,
            String primary_type_of_work,
            String zip_Code,
            String country) {
        Number_of_service_providers = number_of_service_providers;
        Primary_type_of_work = primary_type_of_work;
        Zip_Code = zip_Code;
        Country = country;
    }

    //Foe from Sign Up form both
    public Provider(String first_name,
                    String last_name,
                    String phone,
                    String email,
                    String password,
                    String which_best_describes_your_business_needs,
                    String Number_of_service_providers,
                    String Primary_type_of_work,
                    String Zip_Code,
                    String Country )
    {
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone = phone;
       // this.email = email;
        this.password = password;
        this.Which_best_describes_your_business_needs = which_best_describes_your_business_needs;
        this.Number_of_service_providers=Number_of_service_providers;
        this.Primary_type_of_work=Primary_type_of_work;
        this.Zip_Code=Zip_Code;
        this.Country=Country;

        //Set provider email address
        if(email.equals("email")){
            this.email="provider" + getTimeStamp() +"@yopmail.com";
        }
    }




}
