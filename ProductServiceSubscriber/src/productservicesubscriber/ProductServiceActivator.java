package productservicesubscriber;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import productservicepublisher.ProductServicePublish;


public class ProductServiceActivator implements BundleActivator {

	ServiceReference serviceReference;

	public void start(BundleContext context) throws Exception {

		System.out.println("");
		serviceReference = context.getServiceReference(ProductServicePublish.class.getName());
		ProductServicePublish servicePublish = (ProductServicePublish) context.getService(serviceReference);
		
		servicePublish.showProducts();
		
	}

	public void stop(BundleContext context) throws Exception {

		System.out.println("end");
		context.ungetService(serviceReference);
		
	}

}
