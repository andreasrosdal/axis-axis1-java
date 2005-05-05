/*
 * Copyright 2004,2005 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
package org.apache.axis.engine;

import org.apache.axis.AbstractTestCase;

import org.apache.axis.AbstractTestCase;
import org.apache.axis.context.EngineContext;
import org.apache.axis.context.MessageContext;
import org.apache.axis.context.BasicOperationContext;
import org.apache.axis.description.AxisGlobal;
import org.apache.axis.om.OMFactory;
import org.apache.axis.om.SOAPFactory;
import org.apache.axis.om.OMAbstractFactory;

public class MessageContextTest extends AbstractTestCase {
    public MessageContextTest(String testName) {
        super(testName);
    }

    public void testMesssageContext() throws AxisFault {
        EngineConfiguration er = new EngineConfigurationImpl(new AxisGlobal());
        EngineContext engineContext = new EngineContext(er);
        MessageContext msgctx = new MessageContext(engineContext, null,null,null,null,new BasicOperationContext(null,null));

        SOAPFactory omFac = OMAbstractFactory.getSOAP11Factory();

        msgctx.setEnvelope(omFac.getDefaultEnvelope());
        assertNotNull(msgctx.getEnvelope());

        msgctx.setFaultTo(null);
        assertNull(msgctx.getFaultTo());

        msgctx.setFrom(null);
        assertNull(msgctx.getFrom());

        msgctx.setRelatesTo(null);
        assertNull(msgctx.getRelatesTo());

        msgctx.setReplyTo(null);
        assertNull(msgctx.getReplyTo());

        msgctx.setMessageID(null);
        assertNull(msgctx.getMessageID());
    }
}
