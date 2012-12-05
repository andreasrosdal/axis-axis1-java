/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.apache.axis.model.wsdd.impl;

import java.util.Collection;
import java.util.List;
import java.util.Iterator;

import org.apache.axis.model.wsdd.ArrayMapping;
import org.apache.axis.model.wsdd.BeanMapping;
import org.apache.axis.model.wsdd.Operation;
import org.apache.axis.model.wsdd.Parameter;
import org.apache.axis.model.wsdd.Service;
import org.apache.axis.model.wsdd.Style;
import org.apache.axis.model.wsdd.TypeMapping;
import org.apache.axis.model.wsdd.Use;
import org.apache.axis.model.wsdd.WSDDFactory;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.apache.axis.model.wsdd.impl.ServiceImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.apache.axis.model.wsdd.impl.ServiceImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.apache.axis.model.wsdd.impl.ServiceImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.apache.axis.model.wsdd.impl.ServiceImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.apache.axis.model.wsdd.impl.ServiceImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.apache.axis.model.wsdd.impl.ServiceImpl#getTypeMappings <em>Type Mappings</em>}</li>
 *   <li>{@link org.apache.axis.model.wsdd.impl.ServiceImpl#getBeanMappings <em>Bean Mappings</em>}</li>
 *   <li>{@link org.apache.axis.model.wsdd.impl.ServiceImpl#getArrayMappings <em>Array Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends DeployableItemImpl implements Service {
    /**
     * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProvider()
     * @generated
     * @ordered
     */
    protected static final Object PROVIDER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProvider()
     * @generated
     * @ordered
     */
    protected Object provider = PROVIDER_EDEFAULT;

    /**
     * The default value of the '{@link #getUse() <em>Use</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUse()
     * @generated
     * @ordered
     */
    protected static final Use USE_EDEFAULT = Use.ENCODED_LITERAL;

    /**
     * The cached value of the '{@link #getUse() <em>Use</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUse()
     * @generated
     * @ordered
     */
    protected Use use = USE_EDEFAULT;

    /**
     * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStyle()
     * @generated
     * @ordered
     */
    protected static final Style STYLE_EDEFAULT = Style.RPC_LITERAL;

    /**
     * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStyle()
     * @generated
     * @ordered
     */
    protected Style style = STYLE_EDEFAULT;

    /**
     * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameters()
     * @generated
     * @ordered
     */
    protected EList parameters;

    /**
     * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperations()
     * @generated
     * @ordered
     */
    protected EList operations;

    /**
     * The cached value of the '{@link #getTypeMappings() <em>Type Mappings</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeMappings()
     * @generated
     * @ordered
     */
    protected EList typeMappings;

    /**
     * The cached value of the '{@link #getBeanMappings() <em>Bean Mappings</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBeanMappings()
     * @generated
     * @ordered
     */
    protected EList beanMappings;

    /**
     * The cached value of the '{@link #getArrayMappings() <em>Array Mappings</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArrayMappings()
     * @generated
     * @ordered
     */
    protected EList arrayMappings;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServiceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return WSDDPackageImpl.Literals.SERVICE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getProvider() {
        return provider;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProvider(Object newProvider) {
        provider = newProvider;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Use getUse() {
        return use;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUse(Use newUse) {
        use = newUse == null ? USE_EDEFAULT : newUse;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Style getStyle() {
        return style;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStyle(Style newStyle) {
        style = newStyle == null ? STYLE_EDEFAULT : newStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List getParameters() {
        if (parameters == null) {
            parameters = new BasicInternalEList(Parameter.class);
        }
        return parameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List getOperations() {
        if (operations == null) {
            operations = new BasicInternalEList(Operation.class);
        }
        return operations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List getTypeMappings() {
        if (typeMappings == null) {
            typeMappings = new BasicInternalEList(TypeMapping.class);
        }
        return typeMappings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List getBeanMappings() {
        if (beanMappings == null) {
            beanMappings = new BasicInternalEList(BeanMapping.class);
        }
        return beanMappings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List getArrayMappings() {
        if (arrayMappings == null) {
            arrayMappings = new BasicInternalEList(ArrayMapping.class);
        }
        return arrayMappings;
    }

    public void setParameter(String name, String value) {
        for (Iterator it = getParameters().iterator(); it.hasNext(); ) {
            Parameter param = (Parameter)it.next();
            if (name.equals(param.getName())) {
                param.setValue(value);
                return;
            }
        }
        Parameter param = WSDDFactory.INSTANCE.createParameter();
        param.setName(name);
        param.setValue(value);
        getParameters().add(param);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case WSDDPackageImpl.SERVICE__PARAMETERS:
                return ((InternalEList)getParameters()).basicRemove(otherEnd, msgs);
            case WSDDPackageImpl.SERVICE__OPERATIONS:
                return ((InternalEList)getOperations()).basicRemove(otherEnd, msgs);
            case WSDDPackageImpl.SERVICE__TYPE_MAPPINGS:
                return ((InternalEList)getTypeMappings()).basicRemove(otherEnd, msgs);
            case WSDDPackageImpl.SERVICE__BEAN_MAPPINGS:
                return ((InternalEList)getBeanMappings()).basicRemove(otherEnd, msgs);
            case WSDDPackageImpl.SERVICE__ARRAY_MAPPINGS:
                return ((InternalEList)getArrayMappings()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case WSDDPackageImpl.SERVICE__PROVIDER:
                return getProvider();
            case WSDDPackageImpl.SERVICE__USE:
                return getUse();
            case WSDDPackageImpl.SERVICE__STYLE:
                return getStyle();
            case WSDDPackageImpl.SERVICE__PARAMETERS:
                return getParameters();
            case WSDDPackageImpl.SERVICE__OPERATIONS:
                return getOperations();
            case WSDDPackageImpl.SERVICE__TYPE_MAPPINGS:
                return getTypeMappings();
            case WSDDPackageImpl.SERVICE__BEAN_MAPPINGS:
                return getBeanMappings();
            case WSDDPackageImpl.SERVICE__ARRAY_MAPPINGS:
                return getArrayMappings();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case WSDDPackageImpl.SERVICE__PROVIDER:
                setProvider(newValue);
                return;
            case WSDDPackageImpl.SERVICE__USE:
                setUse((Use)newValue);
                return;
            case WSDDPackageImpl.SERVICE__STYLE:
                setStyle((Style)newValue);
                return;
            case WSDDPackageImpl.SERVICE__PARAMETERS:
                getParameters().clear();
                getParameters().addAll((Collection)newValue);
                return;
            case WSDDPackageImpl.SERVICE__OPERATIONS:
                getOperations().clear();
                getOperations().addAll((Collection)newValue);
                return;
            case WSDDPackageImpl.SERVICE__TYPE_MAPPINGS:
                getTypeMappings().clear();
                getTypeMappings().addAll((Collection)newValue);
                return;
            case WSDDPackageImpl.SERVICE__BEAN_MAPPINGS:
                getBeanMappings().clear();
                getBeanMappings().addAll((Collection)newValue);
                return;
            case WSDDPackageImpl.SERVICE__ARRAY_MAPPINGS:
                getArrayMappings().clear();
                getArrayMappings().addAll((Collection)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eUnset(int featureID) {
        switch (featureID) {
            case WSDDPackageImpl.SERVICE__PROVIDER:
                setProvider(PROVIDER_EDEFAULT);
                return;
            case WSDDPackageImpl.SERVICE__USE:
                setUse(USE_EDEFAULT);
                return;
            case WSDDPackageImpl.SERVICE__STYLE:
                setStyle(STYLE_EDEFAULT);
                return;
            case WSDDPackageImpl.SERVICE__PARAMETERS:
                getParameters().clear();
                return;
            case WSDDPackageImpl.SERVICE__OPERATIONS:
                getOperations().clear();
                return;
            case WSDDPackageImpl.SERVICE__TYPE_MAPPINGS:
                getTypeMappings().clear();
                return;
            case WSDDPackageImpl.SERVICE__BEAN_MAPPINGS:
                getBeanMappings().clear();
                return;
            case WSDDPackageImpl.SERVICE__ARRAY_MAPPINGS:
                getArrayMappings().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case WSDDPackageImpl.SERVICE__PROVIDER:
                return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
            case WSDDPackageImpl.SERVICE__USE:
                return use != USE_EDEFAULT;
            case WSDDPackageImpl.SERVICE__STYLE:
                return style != STYLE_EDEFAULT;
            case WSDDPackageImpl.SERVICE__PARAMETERS:
                return parameters != null && !parameters.isEmpty();
            case WSDDPackageImpl.SERVICE__OPERATIONS:
                return operations != null && !operations.isEmpty();
            case WSDDPackageImpl.SERVICE__TYPE_MAPPINGS:
                return typeMappings != null && !typeMappings.isEmpty();
            case WSDDPackageImpl.SERVICE__BEAN_MAPPINGS:
                return beanMappings != null && !beanMappings.isEmpty();
            case WSDDPackageImpl.SERVICE__ARRAY_MAPPINGS:
                return arrayMappings != null && !arrayMappings.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (provider: ");
        result.append(provider);
        result.append(", use: ");
        result.append(use);
        result.append(", style: ");
        result.append(style);
        result.append(')');
        return result.toString();
    }

} //ServiceImpl
