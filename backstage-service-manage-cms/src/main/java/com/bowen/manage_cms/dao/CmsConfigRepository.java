package com.bowen.manage_cms.dao;


import com.bowen.framework.domain.cms.CmsConfig;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CmsConfigRepository extends MongoRepository<CmsConfig,String> {
}
