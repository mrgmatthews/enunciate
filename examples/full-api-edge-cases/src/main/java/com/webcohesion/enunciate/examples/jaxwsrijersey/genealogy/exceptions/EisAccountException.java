package com.webcohesion.enunciate.examples.jaxwsrijersey.genealogy.exceptions;

import javax.xml.ws.WebFault;

@WebFault ( faultBean = "com.webcohesion.enunciate.samples.genealogy.exceptions.EisFault" )
public class EisAccountException extends EisExceptionBase {

  private static final long serialVersionUID = 6609084036637969280L;
  private EisFault faultInfo;


  public EisAccountException(String message, EisFault faultInfo, Throwable cause) {
    super(message, cause);
    this.faultInfo = faultInfo;
  }


  public EisAccountException(String message, EisFault faultInfo) {
    super(message);
    this.faultInfo = faultInfo;
  }


  public EisFault getFaultInfo() {
    return faultInfo;
  }

}