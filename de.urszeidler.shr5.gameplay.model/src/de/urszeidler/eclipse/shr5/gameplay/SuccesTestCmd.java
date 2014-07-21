/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Succes Test Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.SuccesTestCmd#getDicePool <em>Dice Pool</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSuccesTestCmd()
 * @model
 * @generated
 */
public interface SuccesTestCmd extends ProbeCommand {
    /**
     * Returns the value of the '<em><b>Dice Pool</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dice Pool</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dice Pool</em>' attribute.
     * @see #setDicePool(int)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSuccesTestCmd_DicePool()
     * @model
     * @generated
     */
    int getDicePool();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.SuccesTestCmd#getDicePool <em>Dice Pool</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dice Pool</em>' attribute.
     * @see #getDicePool()
     * @generated
     */
    void setDicePool(int value);

} // SuccesTestCmd