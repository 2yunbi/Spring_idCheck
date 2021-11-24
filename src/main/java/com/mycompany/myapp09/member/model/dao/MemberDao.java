package com.mycompany.myapp09.member.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp09.member.model.vo.Member;

@Repository("memberDao")
public class MemberDao {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public Member idCheck(Member mvo) throws Exception  {
		return sqlSessionTemplate.selectOne("Member.idCheck", mvo);
	}
}
