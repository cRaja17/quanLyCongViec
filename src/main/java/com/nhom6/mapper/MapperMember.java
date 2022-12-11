package com.nhom6.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nhom6.Entity.MemberEntity;

public class MapperMember implements RowMapper<MemberEntity>{

	public MemberEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		MemberEntity member = new MemberEntity();
		member.setId(rs.getInt("id"));
		member.setName(rs.getString("name"));
		member.setAddress(rs.getString("address"));
		member.setDateBirthday(rs.getDate("dateBirthday"));
		member.setGender(rs.getInt("gender"));
		member.setIDidentity(rs.getInt("IDidentify"));
		member.setPlaceOfIssue(rs.getString("placeOfIssue"));
		member.setNativeLand(rs.getString("nativeLand"));
		member.setPermanentResident(rs.getString("permanentResident"));
		member.setIssueON(rs.getString("IssueON"));
		member.setImage(rs.getString("image"));
		member.setFrontIdentify(rs.getString("frontIdentify"));
		member.setBackIdentify(rs.getString("backIdentify"));
		member.setPassword(rs.getString("password"));
		member.setPhone_number(rs.getInt("phone_number"));
		return member;
	}
}
