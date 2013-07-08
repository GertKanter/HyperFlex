/**
 * Variability Analysis And Resolution Plugins (VARP)
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * University of Bergamo
 * Dept. of Information Technology and Mathematics
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:luca.gherardi@unibg.it">Luca Gherardi</A>
 * 
 * Supervised by: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
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
package it.unibg.robotics.roscomponentmodel.impl;

import it.unibg.robotics.roscomponentmodel.CompositeProperty;
import it.unibg.robotics.roscomponentmodel.Property;
import it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.CompositePropertyImpl#getExposed <em>Exposed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositePropertyImpl extends PropertyImpl implements CompositeProperty {
	/**
	 * The cached value of the '{@link #getExposed() <em>Exposed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposed()
	 * @generated
	 * @ordered
	 */
	protected Property exposed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return roscomponentmodelPackage.Literals.COMPOSITE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getExposed() {
		if (exposed != null && exposed.eIsProxy()) {
			InternalEObject oldExposed = (InternalEObject)exposed;
			exposed = (Property)eResolveProxy(oldExposed);
			if (exposed != oldExposed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, roscomponentmodelPackage.COMPOSITE_PROPERTY__EXPOSED, oldExposed, exposed));
			}
		}
		return exposed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetExposed() {
		return exposed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposed(Property newExposed) {
		Property oldExposed = exposed;
		exposed = newExposed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, roscomponentmodelPackage.COMPOSITE_PROPERTY__EXPOSED, oldExposed, exposed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case roscomponentmodelPackage.COMPOSITE_PROPERTY__EXPOSED:
				if (resolve) return getExposed();
				return basicGetExposed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case roscomponentmodelPackage.COMPOSITE_PROPERTY__EXPOSED:
				setExposed((Property)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case roscomponentmodelPackage.COMPOSITE_PROPERTY__EXPOSED:
				setExposed((Property)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case roscomponentmodelPackage.COMPOSITE_PROPERTY__EXPOSED:
				return exposed != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositePropertyImpl
