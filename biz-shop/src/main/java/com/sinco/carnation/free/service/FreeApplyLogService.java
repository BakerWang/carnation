package com.sinco.carnation.free.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sinco.carnation.shop.dao.FreeApplyLogDao;
import com.sinco.carnation.shop.model.FreeApplyLog;

@Service
@Transactional
public class FreeApplyLogService {
	@Autowired
	private FreeApplyLogDao freeApplyLogDao;

	public boolean save(FreeApplyLog freeApplyLog) {
		/**
		 * init other field here
		 */
		try {
			this.freeApplyLogDao.save(freeApplyLog);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public FreeApplyLog getObjById(Long id) {
		FreeApplyLog freeApplyLog = this.freeApplyLogDao.get(id);
		if (freeApplyLog != null) {
			return freeApplyLog;
		}
		return null;
	}

	public boolean delete(Long id) {
		try {
			this.freeApplyLogDao.remove(id);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean batchDelete(List<Serializable> freeApplyLogIds) {
		// TODO Auto-generated method stub
		for (Serializable id : freeApplyLogIds) {
			delete((Long) id);
		}
		return true;
	}

//	public IPageList list(IQueryObject properties) {
//		if (properties == null) {
//			return null;
//		}
//		String query = properties.getQuery();
//		String construct = properties.getConstruct();
//		Map params = properties.getParameters();
//		GenericPageList pList = new GenericPageList(FreeApplyLog.class,
//				construct, query, params, this.freeApplyLogDao);
//		if (properties != null) {
//			PageObject pageObj = properties.getPageObj();
//			if (pageObj != null)
//				pList.doList(
//						pageObj.getCurrentPage() == null ? 0 : pageObj
//								.getCurrentPage(),
//						pageObj.getPageSize() == null ? 0 : pageObj
//								.getPageSize());
//		} else
//			pList.doList(0, -1);
//		return pList;
//	}

	public boolean update(FreeApplyLog freeApplyLog) {
		try {
			this.freeApplyLogDao.update(freeApplyLog);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

//	public List<FreeApplyLog> query(String query, Map params, int begin, int max) {
//		return this.freeApplyLogDao.query(query, params, begin, max);
//
//	}
}
