/*
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.skem.ui.internal.SkemActivator;

public class MyDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return SkemActivator.getInstance().getInjector("org.xtext.example.mydsl.MyDsl");
	}

}
