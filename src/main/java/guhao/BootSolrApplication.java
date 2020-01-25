package guhao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import guhao.utils.SolrUtils;

@SpringBootApplication
public class BootSolrApplication {

    public static ConfigurableApplicationContext ac;
    public static void main(String[] args) {
    	//获取ApplicationContext
    	BootSolrApplication.ac = SpringApplication.run(BootSolrApplication.class, args);
    	//注意，虽然类的名字首字母都是大写的，但是Spring中bean的命名规则是首字母小写
    SolrUtils solrUtils = (SolrUtils) ac.getBean("solrUtils");
    //如果第一次运行，把下面的注释打开即可将数据库中的数据转到solr中,转储完成后请将该行注释掉。
  // solrUtils.importSearchData();
    }

}
