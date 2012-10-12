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
package it.unibg.robotics.featuremodels.commands.featureselection.handlers;

import it.unibg.robotics.featuremodels.model.diagram.edit.parts.Feature2EditPart;
import it.unibg.robotics.featuremodels.model.diagram.part.FeatureModelDiagramEditor;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import featureModel.Feature;
import featureModel.Instance;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class FeatureDeselectionHandler extends AbstractHandler {
	
	private Feature2EditPart featureEditPart;
	private Feature feature;
	private Instance instance;
	
	/**
	 * The constructor.
	 */
	public FeatureDeselectionHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		FeatureModelDiagramEditor featureEditor = null;
		IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
		if(activeEditor instanceof FeatureModelDiagramEditor){
			featureEditor = (FeatureModelDiagramEditor)activeEditor;
			StructuredSelection structSelect = (StructuredSelection)featureEditor.getSite().getSelectionProvider().getSelection();
			if(structSelect.getFirstElement() instanceof Feature2EditPart){
				featureEditPart = (Feature2EditPart)structSelect.getFirstElement();
				feature = featureEditPart.getFeature();
				//FeatureModel model = featureEditPart.getFeatureModel();
				instance = featureEditPart.getFeatureModel().getSelectedInstance();
				if(instance == null){
					MessageDialog.openWarning(null, "Warning", 
					"You have to select an instance!!!");
					return null;
				}
				if(! instance.getSelectedFeatures().contains(feature)){
					return null;
				}
				TransactionalEditingDomain editingDomain = featureEditor.getEditingDomain();
				editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain){
					@SuppressWarnings("unchecked")
					@Override
					protected void doExecute() {
						//instance.getSelectedFeatures().remove(feature);
						featureEditPart.getFeatureModel().removeFeatureFromInstance(instance, feature);
						featureEditPart.getPrimaryShape().updateColor();
					}
				});

			}
		}


		
		MessageDialog.openInformation(
				window.getShell(),
				"Feature Selection",
				"Feature Removed");
		return null;
	}
}
