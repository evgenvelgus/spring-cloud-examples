package com.demo.account.domains;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Model class representing Facebook graph object AdAccount
 *
 * @author Prabhat
 * @see <a href="http://developers.facebook.com/docs/reference/ads-api/adaccount/">Ad Account @ Graph API documentation</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {
    /**
     * The string equivalent of ID with prefix act_
     */
    private String id;

    /**
     * The Id of the Ad Account
     */
    private long accountId;

    /**
     * Name of the account
     */
    private String name;

    /**
     * Status of the account<br/> 1 for active, 2 for disabled and 3 for
     * unsettled
     */
    private long accountStatus;

    /**
     * The currency used for the account
     */
    private String currency;

    /**
     * Id of the timeZone
     */
    private long timezoneId;

    /**
     * name for the timezone
     */
    private String timeZoneName;

    /**
     * This is reserved for future use
     */
    private String[] capabilities;

    /**
     * Denotes if this is a personal or business account.
     */
    private long isPersonal;

    /**
     * The name of the business
     */
    private String businessName;

    /**
     * The Street address of the Business
     */
    private String businessStreet;

    /**
     * The Street address of the Business (representin Line 2)
     */
    private String businessStreet2;
    /**
     * The city where the business runs
     */
    private String businessCity;
    /**
     * The state where the business runs
     */
    private String businessState;
    /**
     * The zipcode of the place where the business runs
     */
    private String businessZip;
    /**
     * The country code where business runs
     */
    private String businessCountryCode;

    /**
     * The status
     */
    private long taxIdStatus;

    /**
     * Age
     */
    private int age;

    /**
     * Gets age
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets age
     *
     * @param age age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets id
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets personal
     *
     * @return isPersonal
     */
    public long getPersonal() {
        return isPersonal;
    }

    /**
     * Sets personal
     *
     * @param personal personal
     */
    public void setPersonal(long personal) {
        isPersonal = personal;
    }

    /**
     * Gets account id
     *
     * @return account id
     */
    public long getAccountId() {
        return accountId;
    }

    /**
     * Sets account id
     *
     * @param accountId account id
     */
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    /**
     * Gets name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name
     *
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets account status
     *
     * @return account status
     */
    public long getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets account status
     *
     * @param accountStatus account status
     */
    public void setAccountStatus(long accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * Gets currency
     *
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets currency
     *
     * @param currency currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Gets timezone id
     *
     * @return timezone id
     */
    public long getTimezoneId() {
        return timezoneId;
    }

    /**
     * Sets timezone id
     *
     * @param timezoneId timezone id
     */
    public void setTimezoneId(long timezoneId) {
        this.timezoneId = timezoneId;
    }

    /**
     * Gets timezone name
     *
     * @return timezone name
     */
    public String getTimeZoneName() {
        return timeZoneName;
    }

    /**
     * Sets timezone name
     *
     * @param timeZoneName timezone name
     */
    public void setTimeZoneName(String timeZoneName) {
        this.timeZoneName = timeZoneName;
    }

    /**
     * Gets business name
     *
     * @return business name
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets business name
     *
     * @param businessName business name
     */
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    /**
     * Gets business street
     *
     * @return business street
     */
    public String getBusinessStreet() {
        return businessStreet;
    }

    /**
     * Sets business street
     *
     * @param businessStreet business street
     */
    public void setBusinessStreet(String businessStreet) {
        this.businessStreet = businessStreet;
    }

    /**
     * Gets business street 2
     *
     * @return business street 2
     */
    public String getBusinessStreet2() {
        return businessStreet2;
    }

    /**
     * Sets business street 2
     *
     * @param businessStreet2 business street 2
     */
    public void setBusinessStreet2(String businessStreet2) {
        this.businessStreet2 = businessStreet2;
    }

    /**
     * Gets business city
     *
     * @return business city
     */
    public String getBusinessCity() {
        return businessCity;
    }

    /**
     * Sets business city
     *
     * @param businessCity business city
     */
    public void setBusinessCity(String businessCity) {
        this.businessCity = businessCity;
    }

    /**
     * Gets business state
     *
     * @return business state
     */
    public String getBusinessState() {
        return businessState;
    }

    /**
     * Sets business state
     *
     * @param businessState business state
     */
    public void setBusinessState(String businessState) {
        this.businessState = businessState;
    }

    /**
     * Gets business zip
     *
     * @return business zip
     */
    public String getBusinessZip() {
        return businessZip;
    }

    /**
     * Sets business zip
     *
     * @param businessZip business zip
     */
    public void setBusinessZip(String businessZip) {
        this.businessZip = businessZip;
    }

    /**
     * Gets business country code
     *
     * @return business country code
     */
    public String getBusinessCountryCode() {
        return businessCountryCode;
    }

    /**
     * Sets business country code
     *
     * @param businessCountryCode business country code
     */
    public void setBusinessCountryCode(String businessCountryCode) {
        this.businessCountryCode = businessCountryCode;
    }

    public long getTaxIdStatus() {
        return taxIdStatus;
    }

    public void setTaxIdStatus(long taxIdStatus) {
        this.taxIdStatus = taxIdStatus;
    }

    /**
     * Gets capabilities
     *
     * @return capabilities
     */
    public String[] getCapabilities() {
        return capabilities;
    }

    /**
     * Sets capabilities
     *
     * @param capabilities capabilities
     */
    public void setCapabilities(String[] capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * Overrides toString function
     *
     * @return a string
     */
    @Override
    public String toString() {
        return "AdAccount{" +
                "id='" + id + '\'' +
                ", accountId=" + accountId +
                ", name='" + name + '\'' +
                ", accountStatus=" + accountStatus +
                ", currency='" + currency + '\'' +
                ", timezoneId=" + timezoneId +
                ", timeZoneName='" + timeZoneName + '\'' +
                ", businessName='" + businessName + '\'' +
                ", businessStreet='" + businessStreet + '\'' +
                ", businessStreet2='" + businessStreet2 + '\'' +
                ", businessCity='" + businessCity + '\'' +
                ", businessState='" + businessState + '\'' +
                ", businessZip='" + businessZip + '\'' +
                ", businessCountryCode='" + businessCountryCode + '\'' +
                ", vatStatus='" + taxIdStatus + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
