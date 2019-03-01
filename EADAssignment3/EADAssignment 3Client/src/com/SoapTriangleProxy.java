package com;

public class SoapTriangleProxy implements com.SoapTriangle {
  private String _endpoint = null;
  private com.SoapTriangle soapTriangle = null;
  
  public SoapTriangleProxy() {
    _initSoapTriangleProxy();
  }
  
  public SoapTriangleProxy(String endpoint) {
    _endpoint = endpoint;
    _initSoapTriangleProxy();
  }
  
  private void _initSoapTriangleProxy() {
    try {
      soapTriangle = (new com.SoapTriangleServiceLocator()).getSoapTriangle();
      if (soapTriangle != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)soapTriangle)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)soapTriangle)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (soapTriangle != null)
      ((javax.xml.rpc.Stub)soapTriangle)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.SoapTriangle getSoapTriangle() {
    if (soapTriangle == null)
      _initSoapTriangleProxy();
    return soapTriangle;
  }
  
  public double getArea(double side1, double side2, double side3) throws java.rmi.RemoteException{
    if (soapTriangle == null)
      _initSoapTriangleProxy();
    return soapTriangle.getArea(side1, side2, side3);
  }
  
  
}