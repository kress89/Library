package hr.kreso.ucenje.mybatis.handler;

import hr.kreso.ucenje.model.StatusEnum;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StatusEnumTypeHandler implements TypeHandler {

    @Override
    public void setParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {
       ps.setString(i, ((StatusEnum)parameter).getCode());
    }

    @Override
    public Object getResult(ResultSet rs, String columnName) throws SQLException {
        return StatusEnum.setStatusEnum(rs.getString(columnName));
    }

    @Override
    public Object getResult(ResultSet rs, int columnIndex) throws SQLException {
        return StatusEnum.setStatusEnum(rs.getString(columnIndex));
    }

    @Override
    public Object getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return StatusEnum.setStatusEnum(cs.getString(columnIndex));
    }
}
