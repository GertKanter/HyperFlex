package org.hyperflex.roscomponentmodel.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.hyperflex.roscomponentmodel.CompositeMsgConsumer;
import org.hyperflex.roscomponentmodel.CompositeMsgProducer;
import org.hyperflex.roscomponentmodel.CompositeSrvConsumer;
import org.hyperflex.roscomponentmodel.CompositeSrvProducer;
import org.hyperflex.roscomponentmodel.NodeMsgConsumer;
import org.hyperflex.roscomponentmodel.NodeMsgProducer;
import org.hyperflex.roscomponentmodel.NodeSrvConsumer;
import org.hyperflex.roscomponentmodel.NodeSrvProducer;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.ArchitectureModelEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.Composite2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgConsumer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposed2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposedEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgProducer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeName2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeNameEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvConsumer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvProducer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvProducerPromote2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvProducerPromoteEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.MsgInterfaceConnection2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.MsgInterfaceConnectionEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeMsgConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeMsgProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeNameEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodePropertyEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodePropertyNameEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeSrvConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeSrvProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.TopicEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.TopicNameEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.WireEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.WireSrvNameEditPart;
import org.hyperflex.roscomponentmodel.diagram.part.RosComponentModelDiagramEditorPlugin;
import org.hyperflex.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry;
import org.hyperflex.roscomponentmodel.diagram.providers.RosComponentModelElementTypes;
import org.hyperflex.roscomponentmodel.diagram.providers.RosComponentModelParserProvider;

/**
 * @generated
 */
