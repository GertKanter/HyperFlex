/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Department of Engineering
 * University of Bergamo
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
 * 
 * ***********************************************************************************************
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * 
 */
package org.hyperflex.roscomponentmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Msg Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.roscomponentmodel.CompositeMsgInterface#getExposed <em>Exposed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage#getCompositeMsgInterface()
 * @model
 * @generated
 */
public interface CompositeMsgInterface extends MsgInterface {
	/**
	 * Returns the value of the '<em><b>Exposed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposed</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposed</em>' reference.
	 * @see #setExposed(Topic)
	 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage#getCompositeMsgInterface_Exposed()
	 * @model required="true"
	 * @generated
	 */
	Topic getExposed();

	/**
	 * Sets the value of the '{@link org.hyperflex.roscomponentmodel.CompositeMsgInterface#getExposed <em>Exposed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposed</em>' reference.
	 * @see #getExposed()
	 * @generated
	 */
	void setExposed(Topic value);

} // CompositeMsgInterface
