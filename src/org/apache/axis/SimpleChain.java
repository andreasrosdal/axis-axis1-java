/*
 * The Apache Software License, Version 1.1
 *
 *
 * Copyright (c) 1999 The Apache Software Foundation.  All rights 
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
 * 4. The names "Xerces" and "Apache Software Foundation" must
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
 * individuals on behalf of the Apache Software Foundation and was
 * originally based on software copyright (c) 1999, International
 * Business Machines, Inc., http://www.ibm.com.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 */

package org.apache.axis ;

import java.util.* ;
import org.apache.axis.* ;
import org.apache.axis.utils.* ;

public class SimpleChain implements Chain {
  private Vector  handlers ;

  public void init() {
    for ( int i = 0 ; i < handlers.size() ; i++ )
      ((Handler) handlers.elementAt( i )).init();
  }

  public void cleanup() {
    for ( int i = 0 ; i < handlers.size() ; i++ )
      ((Handler) handlers.elementAt( i )).cleanup();
  }

  /**
   * Iterate over the chain invoking each handler.  If there's a fault
   * then call 'undo' for each completed handler in reverse order, then 
   * rethrow the exception.
   */
  public void invoke(MessageContext msgContext) throws Exception {
    int i = 0 ;
    try {
      for ( i = 0 ; i < handlers.size() ; i++ )
        ((Handler) handlers.elementAt( i )).invoke( msgContext );
    }
    catch( Exception e ) {
      // undo in reverse order - rethrow
      while( --i >= 0 )
        ((Handler) handlers.elementAt( i )).undo( msgContext );
      throw e ;
    }
  }

  /**
   * Undo all of the work this chain completed because some handler
   * later on has faulted - in reverse order.
   */
  public void undo(MessageContext msgContext) {
    System.err.println( "In SimpleChain::undo" );
    for ( int i = handlers.size()-1 ; i >= 0 ; i-- )
      ((Handler) handlers.elementAt( i )).undo( msgContext );
      
  }

  public boolean canHandleBlock(QName qname) {
    for ( int i = 0 ; i < handlers.size() ; i++ )
      if ( ((Handler) handlers.elementAt( i )).canHandleBlock(qname) )
        return( true );
    return( false );
  }

  public QName[] getBlocksHandled() {
    // Could there be dups??
    if ( handlers.size() == 0 ) return( null );
    ArrayList  result = new ArrayList();
    for ( int i = 0 ; i < handlers.size() ; i++ ) {
      QName[]  tmp = ((Handler) handlers.elementAt(i)).getBlocksHandled();
      result.addAll( Arrays.asList( tmp ) );
    }

    return( (QName[]) result.toArray() );
  }

  public void addHandler(Handler handler) {
    if ( handlers == null ) handlers = new Vector();
    handlers.add( handler );
  }

  public void removeHandler(int index) {
    if ( handlers != null )
      handlers.removeElementAt( index );
  }

  public void clear() {
    handlers.clear();
  }

  public boolean contains(Handler handler) {
    return( handlers != null ? handlers.contains( handler ) : false );
  }

  public Handler[] getHandlers() {
    return( (Handler[]) handlers.toArray() );
  }
};