public class RosComponentModelNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		RosComponentModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		RosComponentModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof RosComponentModelNavigatorItem
				&& !isOwnView(((RosComponentModelNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof RosComponentModelNavigatorGroup) {
			RosComponentModelNavigatorGroup group = (RosComponentModelNavigatorGroup) element;
			return RosComponentModelDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof RosComponentModelNavigatorItem) {
			RosComponentModelNavigatorItem navigatorItem = (RosComponentModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (RosComponentModelVisualIDRegistry.getVisualID(view)) {
		case ArchitectureModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.hyperflex.org/componentmodels.ros?System", RosComponentModelElementTypes.System_1000); //$NON-NLS-1$
		case CompositeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.hyperflex.org/componentmodels.ros?Composite", RosComponentModelElementTypes.Composite_2001); //$NON-NLS-1$
		case NodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.ros?Node", RosComponentModelElementTypes.Node_3001); //$NON-NLS-1$
		case NodePropertyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.ros?NodeProperty", RosComponentModelElementTypes.NodeProperty_3002); //$NON-NLS-1$
		case NodeMsgProducerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.ros?NodeMsgProducer", RosComponentModelElementTypes.NodeMsgProducer_3003); //$NON-NLS-1$
		case NodeMsgConsumerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.ros?NodeMsgConsumer", RosComponentModelElementTypes.NodeMsgConsumer_3004); //$NON-NLS-1$
		case NodeSrvProducerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.ros?NodeSrvProducer", RosComponentModelElementTypes.NodeSrvProducer_3005); //$NON-NLS-1$
		case NodeSrvConsumerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.ros?NodeSrvConsumer", RosComponentModelElementTypes.NodeSrvConsumer_3006); //$NON-NLS-1$
		case Composite2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.ros?Composite", RosComponentModelElementTypes.Composite_3007); //$NON-NLS-1$
		case CompositeMsgProducerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.ros?CompositeMsgProducer", RosComponentModelElementTypes.CompositeMsgProducer_3008); //$NON-NLS-1$
		case CompositeMsgConsumerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.ros?CompositeMsgConsumer", RosComponentModelElementTypes.CompositeMsgConsumer_3009); //$NON-NLS-1$
		case CompositeSrvProducerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.ros?CompositeSrvProducer", RosComponentModelElementTypes.CompositeSrvProducer_3010); //$NON-NLS-1$
		case CompositeSrvConsumerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.ros?CompositeSrvConsumer", RosComponentModelElementTypes.CompositeSrvConsumer_3011); //$NON-NLS-1$
		case CompositeMsgProducer2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.ros?CompositeMsgProducer", RosComponentModelElementTypes.CompositeMsgProducer_3012); //$NON-NLS-1$
		case CompositeMsgConsumer2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.ros?CompositeMsgConsumer", RosComponentModelElementTypes.CompositeMsgConsumer_3013); //$NON-NLS-1$
		case TopicEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.ros?Topic", RosComponentModelElementTypes.Topic_3014); //$NON-NLS-1$
		case CompositeSrvProducer2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.ros?CompositeSrvProducer", RosComponentModelElementTypes.CompositeSrvProducer_3015); //$NON-NLS-1$
		case CompositeSrvConsumer2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.ros?CompositeSrvConsumer", RosComponentModelElementTypes.CompositeSrvConsumer_3016); //$NON-NLS-1$
		case MsgInterfaceConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/componentmodels.ros?MsgInterface?connection", RosComponentModelElementTypes.MsgInterfaceConnection_4001); //$NON-NLS-1$
		case MsgInterfaceConnection2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/componentmodels.ros?MsgInterface?connection", RosComponentModelElementTypes.MsgInterfaceConnection_4002); //$NON-NLS-1$
		case CompositeMsgInterfaceExposedEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/componentmodels.ros?CompositeMsgInterface?exposed", RosComponentModelElementTypes.CompositeMsgInterfaceExposed_4003); //$NON-NLS-1$
		case CompositeMsgInterfaceExposed2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/componentmodels.ros?CompositeMsgInterface?exposed", RosComponentModelElementTypes.CompositeMsgInterfaceExposed_4004); //$NON-NLS-1$
		case CompositeSrvProducerPromoteEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/componentmodels.ros?CompositeSrvProducer?promote", RosComponentModelElementTypes.CompositeSrvProducerPromote_4005); //$NON-NLS-1$
		case CompositeSrvProducerPromote2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/componentmodels.ros?CompositeSrvProducer?promote", RosComponentModelElementTypes.CompositeSrvProducerPromote_4006); //$NON-NLS-1$
		case WireEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/componentmodels.ros?Wire", RosComponentModelElementTypes.Wire_4007); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = RosComponentModelDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& RosComponentModelElementTypes
						.isKnownElementType(elementType)) {
			image = RosComponentModelElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof RosComponentModelNavigatorGroup) {
			RosComponentModelNavigatorGroup group = (RosComponentModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof RosComponentModelNavigatorItem) {
			RosComponentModelNavigatorItem navigatorItem = (RosComponentModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (RosComponentModelVisualIDRegistry.getVisualID(view)) {
		case ArchitectureModelEditPart.VISUAL_ID:
			return getSystem_1000Text(view);
		case CompositeEditPart.VISUAL_ID:
			return getComposite_2001Text(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_3001Text(view);
		case NodePropertyEditPart.VISUAL_ID:
			return getNodeProperty_3002Text(view);
		case NodeMsgProducerEditPart.VISUAL_ID:
			return getNodeMsgProducer_3003Text(view);
		case NodeMsgConsumerEditPart.VISUAL_ID:
			return getNodeMsgConsumer_3004Text(view);
		case NodeSrvProducerEditPart.VISUAL_ID:
			return getNodeSrvProducer_3005Text(view);
		case NodeSrvConsumerEditPart.VISUAL_ID:
			return getNodeSrvConsumer_3006Text(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3007Text(view);
		case CompositeMsgProducerEditPart.VISUAL_ID:
			return getCompositeMsgProducer_3008Text(view);
		case CompositeMsgConsumerEditPart.VISUAL_ID:
			return getCompositeMsgConsumer_3009Text(view);
		case CompositeSrvProducerEditPart.VISUAL_ID:
			return getCompositeSrvProducer_3010Text(view);
		case CompositeSrvConsumerEditPart.VISUAL_ID:
			return getCompositeSrvConsumer_3011Text(view);
		case CompositeMsgProducer2EditPart.VISUAL_ID:
			return getCompositeMsgProducer_3012Text(view);
		case CompositeMsgConsumer2EditPart.VISUAL_ID:
			return getCompositeMsgConsumer_3013Text(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_3014Text(view);
		case CompositeSrvProducer2EditPart.VISUAL_ID:
			return getCompositeSrvProducer_3015Text(view);
		case CompositeSrvConsumer2EditPart.VISUAL_ID:
			return getCompositeSrvConsumer_3016Text(view);
		case MsgInterfaceConnectionEditPart.VISUAL_ID:
			return getMsgInterfaceConnection_4001Text(view);
		case MsgInterfaceConnection2EditPart.VISUAL_ID:
			return getMsgInterfaceConnection_4002Text(view);
		case CompositeMsgInterfaceExposedEditPart.VISUAL_ID:
			return getCompositeMsgInterfaceExposed_4003Text(view);
		case CompositeMsgInterfaceExposed2EditPart.VISUAL_ID:
			return getCompositeMsgInterfaceExposed_4004Text(view);
		case CompositeSrvProducerPromoteEditPart.VISUAL_ID:
			return getCompositeSrvProducerPromote_4005Text(view);
		case CompositeSrvProducerPromote2EditPart.VISUAL_ID:
			return getCompositeSrvProducerPromote_4006Text(view);
		case WireEditPart.VISUAL_ID:
			return getWire_4007Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getSystem_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getComposite_2001Text(View view) {
		IParser parser = RosComponentModelParserProvider.getParser(
				RosComponentModelElementTypes.Composite_2001,
				view.getElement() != null ? view.getElement() : view,
				RosComponentModelVisualIDRegistry
						.getType(CompositeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNode_3001Text(View view) {
		IParser parser = RosComponentModelParserProvider.getParser(
				RosComponentModelElementTypes.Node_3001,
				view.getElement() != null ? view.getElement() : view,
				RosComponentModelVisualIDRegistry
						.getType(NodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNodeProperty_3002Text(View view) {
		IParser parser = RosComponentModelParserProvider.getParser(
				RosComponentModelElementTypes.NodeProperty_3002, view
						.getElement() != null ? view.getElement() : view,
				RosComponentModelVisualIDRegistry
						.getType(NodePropertyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNodeMsgProducer_3003Text(View view) {
		NodeMsgProducer domainModelElement = (NodeMsgProducer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNodeMsgConsumer_3004Text(View view) {
		NodeMsgConsumer domainModelElement = (NodeMsgConsumer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNodeSrvProducer_3005Text(View view) {
		NodeSrvProducer domainModelElement = (NodeSrvProducer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNodeSrvConsumer_3006Text(View view) {
		NodeSrvConsumer domainModelElement = (NodeSrvConsumer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComposite_3007Text(View view) {
		IParser parser = RosComponentModelParserProvider.getParser(
				RosComponentModelElementTypes.Composite_3007,
				view.getElement() != null ? view.getElement() : view,
				RosComponentModelVisualIDRegistry
						.getType(CompositeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeMsgProducer_3008Text(View view) {
		CompositeMsgProducer domainModelElement = (CompositeMsgProducer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeMsgConsumer_3009Text(View view) {
		CompositeMsgConsumer domainModelElement = (CompositeMsgConsumer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeSrvProducer_3010Text(View view) {
		CompositeSrvProducer domainModelElement = (CompositeSrvProducer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeSrvConsumer_3011Text(View view) {
		CompositeSrvConsumer domainModelElement = (CompositeSrvConsumer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeMsgProducer_3012Text(View view) {
		CompositeMsgProducer domainModelElement = (CompositeMsgProducer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeMsgConsumer_3013Text(View view) {
		CompositeMsgConsumer domainModelElement = (CompositeMsgConsumer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTopic_3014Text(View view) {
		IParser parser = RosComponentModelParserProvider.getParser(
				RosComponentModelElementTypes.Topic_3014,
				view.getElement() != null ? view.getElement() : view,
				RosComponentModelVisualIDRegistry
						.getType(TopicNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeSrvProducer_3015Text(View view) {
		CompositeSrvProducer domainModelElement = (CompositeSrvProducer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeSrvConsumer_3016Text(View view) {
		CompositeSrvConsumer domainModelElement = (CompositeSrvConsumer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMsgInterfaceConnection_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMsgInterfaceConnection_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCompositeMsgInterfaceExposed_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCompositeMsgInterfaceExposed_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCompositeSrvProducerPromote_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCompositeSrvProducerPromote_4006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getWire_4007Text(View view) {
		IParser parser = RosComponentModelParserProvider.getParser(
				RosComponentModelElementTypes.Wire_4007,
				view.getElement() != null ? view.getElement() : view,
				RosComponentModelVisualIDRegistry
						.getType(WireSrvNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ArchitectureModelEditPart.MODEL_ID
				.equals(RosComponentModelVisualIDRegistry.getModelID(view));
	}

}
