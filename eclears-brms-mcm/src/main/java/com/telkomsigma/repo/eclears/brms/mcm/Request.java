package com.telkomsigma.repo.eclears.brms.mcm;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Request implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Validation Name")
   private java.lang.String validationName;
   @org.kie.api.definition.type.Label(value = "Validation Status ")
   private java.lang.String status;

   public Request()
   {
   }

   public java.lang.String getValidationName()
   {
      return this.validationName;
   }

   public void setValidationName(java.lang.String validationName)
   {
      this.validationName = validationName;
   }

   public java.lang.String getStatus()
   {
      return this.status;
   }

   public void setStatus(java.lang.String status)
   {
      this.status = status;
   }

   public Request(java.lang.String validationName, java.lang.String status)
   {
      this.validationName = validationName;
      this.status = status;
   }

}