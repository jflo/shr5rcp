/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.urszeidler.eclipse.shr5Management.GeneratorState;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5Management.Shr5Generator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Shr5GeneratorItemProvider
	extends CharacterGeneratorItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shr5GeneratorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addResourcenPropertyDescriptor(object);
			addSkillsPropertyDescriptor(object);
			addAttributePropertyDescriptor(object);
			addMetaTypePropertyDescriptor(object);
			addMagicPropertyDescriptor(object);
			addKarmaToResourcePropertyDescriptor(object);
			addKarmaSpendPropertyDescriptor(object);
			addShr5GeneratorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Resourcen feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourcenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shr5Generator_resourcen_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shr5Generator_resourcen_feature", "_UI_Shr5Generator_type"),
				 Shr5managementPackage.Literals.SHR5_GENERATOR__RESOURCEN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Skills feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSkillsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shr5Generator_skills_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shr5Generator_skills_feature", "_UI_Shr5Generator_type"),
				 Shr5managementPackage.Literals.SHR5_GENERATOR__SKILLS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shr5Generator_attribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shr5Generator_attribute_feature", "_UI_Shr5Generator_type"),
				 Shr5managementPackage.Literals.SHR5_GENERATOR__ATTRIBUTE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Meta Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetaTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shr5Generator_metaType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shr5Generator_metaType_feature", "_UI_Shr5Generator_type"),
				 Shr5managementPackage.Literals.SHR5_GENERATOR__META_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Magic feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMagicPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shr5Generator_magic_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shr5Generator_magic_feature", "_UI_Shr5Generator_type"),
				 Shr5managementPackage.Literals.SHR5_GENERATOR__MAGIC,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Karma To Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKarmaToResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shr5Generator_karmaToResource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shr5Generator_karmaToResource_feature", "_UI_Shr5Generator_type"),
				 Shr5managementPackage.Literals.SHR5_GENERATOR__KARMA_TO_RESOURCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Karma Spend feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKarmaSpendPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shr5Generator_karmaSpend_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shr5Generator_karmaSpend_feature", "_UI_Shr5Generator_type"),
				 Shr5managementPackage.Literals.SHR5_GENERATOR__KARMA_SPEND,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shr5 Generator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShr5GeneratorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shr5Generator_shr5Generator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shr5Generator_shr5Generator_feature", "_UI_Shr5Generator_type"),
				 Shr5managementPackage.Literals.SHR5_GENERATOR__SHR5_GENERATOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns Shr5Generator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Shr5Generator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public String getText(Object object) {
		GeneratorState labelValue = ((Shr5Generator)object).getState();
		String label = labelValue == null ? null : labelValue.toString();

		Shr5Generator pc = (Shr5Generator)object;
		if(pc.getCharacter()!=null){
			ComposeableAdapterFactory factory = ((Shr5managementItemProviderAdapterFactory) this.adapterFactory)
					.getRootAdapterFactory();
			IItemLabelProvider labelprovider = (IItemLabelProvider) factory.adapt(pc.getCharacter(),
					IItemLabelProvider.class);

			if (labelprovider != null)
				return getString("_UI_Shr5Generator_type")+" "+ labelprovider.getText(pc.getCharacter())+" ["+labelValue+"]";

		}

		
		
		return label == null || label.length() == 0 ?
			getString("_UI_Shr5Generator_type") :
			getString("_UI_Shr5Generator_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Shr5Generator.class)) {
			case Shr5managementPackage.SHR5_GENERATOR__KARMA_TO_RESOURCE:
			case Shr5managementPackage.SHR5_GENERATOR__KARMA_SPEND:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
