package com.iwangwei.testsimhash.utils;

import lombok.Data;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.util.Date;
import java.util.List;

@Data
@SolrDocument(collection = "RBM-CHECKING-RESOURCE-FILE")
public class SolrResourceFile {
    private String id;
    private String resourceId;
    private String content;
}
