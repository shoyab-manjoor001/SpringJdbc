package com.springcore.springjdbc.Mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import com.springcore.springjdbc.entiites.Student;

public class RowMapperImpl implements RowMapper<Student> {

	@Nullable
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	
			Student st = new Student();
			st.setId(rs.getInt(1));
			st.setName(rs.getString(2));
			st.setCity(rs.getString(3));
		return st;
	}
	
}
