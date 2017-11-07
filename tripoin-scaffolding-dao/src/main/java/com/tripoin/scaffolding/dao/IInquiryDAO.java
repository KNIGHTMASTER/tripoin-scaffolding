package com.tripoin.scaffolding.dao;

import com.tripoin.scaffolding.dao.exception.DAOException;
import com.tripoin.scaffolding.data.IScaffoldingConstant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 * @param <DATA>
 */
public interface IInquiryDAO<DATA> {

	List<DATA> findByStatus(int p_Status) throws DAOException;
	
	/*Property CODE*/
	List<DATA> findByCodeContainingAndStatus(String p_Code, int p_Status) throws DAOException;

	List<DATA> findByCodeContainingAndStatusOrderByIdAsc(String p_Code, int p_Status) throws DAOException;
	
	List<DATA> findByCodeContainingAndStatusOrderByCodeAsc(String p_Code, int p_Status) throws DAOException;

	List<DATA> findByCodeContainingAndStatusOrderByCodeDesc(String p_Code, int p_Status) throws DAOException;
	
	Page<DATA> findByCodeContainingAndStatusOrderByCodeAsc(String p_Code, int p_Status, Pageable p_Pageable) throws DAOException;

	Page<DATA> findByCodeContainingAndStatusOrderByIdAsc(String p_Code, int p_Status, Pageable p_Pageable) throws DAOException;

	/*Property NAME*/
	List<DATA> findByNameContainingAndStatus(String p_Name, int p_Status) throws DAOException;

	List<DATA> findByNameContainingAndStatusOrderByIdAsc(String p_Name, int p_Status) throws DAOException;
	
	List<DATA> findByNameContainingAndStatusOrderByNameAsc(String p_Name, int p_Status) throws DAOException;

	List<DATA> findByNameContainingAndStatusOrderByNameDesc(String p_Name, int p_Status) throws DAOException;

	Page<DATA> findByNameContainingAndStatusOrderByIdAsc(String p_Name, int p_Status, Pageable p_Pageable) throws DAOException;

	Page<DATA> findByNameContainingAndStatusOrderByNameAsc(String p_Name, int p_Status, Pageable p_Pageable) throws DAOException;

	/*List Of Value*/
	@Query(IScaffoldingConstant.Query.SELECT_LOV)
	List<DATA> selectLOV() throws DAOException;
	
	/*@Query(QueryConstant.ADVANCED_PAGINATION)
	Page<DATA> advancedPagination(String p_FilterKey, String p_FilterValue, Pageable p_Pageable) throws DAOException;*/

	/*List<String> getPhysicalColumnNames() throws DAOException;*/
}