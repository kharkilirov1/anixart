package com.fasterxml.jackson.databind.introspect;

import androidx.room.util.C0576a;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p000a.C0000a;

/* loaded from: classes.dex */
public class POJOPropertiesCollector {
    public final AnnotationIntrospector _annotationIntrospector;
    public LinkedList<AnnotatedMember> _anyGetters;
    public LinkedList<AnnotatedMember> _anySetterField;
    public LinkedList<AnnotatedMethod> _anySetters;
    public final AnnotatedClass _classDef;
    public boolean _collected;
    public final MapperConfig<?> _config;
    public LinkedList<POJOPropertyBuilder> _creatorProperties;
    public final boolean _forSerialization;
    public HashSet<String> _ignoredPropertyNames;
    public LinkedHashMap<Object, AnnotatedMember> _injectables;
    public LinkedList<AnnotatedMember> _jsonValueAccessors;
    public final String _mutatorPrefix;
    public LinkedHashMap<String, POJOPropertyBuilder> _properties;
    public final boolean _stdBeanNaming;
    public final JavaType _type;
    public final boolean _useAnnotations;
    public final VisibilityChecker<?> _visibilityChecker;

    public POJOPropertiesCollector(MapperConfig<?> mapperConfig, boolean z, JavaType javaType, AnnotatedClass annotatedClass, String str) {
        this._config = mapperConfig;
        this._stdBeanNaming = mapperConfig.isEnabled(MapperFeature.USE_STD_BEAN_NAMING);
        this._forSerialization = z;
        this._type = javaType;
        this._classDef = annotatedClass;
        this._mutatorPrefix = str == null ? "set" : str;
        if (mapperConfig.isAnnotationProcessingEnabled()) {
            this._useAnnotations = true;
            this._annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        } else {
            this._useAnnotations = false;
            this._annotationIntrospector = AnnotationIntrospector.nopInstance();
        }
        this._visibilityChecker = mapperConfig.getDefaultVisibilityChecker(javaType.getRawClass(), annotatedClass);
    }

    private void _collectIgnorals(String str) {
        if (this._forSerialization) {
            return;
        }
        if (this._ignoredPropertyNames == null) {
            this._ignoredPropertyNames = new HashSet<>();
        }
        this._ignoredPropertyNames.add(str);
    }

    private PropertyNamingStrategy _findNamingStrategy() {
        PropertyNamingStrategy namingStrategyInstance;
        Object findNamingStrategy = this._annotationIntrospector.findNamingStrategy(this._classDef);
        if (findNamingStrategy == null) {
            return this._config.getPropertyNamingStrategy();
        }
        if (findNamingStrategy instanceof PropertyNamingStrategy) {
            return (PropertyNamingStrategy) findNamingStrategy;
        }
        if (!(findNamingStrategy instanceof Class)) {
            StringBuilder m24u = C0000a.m24u("AnnotationIntrospector returned PropertyNamingStrategy definition of type ");
            m24u.append(findNamingStrategy.getClass().getName());
            m24u.append("; expected type PropertyNamingStrategy or Class<PropertyNamingStrategy> instead");
            throw new IllegalStateException(m24u.toString());
        }
        Class<?> cls = (Class) findNamingStrategy;
        if (cls == PropertyNamingStrategy.class) {
            return null;
        }
        if (!PropertyNamingStrategy.class.isAssignableFrom(cls)) {
            throw new IllegalStateException(C0576a.m4116o(cls, C0000a.m24u("AnnotationIntrospector returned Class "), "; expected Class<PropertyNamingStrategy>"));
        }
        HandlerInstantiator handlerInstantiator = this._config.getHandlerInstantiator();
        return (handlerInstantiator == null || (namingStrategyInstance = handlerInstantiator.namingStrategyInstance(this._config, this._classDef, cls)) == null) ? (PropertyNamingStrategy) ClassUtil.createInstance(cls, this._config.canOverrideAccessModifiers()) : namingStrategyInstance;
    }

    private PropertyName _propNameFromSimple(String str) {
        return PropertyName.construct(str, null);
    }

