/**
 */
package de.urszeidler.eclipse.shr5.tests;

import java.math.BigDecimal;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Cyberware;
import de.urszeidler.eclipse.shr5.CyberwareEnhancement;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cyberware</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeldWert#getWert() <em>Wert</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Capacity#getCapacityFeature() <em>Capacity Feature</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Capacity#getCapacity() <em>Capacity</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Capacity#getCapacityRemains() <em>Capacity Remains</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Capacity#canAdd(org.eclipse.emf.ecore.EObject) <em>Can Add</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CyberwareTest extends KoerpermodsTest {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(CyberwareTest.class);
    }

	/**
     * Constructs a new Cyberware test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CyberwareTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Cyberware test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected Cyberware getFixture() {
        return (Cyberware)fixture;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
	@Override
	protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createCyberware());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
	@Override
	protected void tearDown() throws Exception {
        setFixture(null);
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.GeldWert#getWert() <em>Wert</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.GeldWert#getWert()
     * @generated not
     */
    public void testGetWert() {
        getFixture().setWertValue(new BigDecimal(10));        
        assertEquals(10,getFixture().getWert().intValue());
    }

    
    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Capacity#getCapacityFeature() <em>Capacity Feature</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Capacity#getCapacityFeature()
     * @generated not
     */
    public void testGetCapacityFeature() {
        assertEquals(Shr5Package.Literals.CYBERWARE__EINBAU, getFixture().getCapacityFeature());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Capacity#getCapacity() <em>Capacity</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Capacity#getCapacity()
     * @generated not
     */
    public void testGetCapacity() {
        getFixture().setCyberwareCapacity(10);
        assertEquals(10, getFixture().getCapacity());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Capacity#getCapacityRemains() <em>Capacity Remains</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Capacity#getCapacityRemains()
     * @generated not
     */
    public void testGetCapacityRemains() {
        getFixture().setCyberwareCapacity(10);
        assertEquals(10, getFixture().getCapacityRemains());
        
        CyberwareEnhancement gegenstand = Shr5Factory.eINSTANCE.createCyberwareEnhancement();
        gegenstand.setCapacityUse(2);
        getFixture().getEinbau().add(gegenstand);
        assertEquals(8, getFixture().getCapacityRemains());
        
        gegenstand = Shr5Factory.eINSTANCE.createCyberwareEnhancement();
        gegenstand.setCapacityUse(3);
        getFixture().getEinbau().add(gegenstand);
        assertEquals(5, getFixture().getCapacityRemains());
        
        getFixture().getEinbau().remove(gegenstand);
        assertEquals(8, getFixture().getCapacityRemains());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Capacity#canAdd(org.eclipse.emf.ecore.EObject) <em>Can Add</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Capacity#canAdd(org.eclipse.emf.ecore.EObject)
     * @generated not
     */
    public void testCanAdd__EObject() {
        getFixture().setCyberwareCapacity(10);
        assertEquals(10, getFixture().getCapacityRemains());
        
        CyberwareEnhancement gegenstand = Shr5Factory.eINSTANCE.createCyberwareEnhancement();
        gegenstand.setCapacityUse(10);
        assertFalse(getFixture().canAdd(gegenstand));
        gegenstand.setCapacityUse(9);
        assertTrue(getFixture().canAdd(gegenstand));
        getFixture().getEinbau().add(gegenstand);
        assertEquals(1, getFixture().getCapacityRemains());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.GeldWert#getWert() <em>Wert</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.GeldWert#getWert()
     * @generated not
     */
    public void testGetWert_SubItems() {
        getFixture().setWertValue(new BigDecimal(10));        
        assertEquals(10,getFixture().getWert().intValue());
        
        CyberwareEnhancement gegenstand = Shr5Factory.eINSTANCE.createCyberwareEnhancement();
        gegenstand.setWertValue(new BigDecimal(10));
        getFixture().getEinbau().add(gegenstand);
        assertEquals(20,getFixture().getWert().intValue());        
    }

} //CyberwareTest
