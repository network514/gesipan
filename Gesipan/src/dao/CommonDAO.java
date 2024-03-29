package dao;

import java.util.List;

public interface CommonDAO {
	/*
	 * 추가 CREATE
	 */
	public int insert(Object obj);
	/*
	 * 전체 요소의 갯수
	 */
	public int count(); //where절이 있어야 파라미터를 넣는다.
	/*
	 * ID로 중복값 없이 추출
	 */
	public Object getElementById(String id);
	/*
	 * Name 으로 중복값 허용하며 추출
	 */
	public List<Object> getElementsByName(String name);
	/*
	 * 전체 목록 추출
	 */
	public List<Object> list();
	/*
	 * 수정
	 */
	public int update(Object obj);
	/*
	 * 삭제
	 */
	public int delete(String id);
}
