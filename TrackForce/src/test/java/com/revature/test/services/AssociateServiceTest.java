package com.revature.test.services;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

import com.revature.services.ClientResource;
import com.revature.services.MarketingStatusService;
import com.revature.utils.DBLoaderUtil;
import com.revature.utils.TestDBUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.testng.Assert;
import org.testng.annotations.*;

import com.revature.model.AssociateInfo;
import com.revature.services.AssociateService;

public class AssociateServiceTest {
    private AssociateService associateservice;
    private SessionFactory factory;
    private Session session;
    private Transaction transaction;

    @BeforeSuite
    public void initCaches() throws IOException, SQLException, ClassNotFoundException {
    	factory = TestDBUtil.getSessionFactory();
        new DBLoaderUtil().populateDBSF();  // todo: use testloader instead
        new AssociateService().execute();
        new ClientResource().execute();
        new MarketingStatusService().execute();
    }

    @BeforeTest
    public void initAssoicateAndTransaction() {
        session = factory.openSession();
        transaction = session.getTransaction();
        associateservice = new AssociateService();
    }

    @AfterTest
    public void rollbackChanges() {
        transaction.rollback();
        session.close();
    }

	@Test
	public void testgetAssociatePositive() throws IOException {
		BigDecimal bigdecimal = new BigDecimal(25);
		AssociateInfo associate = associateservice.getAssociate(bigdecimal);
		System.out.println(associate);
	}

    @Test
    public void testgetAssociateNegative() throws IOException {
        AssociateService associateservice = new AssociateService();
        BigDecimal bigdecimal = new BigDecimal(-25);
        AssociateInfo associate = associateservice.getAssociate(bigdecimal);
        System.out.println(associate);
    }

    @Test
    public void testUpdateAssociatePositive() throws IOException {  // todo: this test fixed; now have to fix the rest to use ids instead of names
        AssociateService associateService = new AssociateService();
        associateService.updateAssociate("266", "1", "307");

        AssociateInfo associateInfo = associateService.getAssociate(new BigDecimal(266));

        Assert.assertEquals(associateInfo.getMsid().intValueExact(), 1);
        Assert.assertEquals(associateInfo.getMarketingStatus(), "MAPPED: TRAINING");
        Assert.assertEquals(associateInfo.getClient(), "Corner Bakery");
    }
    
    @Test
    public void testUpdateAssociateNegative() throws IOException {
        AssociateService associateService = new AssociateService();
        associateService.updateAssociate("266", "Placed Tomorrow", "Petsmart");
        
        AssociateInfo associateInfo = associateService.getAssociate(new BigDecimal(266));
        
        Assert.assertNotNull(associateInfo.getMarketingStatus());
        Assert.assertEquals(associateInfo.getClient(), "None");
    }
}