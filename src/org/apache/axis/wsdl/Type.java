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
package org.apache.axis.wsdl;


import org.w3c.dom.Node;

import javax.wsdl.QName;

/**
 * This class represents a type that is supported by the WSDL2Java emitter.
 * A Type has a QName representing its XML name and a Java Name, which
 * is its full java name.  The Type may also have a Node, which locates
 * the definition of the emit type in the xml.  
 * A Type object is built by the TypeFactory for each XML complexType, simpleType,
 * or element (necessary for ref=) that is defined or encountered.
 *
 * @author Rich Scheuerle  (scheu@us.ibm.com)
 */
public class Type {

    private QName   qName;       // QName of the element type
    private String  jName;       // Name of the Java Mapping (Class or primitive)
    private Node    node;        // Element node
    private boolean shouldEmit;  // Indicates if this Type should have code emitted for it.
    private boolean isBaseType;  // Indicates if represented by a java primitive or util class

    /**
     * Create a Type object for an xml construct name that represents a base java type
     */
    protected Type(QName pqName) {
        qName = pqName;
        node = null;
        jName = Utils.getBaseJavaName(qName);
        shouldEmit = false;
        isBaseType = true;
    }
       
    /**
     * Create a Type object for an xml construct that references another type.        
     * The Type corresponding to the ultimate reference type is passed as refType
     */  
    protected Type(QName pqName, Type refType, Node pNode) {
        qName = pqName;
        node = pNode;
        jName = refType.getJavaName();
        shouldEmit = false;
        isBaseType = (refType.getBaseType() != null);
    }
       
    /**
     * Create a Type object for an xml construct that is not a base java type
     */  
    protected Type(QName pqName, String pjName, Node pNode) {
        qName = pqName;
        node  = pNode;
        jName = pjName;
        shouldEmit  = (node != null);
        isBaseType = false;
    }

    /**
     * Query QName
     */
    public QName getQName() {
        return qName;
    }

    /**
     * Query Java Mapping Name
     */
    public String getJavaName() {
        return jName;
    }

    /**
     * Query Java Local Name
     */
    public String getJavaLocalName() {
        return jName.substring(jName.lastIndexOf('.')+1);
    }

    /**
     * Query Java Package Name
     */
    public String getJavaPackageName() {
        if (jName.lastIndexOf('.') > 0) {
            return jName.substring(0, jName.lastIndexOf('.'));
        }
        else {
            return "";
        }
    }

    /**
     * Query Java Mapping Name
     */
    public Node getNode() {
        return node;
    }

    /**
     * Query whether a Node defining the type exists.
     */
    public boolean isDefined() {
        return (node != null);
    }

    /**
     * Query whether a Node should be emitted.
     */
    public boolean getShouldEmit() {
        return shouldEmit;
    }

    /**
     * Indicate whether a Node should be emitted.
     */
    public void setShouldEmit(boolean pShouldEmit) {
        shouldEmit = pShouldEmit;
    }

    /**
     * Returns the Java Base Type Name.
     * For example if the Type represents a schema integer, "int" is returned.
     * If this is a user defined type, null is returned.
     */
    public String getBaseType() {
        if (isBaseType) {
            return jName;
        }
        else {
            return null;
        }
    }

    /**
     * Get string representation.
     */
    public String toString() {
        return 
            "QName: " + getQName() + "\n" +
            "JName: " + getJavaName() + "\n" +
            "Emit?: " + shouldEmit + "\n" +
            "Base?: " + isBaseType + "\n" +
            "Node:  " + getNode() + "\n";
    }
};
