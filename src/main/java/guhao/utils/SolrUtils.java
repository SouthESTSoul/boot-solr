package guhao.utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import guhao.entity.Search;
import guhao.mapper.SearchMapper;

@Service
public class SolrUtils {

	@Autowired
	private SearchMapper searchMapper;

	@Autowired
	private SolrTemplate solrTemplate;

	/**
	 * 实现将数据库中的数据批量导入到Solr索引库中
	 */
	public void importSearchData() {
		//将数据从数据库中查出
		List<Search> list = searchMapper.findAll();
		System.out.println("====search列表====");
		for (Search search : list) {
			System.out.println(search.getId());
		}
		//向solr中存储查出来的数据
		solrTemplate.saveBeans("", list);
		solrTemplate.commit(""); // 提交
		System.out.println("====结束====");
	}
}