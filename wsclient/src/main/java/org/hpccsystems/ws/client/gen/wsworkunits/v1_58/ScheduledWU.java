/**
 * ScheduledWU.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_58;

public class ScheduledWU  implements java.io.Serializable {
    private java.lang.String wuid;

    private java.lang.String cluster;

    private java.lang.String eventName;

    private java.lang.String eventText;

    private java.lang.String jobName;

    private java.lang.Integer stateID;

    private java.lang.String state;

    private java.lang.String owner;

    public ScheduledWU() {
    }

    public ScheduledWU(
           java.lang.String wuid,
           java.lang.String cluster,
           java.lang.String eventName,
           java.lang.String eventText,
           java.lang.String jobName,
           java.lang.Integer stateID,
           java.lang.String state,
           java.lang.String owner) {
           this.wuid = wuid;
           this.cluster = cluster;
           this.eventName = eventName;
           this.eventText = eventText;
           this.jobName = jobName;
           this.stateID = stateID;
           this.state = state;
           this.owner = owner;
    }


    /**
     * Gets the wuid value for this ScheduledWU.
     * 
     * @return wuid
     */
    public java.lang.String getWuid() {
        return wuid;
    }


    /**
     * Sets the wuid value for this ScheduledWU.
     * 
     * @param wuid
     */
    public void setWuid(java.lang.String wuid) {
        this.wuid = wuid;
    }


    /**
     * Gets the cluster value for this ScheduledWU.
     * 
     * @return cluster
     */
    public java.lang.String getCluster() {
        return cluster;
    }


    /**
     * Sets the cluster value for this ScheduledWU.
     * 
     * @param cluster
     */
    public void setCluster(java.lang.String cluster) {
        this.cluster = cluster;
    }


    /**
     * Gets the eventName value for this ScheduledWU.
     * 
     * @return eventName
     */
    public java.lang.String getEventName() {
        return eventName;
    }


    /**
     * Sets the eventName value for this ScheduledWU.
     * 
     * @param eventName
     */
    public void setEventName(java.lang.String eventName) {
        this.eventName = eventName;
    }


    /**
     * Gets the eventText value for this ScheduledWU.
     * 
     * @return eventText
     */
    public java.lang.String getEventText() {
        return eventText;
    }


    /**
     * Sets the eventText value for this ScheduledWU.
     * 
     * @param eventText
     */
    public void setEventText(java.lang.String eventText) {
        this.eventText = eventText;
    }


    /**
     * Gets the jobName value for this ScheduledWU.
     * 
     * @return jobName
     */
    public java.lang.String getJobName() {
        return jobName;
    }


    /**
     * Sets the jobName value for this ScheduledWU.
     * 
     * @param jobName
     */
    public void setJobName(java.lang.String jobName) {
        this.jobName = jobName;
    }


    /**
     * Gets the stateID value for this ScheduledWU.
     * 
     * @return stateID
     */
    public java.lang.Integer getStateID() {
        return stateID;
    }


    /**
     * Sets the stateID value for this ScheduledWU.
     * 
     * @param stateID
     */
    public void setStateID(java.lang.Integer stateID) {
        this.stateID = stateID;
    }


    /**
     * Gets the state value for this ScheduledWU.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this ScheduledWU.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the owner value for this ScheduledWU.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this ScheduledWU.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduledWU)) return false;
        ScheduledWU other = (ScheduledWU) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wuid==null && other.getWuid()==null) || 
             (this.wuid!=null &&
              this.wuid.equals(other.getWuid()))) &&
            ((this.cluster==null && other.getCluster()==null) || 
             (this.cluster!=null &&
              this.cluster.equals(other.getCluster()))) &&
            ((this.eventName==null && other.getEventName()==null) || 
             (this.eventName!=null &&
              this.eventName.equals(other.getEventName()))) &&
            ((this.eventText==null && other.getEventText()==null) || 
             (this.eventText!=null &&
              this.eventText.equals(other.getEventText()))) &&
            ((this.jobName==null && other.getJobName()==null) || 
             (this.jobName!=null &&
              this.jobName.equals(other.getJobName()))) &&
            ((this.stateID==null && other.getStateID()==null) || 
             (this.stateID!=null &&
              this.stateID.equals(other.getStateID()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getWuid() != null) {
            _hashCode += getWuid().hashCode();
        }
        if (getCluster() != null) {
            _hashCode += getCluster().hashCode();
        }
        if (getEventName() != null) {
            _hashCode += getEventName().hashCode();
        }
        if (getEventText() != null) {
            _hashCode += getEventText().hashCode();
        }
        if (getJobName() != null) {
            _hashCode += getJobName().hashCode();
        }
        if (getStateID() != null) {
            _hashCode += getStateID().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduledWU.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ScheduledWU"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Cluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EventName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EventText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "JobName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "StateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