    public void _addCreatorParam(Map<String, POJOPropertyBuilder> map, AnnotatedParameter annotatedParameter) {
        JsonCreator.Mode findCreatorAnnotation;
        String findImplicitPropertyName = this._annotationIntrospector.findImplicitPropertyName(annotatedParameter);
        if (findImplicitPropertyName == null) {
            findImplicitPropertyName = "";
        }
        PropertyName findNameForDeserialization = this._annotationIntrospector.findNameForDeserialization(annotatedParameter);
        boolean z = (findNameForDeserialization == null || findNameForDeserialization.isEmpty()) ? false : true;
        if (!z) {
            if (findImplicitPropertyName.isEmpty() || (findCreatorAnnotation = this._annotationIntrospector.findCreatorAnnotation(this._config, annotatedParameter.getOwner())) == null || findCreatorAnnotation == JsonCreator.Mode.DISABLED) {
                return;
            } else {
                findNameForDeserialization = PropertyName.construct(findImplicitPropertyName);
            }
        }
        PropertyName propertyName = findNameForDeserialization;
        POJOPropertyBuilder _property = (z && findImplicitPropertyName.isEmpty()) ? _property(map, propertyName) : _property(map, findImplicitPropertyName);
        _property.addCtor(annotatedParameter, propertyName, z, true, false);
        this._creatorProperties.add(_property);
    }

