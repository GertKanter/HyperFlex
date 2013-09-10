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
package it.unibg.robotics.orocoscomponentmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.CompositeProperty#getExposedProperty <em>Exposed Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getCompositeProperty()
 * @model
 * @generated
 */
public interface CompositeProperty extends Property {
	/**
	 * Returns the value of the '<em><b>Exposed Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposed Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposed Property</em>' reference.
	 * @see #setExposedProperty(Property)
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getCompositeProperty_ExposedProperty()
	 * @model required="true"
	 * @generated
	 */
	Property getExposedProperty();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.orocoscomponentmodel.CompositeProperty#getExposedProperty <em>Exposed Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposed Property</em>' reference.
	 * @see #getExposedProperty()
	 * @generated
	 */
	void setExposedProperty(Property value);

} // CompositeProperty