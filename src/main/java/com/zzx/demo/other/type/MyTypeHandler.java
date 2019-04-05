/**
 * 
 */
/*
 * package com.zzx.demo.type;
 * 
 * import java.sql.CallableStatement; import java.sql.PreparedStatement; import
 * java.sql.ResultSet; import java.sql.SQLException;
 * 
 * import org.apache.ibatis.type.BaseTypeHandler; import
 * org.apache.ibatis.type.JdbcType; import
 * org.apache.ibatis.type.MappedJdbcTypes;
 * 
 *//**
	 * MyTypeHandler 自定义typehandler
	 * 
	 * @author zhengzhongxian
	 * @date 2019年4月5日
	 * @description
	 *//*
		 * @MappedJdbcTypes(JdbcType.VARCHAR) public class MyTypeHandler extends
		 * BaseTypeHandler<String> {
		 * 
		 * @Override public void setNonNullParameter(PreparedStatement ps, int i, String
		 * parameter, JdbcType jdbcType) throws SQLException { ps.setString(i, parameter
		 * + "-test"); }
		 * 
		 * @Override public String getNullableResult(ResultSet rs, String columnName)
		 * throws SQLException { // TODO Auto-generated method stub return null; }
		 * 
		 * @Override public String getNullableResult(ResultSet rs, int columnIndex)
		 * throws SQLException { // TODO Auto-generated method stub return null; }
		 * 
		 * @Override public String getNullableResult(CallableStatement cs, int
		 * columnIndex) throws SQLException { // TODO Auto-generated method stub return
		 * null; }
		 * 
		 * }
		 */