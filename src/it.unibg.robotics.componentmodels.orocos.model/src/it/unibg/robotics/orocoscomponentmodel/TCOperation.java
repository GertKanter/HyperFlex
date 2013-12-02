/**
 * HyperFlex toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * ETH Zurich
 * Institute for Dynamic Systems and Control
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, University of Bergamo
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
package it.unibg.robotics.orocoscomponentmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TC Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.TCOperation#getSrvName <em>Srv Name</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.TCOperation#isOwnThread <em>Own Thread</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getTCOperation()
 * @model
 * @generated
 */
public interface TCOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>Srv Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Name</em>' attribute.
	 * @see #setSrvName(String)
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getTCOperation_SrvName()
	 * @model
	 * @generated
	 */
	String getSrvName();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.orocoscomponentmodel.TCOperation#getSrvName <em>Srv Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srv Name</em>' attribute.
	 * @see #getSrvName()
	 * @generated
	 */
	void setSrvName(String value);

	/**
	 * Returns the value of the '<em><b>Own Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Own Thread</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Own Thread</em>' attribute.
	 * @see #setOwnThread(boolean)
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getTCOperation_OwnThread()
	 * @model required="true"
	 * @generated
	 */
	boolean isOwnThread();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.orocoscomponentmodel.TCOperation#isOwnThread <em>Own Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Own Thread</em>' attribute.
	 * @see #isOwnThread()
	 * @generated
	 */
	void setOwnThread(boolean value);

} // TCOperation