    public void _addCreators(Map<String, POJOPropertyBuilder> map) {
        if (this._useAnnotations) {
            Iterator<AnnotatedConstructor> it = this._classDef.getConstructors().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnnotatedConstructor next = it.next();
                if (this._creatorProperties == null) {
                    this._creatorProperties = new LinkedList<>();
                }
                int parameterCount = next.getParameterCount();
                for (int i2 = 0; i2 < parameterCount; i2++) {
                    _addCreatorParam(map, next.getParameter(i2));
                }
            }
            for (AnnotatedMethod annotatedMethod : this._classDef.getFactoryMethods()) {
                if (this._creatorProperties == null) {
                    this._creatorProperties = new LinkedList<>();
                }
                int parameterCount2 = annotatedMethod.getParameterCount();
                for (int i3 = 0; i3 < parameterCount2; i3++) {
                    _addCreatorParam(map, annotatedMethod.getParameter(i3));
                }
            }
        }
    }

    public void _addFields(Map<String, POJOPropertyBuilder> map) {
        PropertyName propertyName;
        boolean z;
        boolean z2;
        boolean z3;
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        boolean z4 = (this._forSerialization || this._config.isEnabled(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS)) ? false : true;
        boolean isEnabled = this._config.isEnabled(MapperFeature.PROPAGATE_TRANSIENT_MARKER);
        for (AnnotatedField annotatedField : this._classDef.fields()) {
            String findImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedField);
            Boolean bool = Boolean.TRUE;
            if (bool.equals(annotationIntrospector.hasAsValue(annotatedField))) {
                if (this._jsonValueAccessors == null) {
                    this._jsonValueAccessors = new LinkedList<>();
                }
                this._jsonValueAccessors.add(annotatedField);
            } else if (bool.equals(annotationIntrospector.hasAnySetter(annotatedField))) {
                if (this._anySetterField == null) {
                    this._anySetterField = new LinkedList<>();
                }
                this._anySetterField.add(annotatedField);
            } else {
                if (findImplicitPropertyName == null) {
                    findImplicitPropertyName = annotatedField.getName();
                }
                PropertyName findNameForSerialization = this._forSerialization ? annotationIntrospector.findNameForSerialization(annotatedField) : annotationIntrospector.findNameForDeserialization(annotatedField);
                boolean z5 = findNameForSerialization != null;
                if (z5 && findNameForSerialization.isEmpty()) {
                    propertyName = _propNameFromSimple(findImplicitPropertyName);
                    z = false;
                } else {
                    propertyName = findNameForSerialization;
                    z = z5;
                }
                boolean z6 = propertyName != null;
                if (!z6) {
                    z6 = this._visibilityChecker.isFieldVisible(annotatedField);
                }
                boolean hasIgnoreMarker = annotationIntrospector.hasIgnoreMarker(annotatedField);
                if (!annotatedField.isTransient() || z5) {
                    z2 = hasIgnoreMarker;
                    z3 = z6;
                } else if (isEnabled) {
                    z3 = false;
                    z2 = true;
                } else {
                    z2 = hasIgnoreMarker;
                    z3 = false;
                }
                if (!z4 || propertyName != null || z2 || !Modifier.isFinal(annotatedField.getModifiers())) {
                    _property(map, findImplicitPropertyName).addField(annotatedField, propertyName, z, z3, z2);
                }
            }
        }
    }

    public void _addGetterMethod(Map<String, POJOPropertyBuilder> map, AnnotatedMethod annotatedMethod, AnnotationIntrospector annotationIntrospector) {
        PropertyName propertyName;
        boolean z;
        String str;
        boolean z2;
        boolean isGetterVisible;
        if (annotatedMethod.hasReturnType()) {
            Boolean bool = Boolean.TRUE;
            if (bool.equals(annotationIntrospector.hasAnyGetter(annotatedMethod))) {
                if (this._anyGetters == null) {
                    this._anyGetters = new LinkedList<>();
                }
                this._anyGetters.add(annotatedMethod);
                return;
            }
            if (bool.equals(annotationIntrospector.hasAsValue(annotatedMethod))) {
                if (this._jsonValueAccessors == null) {
                    this._jsonValueAccessors = new LinkedList<>();
                }
                this._jsonValueAccessors.add(annotatedMethod);
                return;
            }
            PropertyName findNameForSerialization = annotationIntrospector.findNameForSerialization(annotatedMethod);
            boolean z3 = false;
            boolean z4 = findNameForSerialization != null;
            if (z4) {
                String findImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
                if (findImplicitPropertyName == null) {
                    findImplicitPropertyName = BeanUtil.okNameForGetter(annotatedMethod, this._stdBeanNaming);
                }
                if (findImplicitPropertyName == null) {
                    findImplicitPropertyName = annotatedMethod.getName();
                }
                if (findNameForSerialization.isEmpty()) {
                    findNameForSerialization = _propNameFromSimple(findImplicitPropertyName);
                } else {
                    z3 = z4;
                }
                propertyName = findNameForSerialization;
                z = z3;
                str = findImplicitPropertyName;
                z2 = true;
            } else {
                str = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
                if (str == null) {
                    str = BeanUtil.okNameForRegularGetter(annotatedMethod, annotatedMethod.getName(), this._stdBeanNaming);
                }
                if (str == null) {
                    str = BeanUtil.okNameForIsGetter(annotatedMethod, annotatedMethod.getName(), this._stdBeanNaming);
                    if (str == null) {
                        return;
                    } else {
                        isGetterVisible = this._visibilityChecker.isIsGetterVisible(annotatedMethod);
                    }
                } else {
                    isGetterVisible = this._visibilityChecker.isGetterVisible(annotatedMethod);
                }
                propertyName = findNameForSerialization;
                z2 = isGetterVisible;
                z = z4;
            }
            _property(map, str).addGetter(annotatedMethod, propertyName, z, z2, annotationIntrospector.hasIgnoreMarker(annotatedMethod));
        }
    }

    public void _addInjectables(Map<String, POJOPropertyBuilder> map) {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        for (AnnotatedMember annotatedMember : this._classDef.fields()) {
            _doAddInjectable(annotationIntrospector.findInjectableValue(annotatedMember), annotatedMember);
        }
        for (AnnotatedMethod annotatedMethod : this._classDef.memberMethods()) {
            if (annotatedMethod.getParameterCount() == 1) {
                _doAddInjectable(annotationIntrospector.findInjectableValue(annotatedMethod), annotatedMethod);
            }
        }
    }

    public void _addMethods(Map<String, POJOPropertyBuilder> map) {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        for (AnnotatedMethod annotatedMethod : this._classDef.memberMethods()) {
            int parameterCount = annotatedMethod.getParameterCount();
            if (parameterCount == 0) {
                _addGetterMethod(map, annotatedMethod, annotationIntrospector);
            } else if (parameterCount == 1) {
                _addSetterMethod(map, annotatedMethod, annotationIntrospector);
            } else if (parameterCount == 2 && annotationIntrospector != null && Boolean.TRUE.equals(annotationIntrospector.hasAnySetter(annotatedMethod))) {
                if (this._anySetters == null) {
                    this._anySetters = new LinkedList<>();
                }
                this._anySetters.add(annotatedMethod);
            }
        }
    }

    public void _addSetterMethod(Map<String, POJOPropertyBuilder> map, AnnotatedMethod annotatedMethod, AnnotationIntrospector annotationIntrospector) {
        String findImplicitPropertyName;
        PropertyName propertyName;
        boolean z;
        boolean z2;
        PropertyName findNameForDeserialization = annotationIntrospector == null ? null : annotationIntrospector.findNameForDeserialization(annotatedMethod);
        boolean z3 = findNameForDeserialization != null;
        if (z3) {
            findImplicitPropertyName = annotationIntrospector != null ? annotationIntrospector.findImplicitPropertyName(annotatedMethod) : null;
            if (findImplicitPropertyName == null) {
                findImplicitPropertyName = BeanUtil.okNameForMutator(annotatedMethod, this._mutatorPrefix, this._stdBeanNaming);
            }
            if (findImplicitPropertyName == null) {
                findImplicitPropertyName = annotatedMethod.getName();
            }
            if (findNameForDeserialization.isEmpty()) {
                findNameForDeserialization = _propNameFromSimple(findImplicitPropertyName);
                z3 = false;
            }
            propertyName = findNameForDeserialization;
            z = z3;
            z2 = true;
        } else {
            findImplicitPropertyName = annotationIntrospector != null ? annotationIntrospector.findImplicitPropertyName(annotatedMethod) : null;
            if (findImplicitPropertyName == null) {
                findImplicitPropertyName = BeanUtil.okNameForMutator(annotatedMethod, this._mutatorPrefix, this._stdBeanNaming);
            }
            if (findImplicitPropertyName == null) {
                return;
            }
            propertyName = findNameForDeserialization;
            z2 = this._visibilityChecker.isSetterVisible(annotatedMethod);
            z = z3;
        }
        _property(map, findImplicitPropertyName).addSetter(annotatedMethod, propertyName, z, z2, annotationIntrospector == null ? false : annotationIntrospector.hasIgnoreMarker(annotatedMethod));
    }

    public void _doAddInjectable(JacksonInject.Value value, AnnotatedMember annotatedMember) {
        if (value == null) {
            return;
        }
        Object id2 = value.getId();
        if (this._injectables == null) {
            this._injectables = new LinkedHashMap<>();
        }
        AnnotatedMember put = this._injectables.put(id2, annotatedMember);
        if (put == null || put.getClass() != annotatedMember.getClass()) {
            return;
        }
        String name = id2.getClass().getName();
        StringBuilder m24u = C0000a.m24u("Duplicate injectable value with id '");
        m24u.append(String.valueOf(id2));
        m24u.append("' (of type ");
        m24u.append(name);
        m24u.append(")");
        throw new IllegalArgumentException(m24u.toString());
    }

    public POJOPropertyBuilder _property(Map<String, POJOPropertyBuilder> map, PropertyName propertyName) {
        String simpleName = propertyName.getSimpleName();
        POJOPropertyBuilder pOJOPropertyBuilder = map.get(simpleName);
        if (pOJOPropertyBuilder != null) {
            return pOJOPropertyBuilder;
        }
        POJOPropertyBuilder pOJOPropertyBuilder2 = new POJOPropertyBuilder(this._config, this._annotationIntrospector, this._forSerialization, propertyName);
        map.put(simpleName, pOJOPropertyBuilder2);
        return pOJOPropertyBuilder2;
    }

    public void _removeUnwantedAccessor(Map<String, POJOPropertyBuilder> map) {
        boolean isEnabled = this._config.isEnabled(MapperFeature.INFER_PROPERTY_MUTATORS);
        for (POJOPropertyBuilder pOJOPropertyBuilder : map.values()) {
            if (pOJOPropertyBuilder.removeNonVisible(isEnabled) == JsonProperty.Access.READ_ONLY) {
                _collectIgnorals(pOJOPropertyBuilder.getName());
            }
        }
    }

    public void _removeUnwantedProperties(Map<String, POJOPropertyBuilder> map) {
        Iterator<POJOPropertyBuilder> it = map.values().iterator();
        while (it.hasNext()) {
            POJOPropertyBuilder next = it.next();
            if (!next.anyVisible()) {
                it.remove();
            } else if (next.anyIgnorals()) {
                if (next.isExplicitlyIncluded()) {
                    next.removeIgnored();
                    if (!next.couldDeserialize()) {
                        _collectIgnorals(next.getName());
                    }
                } else {
                    it.remove();
                    _collectIgnorals(next.getName());
                }
            }
        }
    }

    public void _renameProperties(Map<String, POJOPropertyBuilder> map) {
        Iterator<Map.Entry<String, POJOPropertyBuilder>> it = map.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            POJOPropertyBuilder value = it.next().getValue();
            Set<PropertyName> findExplicitNames = value.findExplicitNames();
            if (!findExplicitNames.isEmpty()) {
                it.remove();
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                if (findExplicitNames.size() == 1) {
                    linkedList.add(value.withName(findExplicitNames.iterator().next()));
                } else {
                    linkedList.addAll(value.explode(findExplicitNames));
                }
            }
        }
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                POJOPropertyBuilder pOJOPropertyBuilder = (POJOPropertyBuilder) it2.next();
                String name = pOJOPropertyBuilder.getName();
                POJOPropertyBuilder pOJOPropertyBuilder2 = map.get(name);
                if (pOJOPropertyBuilder2 == null) {
                    map.put(name, pOJOPropertyBuilder);
                } else {
                    pOJOPropertyBuilder2.addAll(pOJOPropertyBuilder);
                }
                _updateCreatorProperty(pOJOPropertyBuilder, this._creatorProperties);
                HashSet<String> hashSet = this._ignoredPropertyNames;
                if (hashSet != null) {
                    hashSet.remove(name);
                }
            }
        }
    }

    public void _renameUsing(Map<String, POJOPropertyBuilder> map, PropertyNamingStrategy propertyNamingStrategy) {
        POJOPropertyBuilder[] pOJOPropertyBuilderArr = (POJOPropertyBuilder[]) map.values().toArray(new POJOPropertyBuilder[map.size()]);
        map.clear();
        for (POJOPropertyBuilder pOJOPropertyBuilder : pOJOPropertyBuilderArr) {
            PropertyName fullName = pOJOPropertyBuilder.getFullName();
            String str = null;
            if (!pOJOPropertyBuilder.isExplicitlyNamed() || this._config.isEnabled(MapperFeature.ALLOW_EXPLICIT_PROPERTY_RENAMING)) {
                if (this._forSerialization) {
                    if (pOJOPropertyBuilder.hasGetter()) {
                        str = propertyNamingStrategy.nameForGetterMethod(this._config, pOJOPropertyBuilder.getGetter(), fullName.getSimpleName());
                    } else if (pOJOPropertyBuilder.hasField()) {
                        str = propertyNamingStrategy.nameForField(this._config, pOJOPropertyBuilder.getField(), fullName.getSimpleName());
                    }
                } else if (pOJOPropertyBuilder.hasSetter()) {
                    str = propertyNamingStrategy.nameForSetterMethod(this._config, pOJOPropertyBuilder.getSetter(), fullName.getSimpleName());
                } else if (pOJOPropertyBuilder.hasConstructorParameter()) {
                    str = propertyNamingStrategy.nameForConstructorParameter(this._config, pOJOPropertyBuilder.getConstructorParameter(), fullName.getSimpleName());
                } else if (pOJOPropertyBuilder.hasField()) {
                    str = propertyNamingStrategy.nameForField(this._config, pOJOPropertyBuilder.getField(), fullName.getSimpleName());
                } else if (pOJOPropertyBuilder.hasGetter()) {
                    str = propertyNamingStrategy.nameForGetterMethod(this._config, pOJOPropertyBuilder.getGetter(), fullName.getSimpleName());
                }
            }
            if (str == null || fullName.hasSimpleName(str)) {
                str = fullName.getSimpleName();
            } else {
                pOJOPropertyBuilder = pOJOPropertyBuilder.withSimpleName(str);
            }
            POJOPropertyBuilder pOJOPropertyBuilder2 = map.get(str);
            if (pOJOPropertyBuilder2 == null) {
                map.put(str, pOJOPropertyBuilder);
            } else {
                pOJOPropertyBuilder2.addAll(pOJOPropertyBuilder);
            }
            _updateCreatorProperty(pOJOPropertyBuilder, this._creatorProperties);
        }
    }

    public void _renameWithWrappers(Map<String, POJOPropertyBuilder> map) {
        PropertyName findWrapperName;
        Iterator<Map.Entry<String, POJOPropertyBuilder>> it = map.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            POJOPropertyBuilder value = it.next().getValue();
            AnnotatedMember primaryMember = value.getPrimaryMember();
            if (primaryMember != null && (findWrapperName = this._annotationIntrospector.findWrapperName(primaryMember)) != null && findWrapperName.hasSimpleName() && !findWrapperName.equals(value.getFullName())) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(value.withName(findWrapperName));
                it.remove();
            }
        }
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                POJOPropertyBuilder pOJOPropertyBuilder = (POJOPropertyBuilder) it2.next();
                String name = pOJOPropertyBuilder.getName();
                POJOPropertyBuilder pOJOPropertyBuilder2 = map.get(name);
                if (pOJOPropertyBuilder2 == null) {
                    map.put(name, pOJOPropertyBuilder);
                } else {
                    pOJOPropertyBuilder2.addAll(pOJOPropertyBuilder);
                }
            }
        }
    }

    public void _sortProperties(Map<String, POJOPropertyBuilder> map) {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        Boolean findSerializationSortAlphabetically = annotationIntrospector.findSerializationSortAlphabetically(this._classDef);
        boolean shouldSortPropertiesAlphabetically = findSerializationSortAlphabetically == null ? this._config.shouldSortPropertiesAlphabetically() : findSerializationSortAlphabetically.booleanValue();
        String[] findSerializationPropertyOrder = annotationIntrospector.findSerializationPropertyOrder(this._classDef);
        if (!shouldSortPropertiesAlphabetically && this._creatorProperties == null && findSerializationPropertyOrder == null) {
            return;
        }
        int size = map.size();
        Map<? extends Object, ? extends Object> treeMap = shouldSortPropertiesAlphabetically ? new TreeMap<>() : new LinkedHashMap<>(size + size);
        for (POJOPropertyBuilder pOJOPropertyBuilder : map.values()) {
            treeMap.put(pOJOPropertyBuilder.getName(), pOJOPropertyBuilder);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(size + size);
        if (findSerializationPropertyOrder != null) {
            for (String str : findSerializationPropertyOrder) {
                POJOPropertyBuilder pOJOPropertyBuilder2 = (POJOPropertyBuilder) treeMap.get(str);
                if (pOJOPropertyBuilder2 == null) {
                    Iterator<POJOPropertyBuilder> it = map.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        POJOPropertyBuilder next = it.next();
                        if (str.equals(next.getInternalName())) {
                            str = next.getName();
                            pOJOPropertyBuilder2 = next;
                            break;
                        }
                    }
                }
                if (pOJOPropertyBuilder2 != null) {
                    linkedHashMap.put(str, pOJOPropertyBuilder2);
                }
            }
        }
        Collection<POJOPropertyBuilder> collection = this._creatorProperties;
        if (collection != null) {
            if (shouldSortPropertiesAlphabetically) {
                TreeMap treeMap2 = new TreeMap();
                Iterator<POJOPropertyBuilder> it2 = this._creatorProperties.iterator();
                while (it2.hasNext()) {
                    POJOPropertyBuilder next2 = it2.next();
                    treeMap2.put(next2.getName(), next2);
                }
                collection = treeMap2.values();
            }
            for (POJOPropertyBuilder pOJOPropertyBuilder3 : collection) {
                String name = pOJOPropertyBuilder3.getName();
                if (treeMap.containsKey(name)) {
                    linkedHashMap.put(name, pOJOPropertyBuilder3);
                }
            }
        }
        linkedHashMap.putAll(treeMap);
        map.clear();
        map.putAll(linkedHashMap);
    }

    public void _updateCreatorProperty(POJOPropertyBuilder pOJOPropertyBuilder, List<POJOPropertyBuilder> list) {
        if (list != null) {
            String internalName = pOJOPropertyBuilder.getInternalName();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (list.get(i2).getInternalName().equals(internalName)) {
                    list.set(i2, pOJOPropertyBuilder);
                    return;
                }
            }
        }
    }

    public void collectAll() {
        LinkedHashMap<String, POJOPropertyBuilder> linkedHashMap = new LinkedHashMap<>();
        _addFields(linkedHashMap);
        _addMethods(linkedHashMap);
        if (!this._classDef.isNonStaticInnerClass()) {
            _addCreators(linkedHashMap);
        }
        _addInjectables(linkedHashMap);
        _removeUnwantedProperties(linkedHashMap);
        _removeUnwantedAccessor(linkedHashMap);
        _renameProperties(linkedHashMap);
        Iterator<POJOPropertyBuilder> it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            it.next().mergeAnnotations(this._forSerialization);
        }
        PropertyNamingStrategy _findNamingStrategy = _findNamingStrategy();
        if (_findNamingStrategy != null) {
            _renameUsing(linkedHashMap, _findNamingStrategy);
        }
        Iterator<POJOPropertyBuilder> it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            it2.next().trimByVisibility();
        }
        if (this._config.isEnabled(MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME)) {
            _renameWithWrappers(linkedHashMap);
        }
        _sortProperties(linkedHashMap);
        this._properties = linkedHashMap;
        this._collected = true;
    }

    public Class<?> findPOJOBuilderClass() {
        return this._annotationIntrospector.findPOJOBuilder(this._classDef);
    }

    public AnnotationIntrospector getAnnotationIntrospector() {
        return this._annotationIntrospector;
    }

    public AnnotatedMember getAnyGetter() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._anyGetters;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem("Multiple 'any-getters' defined (%s vs %s)", this._anyGetters.get(0), this._anyGetters.get(1));
        }
        return this._anyGetters.getFirst();
    }

    public AnnotatedMember getAnySetterField() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._anySetterField;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem("Multiple 'any-setter' fields defined (%s vs %s)", this._anySetterField.get(0), this._anySetterField.get(1));
        }
        return this._anySetterField.getFirst();
    }

    public AnnotatedMethod getAnySetterMethod() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMethod> linkedList = this._anySetters;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem("Multiple 'any-setter' methods defined (%s vs %s)", this._anySetters.get(0), this._anySetters.get(1));
        }
        return this._anySetters.getFirst();
    }

    public AnnotatedClass getClassDef() {
        return this._classDef;
    }

    public MapperConfig<?> getConfig() {
        return this._config;
    }

    public Set<String> getIgnoredPropertyNames() {
        return this._ignoredPropertyNames;
    }

    public Map<Object, AnnotatedMember> getInjectables() {
        if (!this._collected) {
            collectAll();
        }
        return this._injectables;
    }

    public AnnotatedMember getJsonValueAccessor() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._jsonValueAccessors;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem("Multiple 'as-value' properties defined (%s vs %s)", this._jsonValueAccessors.get(0), this._jsonValueAccessors.get(1));
        }
        return this._jsonValueAccessors.get(0);
    }

    @Deprecated
    public AnnotatedMethod getJsonValueMethod() {
        AnnotatedMember jsonValueAccessor = getJsonValueAccessor();
        if (jsonValueAccessor instanceof AnnotatedMethod) {
            return (AnnotatedMethod) jsonValueAccessor;
        }
        return null;
    }

    public ObjectIdInfo getObjectIdInfo() {
        ObjectIdInfo findObjectIdInfo = this._annotationIntrospector.findObjectIdInfo(this._classDef);
        return findObjectIdInfo != null ? this._annotationIntrospector.findObjectReferenceInfo(this._classDef, findObjectIdInfo) : findObjectIdInfo;
    }

    public List<BeanPropertyDefinition> getProperties() {
        return new ArrayList(getPropertyMap().values());
    }

    public Map<String, POJOPropertyBuilder> getPropertyMap() {
        if (!this._collected) {
            collectAll();
        }
        return this._properties;
    }

    public JavaType getType() {
        return this._type;
    }

    public void reportProblem(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        StringBuilder m24u = C0000a.m24u("Problem with definition of ");
        m24u.append(this._classDef);
        m24u.append(": ");
        m24u.append(str);
        throw new IllegalArgumentException(m24u.toString());
    }

    public POJOPropertyBuilder _property(Map<String, POJOPropertyBuilder> map, String str) {
        POJOPropertyBuilder pOJOPropertyBuilder = map.get(str);
        if (pOJOPropertyBuilder != null) {
            return pOJOPropertyBuilder;
        }
        POJOPropertyBuilder pOJOPropertyBuilder2 = new POJOPropertyBuilder(this._config, this._annotationIntrospector, this._forSerialization, PropertyName.construct(str));
        map.put(str, pOJOPropertyBuilder2);
        return pOJOPropertyBuilder2;
    }
}
