/*
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
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, Department of Engineering
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
package org.hyperflex.rapyutacomponentmodel.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.CompositeSrvConnectionCreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.CompositeSrvConnectionReorientCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.ContainerSrvConnectionCreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.ContainerSrvConnectionReorientCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.EndPointSrvConnectionCreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.EndPointSrvConnectionReorientCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSrvConnectionEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.ContainerSrvConnectionEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSrvConnectionEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelVisualIDRegistry;
import org.hyperflex.rapyutacomponentmodel.diagram.providers.RapyutaComponentModelElementTypes;

/**
 * @generated
 */
public class EndPointSrvClient2ItemSemanticEditPolicy extends
		RapyutaComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EndPointSrvClient2ItemSemanticEditPolicy() {
		super(RapyutaComponentModelElementTypes.EndPointSrvClient_3074);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (RapyutaComponentModelVisualIDRegistry.getVisualID(outgoingLink) == EndPointSrvConnectionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (RapyutaComponentModelVisualIDRegistry.getVisualID(outgoingLink) == CompositeSrvConnectionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (RapyutaComponentModelVisualIDRegistry.getVisualID(outgoingLink) == ContainerSrvConnectionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (RapyutaComponentModelElementTypes.EndPointSrvConnection_4015 == req
				.getElementType()) {
			return getGEFWrapper(new EndPointSrvConnectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (RapyutaComponentModelElementTypes.CompositeSrvConnection_4017 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeSrvConnectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (RapyutaComponentModelElementTypes.ContainerSrvConnection_4018 == req
				.getElementType()) {
			return getGEFWrapper(new ContainerSrvConnectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (RapyutaComponentModelElementTypes.EndPointSrvConnection_4015 == req
				.getElementType()) {
			return null;
		}
		if (RapyutaComponentModelElementTypes.CompositeSrvConnection_4017 == req
				.getElementType()) {
			return null;
		}
		if (RapyutaComponentModelElementTypes.ContainerSrvConnection_4018 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case EndPointSrvConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new EndPointSrvConnectionReorientCommand(req));
		case CompositeSrvConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new CompositeSrvConnectionReorientCommand(req));
		case ContainerSrvConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new ContainerSrvConnectionReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
