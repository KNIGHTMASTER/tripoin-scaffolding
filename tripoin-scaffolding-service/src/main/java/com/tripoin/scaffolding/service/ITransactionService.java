package com.tripoin.scaffolding.service;

import com.tripoin.scaffolding.service.exception.ServiceException;
import java.util.List;


import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 * @param <DATA>
 * @param <ID>
 */
public interface ITransactionService<DATA, ID> extends ICancellationService<ID>, IApprovalService<ID> {

	@Transactional
	void insert(DATA p_DATA) throws ServiceException;

	@Transactional
	void insertAndFlush(DATA p_DATA) throws ServiceException;

	@Transactional
	void insertCollection(List<DATA> p_DATA)  throws ServiceException;

	void update(DATA p_DATA)  throws ServiceException;

	@Transactional
	void delete(ID p_ID)  throws ServiceException;

	@Transactional
	void deleteByEntity(String p_Code)  throws ServiceException;

	@Transactional
	void deleteCollection(List<String> p_Codes)  throws ServiceException;

	@Transactional
	void deleteCollectionById(List<ID> p_ID)  throws ServiceException;
	
}
