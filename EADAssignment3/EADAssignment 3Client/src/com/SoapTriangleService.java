/**
 * SoapTriangleService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public interface SoapTriangleService extends javax.xml.rpc.Service {
    public java.lang.String getSoapTriangleAddress();

    public com.SoapTriangle getSoapTriangle() throws javax.xml.rpc.ServiceException;

    public com.SoapTriangle getSoapTriangle(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
