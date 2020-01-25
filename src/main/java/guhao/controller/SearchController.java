package guhao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import guhao.service.SearchService;
import guhao.utils.ResponseCode;

import java.util.Map;


@RestController
public class SearchController {

    @Autowired
    private SearchService searchService;

    @RequestMapping("/search")
    public ResponseCode search(@RequestBody Map<String, Object> searchMap) {
        return searchService.search(searchMap);
    }
}
