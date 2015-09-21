/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.aries.transaction.test.impl;

import java.sql.SQLException;

import javax.transaction.Transactional;

@Transactional(Transactional.TxType.NOT_SUPPORTED)
public class NotSupportedTestBeanImpl extends TestBeanImpl {

    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    @Override
    public void delegateInsertRow(String name, int value) throws SQLException {
        // TODO Auto-generated method stub
        super.delegateInsertRow(name, value);
    }

    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    @Override
    public void throwApplicationException() throws SQLException {
        // TODO Auto-generated method stub
        super.throwApplicationException();
    }

    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    @Override
    public void throwRuntimeException() {
        // TODO Auto-generated method stub
        super.throwRuntimeException();
    }

}