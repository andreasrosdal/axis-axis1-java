/*
 * The Apache Software License, Version 1.1
 *
 *
 * Copyright (c) 2001 The Apache Software Foundation.  All rights 
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer. 
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution,
 *    if any, must include the following acknowledgment:  
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowledgment may appear in the software itself,
 *    if and wherever such third-party acknowledgments normally appear.
 *
 * 4. The names "Axis" and "Apache Software Foundation" must
 *    not be used to endorse or promote products derived from this
 *    software without prior written permission. For written 
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache",
 *    nor may "Apache" appear in their name, without prior written
 *    permission of the Apache Software Foundation.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 */

package org.apache.axis;

public class Constants {
  // Some common Constants that should be used in local handler options
  // (Not all implementations will have these concepts - for example
  //  not all Engines will have notion of registries but defining these
  //  here should allow people to ask if they exist)
  //////////////////////////////////////////////////////////////////////////

  // Envelope Stuff
  //////////////////////////////////////////////////////////////////////////
  public static String NSPREFIX_SOAP_ENV   = "SOAP-ENV" ;
  public static String NSPREFIX_SOAP_ENC   = "SOAP-ENC" ;
  public static String NSPREFIX_SCHEMA_XSI = "xsi" ;
  public static String NSPREFIX_SCHEMA_XSD = "xsd" ;


  public static String AXIS_NS = "http://xml.apache.org/axis/";
  public static String URI_SOAP_ENV =
                               "http://schemas.xmlsoap.org/soap/envelope/" ;
  public static String URI_SOAP_ENC =
                               "http://schemas.xmlsoap.org/soap/encoding/" ;
  public static String URI_NEXT_ACTOR = 
                               "http://schemas.xmlsoap.org/soap/actor/next" ;

  public static String NS_URI_XMLNS = 
                               "http://www.w3.org/2000/xmlns/";
  
  // Schema namespaces
  public static final String URI_1999_SCHEMA_XSI =
    "http://www.w3.org/1999/XMLSchema-instance";
  public static final String URI_1999_SCHEMA_XSD =
    "http://www.w3.org/1999/XMLSchema";
  public static final String URI_2000_SCHEMA_XSI =
    "http://www.w3.org/2000/10/XMLSchema-instance";
  public static final String URI_2000_SCHEMA_XSD =
    "http://www.w3.org/2000/10/XMLSchema";
  public static final String URI_2001_SCHEMA_XSI =
    "http://www.w3.org/2001/XMLSchema-instance";
  public static final String URI_2001_SCHEMA_XSD =
    "http://www.w3.org/2001/XMLSchema";
  public static final String URI_CURRENT_SCHEMA_XSI = URI_2001_SCHEMA_XSI;
  public static final String URI_CURRENT_SCHEMA_XSD = URI_2001_SCHEMA_XSD;
  
  public static final String[] URIS_SCHEMA_XSI = {
    URI_1999_SCHEMA_XSI,
    URI_2000_SCHEMA_XSI,
    URI_2001_SCHEMA_XSI,
  };
  
  public static final String[] URIS_SCHEMA_XSD = {
    URI_1999_SCHEMA_XSD,
    URI_2000_SCHEMA_XSD,
    URI_2001_SCHEMA_XSD,
  };

  public static String ELEM_ENVELOPE = "Envelope" ;
  public static String ELEM_HEADER   = "Header" ;
  public static String ELEM_BODY     = "Body" ;
  public static String ELEM_FAULT    = "Fault" ;

  public static String ELEM_FAULT_CODE   = "faultcode" ;
  public static String ELEM_FAULT_STRING = "faultstring" ;
  public static String ELEM_FAULT_DETAIL = "detail" ;
  public static String ELEM_FAULT_ACTOR  = "faultactor" ;

  public static String ATTR_MUST_UNDERSTAND = "mustUnderstand" ;
  public static String ATTR_ENCODING_STYLE  = "encodingStyle" ;
  public static String ATTR_ACTOR           = "actor" ;
  public static String ATTR_ROOT            = "root" ;
  public static String ATTR_ID              = "id" ;
  public static String ATTR_HREF            = "href" ;
  public static final String ATTR_ARRAY_TYPE = "arrayType";

  // Fault Codes
  //////////////////////////////////////////////////////////////////////////
  public static String FAULT_SERVER_GENERAL = "Server.generalException";


  // Misc Strings
  //////////////////////////////////////////////////////////////////////////
  public static String URI_DEBUG = "http://xml.apache.org/axis/debug" ;

  public static String MC_REALPATH = "realpath";

  /** The global input/out chains */
  public static String GLOBAL_REQUEST        = "global.request" ;
  public static String GLOBAL_RECEIVE       = "global.response" ;
  
  public static String JWSPROCESSOR_TARGET = "JWSProcessor" ;

  public static final String SERVER_CONFIG_FILE = "server-config.xml";
  public static final String CLIENT_CONFIG_FILE = "client-config.xml";
}
