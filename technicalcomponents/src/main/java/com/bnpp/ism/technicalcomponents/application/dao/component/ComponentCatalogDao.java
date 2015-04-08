package com.bnpp.ism.technicalcomponents.application.dao.component;

import org.springframework.data.repository.CrudRepository;

import com.bnpp.ism.technicalcomponents.application.model.component.ComponentCatalog;

public interface ComponentCatalogDao extends
		CrudRepository<ComponentCatalog, Long> {

}
