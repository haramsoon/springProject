package kr.ezen.bbs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.ezen.bbs.domain.BoardDTO;
import kr.ezen.bbs.domain.PageDTO;

@Mapper
public interface BoardMapper {
	// interface는 기본이 public 이어서 생략 가능
	
	// 게시글 등록
	void insert(BoardDTO dto);
	
	// 리스트 불러오기
//	List<BoardDTO> getList();
	List<BoardDTO> getList(PageDTO pDto);
	
	// 글 상세보기
	BoardDTO view(int bid);
	
	// 글 수정하기
	int update(BoardDTO dto);
	
	// 글 삭제하기
	int delete(int bid);
	
	// 조회수 증가
	void hitAdd(int bid);
	
	// 저체 게시글 수
	int totalCnt();
}
