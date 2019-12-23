package org.iedcr.champsdata.repositories;





import java.util.List;

import org.iedcr.champsdata.models.Dss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.repository.support.PageableExecutionUtils;
import org.springframework.stereotype.Repository;

@Repository
public class DssRepository {
	@Autowired
    MongoTemplate mongoTemplate;
	
	
	
	private int limit=5;
	
	
	public Page getByPage(Long page) {
		int pageNumber = page != null? (page.intValue() * (limit-1)):0;
		Pageable pageRequest = PageRequest.of(pageNumber, limit);
		Query query = new Query();
        query.with(pageRequest);
        List list = mongoTemplate.find(query, Dss.class);
        return PageableExecutionUtils.getPage(
                list,
                pageRequest,
                () -> mongoTemplate.count(query, Dss.class));
	}

}
