/**
 * Variability Modeling And Resolution Plugins (VARP)
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
package it.unibg.robotics.compositionmodel.impl;

import it.unibg.robotics.compositionmodel.CompProvidedInterf;
import it.unibg.robotics.compositionmodel.CompRequiredInterf;
import it.unibg.robotics.compositionmodel.Composite;
import it.unibg.robotics.compositionmodel.compositionmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.compositionmodel.impl.CompositeImpl#getProvInterfaces <em>Prov Interfaces</em>}</li>
 *   <li>{@link it.unibg.robotics.compositionmodel.impl.CompositeImpl#getReqInterfaces <em>Req Interfaces</em>}</li>
 *   <li>{@link it.unibg.robotics.compositionmodel.impl.CompositeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CompositeImpl extends EObjectImpl implements Composite {
	/**
	 * The cached value of the '{@link #getProvInterfaces() <em>Prov Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<CompProvidedInterf> provInterfaces;

	/**
	 * The cached value of the '{@link #getReqInterfaces() <em>Req Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<CompRequiredInterf> reqInterfaces;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return compositionmodelPackage.Literals.COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompProvidedInterf> getProvInterfaces() {
		if (provInterfaces == null) {
			provInterfaces = new EObjectContainmentEList<CompProvidedInterf>(CompProvidedInterf.class, this, compositionmodelPackage.COMPOSITE__PROV_INTERFACES);
		}
		return provInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompRequiredInterf> getReqInterfaces() {
		if (reqInterfaces == null) {
			reqInterfaces = new EObjectContainmentEList<CompRequiredInterf>(CompRequiredInterf.class, this, compositionmodelPackage.COMPOSITE__REQ_INTERFACES);
		}
		return reqInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, compositionmodelPackage.COMPOSITE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case compositionmodelPackage.COMPOSITE__PROV_INTERFACES:
				return ((InternalEList<?>)getProvInterfaces()).basicRemove(otherEnd, msgs);
			case compositionmodelPackage.COMPOSITE__REQ_INTERFACES:
				return ((InternalEList<?>)getReqInterfaces()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case compositionmodelPackage.COMPOSITE__PROV_INTERFACES:
				return getProvInterfaces();
			case compositionmodelPackage.COMPOSITE__REQ_INTERFACES:
				return getReqInterfaces();
			case compositionmodelPackage.COMPOSITE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case compositionmodelPackage.COMPOSITE__PROV_INTERFACES:
				getProvInterfaces().clear();
				getProvInterfaces().addAll((Collection<? extends CompProvidedInterf>)newValue);
				return;
			case compositionmodelPackage.COMPOSITE__REQ_INTERFACES:
				getReqInterfaces().clear();
				getReqInterfaces().addAll((Collection<? extends CompRequiredInterf>)newValue);
				return;
			case compositionmodelPackage.COMPOSITE__NAME:
				setName((String)newValue);
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
			case compositionmodelPackage.COMPOSITE__PROV_INTERFACES:
				getProvInterfaces().clear();
				return;
			case compositionmodelPackage.COMPOSITE__REQ_INTERFACES:
				getReqInterfaces().clear();
				return;
			case compositionmodelPackage.COMPOSITE__NAME:
				setName(NAME_EDEFAULT);
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
			case compositionmodelPackage.COMPOSITE__PROV_INTERFACES:
				return provInterfaces != null && !provInterfaces.isEmpty();
			case compositionmodelPackage.COMPOSITE__REQ_INTERFACES:
				return reqInterfaces != null && !reqInterfaces.isEmpty();
			case compositionmodelPackage.COMPOSITE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CompositeImpl
