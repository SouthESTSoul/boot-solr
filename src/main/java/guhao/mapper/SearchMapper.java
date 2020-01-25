package guhao.mapper;

import org.apache.ibatis.annotations.Mapper;

import guhao.entity.Search;

import java.util.List;


@Mapper
public interface SearchMapper {

    /**
     * 查询所有记录信息
     *
     * @return
     */
    List<Search> findAll();


}
