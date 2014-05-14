/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import de.urszeidler.eclipse.shr5.AbstaktWaffe;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import de.urszeidler.eclipse.shr5.AutoSoft;
import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Drohne;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.Identifiable;
import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SourceBook;
import java.math.BigDecimal;
import org.eclipse.emf.common.notify.Notification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auto Soft</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AutoSoftImpl#getWert <em>Wert</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AutoSoftImpl#getVerfuegbarkeit <em>Verfuegbarkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AutoSoftImpl#getWertValue <em>Wert Value</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AutoSoftImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AutoSoftImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AutoSoftImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AutoSoftImpl#getParentId <em>Parent Id</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AutoSoftImpl#getPage <em>Page</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AutoSoftImpl#getSrcBook <em>Src Book</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AutoSoftImpl#getRating <em>Rating</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AutoSoftImpl#getSkill <em>Skill</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AutoSoftImpl#getWeapon <em>Weapon</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AutoSoftImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AutoSoftImpl extends MinimalEObjectImpl.Container implements AutoSoft {
    /**
     * The default value of the '{@link #getWert() <em>Wert</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWert()
     * @generated
     * @ordered
     */
    protected static final BigDecimal WERT_EDEFAULT = null;
    /**
     * The default value of the '{@link #getVerfuegbarkeit() <em>Verfuegbarkeit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVerfuegbarkeit()
     * @generated
     * @ordered
     */
    protected static final String VERFUEGBARKEIT_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getVerfuegbarkeit() <em>Verfuegbarkeit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVerfuegbarkeit()
     * @generated
     * @ordered
     */
    protected String verfuegbarkeit = VERFUEGBARKEIT_EDEFAULT;
    /**
     * The default value of the '{@link #getWertValue() <em>Wert Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWertValue()
     * @generated
     * @ordered
     */
    protected static final BigDecimal WERT_VALUE_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getWertValue() <em>Wert Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWertValue()
     * @generated
     * @ordered
     */
    protected BigDecimal wertValue = WERT_VALUE_EDEFAULT;
    /**
     * The default value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBeschreibung()
     * @generated
     * @ordered
     */
    protected static final String BESCHREIBUNG_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBeschreibung()
     * @generated
     * @ordered
     */
    protected String beschreibung = BESCHREIBUNG_EDEFAULT;
    /**
     * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImage()
     * @generated
     * @ordered
     */
    protected static final String IMAGE_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImage()
     * @generated
     * @ordered
     */
    protected String image = IMAGE_EDEFAULT;
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
     * The default value of the '{@link #getParentId() <em>Parent Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParentId()
     * @generated
     * @ordered
     */
    protected static final String PARENT_ID_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getParentId() <em>Parent Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParentId()
     * @generated
     * @ordered
     */
    protected String parentId = PARENT_ID_EDEFAULT;
    /**
     * The default value of the '{@link #getPage() <em>Page</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPage()
     * @generated
     * @ordered
     */
    protected static final String PAGE_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getPage() <em>Page</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPage()
     * @generated
     * @ordered
     */
    protected String page = PAGE_EDEFAULT;
    /**
     * The cached value of the '{@link #getSrcBook() <em>Src Book</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSrcBook()
     * @generated
     * @ordered
     */
    protected SourceBook srcBook;
    /**
     * The default value of the '{@link #getRating() <em>Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRating()
     * @generated
     * @ordered
     */
    protected static final int RATING_EDEFAULT = 0;
    /**
     * The cached value of the '{@link #getRating() <em>Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRating()
     * @generated
     * @ordered
     */
    protected int rating = RATING_EDEFAULT;

    /**
     * The cached value of the '{@link #getSkill() <em>Skill</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSkill()
     * @generated
     * @ordered
     */
    protected Fertigkeit skill;
    /**
     * The cached value of the '{@link #getWeapon() <em>Weapon</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWeapon()
     * @generated
     * @ordered
     */
    protected AbstaktWaffe weapon;
    /**
     * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModel()
     * @generated
     * @ordered
     */
    protected Drohne model;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AutoSoftImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.AUTO_SOFT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public BigDecimal getWert() {
        if(getWertValue()==null)
            return new BigDecimal(0);
        
        return getWertValue().multiply(new BigDecimal(getRating()));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVerfuegbarkeit() {
        return verfuegbarkeit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVerfuegbarkeit(String newVerfuegbarkeit) {
        String oldVerfuegbarkeit = verfuegbarkeit;
        verfuegbarkeit = newVerfuegbarkeit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.AUTO_SOFT__VERFUEGBARKEIT, oldVerfuegbarkeit, verfuegbarkeit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigDecimal getWertValue() {
        return wertValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWertValue(BigDecimal newWertValue) {
        BigDecimal oldWertValue = wertValue;
        wertValue = newWertValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.AUTO_SOFT__WERT_VALUE, oldWertValue, wertValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBeschreibung(String newBeschreibung) {
        String oldBeschreibung = beschreibung;
        beschreibung = newBeschreibung;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.AUTO_SOFT__BESCHREIBUNG, oldBeschreibung, beschreibung));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getImage() {
        return image;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImage(String newImage) {
        String oldImage = image;
        image = newImage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.AUTO_SOFT__IMAGE, oldImage, image));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.AUTO_SOFT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentId(String newParentId) {
        String oldParentId = parentId;
        parentId = newParentId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.AUTO_SOFT__PARENT_ID, oldParentId, parentId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPage() {
        return page;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPage(String newPage) {
        String oldPage = page;
        page = newPage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.AUTO_SOFT__PAGE, oldPage, page));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SourceBook getSrcBook() {
        if (srcBook != null && srcBook.eIsProxy()) {
            InternalEObject oldSrcBook = (InternalEObject)srcBook;
            srcBook = (SourceBook)eResolveProxy(oldSrcBook);
            if (srcBook != oldSrcBook) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.AUTO_SOFT__SRC_BOOK, oldSrcBook, srcBook));
            }
        }
        return srcBook;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SourceBook basicGetSrcBook() {
        return srcBook;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSrcBook(SourceBook newSrcBook) {
        SourceBook oldSrcBook = srcBook;
        srcBook = newSrcBook;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.AUTO_SOFT__SRC_BOOK, oldSrcBook, srcBook));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getRating() {
        return rating;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRating(int newRating) {
        int oldRating = rating;
        rating = newRating;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.AUTO_SOFT__RATING, oldRating, rating));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Fertigkeit getSkill() {
        if (skill != null && skill.eIsProxy()) {
            InternalEObject oldSkill = (InternalEObject)skill;
            skill = (Fertigkeit)eResolveProxy(oldSkill);
            if (skill != oldSkill) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.AUTO_SOFT__SKILL, oldSkill, skill));
            }
        }
        return skill;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Fertigkeit basicGetSkill() {
        return skill;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSkill(Fertigkeit newSkill) {
        Fertigkeit oldSkill = skill;
        skill = newSkill;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.AUTO_SOFT__SKILL, oldSkill, skill));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstaktWaffe getWeapon() {
        if (weapon != null && weapon.eIsProxy()) {
            InternalEObject oldWeapon = (InternalEObject)weapon;
            weapon = (AbstaktWaffe)eResolveProxy(oldWeapon);
            if (weapon != oldWeapon) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.AUTO_SOFT__WEAPON, oldWeapon, weapon));
            }
        }
        return weapon;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstaktWaffe basicGetWeapon() {
        return weapon;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWeapon(AbstaktWaffe newWeapon) {
        AbstaktWaffe oldWeapon = weapon;
        weapon = newWeapon;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.AUTO_SOFT__WEAPON, oldWeapon, weapon));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Drohne getModel() {
        if (model != null && model.eIsProxy()) {
            InternalEObject oldModel = (InternalEObject)model;
            model = (Drohne)eResolveProxy(oldModel);
            if (model != oldModel) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.AUTO_SOFT__MODEL, oldModel, model));
            }
        }
        return model;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Drohne basicGetModel() {
        return model;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(Drohne newModel) {
        Drohne oldModel = model;
        model = newModel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.AUTO_SOFT__MODEL, oldModel, model));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.AUTO_SOFT__WERT:
                return getWert();
            case Shr5Package.AUTO_SOFT__VERFUEGBARKEIT:
                return getVerfuegbarkeit();
            case Shr5Package.AUTO_SOFT__WERT_VALUE:
                return getWertValue();
            case Shr5Package.AUTO_SOFT__BESCHREIBUNG:
                return getBeschreibung();
            case Shr5Package.AUTO_SOFT__IMAGE:
                return getImage();
            case Shr5Package.AUTO_SOFT__NAME:
                return getName();
            case Shr5Package.AUTO_SOFT__PARENT_ID:
                return getParentId();
            case Shr5Package.AUTO_SOFT__PAGE:
                return getPage();
            case Shr5Package.AUTO_SOFT__SRC_BOOK:
                if (resolve) return getSrcBook();
                return basicGetSrcBook();
            case Shr5Package.AUTO_SOFT__RATING:
                return getRating();
            case Shr5Package.AUTO_SOFT__SKILL:
                if (resolve) return getSkill();
                return basicGetSkill();
            case Shr5Package.AUTO_SOFT__WEAPON:
                if (resolve) return getWeapon();
                return basicGetWeapon();
            case Shr5Package.AUTO_SOFT__MODEL:
                if (resolve) return getModel();
                return basicGetModel();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Shr5Package.AUTO_SOFT__VERFUEGBARKEIT:
                setVerfuegbarkeit((String)newValue);
                return;
            case Shr5Package.AUTO_SOFT__WERT_VALUE:
                setWertValue((BigDecimal)newValue);
                return;
            case Shr5Package.AUTO_SOFT__BESCHREIBUNG:
                setBeschreibung((String)newValue);
                return;
            case Shr5Package.AUTO_SOFT__IMAGE:
                setImage((String)newValue);
                return;
            case Shr5Package.AUTO_SOFT__NAME:
                setName((String)newValue);
                return;
            case Shr5Package.AUTO_SOFT__PARENT_ID:
                setParentId((String)newValue);
                return;
            case Shr5Package.AUTO_SOFT__PAGE:
                setPage((String)newValue);
                return;
            case Shr5Package.AUTO_SOFT__SRC_BOOK:
                setSrcBook((SourceBook)newValue);
                return;
            case Shr5Package.AUTO_SOFT__RATING:
                setRating((Integer)newValue);
                return;
            case Shr5Package.AUTO_SOFT__SKILL:
                setSkill((Fertigkeit)newValue);
                return;
            case Shr5Package.AUTO_SOFT__WEAPON:
                setWeapon((AbstaktWaffe)newValue);
                return;
            case Shr5Package.AUTO_SOFT__MODEL:
                setModel((Drohne)newValue);
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
            case Shr5Package.AUTO_SOFT__VERFUEGBARKEIT:
                setVerfuegbarkeit(VERFUEGBARKEIT_EDEFAULT);
                return;
            case Shr5Package.AUTO_SOFT__WERT_VALUE:
                setWertValue(WERT_VALUE_EDEFAULT);
                return;
            case Shr5Package.AUTO_SOFT__BESCHREIBUNG:
                setBeschreibung(BESCHREIBUNG_EDEFAULT);
                return;
            case Shr5Package.AUTO_SOFT__IMAGE:
                setImage(IMAGE_EDEFAULT);
                return;
            case Shr5Package.AUTO_SOFT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case Shr5Package.AUTO_SOFT__PARENT_ID:
                setParentId(PARENT_ID_EDEFAULT);
                return;
            case Shr5Package.AUTO_SOFT__PAGE:
                setPage(PAGE_EDEFAULT);
                return;
            case Shr5Package.AUTO_SOFT__SRC_BOOK:
                setSrcBook((SourceBook)null);
                return;
            case Shr5Package.AUTO_SOFT__RATING:
                setRating(RATING_EDEFAULT);
                return;
            case Shr5Package.AUTO_SOFT__SKILL:
                setSkill((Fertigkeit)null);
                return;
            case Shr5Package.AUTO_SOFT__WEAPON:
                setWeapon((AbstaktWaffe)null);
                return;
            case Shr5Package.AUTO_SOFT__MODEL:
                setModel((Drohne)null);
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
            case Shr5Package.AUTO_SOFT__WERT:
                return WERT_EDEFAULT == null ? getWert() != null : !WERT_EDEFAULT.equals(getWert());
            case Shr5Package.AUTO_SOFT__VERFUEGBARKEIT:
                return VERFUEGBARKEIT_EDEFAULT == null ? verfuegbarkeit != null : !VERFUEGBARKEIT_EDEFAULT.equals(verfuegbarkeit);
            case Shr5Package.AUTO_SOFT__WERT_VALUE:
                return WERT_VALUE_EDEFAULT == null ? wertValue != null : !WERT_VALUE_EDEFAULT.equals(wertValue);
            case Shr5Package.AUTO_SOFT__BESCHREIBUNG:
                return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
            case Shr5Package.AUTO_SOFT__IMAGE:
                return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
            case Shr5Package.AUTO_SOFT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case Shr5Package.AUTO_SOFT__PARENT_ID:
                return PARENT_ID_EDEFAULT == null ? parentId != null : !PARENT_ID_EDEFAULT.equals(parentId);
            case Shr5Package.AUTO_SOFT__PAGE:
                return PAGE_EDEFAULT == null ? page != null : !PAGE_EDEFAULT.equals(page);
            case Shr5Package.AUTO_SOFT__SRC_BOOK:
                return srcBook != null;
            case Shr5Package.AUTO_SOFT__RATING:
                return rating != RATING_EDEFAULT;
            case Shr5Package.AUTO_SOFT__SKILL:
                return skill != null;
            case Shr5Package.AUTO_SOFT__WEAPON:
                return weapon != null;
            case Shr5Package.AUTO_SOFT__MODEL:
                return model != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == Beschreibbar.class) {
            switch (derivedFeatureID) {
                case Shr5Package.AUTO_SOFT__BESCHREIBUNG: return Shr5Package.BESCHREIBBAR__BESCHREIBUNG;
                case Shr5Package.AUTO_SOFT__IMAGE: return Shr5Package.BESCHREIBBAR__IMAGE;
                case Shr5Package.AUTO_SOFT__NAME: return Shr5Package.BESCHREIBBAR__NAME;
                default: return -1;
            }
        }
        if (baseClass == Identifiable.class) {
            switch (derivedFeatureID) {
                case Shr5Package.AUTO_SOFT__PARENT_ID: return Shr5Package.IDENTIFIABLE__PARENT_ID;
                default: return -1;
            }
        }
        if (baseClass == Quelle.class) {
            switch (derivedFeatureID) {
                case Shr5Package.AUTO_SOFT__PAGE: return Shr5Package.QUELLE__PAGE;
                case Shr5Package.AUTO_SOFT__SRC_BOOK: return Shr5Package.QUELLE__SRC_BOOK;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == Beschreibbar.class) {
            switch (baseFeatureID) {
                case Shr5Package.BESCHREIBBAR__BESCHREIBUNG: return Shr5Package.AUTO_SOFT__BESCHREIBUNG;
                case Shr5Package.BESCHREIBBAR__IMAGE: return Shr5Package.AUTO_SOFT__IMAGE;
                case Shr5Package.BESCHREIBBAR__NAME: return Shr5Package.AUTO_SOFT__NAME;
                default: return -1;
            }
        }
        if (baseClass == Identifiable.class) {
            switch (baseFeatureID) {
                case Shr5Package.IDENTIFIABLE__PARENT_ID: return Shr5Package.AUTO_SOFT__PARENT_ID;
                default: return -1;
            }
        }
        if (baseClass == Quelle.class) {
            switch (baseFeatureID) {
                case Shr5Package.QUELLE__PAGE: return Shr5Package.AUTO_SOFT__PAGE;
                case Shr5Package.QUELLE__SRC_BOOK: return Shr5Package.AUTO_SOFT__SRC_BOOK;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(" (verfuegbarkeit: ");
        result.append(verfuegbarkeit);
        result.append(", wertValue: ");
        result.append(wertValue);
        result.append(", beschreibung: ");
        result.append(beschreibung);
        result.append(", image: ");
        result.append(image);
        result.append(", name: ");
        result.append(name);
        result.append(", parentId: ");
        result.append(parentId);
        result.append(", page: ");
        result.append(page);
        result.append(", rating: ");
        result.append(rating);
        result.append(')');
        return result.toString();
    }

} //AutoSoftImpl
