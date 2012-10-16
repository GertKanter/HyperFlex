/**
 * Feature Model Plugin
 * 
 * Copyright (c) 2011
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
package it.unibg.robotics.featuremodels.model.diagram.providers;

import it.unibg.robotics.featuremodels.model.diagram.edit.parts.CompositeFeatureLowerBoundUpperBoundEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureName2EditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureNameEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.SimpleAttributeNameEditPart;
import it.unibg.robotics.featuremodels.model.diagram.parsers.MessageFormatParser;
import it.unibg.robotics.featuremodels.model.diagram.part.FeatureModelVisualIDRegistry;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class FeatureModelParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser featureName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getFeatureName_5005Parser() {
		if (featureName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.featuremodels.featuremodelsPackage.eINSTANCE
					.getFeature_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { it.unibg.robotics.featuremodels.featuremodelsPackage.eINSTANCE
					.getFeature_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			featureName_5005Parser = parser;
		}
		return featureName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser featureName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getFeatureName_5006Parser() {
		if (featureName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.featuremodels.featuremodelsPackage.eINSTANCE
					.getFeature_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { it.unibg.robotics.featuremodels.featuremodelsPackage.eINSTANCE
					.getFeature_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			featureName_5006Parser = parser;
		}
		return featureName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositeFeatureLowerBoundUpperBound_5007Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeFeatureLowerBoundUpperBound_5007Parser() {
		if (compositeFeatureLowerBoundUpperBound_5007Parser == null) {
			EAttribute[] features = new EAttribute[] {
					it.unibg.robotics.featuremodels.featuremodelsPackage.eINSTANCE
							.getCompositeFeature_LowerBound(),
					it.unibg.robotics.featuremodels.featuremodelsPackage.eINSTANCE
							.getCompositeFeature_UpperBound() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0} ... {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} ... {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} ... {1}"); //$NON-NLS-1$
			compositeFeatureLowerBoundUpperBound_5007Parser = parser;
		}
		return compositeFeatureLowerBoundUpperBound_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser simpleAttributeName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getSimpleAttributeName_5008Parser() {
		if (simpleAttributeName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.featuremodels.featuremodelsPackage.eINSTANCE
					.getAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			simpleAttributeName_5008Parser = parser;
		}
		return simpleAttributeName_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case FeatureNameEditPart.VISUAL_ID:
			return getFeatureName_5005Parser();
		case FeatureName2EditPart.VISUAL_ID:
			return getFeatureName_5006Parser();
		case CompositeFeatureLowerBoundUpperBoundEditPart.VISUAL_ID:
			return getCompositeFeatureLowerBoundUpperBound_5007Parser();
		case SimpleAttributeNameEditPart.VISUAL_ID:
			return getSimpleAttributeName_5008Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(FeatureModelVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(FeatureModelVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (FeatureModelElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
