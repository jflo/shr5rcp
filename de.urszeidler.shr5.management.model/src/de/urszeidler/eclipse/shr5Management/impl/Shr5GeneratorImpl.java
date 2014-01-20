/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5Management.Attributes;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.MetaType;
import de.urszeidler.eclipse.shr5Management.Resourcen;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.Skill;
import de.urszeidler.eclipse.shr5Management.SpecialType;
import de.urszeidler.eclipse.shr5Management.Spellcaster;
import de.urszeidler.eclipse.shr5Management.Technomancer;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;
import de.urszeidler.eclipse.shr5Management.util.Shr5managementValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Shr5 Generator</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl#getResourcen <em>Resourcen</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl#getSkills <em>Skills</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl#getAttribute <em>Attribute</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl#getMetaType <em>Meta Type</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl#getMagic <em>Magic</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl#getKarmaToResource <em>Karma To Resource</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl#getKarmaSpend <em>Karma Spend</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl#getShr5Generator <em>Shr5 Generator</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class Shr5GeneratorImpl extends CharacterGeneratorImpl implements Shr5Generator {
    /**
     * The cached value of the '{@link #getResourcen() <em>Resourcen</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getResourcen()
     * @generated
     * @ordered
     */
    protected Resourcen resourcen;

    /**
     * The cached value of the '{@link #getSkills() <em>Skills</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSkills()
     * @generated
     * @ordered
     */
    protected Skill skills;

    /**
     * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAttribute()
     * @generated
     * @ordered
     */
    protected Attributes attribute;

    /**
     * The cached value of the '{@link #getMetaType() <em>Meta Type</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getMetaType()
     * @generated
     * @ordered
     */
    protected MetaType metaType;

    /**
     * The cached value of the '{@link #getMagic() <em>Magic</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getMagic()
     * @generated
     * @ordered
     */
    protected SpecialType magic;

    /**
     * The default value of the '{@link #getKarmaToResource() <em>Karma To Resource</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getKarmaToResource()
     * @generated
     * @ordered
     */
    protected static final int KARMA_TO_RESOURCE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getKarmaToResource() <em>Karma To Resource</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getKarmaToResource()
     * @generated
     * @ordered
     */
    protected int karmaToResource = KARMA_TO_RESOURCE_EDEFAULT;

    /**
     * The default value of the '{@link #getKarmaSpend() <em>Karma Spend</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getKarmaSpend()
     * @generated
     * @ordered
     */
    protected static final int KARMA_SPEND_EDEFAULT = 0;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected Shr5GeneratorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.SHR5_GENERATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Resourcen getResourcen() {
        if (resourcen != null && resourcen.eIsProxy()) {
            InternalEObject oldResourcen = (InternalEObject)resourcen;
            resourcen = (Resourcen)eResolveProxy(oldResourcen);
            if (resourcen != oldResourcen) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.SHR5_GENERATOR__RESOURCEN, oldResourcen,
                            resourcen));
            }
        }
        return resourcen;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Resourcen basicGetResourcen() {
        return resourcen;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setResourcen(Resourcen newResourcen) {
        Resourcen oldResourcen = resourcen;
        resourcen = newResourcen;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_GENERATOR__RESOURCEN, oldResourcen, resourcen));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Skill getSkills() {
        if (skills != null && skills.eIsProxy()) {
            InternalEObject oldSkills = (InternalEObject)skills;
            skills = (Skill)eResolveProxy(oldSkills);
            if (skills != oldSkills) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.SHR5_GENERATOR__SKILLS, oldSkills, skills));
            }
        }
        return skills;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Skill basicGetSkills() {
        return skills;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setSkills(Skill newSkills) {
        Skill oldSkills = skills;
        skills = newSkills;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_GENERATOR__SKILLS, oldSkills, skills));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Attributes getAttribute() {
        if (attribute != null && attribute.eIsProxy()) {
            InternalEObject oldAttribute = (InternalEObject)attribute;
            attribute = (Attributes)eResolveProxy(oldAttribute);
            if (attribute != oldAttribute) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.SHR5_GENERATOR__ATTRIBUTE, oldAttribute,
                            attribute));
            }
        }
        return attribute;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Attributes basicGetAttribute() {
        return attribute;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setAttribute(Attributes newAttribute) {
        Attributes oldAttribute = attribute;
        attribute = newAttribute;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_GENERATOR__ATTRIBUTE, oldAttribute, attribute));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public MetaType getMetaType() {
        if (metaType != null && metaType.eIsProxy()) {
            InternalEObject oldMetaType = (InternalEObject)metaType;
            metaType = (MetaType)eResolveProxy(oldMetaType);
            if (metaType != oldMetaType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.SHR5_GENERATOR__META_TYPE, oldMetaType, metaType));
            }
        }
        return metaType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public MetaType basicGetMetaType() {
        return metaType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setMetaType(MetaType newMetaType) {
        MetaType oldMetaType = metaType;
        metaType = newMetaType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_GENERATOR__META_TYPE, oldMetaType, metaType));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SpecialType getMagic() {
        if (magic != null && magic.eIsProxy()) {
            InternalEObject oldMagic = (InternalEObject)magic;
            magic = (SpecialType)eResolveProxy(oldMagic);
            if (magic != oldMagic) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.SHR5_GENERATOR__MAGIC, oldMagic, magic));
            }
        }
        return magic;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SpecialType basicGetMagic() {
        return magic;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setMagic(SpecialType newMagic) {
        SpecialType oldMagic = magic;
        magic = newMagic;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_GENERATOR__MAGIC, oldMagic, magic));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public int getKarmaToResource() {
        return karmaToResource;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public void setKarmaToResource(int newKarmaToResource) {
        int oldKarmaToResource = karmaToResource;
        karmaToResource = newKarmaToResource;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_GENERATOR__KARMA_TO_RESOURCE, oldKarmaToResource,
                    karmaToResource));
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_GENERATOR__KARMA_SPEND, oldKarmaToResource,
                    karmaToResource));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getKarmaSpend() {
        if (getCharacter() == null || getCharacter().getPersona() == null)
            return 0;
        int karmaKosten = 0;
        AbstraktPersona persona = getCharacter().getPersona();
        if (persona instanceof KoerperPersona) {
            KoerperPersona kp = (KoerperPersona)persona;
            EList<PersonaEigenschaft> eigenschaften = kp.getEigenschaften();
            for (PersonaEigenschaft personaEigenschaft : eigenschaften) {
                karmaKosten = karmaKosten + personaEigenschaft.getKarmaKosten();
            }

        }
        // TODO need to calc the karma cost
        return karmaKosten + getKarmaToResource();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Shr5System getShr5Generator() {
        Shr5System shr5Generator = basicGetShr5Generator();
        return shr5Generator != null && shr5Generator.eIsProxy() ? (Shr5System)eResolveProxy((InternalEObject)shr5Generator) : shr5Generator;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public Shr5System basicGetShr5Generator() {
        if (generator instanceof Shr5System) {
            Shr5System sr5 = (Shr5System)generator;
            return sr5;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public boolean hasCategoryOnlyOnce(DiagnosticChain diagnostics, Map<Object, Object> context) {

        HashSet<String> set = new HashSet<String>();
        if (getMetaType() != null)
            set.add(getMetaType().getCategorieName());
        if (getAttribute() != null)
            set.add(getAttribute().getCategorieName());
        if (getMagic() != null)
            set.add(getMagic().getCategorieName());
        if (getSkills() != null)
            set.add(getSkills().getCategorieName());
        if (getResourcen() != null)
            set.add(getResourcen().getCategorieName());

        if (set.size() != 5) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_GENERATOR__HAS_CATEGORY_ONLY_ONCE, EcorePlugin.INSTANCE.getString(
                                "_UI_GenericInvariant_diagnostic",
                                new Object[]{ "hasCategoryOnlyOnce", EObjectValidator.getObjectLabel(this, context) }), new Object[]{ this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public boolean hasNotSpendAllPoints(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (getShr5Generator() == null || getSkills() == null || getAttribute() == null || getResourcen() == null || getMetaType() == null
                || getMagic() == null)
            return true;

        int karmaPoints = getShr5Generator().getKarmaPoints();

        boolean haseSpendAllPoints = false;
        if (magic instanceof Spellcaster) {
            Spellcaster sc = (Spellcaster)magic;
            if (sc.calcSpellPointsSpend(getCharacter()) != sc.getSpellPoints())
                haseSpendAllPoints = true;
        } else if (magic instanceof Technomancer) {
            Technomancer tm = (Technomancer)magic;
            if (tm.calcComplexFormsSpend(getCharacter()) != tm.getComplexForms())
                haseSpendAllPoints = true;
        }

        int skillPoints = getSkills().getSkillPoints();
        int groupPoints = getSkills().getGroupPoints();
        boolean notAllSpend = haseSpendAllPoints
                || getKarmaSpend() != karmaPoints
                || getAttribute().calcAttributesSpend(getCharacter()) != getAttribute().getAttibutePoints()
                || getShr5Generator().getMaxResourceToKeep() < getResourcen().getResource() - getResourcen().calcResourceSpend(getCharacter())
                || getMagic().calcSkillsSpend(getCharacter()) != getMagic().getSkillNumber()
                || getMetaType().calcSpecialPointsSpend(getCharacter()) != getMetaType().getSpecialPoints()
                || getSkills().calcSkillSpend(getCharacter()) != skillPoints || getSkills().calcGroupSpend(getCharacter()) != groupPoints;
        if (notAllSpend) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_GENERATOR__HAS_NOT_SPEND_ALL_POINTS, EcorePlugin.INSTANCE.getString(
                                "_UI_GenericInvariant_diagnostic",
                                new Object[]{ "hasNotSpendAllPoints", EObjectValidator.getObjectLabel(this, context) }), new Object[]{ this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public boolean hasNotMoreMaxAttributes(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (getShr5Generator() == null)
            return true;
        ManagedCharacter managedCharacter = getCharacter();
        if (managedCharacter == null)
            return true;
        AbstraktPersona persona = managedCharacter.getPersona();
        if (persona == null)
            return true;

        Spezies spezies = persona.getSpezies();
        if (spezies == null)
            return true;

        getShr5Generator().getNumberOfMaxAttributes();
        int counter = 0;

        if (persona.getKonstitutionBasis() >= spezies.getKonstitutionMax())
            counter++;
        if (persona.getGeschicklichkeitBasis() >= spezies.getGeschicklichkeitMax())
            counter++;
        if (persona.getReaktionBasis() >= spezies.getReaktionMax())
            counter++;
        if (persona.getStaerkeBasis() >= spezies.getStaerkeMax())
            counter++;

        if (persona.getCharismaBasis() >= spezies.getCharismaMax())
            counter++;

        if (persona.getLogikBasis() >= spezies.getLogikMax())
            counter++;
        if (persona.getWillenskraftBasis() >= spezies.getWillenskraftMax())
            counter++;
        if (persona.getIntuitionBasis() >= spezies.getIntuitionMax())
            counter++;

        if (counter > getShr5Generator().getNumberOfMaxAttributes()) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_GENERATOR__HAS_NOT_MORE_MAX_ATTRIBUTES, EcorePlugin.INSTANCE.getString(
                                "_UI_GenericInvariant_diagnostic",
                                new Object[]{ "hasNotMoreMaxAttributes", EObjectValidator.getObjectLabel(this, context) }), new Object[]{ this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public boolean hasNotSpendAllAttributesPoints(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (getAttribute() == null)
            return true;

        if (getAttribute().calcAttributesSpend(getCharacter()) != getAttribute().getAttibutePoints()) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_GENERATOR__HAS_NOT_SPEND_ALL_ATTRIBUTES_POINTS, EcorePlugin.INSTANCE.getString(
                                "_UI_GenericInvariant_diagnostic",
                                new Object[]{ "hasNotSpendAllAttributesPoints", EObjectValidator.getObjectLabel(this, context) }),
                        new Object[]{ this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public boolean hasNotSpendSkillAllPoints(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (getSkills() == null)
            return true;

        int skillPoints = getSkills().getSkillPoints();
        int groupPoints = getSkills().getGroupPoints();
        if (getSkills().calcSkillSpend(getCharacter()) != skillPoints || getSkills().calcGroupSpend(getCharacter()) != groupPoints) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_GENERATOR__HAS_NOT_SPEND_SKILL_ALL_POINTS, EcorePlugin.INSTANCE.getString(
                                "_UI_GenericInvariant_diagnostic",
                                new Object[]{ "hasNotSpendSkillAllPoints", EObjectValidator.getObjectLabel(this, context) }), new Object[]{ this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public boolean hasNotSpendAllSpecialPoints(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (getMetaType() == null)
            return true;

        if (getMetaType().calcSpecialPointsSpend(getCharacter()) != getMetaType().getSpecialPoints()) {
            if (diagnostics != null) {
                diagnostics
                        .add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                                Shr5managementValidator.SHR5_GENERATOR__HAS_NOT_SPEND_ALL_SPECIAL_POINTS, EcorePlugin.INSTANCE.getString(
                                        "_UI_GenericInvariant_diagnostic",
                                        new Object[]{ "hasNotSpendAllSpecialPoints", EObjectValidator.getObjectLabel(this, context) }),
                                new Object[]{ this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public boolean hasNotSpendAllSpecialTypePoints(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (getMagic() == null)
            return true;

        boolean hasSpendAllPoints = false;
        if (magic instanceof Spellcaster) {
            Spellcaster sc = (Spellcaster)magic;
            if (sc.calcSpellPointsSpend(getCharacter()) != sc.getSpellPoints())
                hasSpendAllPoints = true;
        } else if (magic instanceof Technomancer) {
            Technomancer tm = (Technomancer)magic;
            if (tm.calcComplexFormsSpend(getCharacter()) != tm.getComplexForms())
                hasSpendAllPoints = true;
        }

        if (hasSpendAllPoints || getMagic().calcSkillsSpend(getCharacter()) != getMagic().getSkillNumber()) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_GENERATOR__HAS_NOT_SPEND_ALL_SPECIAL_TYPE_POINTS, EcorePlugin.INSTANCE.getString(
                                "_UI_GenericInvariant_diagnostic",
                                new Object[]{ "hasNotSpendAllSpecialTypePoints", EObjectValidator.getObjectLabel(this, context) }),
                        new Object[]{ this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public boolean hasNotSpendAllConnectionPoints(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (getShr5Generator() == null)
            return true;
        ManagedCharacter managedCharacter = getCharacter();
        if (managedCharacter == null)
            return true;
        AbstraktPersona persona = managedCharacter.getPersona();
        if (persona == null)
            return true;

        int allPoints = persona.getCharisma() * getShr5Generator().getCharismaToConnectionFactor();
        int pointsSpend = ShadowrunManagmentTools.calcConnectionsSpend(managedCharacter);

        if (pointsSpend >= allPoints) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_GENERATOR__HAS_NOT_SPEND_ALL_CONNECTION_POINTS, EcorePlugin.INSTANCE.getString(
                                "_UI_GenericInvariant_diagnostic",
                                new Object[]{ "hasNotSpendAllConnectionPoints", EObjectValidator.getObjectLabel(this, context) }),
                        new Object[]{ this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public boolean hasNotSpendAllResourcePoints(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (getShr5Generator() == null)
            return true;

        boolean test = getShr5Generator().getMaxResourceToKeep() < getResourcen().getResource() - getResourcen().calcResourceSpend(getCharacter());
        if (test) {
            if (diagnostics != null) {
                diagnostics
                        .add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                                Shr5managementValidator.SHR5_GENERATOR__HAS_NOT_SPEND_ALL_RESOURCE_POINTS, EcorePlugin.INSTANCE.getString(
                                        "_UI_GenericInvariant_diagnostic",
                                        new Object[]{ "hasNotSpendAllResourcePoints", EObjectValidator.getObjectLabel(this, context) }),
                                new Object[]{ this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.SHR5_GENERATOR__RESOURCEN:
                if (resolve)
                    return getResourcen();
                return basicGetResourcen();
            case Shr5managementPackage.SHR5_GENERATOR__SKILLS:
                if (resolve)
                    return getSkills();
                return basicGetSkills();
            case Shr5managementPackage.SHR5_GENERATOR__ATTRIBUTE:
                if (resolve)
                    return getAttribute();
                return basicGetAttribute();
            case Shr5managementPackage.SHR5_GENERATOR__META_TYPE:
                if (resolve)
                    return getMetaType();
                return basicGetMetaType();
            case Shr5managementPackage.SHR5_GENERATOR__MAGIC:
                if (resolve)
                    return getMagic();
                return basicGetMagic();
            case Shr5managementPackage.SHR5_GENERATOR__KARMA_TO_RESOURCE:
                return getKarmaToResource();
            case Shr5managementPackage.SHR5_GENERATOR__KARMA_SPEND:
                return getKarmaSpend();
            case Shr5managementPackage.SHR5_GENERATOR__SHR5_GENERATOR:
                if (resolve)
                    return getShr5Generator();
                return basicGetShr5Generator();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Shr5managementPackage.SHR5_GENERATOR__RESOURCEN:
                setResourcen((Resourcen)newValue);
                return;
            case Shr5managementPackage.SHR5_GENERATOR__SKILLS:
                setSkills((Skill)newValue);
                return;
            case Shr5managementPackage.SHR5_GENERATOR__ATTRIBUTE:
                setAttribute((Attributes)newValue);
                return;
            case Shr5managementPackage.SHR5_GENERATOR__META_TYPE:
                setMetaType((MetaType)newValue);
                return;
            case Shr5managementPackage.SHR5_GENERATOR__MAGIC:
                setMagic((SpecialType)newValue);
                return;
            case Shr5managementPackage.SHR5_GENERATOR__KARMA_TO_RESOURCE:
                setKarmaToResource((Integer)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Shr5managementPackage.SHR5_GENERATOR__RESOURCEN:
                setResourcen((Resourcen)null);
                return;
            case Shr5managementPackage.SHR5_GENERATOR__SKILLS:
                setSkills((Skill)null);
                return;
            case Shr5managementPackage.SHR5_GENERATOR__ATTRIBUTE:
                setAttribute((Attributes)null);
                return;
            case Shr5managementPackage.SHR5_GENERATOR__META_TYPE:
                setMetaType((MetaType)null);
                return;
            case Shr5managementPackage.SHR5_GENERATOR__MAGIC:
                setMagic((SpecialType)null);
                return;
            case Shr5managementPackage.SHR5_GENERATOR__KARMA_TO_RESOURCE:
                setKarmaToResource(KARMA_TO_RESOURCE_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Shr5managementPackage.SHR5_GENERATOR__RESOURCEN:
                return resourcen != null;
            case Shr5managementPackage.SHR5_GENERATOR__SKILLS:
                return skills != null;
            case Shr5managementPackage.SHR5_GENERATOR__ATTRIBUTE:
                return attribute != null;
            case Shr5managementPackage.SHR5_GENERATOR__META_TYPE:
                return metaType != null;
            case Shr5managementPackage.SHR5_GENERATOR__MAGIC:
                return magic != null;
            case Shr5managementPackage.SHR5_GENERATOR__KARMA_TO_RESOURCE:
                return karmaToResource != KARMA_TO_RESOURCE_EDEFAULT;
            case Shr5managementPackage.SHR5_GENERATOR__KARMA_SPEND:
                return getKarmaSpend() != KARMA_SPEND_EDEFAULT;
            case Shr5managementPackage.SHR5_GENERATOR__SHR5_GENERATOR:
                return basicGetShr5Generator() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    @SuppressWarnings("unchecked")
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case Shr5managementPackage.SHR5_GENERATOR___HAS_CATEGORY_ONLY_ONCE__DIAGNOSTICCHAIN_MAP:
                return hasCategoryOnlyOnce((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case Shr5managementPackage.SHR5_GENERATOR___HAS_NOT_SPEND_ALL_POINTS__DIAGNOSTICCHAIN_MAP:
                return hasNotSpendAllPoints((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case Shr5managementPackage.SHR5_GENERATOR___HAS_NOT_MORE_MAX_ATTRIBUTES__DIAGNOSTICCHAIN_MAP:
                return hasNotMoreMaxAttributes((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case Shr5managementPackage.SHR5_GENERATOR___HAS_NOT_SPEND_ALL_ATTRIBUTES_POINTS__DIAGNOSTICCHAIN_MAP:
                return hasNotSpendAllAttributesPoints((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case Shr5managementPackage.SHR5_GENERATOR___HAS_NOT_SPEND_SKILL_ALL_POINTS__DIAGNOSTICCHAIN_MAP:
                return hasNotSpendSkillAllPoints((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case Shr5managementPackage.SHR5_GENERATOR___HAS_NOT_SPEND_ALL_SPECIAL_POINTS__DIAGNOSTICCHAIN_MAP:
                return hasNotSpendAllSpecialPoints((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case Shr5managementPackage.SHR5_GENERATOR___HAS_NOT_SPEND_ALL_SPECIAL_TYPE_POINTS__DIAGNOSTICCHAIN_MAP:
                return hasNotSpendAllSpecialTypePoints((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case Shr5managementPackage.SHR5_GENERATOR___HAS_NOT_SPEND_ALL_CONNECTION_POINTS__DIAGNOSTICCHAIN_MAP:
                return hasNotSpendAllConnectionPoints((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case Shr5managementPackage.SHR5_GENERATOR___HAS_NOT_SPEND_ALL_RESOURCE_POINTS__DIAGNOSTICCHAIN_MAP:
                return hasNotSpendAllResourcePoints((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
        }
        return super.eInvoke(operationID, arguments);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (karmaToResource: ");
        result.append(karmaToResource);
        result.append(')');
        return result.toString();
    }

} // Shr5GeneratorImpl
