/*
 * Copyright 2001-2004 The Apache Software Foundation.
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

package org.apache.commons.codec;

import junit.framework.TestCase;

/**
 * @version $Id$
 * @author Apache Software Foundation
 */
public abstract class BinaryEncoderAbstractTest extends TestCase {

    public BinaryEncoderAbstractTest(String name) {
        super(name);
    }

    protected abstract BinaryEncoder makeEncoder();

    // ------------------------------------------------------------------------

    public void testEncodeEmpty() throws Exception {
        BinaryEncoder encoder = makeEncoder();
        encoder.encode(new byte[0]);
    }        

    public void testEncodeNull() throws Exception {
        BinaryEncoder encoder = makeEncoder();
	try {
	    encoder.encode(null);
	} catch( EncoderException ee ) {
	    // An exception should be thrown
	}
    }        
}
