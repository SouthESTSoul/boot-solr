package guhao.service;

import java.util.Map;

import guhao.utils.ResponseCode;


public interface SearchService {

    /**
     * 搜索 -- 从Solr索引库中
     *
     * @param searchMap
     * @return
     */
    ResponseCode search(Map<String, Object> searchMap);
}
