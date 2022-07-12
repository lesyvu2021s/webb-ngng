/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Jul 10, 2022
*/
package lsv.com.vn.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import lsv.com.vn.model.SalesOrder;

@Repository
@Transactional
public class SalesOrderDaoImpl implements SalesOrderDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void addSalesOrder(SalesOrder salesOrder) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(salesOrder);
		
	}

}
