package com.bnpp.ism.technicalcomponents.application.dao.storage;

import org.springframework.data.repository.CrudRepository;

import com.bnpp.ism.technicalcomponents.application.model.storage.StoredFileVersion;

public interface StoredFileVersionDao extends CrudRepository<StoredFileVersion, Long> {

}
