package test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import test.vo.MovieVo;

public interface MovieMapper {
	@Insert("insert into movie values(movie_seq.nextval,#{title},#{content},#{director})")
	int insert(MovieVo vo);
	
	@Delete("delete from movie where mnum=#{mnum}")
	int delete(int mnum);
	
	@Select("select * from movie")
	List<MovieVo> list();
	
	@Select("select * from movie where mnum=#{mnum}")
	MovieVo select(int mnum);
	
	@Update("update movie set title=#{title},content=#{content},director=#{director} "
			+ " where mnum=#{mnum}")
	int update(MovieVo vo);
}





