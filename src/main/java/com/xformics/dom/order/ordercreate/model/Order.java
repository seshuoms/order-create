package com.xformics.dom.order.ordercreate.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Order {
    @JsonProperty("Order")
    private OrderDetails orderDetails;
}

@Data
class OrderDetails {
    @JsonProperty("OrderLines")
    private OrderLines orderLines;

    @JsonProperty("PersonInfoBillTo")
    private BillingInfo billingInfo;

    @JsonProperty("CustomerEMailID")
    private String CustomerEMailID;

    @JsonProperty("DocumentType")
    private String DocumentType;

    @JsonProperty("EnterpriseCode")
    private String EnterpriseCode;

    @JsonProperty("PaymentStatus")
    private String PaymentStatus;

    @JsonProperty("OrderDate")
    private String OrderDate;

    @JsonProperty("OrderNo")
    private String OrderNo;

    @JsonProperty("EntryType")
    private String EntryType;

    @JsonProperty("AllocationRuleID")
    private String AllocationRuleID;
}

@Data
class OrderLines {
    @JsonProperty("OrderLine")
    private OrderLine orderLine;

    @JsonProperty("PersonInfoShipTo")
    private ShippingInfo shippingInfo;
}

@Data
class OrderLine {
    @JsonProperty("Item")
    private Item item;

    @JsonProperty("LinePriceInfo")
    private PriceInfo priceInfo;

    @JsonProperty("PersonInfoShipTo")
    private ShippingInfo shippingInfo;

    @JsonProperty("OrderedQty")
    private String OrderedQty;

    @JsonProperty("PrimeLineNo")
    private String PrimeLineNo;

    @JsonProperty("SubLineNo")
    private String SubLineNo;

    @JsonProperty("ReqDeliveryDate")
    private String ReqDeliveryDate;

    @JsonProperty("ShipNode")
    private String ShipNode;

    @JsonProperty("CarrierServiceCode")
    private String CarrierServiceCode;

    @JsonProperty("ReservationID")
    private String ReservationID;

    @JsonProperty("FulfillmentType")
    private String FulfillmentType;

    @JsonProperty("LineType")
    private String LineType;
}

@Data
class Item {
    @JsonProperty("ItemID")
    private String ItemID;

    @JsonProperty("UnitOfMeasure")
    private String UnitOfMeasure;

    @JsonProperty("ProductClass")
    private String ProductClass;

    @JsonProperty("ItemDesc")
    private String ItemDesc;
}

@Data
class PriceInfo {
    @JsonProperty("UnitPrice")
    private String UnitPrice;

    @JsonProperty("IsPriceLocked")
    private String IsPriceLocked;
}

@Data
class ShippingInfo {
    @JsonProperty("AddressLine1")
    private String AddressLine1;

    @JsonProperty("AddressLine2")
    private String AddressLine2;

    @JsonProperty("City")
    private String City;

    @JsonProperty("Country")
    private String Country;

    @JsonProperty("EMailID")
    private String EMailID;

    @JsonProperty("FirstName")
    private String FirstName;

    @JsonProperty("LastName")
    private String LastName;

    @JsonProperty("MobilePhone")
    private String MobilePhone;

    @JsonProperty("State")
    private String State;

    @JsonProperty("ZipCode")
    private String ZipCode;
}

@Data
class BillingInfo {
    @JsonProperty("Country")
    private String Country;
}

