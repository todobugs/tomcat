/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.tomcat.jdbc.test.driver;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;

public class Connection implements java.sql.Connection {

    public void clearWarnings() throws SQLException {
    }

    public void close() throws SQLException {
        //TODO
    }

    public void commit() throws SQLException {
    }

    public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
        return null;
    }

    public Blob createBlob() throws SQLException {
        return null;
    }

    public Clob createClob() throws SQLException {
        return null;
    }

    public NClob createNClob() throws SQLException {
        return null;
    }

    public SQLXML createSQLXML() throws SQLException {
        return null;
    }

    public Statement createStatement() throws SQLException {
        return new org.apache.tomcat.jdbc.test.driver.Statement();
    }

    public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
        return new org.apache.tomcat.jdbc.test.driver.Statement();
    }

    public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return new org.apache.tomcat.jdbc.test.driver.Statement();
    }

    public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
        return null;
    }

    public boolean getAutoCommit() throws SQLException {
        return false;
    }

    public String getCatalog() throws SQLException {
        return null;
    }

    public Properties getClientInfo() throws SQLException {
        return null;
    }

    public String getClientInfo(String name) throws SQLException {
        return null;
    }

    public int getHoldability() throws SQLException {
        return 0;
    }

    public DatabaseMetaData getMetaData() throws SQLException {
        return null;
    }

    public int getTransactionIsolation() throws SQLException {
        return 0;
    }

    public Map<String, Class<?>> getTypeMap() throws SQLException {
        return null;
    }

    public SQLWarning getWarnings() throws SQLException {
        return null;
    }

    public boolean isClosed() throws SQLException {
        return false;
    }

    public boolean isReadOnly() throws SQLException {
        return false;
    }

    public boolean isValid(int timeout) throws SQLException {
        return false;
    }

    public String nativeSQL(String sql) throws SQLException {
        return null;
    }

    public CallableStatement prepareCall(String sql) throws SQLException {
        return new org.apache.tomcat.jdbc.test.driver.Statement();
    }

    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return new org.apache.tomcat.jdbc.test.driver.Statement();
    }

    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return new org.apache.tomcat.jdbc.test.driver.Statement();
    }

    public PreparedStatement prepareStatement(String sql) throws SQLException {
        return new org.apache.tomcat.jdbc.test.driver.Statement();
    }

    public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
        return new org.apache.tomcat.jdbc.test.driver.Statement();
    }

    
    public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
        return new org.apache.tomcat.jdbc.test.driver.Statement();
    }

    public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
        return new org.apache.tomcat.jdbc.test.driver.Statement();
    }

    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return new org.apache.tomcat.jdbc.test.driver.Statement();
    }

    
    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return new org.apache.tomcat.jdbc.test.driver.Statement();
    }

    public void releaseSavepoint(Savepoint savepoint) throws SQLException {
    }

    public void rollback() throws SQLException {
    }

    public void rollback(Savepoint savepoint) throws SQLException {
    }

    public void setAutoCommit(boolean autoCommit) throws SQLException {
    }

    public void setCatalog(String catalog) throws SQLException {
    }

    public void setClientInfo(Properties properties) throws SQLClientInfoException {
    }

    public void setClientInfo(String name, String value) throws SQLClientInfoException {
    }

    public void setHoldability(int holdability) throws SQLException {
    }

    public void setReadOnly(boolean readOnly) throws SQLException {
    }

    public Savepoint setSavepoint() throws SQLException {
        return null;
    }

    public Savepoint setSavepoint(String name) throws SQLException {
        return null;
    }

    public void setTransactionIsolation(int level) throws SQLException {
    }

    public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
    }

    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }

    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

}
