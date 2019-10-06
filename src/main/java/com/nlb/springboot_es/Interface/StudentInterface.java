package com.nlb.springboot_es.Interface;

import com.nlb.springboot_es.bean.student;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface StudentInterface extends ElasticsearchRepository<student,Integer> {

    public List<student> findByNameLike
}
