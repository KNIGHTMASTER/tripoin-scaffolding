package com.tripoin.scaffolding.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * 
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 * @param <DATA>
 */
@NoRepositoryBean
public interface IScaffoldingDAO<DATA> extends JpaRepository<DATA, Long>, ITransactionDAO<Long>, IInquiryDAO<DATA> {
}
