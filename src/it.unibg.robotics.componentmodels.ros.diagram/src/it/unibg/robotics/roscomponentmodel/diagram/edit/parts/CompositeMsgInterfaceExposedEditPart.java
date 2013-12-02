package it.unibg.robotics.roscomponentmodel.diagram.edit.parts;

import it.unibg.robotics.roscomponentmodel.diagram.edit.policies.CompositeMsgInterfaceExposedItemSemanticEditPolicy;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class CompositeMsgInterfaceExposedEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4007;

	/**
	 * @generated
	 */
	public CompositeMsgInterfaceExposedEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompositeMsgInterfaceExposedItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new ExposeProducerConnectionFigure();
	}

	/**
	 * @generated
	 */
	public ExposeProducerConnectionFigure getPrimaryShape() {
		return (ExposeProducerConnectionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ExposeProducerConnectionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureExposeProducerConnectionLabel;

		/**
		 * @generated
		 */
		public ExposeProducerConnectionFigure() {
			this.setLineStyle(Graphics.LINE_DOT);

			createContents();
			setSourceDecoration(createSourceDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureExposeProducerConnectionLabel = new WrappingLabel();

			fFigureExposeProducerConnectionLabel.setText("");

			fFigureExposeProducerConnectionLabel
					.setFont(FFIGUREEXPOSEPRODUCERCONNECTIONLABEL_FONT);

			this.add(fFigureExposeProducerConnectionLabel);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createSourceDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			df.setLineWidth(2);
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureExposeProducerConnectionLabel() {
			return fFigureExposeProducerConnectionLabel;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREEXPOSEPRODUCERCONNECTIONLABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 15, SWT.NORMAL);

}