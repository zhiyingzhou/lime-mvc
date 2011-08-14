/*****************************************************************************
 * Copyright 2011 Zdenko Vrabel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 *****************************************************************************/
package org.zdevra.guice.mvc;

import com.google.inject.Binder;
import com.google.inject.multibindings.Multibinder;

/**
 * This builder class provide registering custom and default
 * scanners. Class is called and used by the {@link MvcModule}.
 * 
 * @see MvcModule
 */
class ViewScannerBuilder {
	
// ------------------------------------------------------------------------
	
	private final Multibinder<ViewScanner> scannersBinder;
	
// ------------------------------------------------------------------------
	
	/**
	 * Constructor
	 */
	public ViewScannerBuilder(Binder binder) {
		scannersBinder = Multibinder.newSetBinder(binder, ViewScanner.class);
	}
			
	public void as(Class<? extends ViewScanner> scannerClass) {
		scannersBinder.addBinding().to(scannerClass);
	}
	
	public void asInstance(ViewScanner scanner) {
		scannersBinder.addBinding().toInstance(scanner);
	}
	
// ------------------------------------------------------------------------

}