package paymentservicesubscriber;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import paymentservicepublisher.PaymentServicePublish;

public class PaymentServiceActivator implements BundleActivator {

	ServiceReference serviceReference;
	
	public void start(BundleContext context) throws Exception {
		
		System.out.println("");
		serviceReference = context.getServiceReference(PaymentServicePublish.class.getName());
		PaymentServicePublish servicePublish = (PaymentServicePublish) context.getService(serviceReference);
		System.out.println(servicePublish.publishCartService());
		servicePublish.addPaymentService();
		
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("end");
		context.ungetService(serviceReference);
		
	}

}
