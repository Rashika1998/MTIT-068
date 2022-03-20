package cartservicesubscriber;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import cartservicepublisher.CartServicePublish;

public class CartServiceActivator implements BundleActivator {

	ServiceReference serviceReference;

	public void start(BundleContext context) throws Exception {
		
		System.out.println("");
		serviceReference = context.getServiceReference(CartServicePublish.class.getName());
		CartServicePublish servicePublish = (CartServicePublish) context.getService(serviceReference);
		System.out.println(servicePublish.publishCartService());
		servicePublish.addItemToCart();
		
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("end");
		context.ungetService(serviceReference);
		
	}

}
