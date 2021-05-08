package com.nothingtothetable.shinydb.dao.typehandler;

import com.nothingtothetable.shinydb.model.DomainGeneration;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GenerationTypeHandler extends BaseTypeHandler<DomainGeneration>
{
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, DomainGeneration domainGeneration, JdbcType jdbcType) throws SQLException
    {
        preparedStatement.setInt(i, domainGeneration.getDbId());
    }

    @Override
    public DomainGeneration getNullableResult(ResultSet resultSet, String s) throws SQLException
    {
        return DomainGeneration.fromDbId(resultSet.getInt(s));
    }

    @Override
    public DomainGeneration getNullableResult(ResultSet resultSet, int i) throws SQLException
    {
        return DomainGeneration.fromDbId(resultSet.getInt(i));
    }

    @Override
    public DomainGeneration getNullableResult(CallableStatement callableStatement, int i) throws SQLException
    {
        return DomainGeneration.fromDbId(callableStatement.getInt(i));
    }
}
