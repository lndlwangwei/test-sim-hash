package com.iwangwei.testsimhash.dao;

import com.iwangwei.testsimhash.utils.SolrResourceFile;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

public interface SolrResourceDao extends SolrCrudRepository<SolrResourceFile, Integer> {

}
