package com.fasterxml.jackson.databind.deser;

import androidx.room.util.C0576a;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector;
import com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators;
import com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers;
import com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer;
import com.fasterxml.jackson.databind.deser.std.JdkDeserializers;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicReference;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class BasicDeserializerFactory extends DeserializerFactory implements Serializable {
    public final DeserializerFactoryConfig _factoryConfig;
    private static final Class<?> CLASS_OBJECT = Object.class;
    private static final Class<?> CLASS_STRING = String.class;
    private static final Class<?> CLASS_CHAR_SEQUENCE = CharSequence.class;
    private static final Class<?> CLASS_ITERABLE = Iterable.class;
    private static final Class<?> CLASS_MAP_ENTRY = Map.Entry.class;
    private static final Class<?> CLASS_SERIALIZABLE = Serializable.class;
    public static final PropertyName UNWRAPPED_CREATOR_PARAM_NAME = new PropertyName("@JsonUnwrapped");

    /* renamed from: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory$1 */
    public static /* synthetic */ class C08421 {
        public static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode;

        static {
            int[] iArr = new int[JsonCreator.Mode.values().length];
            $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode = iArr;
            try {
                iArr[JsonCreator.Mode.DELEGATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode[JsonCreator.Mode.PROPERTIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode[JsonCreator.Mode.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class ContainerDefaultMappings {
        public static final HashMap<String, Class<? extends Collection>> _collectionFallbacks;
        public static final HashMap<String, Class<? extends Map>> _mapFallbacks;

        static {
            HashMap<String, Class<? extends Collection>> hashMap = new HashMap<>();
            hashMap.put(Collection.class.getName(), ArrayList.class);
            hashMap.put(List.class.getName(), ArrayList.class);
            hashMap.put(Set.class.getName(), HashSet.class);
            hashMap.put(SortedSet.class.getName(), TreeSet.class);
            hashMap.put(Queue.class.getName(), LinkedList.class);
            hashMap.put(AbstractList.class.getName(), ArrayList.class);
            hashMap.put(AbstractSet.class.getName(), HashSet.class);
            hashMap.put(Deque.class.getName(), LinkedList.class);
            hashMap.put(NavigableSet.class.getName(), TreeSet.class);
            _collectionFallbacks = hashMap;
            HashMap<String, Class<? extends Map>> hashMap2 = new HashMap<>();
            hashMap2.put(Map.class.getName(), LinkedHashMap.class);
            hashMap2.put(AbstractMap.class.getName(), LinkedHashMap.class);
            hashMap2.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
            hashMap2.put(SortedMap.class.getName(), TreeMap.class);
            hashMap2.put(NavigableMap.class.getName(), TreeMap.class);
            hashMap2.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
            _mapFallbacks = hashMap2;
        }

        public static Class<?> findCollectionFallback(JavaType javaType) {
            return _collectionFallbacks.get(javaType.getRawClass().getName());
        }

        public static Class<?> findMapFallback(JavaType javaType) {
            return _mapFallbacks.get(javaType.getRawClass().getName());
        }
    }

    public BasicDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        this._factoryConfig = deserializerFactoryConfig;
    }

    private boolean _checkIfCreatorPropertyBased(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, BeanPropertyDefinition beanPropertyDefinition) {
        String name;
        if ((beanPropertyDefinition == null || !beanPropertyDefinition.isExplicitlyNamed()) && annotationIntrospector.findInjectableValue(annotatedWithParams.getParameter(0)) == null) {
            return (beanPropertyDefinition == null || (name = beanPropertyDefinition.getName()) == null || name.isEmpty() || !beanPropertyDefinition.couldSerialize()) ? false : true;
        }
        return true;
    }

    private void _checkImplicitlyNamedConstructors(DeserializationContext deserializationContext, BeanDescription beanDescription, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorCollector creatorCollector, List<AnnotatedWithParams> list) throws JsonMappingException {
        int i2;
        Iterator<AnnotatedWithParams> it = list.iterator();
        AnnotatedWithParams annotatedWithParams = null;
        AnnotatedWithParams annotatedWithParams2 = null;
        SettableBeanProperty[] settableBeanPropertyArr = null;
        while (true) {
            if (!it.hasNext()) {
                annotatedWithParams = annotatedWithParams2;
                break;
            }
            AnnotatedWithParams next = it.next();
            if (visibilityChecker.isCreatorVisible(next)) {
                int parameterCount = next.getParameterCount();
                SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[parameterCount];
                int i3 = 0;
                while (true) {
                    if (i3 < parameterCount) {
                        AnnotatedParameter parameter = next.getParameter(i3);
                        PropertyName _findParamName = _findParamName(parameter, annotationIntrospector);
                        if (_findParamName != null && !_findParamName.isEmpty()) {
                            settableBeanPropertyArr2[i3] = constructCreatorProperty(deserializationContext, beanDescription, _findParamName, parameter.getIndex(), parameter, null);
                            i3++;
                        }
                    } else {
                        if (annotatedWithParams2 != null) {
                            break;
                        }
                        annotatedWithParams2 = next;
                        settableBeanPropertyArr = settableBeanPropertyArr2;
                    }
                }
            }
        }
        if (annotatedWithParams != null) {
            creatorCollector.addPropertyCreator(annotatedWithParams, false, settableBeanPropertyArr);
            BasicBeanDescription basicBeanDescription = (BasicBeanDescription) beanDescription;
            for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
                PropertyName fullName = settableBeanProperty.getFullName();
                if (!basicBeanDescription.hasProperty(fullName)) {
                    basicBeanDescription.addProperty(SimpleBeanPropertyDefinition.construct(deserializationContext.getConfig(), settableBeanProperty.getMember(), fullName));
                }
            }
        }
    }

    private KeyDeserializer _createEnumKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        Class<?> rawClass = javaType.getRawClass();
        BeanDescription introspect = config.introspect(javaType);
        KeyDeserializer findKeyDeserializerFromAnnotation = findKeyDeserializerFromAnnotation(deserializationContext, introspect.getClassInfo());
        if (findKeyDeserializerFromAnnotation != null) {
            return findKeyDeserializerFromAnnotation;
        }
        JsonDeserializer<?> _findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, introspect);
        if (_findCustomEnumDeserializer != null) {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(config, javaType, _findCustomEnumDeserializer);
        }
        JsonDeserializer<Object> findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, introspect.getClassInfo());
        if (findDeserializerFromAnnotation != null) {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(config, javaType, findDeserializerFromAnnotation);
        }
        EnumResolver constructEnumResolver = constructEnumResolver(rawClass, config, introspect.findJsonValueAccessor());
        for (AnnotatedMethod annotatedMethod : introspect.getFactoryMethods()) {
            if (_hasCreatorAnnotation(deserializationContext, annotatedMethod)) {
                if (annotatedMethod.getParameterCount() != 1 || !annotatedMethod.getRawReturnType().isAssignableFrom(rawClass)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unsuitable method (");
                    sb.append(annotatedMethod);
                    sb.append(") decorated with @JsonCreator (for Enum type ");
                    throw new IllegalArgumentException(C0576a.m4116o(rawClass, sb, ")"));
                }
                if (annotatedMethod.getRawParameterType(0) == String.class) {
                    if (config.canOverrideAccessModifiers()) {
                        ClassUtil.checkAndFixAccess(annotatedMethod.getMember(), deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    return StdKeyDeserializers.constructEnumKeyDeserializer(constructEnumResolver, annotatedMethod);
                }
                throw new IllegalArgumentException("Parameter #0 type for factory method (" + annotatedMethod + ") not suitable, must be java.lang.String");
            }
        }
        return StdKeyDeserializers.constructEnumKeyDeserializer(constructEnumResolver);
    }

    private PropertyName _findParamName(AnnotatedParameter annotatedParameter, AnnotationIntrospector annotationIntrospector) {
        if (annotatedParameter == null || annotationIntrospector == null) {
            return null;
        }
        PropertyName findNameForDeserialization = annotationIntrospector.findNameForDeserialization(annotatedParameter);
        if (findNameForDeserialization != null) {
            return findNameForDeserialization;
        }
        String findImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedParameter);
        if (findImplicitPropertyName == null || findImplicitPropertyName.isEmpty()) {
            return null;
        }
        return PropertyName.construct(findImplicitPropertyName);
    }

    private JavaType _mapAbstractType2(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        if (!this._factoryConfig.hasAbstractTypeResolvers()) {
            return null;
        }
        Iterator<AbstractTypeResolver> it = this._factoryConfig.abstractTypeResolvers().iterator();
        while (it.hasNext()) {
            JavaType findTypeMapping = it.next().findTypeMapping(deserializationConfig, javaType);
            if (findTypeMapping != null && !findTypeMapping.hasRawClass(rawClass)) {
                return findTypeMapping;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void _addDeserializerConstructors(com.fasterxml.jackson.databind.DeserializationContext r27, com.fasterxml.jackson.databind.BeanDescription r28, com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> r29, com.fasterxml.jackson.databind.AnnotationIntrospector r30, com.fasterxml.jackson.databind.deser.impl.CreatorCollector r31, java.util.Map<com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]> r32) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._addDeserializerConstructors(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.introspect.VisibilityChecker, com.fasterxml.jackson.databind.AnnotationIntrospector, com.fasterxml.jackson.databind.deser.impl.CreatorCollector, java.util.Map):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v1, types: [com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition] */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    public void _addDeserializerFactoryMethods(DeserializationContext deserializationContext, BeanDescription beanDescription, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorCollector creatorCollector, Map<AnnotatedWithParams, BeanPropertyDefinition[]> map) throws JsonMappingException {
        AnnotatedParameter annotatedParameter;
        int i2;
        int i3;
        SettableBeanProperty[] settableBeanPropertyArr;
        AnnotatedWithParams annotatedWithParams;
        int i4;
        AnnotatedParameter annotatedParameter2;
        VisibilityChecker<?> visibilityChecker2 = visibilityChecker;
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> map2 = map;
        LinkedList<CreatorCandidate> linkedList = new LinkedList();
        Iterator<AnnotatedMethod> it = beanDescription.getFactoryMethods().iterator();
        int i5 = 0;
        while (true) {
            annotatedParameter = null;
            i2 = 1;
            if (!it.hasNext()) {
                break;
            }
            AnnotatedMethod next = it.next();
            JsonCreator.Mode findCreatorAnnotation = annotationIntrospector.findCreatorAnnotation(deserializationContext.getConfig(), next);
            int parameterCount = next.getParameterCount();
            if (findCreatorAnnotation == null) {
                if (parameterCount == 1 && visibilityChecker2.isCreatorVisible(next)) {
                    linkedList.add(CreatorCandidate.construct(annotationIntrospector, next, null));
                }
            } else if (findCreatorAnnotation != JsonCreator.Mode.DISABLED) {
                if (parameterCount == 0) {
                    creatorCollector.setDefaultCreator(next);
                } else {
                    int i6 = C08421.$SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode[findCreatorAnnotation.ordinal()];
                    if (i6 == 1) {
                        _addExplicitDelegatingCreator(deserializationContext, beanDescription, creatorCollector, CreatorCandidate.construct(annotationIntrospector, next, null));
                    } else if (i6 != 2) {
                        _addExplicitAnyCreator(deserializationContext, beanDescription, creatorCollector, CreatorCandidate.construct(annotationIntrospector, next, map2.get(next)));
                    } else {
                        _addExplicitPropertyCreator(deserializationContext, beanDescription, creatorCollector, CreatorCandidate.construct(annotationIntrospector, next, map2.get(next)));
                    }
                    i5++;
                }
            }
        }
        if (i5 > 0) {
            return;
        }
        for (CreatorCandidate creatorCandidate : linkedList) {
            int paramCount = creatorCandidate.paramCount();
            AnnotatedWithParams creator = creatorCandidate.creator();
            BeanPropertyDefinition[] beanPropertyDefinitionArr = map2.get(creator);
            if (paramCount == i2) {
                BeanPropertyDefinition propertyDef = creatorCandidate.propertyDef(0);
                if (_checkIfCreatorPropertyBased(annotationIntrospector, creator, propertyDef)) {
                    SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[paramCount];
                    AnnotatedParameter annotatedParameter3 = annotatedParameter;
                    int i7 = 0;
                    int i8 = 0;
                    int i9 = 0;
                    while (i7 < paramCount) {
                        AnnotatedParameter parameter = creator.getParameter(i7);
                        ?? r20 = beanPropertyDefinitionArr == null ? annotatedParameter : beanPropertyDefinitionArr[i7];
                        JacksonInject.Value findInjectableValue = annotationIntrospector.findInjectableValue(parameter);
                        PropertyName fullName = r20 == 0 ? annotatedParameter : r20.getFullName();
                        if (r20 == 0 || !r20.isExplicitlyNamed()) {
                            i3 = i7;
                            settableBeanPropertyArr = settableBeanPropertyArr2;
                            annotatedWithParams = creator;
                            i4 = paramCount;
                            annotatedParameter2 = annotatedParameter;
                            if (findInjectableValue != null) {
                                i9++;
                                settableBeanPropertyArr[i3] = constructCreatorProperty(deserializationContext, beanDescription, fullName, i3, parameter, findInjectableValue);
                            } else if (annotationIntrospector.findUnwrappingNameTransformer(parameter) != null) {
                                _reportUnwrappedCreatorProperty(deserializationContext, beanDescription, parameter);
                            } else if (annotatedParameter3 == null) {
                                annotatedParameter3 = parameter;
                            }
                        } else {
                            i8++;
                            i3 = i7;
                            settableBeanPropertyArr = settableBeanPropertyArr2;
                            annotatedWithParams = creator;
                            i4 = paramCount;
                            annotatedParameter2 = annotatedParameter;
                            settableBeanPropertyArr[i3] = constructCreatorProperty(deserializationContext, beanDescription, fullName, i3, parameter, findInjectableValue);
                        }
                        i7 = i3 + 1;
                        creator = annotatedWithParams;
                        paramCount = i4;
                        settableBeanPropertyArr2 = settableBeanPropertyArr;
                        annotatedParameter = annotatedParameter2;
                    }
                    SettableBeanProperty[] settableBeanPropertyArr3 = settableBeanPropertyArr2;
                    AnnotatedWithParams annotatedWithParams2 = creator;
                    int i10 = paramCount;
                    AnnotatedParameter annotatedParameter4 = annotatedParameter;
                    int i11 = i8 + 0;
                    if (i8 > 0 || i9 > 0) {
                        if (i11 + i9 == i10) {
                            creatorCollector.addPropertyCreator(annotatedWithParams2, false, settableBeanPropertyArr3);
                        } else if (i8 == 0 && i9 + 1 == i10) {
                            creatorCollector.addDelegatingCreator(annotatedWithParams2, false, settableBeanPropertyArr3, 0);
                        } else {
                            deserializationContext.reportBadTypeDefinition(beanDescription, "Argument #%d of factory method %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", Integer.valueOf(annotatedParameter3.getIndex()), annotatedWithParams2);
                            visibilityChecker2 = visibilityChecker;
                            map2 = map;
                            annotatedParameter = annotatedParameter4;
                            i2 = 1;
                        }
                    }
                    visibilityChecker2 = visibilityChecker;
                    map2 = map;
                    annotatedParameter = annotatedParameter4;
                    i2 = 1;
                } else {
                    _handleSingleArgumentCreator(creatorCollector, creator, false, visibilityChecker2.isCreatorVisible(creator));
                    if (propertyDef != null) {
                        ((POJOPropertyBuilder) propertyDef).removeConstructors();
                    }
                }
            }
        }
    }

    public void _addExplicitAnyCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate) throws JsonMappingException {
        if (1 != creatorCandidate.paramCount()) {
            int findOnlyParamWithoutInjection = creatorCandidate.findOnlyParamWithoutInjection();
            if (findOnlyParamWithoutInjection < 0 || creatorCandidate.paramName(findOnlyParamWithoutInjection) != null) {
                _addExplicitPropertyCreator(deserializationContext, beanDescription, creatorCollector, creatorCandidate);
                return;
            } else {
                _addExplicitDelegatingCreator(deserializationContext, beanDescription, creatorCollector, creatorCandidate);
                return;
            }
        }
        AnnotatedParameter parameter = creatorCandidate.parameter(0);
        JacksonInject.Value injection = creatorCandidate.injection(0);
        PropertyName explicitParamName = creatorCandidate.explicitParamName(0);
        BeanPropertyDefinition propertyDef = creatorCandidate.propertyDef(0);
        boolean z = (explicitParamName == null && injection == null) ? false : true;
        if (!z && propertyDef != null) {
            explicitParamName = creatorCandidate.paramName(0);
            z = explicitParamName != null && propertyDef.couldSerialize();
        }
        PropertyName propertyName = explicitParamName;
        if (z) {
            creatorCollector.addPropertyCreator(creatorCandidate.creator(), true, new SettableBeanProperty[]{constructCreatorProperty(deserializationContext, beanDescription, propertyName, 0, parameter, injection)});
            return;
        }
        _handleSingleArgumentCreator(creatorCollector, creatorCandidate.creator(), true, true);
        if (propertyDef != null) {
            ((POJOPropertyBuilder) propertyDef).removeConstructors();
        }
    }

    public void _addExplicitDelegatingCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate) throws JsonMappingException {
        int paramCount = creatorCandidate.paramCount();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[paramCount];
        int i2 = -1;
        for (int i3 = 0; i3 < paramCount; i3++) {
            AnnotatedParameter parameter = creatorCandidate.parameter(i3);
            JacksonInject.Value injection = creatorCandidate.injection(i3);
            if (injection != null) {
                settableBeanPropertyArr[i3] = constructCreatorProperty(deserializationContext, beanDescription, null, i3, parameter, injection);
            } else if (i2 < 0) {
                i2 = i3;
            } else {
                deserializationContext.reportBadTypeDefinition(beanDescription, "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed", Integer.valueOf(i2), Integer.valueOf(i3), creatorCandidate);
            }
        }
        if (i2 < 0) {
            deserializationContext.reportBadTypeDefinition(beanDescription, "No argument left as delegating for Creator %s: exactly one required", creatorCandidate);
        }
        if (paramCount != 1) {
            creatorCollector.addDelegatingCreator(creatorCandidate.creator(), true, settableBeanPropertyArr, i2);
            return;
        }
        _handleSingleArgumentCreator(creatorCollector, creatorCandidate.creator(), true, true);
        BeanPropertyDefinition propertyDef = creatorCandidate.propertyDef(0);
        if (propertyDef != null) {
            ((POJOPropertyBuilder) propertyDef).removeConstructors();
        }
    }

    public void _addExplicitPropertyCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate) throws JsonMappingException {
        int paramCount = creatorCandidate.paramCount();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[paramCount];
        for (int i2 = 0; i2 < paramCount; i2++) {
            JacksonInject.Value injection = creatorCandidate.injection(i2);
            AnnotatedParameter parameter = creatorCandidate.parameter(i2);
            PropertyName paramName = creatorCandidate.paramName(i2);
            if (paramName == null) {
                if (deserializationContext.getAnnotationIntrospector().findUnwrappingNameTransformer(parameter) != null) {
                    _reportUnwrappedCreatorProperty(deserializationContext, beanDescription, parameter);
                }
                paramName = creatorCandidate.findImplicitParamName(i2);
                if (paramName == null && injection == null) {
                    deserializationContext.reportBadTypeDefinition(beanDescription, "Argument #%d has no property name, is not Injectable: can not use as Creator %s", Integer.valueOf(i2), creatorCandidate);
                }
            }
            settableBeanPropertyArr[i2] = constructCreatorProperty(deserializationContext, beanDescription, paramName, i2, parameter, injection);
        }
        creatorCollector.addPropertyCreator(creatorCandidate.creator(), true, settableBeanPropertyArr);
    }

    public ValueInstantiator _constructDefaultValueInstantiator(DeserializationContext deserializationContext, BeanDescription beanDescription) throws JsonMappingException {
        CreatorCollector creatorCollector = new CreatorCollector(beanDescription, deserializationContext.getConfig());
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        VisibilityChecker<?> defaultVisibilityChecker = deserializationContext.getConfig().getDefaultVisibilityChecker(beanDescription.getBeanClass(), beanDescription.getClassInfo());
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> _findCreatorsFromProperties = _findCreatorsFromProperties(deserializationContext, beanDescription);
        _addDeserializerFactoryMethods(deserializationContext, beanDescription, defaultVisibilityChecker, annotationIntrospector, creatorCollector, _findCreatorsFromProperties);
        if (beanDescription.getType().isConcrete()) {
            _addDeserializerConstructors(deserializationContext, beanDescription, defaultVisibilityChecker, annotationIntrospector, creatorCollector, _findCreatorsFromProperties);
        }
        return creatorCollector.constructValueInstantiator(deserializationContext);
    }

    public Map<AnnotatedWithParams, BeanPropertyDefinition[]> _findCreatorsFromProperties(DeserializationContext deserializationContext, BeanDescription beanDescription) throws JsonMappingException {
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> emptyMap = Collections.emptyMap();
        for (BeanPropertyDefinition beanPropertyDefinition : beanDescription.findProperties()) {
            Iterator<AnnotatedParameter> constructorParameters = beanPropertyDefinition.getConstructorParameters();
            while (constructorParameters.hasNext()) {
                AnnotatedParameter next = constructorParameters.next();
                AnnotatedWithParams owner = next.getOwner();
                BeanPropertyDefinition[] beanPropertyDefinitionArr = emptyMap.get(owner);
                int index = next.getIndex();
                if (beanPropertyDefinitionArr == null) {
                    if (emptyMap.isEmpty()) {
                        emptyMap = new LinkedHashMap<>();
                    }
                    beanPropertyDefinitionArr = new BeanPropertyDefinition[owner.getParameterCount()];
                    emptyMap.put(owner, beanPropertyDefinitionArr);
                } else if (beanPropertyDefinitionArr[index] != null) {
                    deserializationContext.reportBadTypeDefinition(beanDescription, "Conflict: parameter #%d of %s bound to more than one property; %s vs %s", Integer.valueOf(index), owner, beanPropertyDefinitionArr[index], beanPropertyDefinition);
                }
                beanPropertyDefinitionArr[index] = beanPropertyDefinition;
            }
        }
        return emptyMap;
    }

    public JsonDeserializer<?> _findCustomArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> findArrayDeserializer = it.next().findArrayDeserializer(arrayType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findArrayDeserializer != null) {
                return findArrayDeserializer;
            }
        }
        return null;
    }

    public JsonDeserializer<Object> _findCustomBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> findBeanDeserializer = it.next().findBeanDeserializer(javaType, deserializationConfig, beanDescription);
            if (findBeanDeserializer != null) {
                return findBeanDeserializer;
            }
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> findCollectionDeserializer = it.next().findCollectionDeserializer(collectionType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findCollectionDeserializer != null) {
                return findCollectionDeserializer;
            }
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> findCollectionLikeDeserializer = it.next().findCollectionLikeDeserializer(collectionLikeType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findCollectionLikeDeserializer != null) {
                return findCollectionLikeDeserializer;
            }
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomEnumDeserializer(Class<?> cls, DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> findEnumDeserializer = it.next().findEnumDeserializer(cls, deserializationConfig, beanDescription);
            if (findEnumDeserializer != null) {
                return findEnumDeserializer;
            }
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> findMapDeserializer = it.next().findMapDeserializer(mapType, deserializationConfig, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
            if (findMapDeserializer != null) {
                return findMapDeserializer;
            }
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> findMapLikeDeserializer = it.next().findMapLikeDeserializer(mapLikeType, deserializationConfig, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
            if (findMapLikeDeserializer != null) {
                return findMapLikeDeserializer;
            }
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomReferenceDeserializer(ReferenceType referenceType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> findReferenceDeserializer = it.next().findReferenceDeserializer(referenceType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findReferenceDeserializer != null) {
                return findReferenceDeserializer;
            }
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomTreeNodeDeserializer(Class<? extends JsonNode> cls, DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> findTreeNodeDeserializer = it.next().findTreeNodeDeserializer(cls, deserializationConfig, beanDescription);
            if (findTreeNodeDeserializer != null) {
                return findTreeNodeDeserializer;
            }
        }
        return null;
    }

    @Deprecated
    public AnnotatedMethod _findJsonValueFor(DeserializationConfig deserializationConfig, JavaType javaType) {
        if (javaType == null) {
            return null;
        }
        return deserializationConfig.introspect(javaType).findJsonValueMethod();
    }

    public JavaType _findRemappedType(DeserializationConfig deserializationConfig, Class<?> cls) throws JsonMappingException {
        JavaType mapAbstractType = mapAbstractType(deserializationConfig, deserializationConfig.constructType(cls));
        if (mapAbstractType == null || mapAbstractType.hasRawClass(cls)) {
            return null;
        }
        return mapAbstractType;
    }

    public PropertyMetadata _getSetterInfo(DeserializationContext deserializationContext, BeanProperty beanProperty, PropertyMetadata propertyMetadata) {
        Nulls nulls;
        JsonSetter.Value findSetterInfo;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotatedMember member = beanProperty.getMember();
        Nulls nulls2 = null;
        if (member != null) {
            if (annotationIntrospector == null || (findSetterInfo = annotationIntrospector.findSetterInfo(member)) == null) {
                nulls = null;
            } else {
                nulls2 = findSetterInfo.nonDefaultValueNulls();
                nulls = findSetterInfo.nonDefaultContentNulls();
            }
            JsonSetter.Value setterInfo = config.getConfigOverride(beanProperty.getType().getRawClass()).getSetterInfo();
            if (setterInfo != null) {
                if (nulls2 == null) {
                    nulls2 = setterInfo.nonDefaultValueNulls();
                }
                if (nulls == null) {
                    nulls = setterInfo.nonDefaultContentNulls();
                }
            }
        } else {
            nulls = null;
        }
        JsonSetter.Value defaultSetterInfo = config.getDefaultSetterInfo();
        if (nulls2 == null) {
            nulls2 = defaultSetterInfo.nonDefaultValueNulls();
        }
        if (nulls == null) {
            nulls = defaultSetterInfo.nonDefaultContentNulls();
        }
        return (nulls2 == null && nulls == null) ? propertyMetadata : propertyMetadata.withNulls(nulls2, nulls);
    }

    public boolean _handleSingleArgumentCreator(CreatorCollector creatorCollector, AnnotatedWithParams annotatedWithParams, boolean z, boolean z2) {
        Class<?> rawParameterType = annotatedWithParams.getRawParameterType(0);
        if (rawParameterType == String.class || rawParameterType == CLASS_CHAR_SEQUENCE) {
            if (z || z2) {
                creatorCollector.addStringCreator(annotatedWithParams, z);
            }
            return true;
        }
        if (rawParameterType == Integer.TYPE || rawParameterType == Integer.class) {
            if (z || z2) {
                creatorCollector.addIntCreator(annotatedWithParams, z);
            }
            return true;
        }
        if (rawParameterType == Long.TYPE || rawParameterType == Long.class) {
            if (z || z2) {
                creatorCollector.addLongCreator(annotatedWithParams, z);
            }
            return true;
        }
        if (rawParameterType == Double.TYPE || rawParameterType == Double.class) {
            if (z || z2) {
                creatorCollector.addDoubleCreator(annotatedWithParams, z);
            }
            return true;
        }
        if (rawParameterType == Boolean.TYPE || rawParameterType == Boolean.class) {
            if (z || z2) {
                creatorCollector.addBooleanCreator(annotatedWithParams, z);
            }
            return true;
        }
        if (!z) {
            return false;
        }
        creatorCollector.addDelegatingCreator(annotatedWithParams, z, null, 0);
        return true;
    }

    public boolean _hasCreatorAnnotation(DeserializationContext deserializationContext, Annotated annotated) {
        JsonCreator.Mode findCreatorAnnotation;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        return (annotationIntrospector == null || (findCreatorAnnotation = annotationIntrospector.findCreatorAnnotation(deserializationContext.getConfig(), annotated)) == null || findCreatorAnnotation == JsonCreator.Mode.DISABLED) ? false : true;
    }

    public CollectionType _mapAbstractCollectionType(JavaType javaType, DeserializationConfig deserializationConfig) {
        Class<?> findCollectionFallback = ContainerDefaultMappings.findCollectionFallback(javaType);
        if (findCollectionFallback != null) {
            return (CollectionType) deserializationConfig.constructSpecializedType(javaType, findCollectionFallback);
        }
        return null;
    }

    public MapType _mapAbstractMapType(JavaType javaType, DeserializationConfig deserializationConfig) {
        Class<?> findMapFallback = ContainerDefaultMappings.findMapFallback(javaType);
        if (findMapFallback != null) {
            return (MapType) deserializationConfig.constructSpecializedType(javaType, findMapFallback);
        }
        return null;
    }

    public void _reportUnwrappedCreatorProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, AnnotatedParameter annotatedParameter) throws JsonMappingException {
        deserializationContext.reportBadDefinition(beanDescription.getType(), String.format("Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported", Integer.valueOf(annotatedParameter.getIndex())));
    }

    public ValueInstantiator _valueInstantiatorInstance(DeserializationConfig deserializationConfig, Annotated annotated, Object obj) throws JsonMappingException {
        ValueInstantiator valueInstantiatorInstance;
        if (obj == null) {
            return null;
        }
        if (obj instanceof ValueInstantiator) {
            return (ValueInstantiator) obj;
        }
        if (!(obj instanceof Class)) {
            StringBuilder m24u = C0000a.m24u("AnnotationIntrospector returned key deserializer definition of type ");
            m24u.append(obj.getClass().getName());
            m24u.append("; expected type KeyDeserializer or Class<KeyDeserializer> instead");
            throw new IllegalStateException(m24u.toString());
        }
        Class<?> cls = (Class) obj;
        if (ClassUtil.isBogusClass(cls)) {
            return null;
        }
        if (!ValueInstantiator.class.isAssignableFrom(cls)) {
            throw new IllegalStateException(C0576a.m4116o(cls, C0000a.m24u("AnnotationIntrospector returned Class "), "; expected Class<ValueInstantiator>"));
        }
        HandlerInstantiator handlerInstantiator = deserializationConfig.getHandlerInstantiator();
        return (handlerInstantiator == null || (valueInstantiatorInstance = handlerInstantiator.valueInstantiatorInstance(deserializationConfig, annotated, cls)) == null) ? (ValueInstantiator) ClassUtil.createInstance(cls, deserializationConfig.canOverrideAccessModifiers()) : valueInstantiatorInstance;
    }

    public SettableBeanProperty constructCreatorProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, PropertyName propertyName, int i2, AnnotatedParameter annotatedParameter, JacksonInject.Value value) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        PropertyMetadata construct = annotationIntrospector == null ? PropertyMetadata.STD_REQUIRED_OR_OPTIONAL : PropertyMetadata.construct(annotationIntrospector.hasRequiredMarker(annotatedParameter), annotationIntrospector.findPropertyDescription(annotatedParameter), annotationIntrospector.findPropertyIndex(annotatedParameter), annotationIntrospector.findPropertyDefaultValue(annotatedParameter));
        JavaType resolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, annotatedParameter, annotatedParameter.getType());
        BeanProperty.Std std = new BeanProperty.Std(propertyName, resolveMemberAndTypeAnnotations, annotationIntrospector.findWrapperName(annotatedParameter), annotatedParameter, construct);
        TypeDeserializer typeDeserializer = (TypeDeserializer) resolveMemberAndTypeAnnotations.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, resolveMemberAndTypeAnnotations);
        }
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        PropertyMetadata _getSetterInfo = _getSetterInfo(deserializationContext, std, construct);
        CreatorProperty creatorProperty = new CreatorProperty(propertyName, resolveMemberAndTypeAnnotations, std.getWrapperName(), typeDeserializer2, beanDescription.getClassAnnotations(), annotatedParameter, i2, value == null ? null : value.getId(), _getSetterInfo);
        JsonDeserializer<?> findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, annotatedParameter);
        if (findDeserializerFromAnnotation == null) {
            findDeserializerFromAnnotation = (JsonDeserializer) resolveMemberAndTypeAnnotations.getValueHandler();
        }
        return findDeserializerFromAnnotation != null ? creatorProperty.withValueDeserializer(deserializationContext.handlePrimaryContextualization(findDeserializerFromAnnotation, creatorProperty, resolveMemberAndTypeAnnotations)) : creatorProperty;
    }

    public EnumResolver constructEnumResolver(Class<?> cls, DeserializationConfig deserializationConfig, AnnotatedMember annotatedMember) {
        if (annotatedMember == null) {
            return EnumResolver.constructUnsafe(cls, deserializationConfig.getAnnotationIntrospector());
        }
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotatedMember.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return EnumResolver.constructUnsafeUsingMethod(cls, annotatedMember, deserializationConfig.getAnnotationIntrospector());
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createArrayDeserializer(DeserializationContext deserializationContext, ArrayType arrayType, BeanDescription beanDescription) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType contentType = arrayType.getContentType();
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        JsonDeserializer<?> _findCustomArrayDeserializer = _findCustomArrayDeserializer(arrayType, config, beanDescription, typeDeserializer2, jsonDeserializer);
        if (_findCustomArrayDeserializer == null) {
            if (jsonDeserializer == null) {
                Class<?> rawClass = contentType.getRawClass();
                if (contentType.isPrimitive()) {
                    return PrimitiveArrayDeserializers.forType(rawClass);
                }
                if (rawClass == String.class) {
                    return StringArrayDeserializer.instance;
                }
            }
            _findCustomArrayDeserializer = new ObjectArrayDeserializer(arrayType, jsonDeserializer, typeDeserializer2);
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<BeanDeserializerModifier> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                _findCustomArrayDeserializer = it.next().modifyArrayDeserializer(config, arrayType, beanDescription, _findCustomArrayDeserializer);
            }
        }
        return _findCustomArrayDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createCollectionDeserializer(DeserializationContext deserializationContext, CollectionType collectionType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType contentType = collectionType.getContentType();
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        JsonDeserializer<?> _findCustomCollectionDeserializer = _findCustomCollectionDeserializer(collectionType, config, beanDescription, typeDeserializer2, jsonDeserializer);
        if (_findCustomCollectionDeserializer == null) {
            Class<?> rawClass = collectionType.getRawClass();
            if (jsonDeserializer == null && EnumSet.class.isAssignableFrom(rawClass)) {
                _findCustomCollectionDeserializer = new EnumSetDeserializer(contentType, null);
            }
        }
        if (_findCustomCollectionDeserializer == null) {
            if (collectionType.isInterface() || collectionType.isAbstract()) {
                CollectionType _mapAbstractCollectionType = _mapAbstractCollectionType(collectionType, config);
                if (_mapAbstractCollectionType != null) {
                    beanDescription = config.introspectForCreation(_mapAbstractCollectionType);
                    collectionType = _mapAbstractCollectionType;
                } else {
                    if (collectionType.getTypeHandler() == null) {
                        throw new IllegalArgumentException("Cannot find a deserializer for non-concrete Collection type " + collectionType);
                    }
                    _findCustomCollectionDeserializer = AbstractDeserializer.constructForNonPOJO(beanDescription);
                }
            }
            if (_findCustomCollectionDeserializer == null) {
                ValueInstantiator findValueInstantiator = findValueInstantiator(deserializationContext, beanDescription);
                if (!findValueInstantiator.canCreateUsingDefault()) {
                    if (collectionType.hasRawClass(ArrayBlockingQueue.class)) {
                        return new ArrayBlockingQueueDeserializer(collectionType, jsonDeserializer, typeDeserializer2, findValueInstantiator);
                    }
                    JsonDeserializer<?> findForCollection = JavaUtilCollectionsDeserializers.findForCollection(deserializationContext, collectionType);
                    if (findForCollection != null) {
                        return findForCollection;
                    }
                }
                _findCustomCollectionDeserializer = contentType.hasRawClass(String.class) ? new StringCollectionDeserializer(collectionType, jsonDeserializer, findValueInstantiator) : new CollectionDeserializer(collectionType, jsonDeserializer, typeDeserializer2, findValueInstantiator);
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<BeanDeserializerModifier> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                _findCustomCollectionDeserializer = it.next().modifyCollectionDeserializer(config, collectionType, beanDescription, _findCustomCollectionDeserializer);
            }
        }
        return _findCustomCollectionDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createCollectionLikeDeserializer(DeserializationContext deserializationContext, CollectionLikeType collectionLikeType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType contentType = collectionLikeType.getContentType();
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        JsonDeserializer<?> _findCustomCollectionLikeDeserializer = _findCustomCollectionLikeDeserializer(collectionLikeType, config, beanDescription, typeDeserializer == null ? findTypeDeserializer(config, contentType) : typeDeserializer, jsonDeserializer);
        if (_findCustomCollectionLikeDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<BeanDeserializerModifier> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                _findCustomCollectionLikeDeserializer = it.next().modifyCollectionLikeDeserializer(config, collectionLikeType, beanDescription, _findCustomCollectionLikeDeserializer);
            }
        }
        return _findCustomCollectionLikeDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createEnumDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        Class<?> rawClass = javaType.getRawClass();
        JsonDeserializer<?> _findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, beanDescription);
        if (_findCustomEnumDeserializer == null) {
            ValueInstantiator _constructDefaultValueInstantiator = _constructDefaultValueInstantiator(deserializationContext, beanDescription);
            SettableBeanProperty[] fromObjectArguments = _constructDefaultValueInstantiator == null ? null : _constructDefaultValueInstantiator.getFromObjectArguments(deserializationContext.getConfig());
            Iterator<AnnotatedMethod> it = beanDescription.getFactoryMethods().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnnotatedMethod next = it.next();
                if (_hasCreatorAnnotation(deserializationContext, next)) {
                    if (next.getParameterCount() == 0) {
                        _findCustomEnumDeserializer = EnumDeserializer.deserializerForNoArgsCreator(config, rawClass, next);
                        break;
                    }
                    if (next.getRawReturnType().isAssignableFrom(rawClass)) {
                        _findCustomEnumDeserializer = EnumDeserializer.deserializerForCreator(config, rawClass, next, _constructDefaultValueInstantiator, fromObjectArguments);
                        break;
                    }
                }
            }
            if (_findCustomEnumDeserializer == null) {
                _findCustomEnumDeserializer = new EnumDeserializer(constructEnumResolver(rawClass, config, beanDescription.findJsonValueAccessor()), Boolean.valueOf(config.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)));
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<BeanDeserializerModifier> it2 = this._factoryConfig.deserializerModifiers().iterator();
            while (it2.hasNext()) {
                _findCustomEnumDeserializer = it2.next().modifyEnumDeserializer(config, javaType, beanDescription, _findCustomEnumDeserializer);
            }
        }
        return _findCustomEnumDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public KeyDeserializer createKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        KeyDeserializer keyDeserializer = null;
        if (this._factoryConfig.hasKeyDeserializers()) {
            BeanDescription introspectClassAnnotations = config.introspectClassAnnotations(javaType.getRawClass());
            Iterator<KeyDeserializers> it = this._factoryConfig.keyDeserializers().iterator();
            while (it.hasNext() && (keyDeserializer = it.next().findKeyDeserializer(javaType, config, introspectClassAnnotations)) == null) {
            }
        }
        if (keyDeserializer == null) {
            keyDeserializer = javaType.isEnumType() ? _createEnumKeyDeserializer(deserializationContext, javaType) : StdKeyDeserializers.findStringBasedKeyDeserializer(config, javaType);
        }
        if (keyDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<BeanDeserializerModifier> it2 = this._factoryConfig.deserializerModifiers().iterator();
            while (it2.hasNext()) {
                keyDeserializer = it2.next().modifyKeyDeserializer(config, javaType, keyDeserializer);
            }
        }
        return keyDeserializer;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonDeserializer<?> createMapDeserializer(com.fasterxml.jackson.databind.DeserializationContext r20, com.fasterxml.jackson.databind.type.MapType r21, com.fasterxml.jackson.databind.BeanDescription r22) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createMapDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.type.MapType, com.fasterxml.jackson.databind.BeanDescription):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createMapLikeDeserializer(DeserializationContext deserializationContext, MapLikeType mapLikeType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType keyType = mapLikeType.getKeyType();
        JavaType contentType = mapLikeType.getContentType();
        DeserializationConfig config = deserializationContext.getConfig();
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        KeyDeserializer keyDeserializer = (KeyDeserializer) keyType.getValueHandler();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        JsonDeserializer<?> _findCustomMapLikeDeserializer = _findCustomMapLikeDeserializer(mapLikeType, config, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
        if (_findCustomMapLikeDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<BeanDeserializerModifier> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                _findCustomMapLikeDeserializer = it.next().modifyMapLikeDeserializer(config, mapLikeType, beanDescription, _findCustomMapLikeDeserializer);
            }
        }
        return _findCustomMapLikeDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createReferenceDeserializer(DeserializationContext deserializationContext, ReferenceType referenceType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType contentType = referenceType.getContentType();
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        JsonDeserializer<?> _findCustomReferenceDeserializer = _findCustomReferenceDeserializer(referenceType, config, beanDescription, typeDeserializer2, jsonDeserializer);
        if (_findCustomReferenceDeserializer == null && referenceType.isTypeOrSubTypeOf(AtomicReference.class)) {
            return new AtomicReferenceDeserializer(referenceType, referenceType.getRawClass() == AtomicReference.class ? null : findValueInstantiator(deserializationContext, beanDescription), typeDeserializer2, jsonDeserializer);
        }
        if (_findCustomReferenceDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<BeanDeserializerModifier> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                _findCustomReferenceDeserializer = it.next().modifyReferenceDeserializer(config, referenceType, beanDescription, _findCustomReferenceDeserializer);
            }
        }
        return _findCustomReferenceDeserializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createTreeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        JsonDeserializer<?> _findCustomTreeNodeDeserializer = _findCustomTreeNodeDeserializer(rawClass, deserializationConfig, beanDescription);
        return _findCustomTreeNodeDeserializer != null ? _findCustomTreeNodeDeserializer : JsonNodeDeserializer.getDeserializer(rawClass);
    }

    public JsonDeserializer<Object> findContentDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) throws JsonMappingException {
        Object findContentDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (findContentDeserializer = annotationIntrospector.findContentDeserializer(annotated)) == null) {
            return null;
        }
        return deserializationContext.deserializerInstance(annotated, findContentDeserializer);
    }

    public JsonDeserializer<?> findDefaultDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType javaType2;
        JavaType javaType3;
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == CLASS_OBJECT || rawClass == CLASS_SERIALIZABLE) {
            DeserializationConfig config = deserializationContext.getConfig();
            if (this._factoryConfig.hasAbstractTypeResolvers()) {
                javaType2 = _findRemappedType(config, List.class);
                javaType3 = _findRemappedType(config, Map.class);
            } else {
                javaType2 = null;
                javaType3 = null;
            }
            return new UntypedObjectDeserializer(javaType2, javaType3);
        }
        if (rawClass == CLASS_STRING || rawClass == CLASS_CHAR_SEQUENCE) {
            return StringDeserializer.instance;
        }
        Class<?> cls = CLASS_ITERABLE;
        if (rawClass == cls) {
            TypeFactory typeFactory = deserializationContext.getTypeFactory();
            JavaType[] findTypeParameters = typeFactory.findTypeParameters(javaType, cls);
            return createCollectionDeserializer(deserializationContext, typeFactory.constructCollectionType(Collection.class, (findTypeParameters == null || findTypeParameters.length != 1) ? TypeFactory.unknownType() : findTypeParameters[0]), beanDescription);
        }
        if (rawClass == CLASS_MAP_ENTRY) {
            JavaType containedTypeOrUnknown = javaType.containedTypeOrUnknown(0);
            JavaType containedTypeOrUnknown2 = javaType.containedTypeOrUnknown(1);
            TypeDeserializer typeDeserializer = (TypeDeserializer) containedTypeOrUnknown2.getTypeHandler();
            if (typeDeserializer == null) {
                typeDeserializer = findTypeDeserializer(deserializationContext.getConfig(), containedTypeOrUnknown2);
            }
            return new MapEntryDeserializer(javaType, (KeyDeserializer) containedTypeOrUnknown.getValueHandler(), (JsonDeserializer<Object>) containedTypeOrUnknown2.getValueHandler(), typeDeserializer);
        }
        String name = rawClass.getName();
        if (rawClass.isPrimitive() || name.startsWith("java.")) {
            JsonDeserializer<?> find = NumberDeserializers.find(rawClass, name);
            if (find == null) {
                find = DateDeserializers.find(rawClass, name);
            }
            if (find != null) {
                return find;
            }
        }
        if (rawClass == TokenBuffer.class) {
            return new TokenBufferDeserializer();
        }
        JsonDeserializer<?> findOptionalStdDeserializer = findOptionalStdDeserializer(deserializationContext, javaType, beanDescription);
        return findOptionalStdDeserializer != null ? findOptionalStdDeserializer : JdkDeserializers.find(rawClass, name);
    }

    public JsonDeserializer<Object> findDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) throws JsonMappingException {
        Object findDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (findDeserializer = annotationIntrospector.findDeserializer(annotated)) == null) {
            return null;
        }
        return deserializationContext.deserializerInstance(annotated, findDeserializer);
    }

    public KeyDeserializer findKeyDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) throws JsonMappingException {
        Object findKeyDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (findKeyDeserializer = annotationIntrospector.findKeyDeserializer(annotated)) == null) {
            return null;
        }
        return deserializationContext.keyDeserializerInstance(annotated, findKeyDeserializer);
    }

    public JsonDeserializer<?> findOptionalStdDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        return OptionalHandlerFactory.instance.findDeserializer(javaType, deserializationContext.getConfig(), beanDescription);
    }

    public TypeDeserializer findPropertyContentTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        TypeResolverBuilder<?> findPropertyContentTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyContentTypeResolver(deserializationConfig, annotatedMember, javaType);
        JavaType contentType = javaType.getContentType();
        return findPropertyContentTypeResolver == null ? findTypeDeserializer(deserializationConfig, contentType) : findPropertyContentTypeResolver.buildTypeDeserializer(deserializationConfig, contentType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, contentType));
    }

    public TypeDeserializer findPropertyTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        TypeResolverBuilder<?> findPropertyTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyTypeResolver(deserializationConfig, annotatedMember, javaType);
        if (findPropertyTypeResolver == null) {
            return findTypeDeserializer(deserializationConfig, javaType);
        }
        try {
            return findPropertyTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, javaType));
        } catch (IllegalArgumentException e2) {
            InvalidDefinitionException from = InvalidDefinitionException.from((JsonParser) null, ClassUtil.exceptionMessage(e2), javaType);
            from.initCause(e2);
            throw from;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public TypeDeserializer findTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        Collection<NamedType> collectAndResolveSubtypesByTypeId;
        JavaType mapAbstractType;
        AnnotatedClass classInfo = deserializationConfig.introspectClassAnnotations(javaType.getRawClass()).getClassInfo();
        TypeResolverBuilder findTypeResolver = deserializationConfig.getAnnotationIntrospector().findTypeResolver(deserializationConfig, classInfo, javaType);
        if (findTypeResolver == null) {
            findTypeResolver = deserializationConfig.getDefaultTyper(javaType);
            if (findTypeResolver == null) {
                return null;
            }
            collectAndResolveSubtypesByTypeId = null;
        } else {
            collectAndResolveSubtypesByTypeId = deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, classInfo);
        }
        if (findTypeResolver.getDefaultImpl() == null && javaType.isAbstract() && (mapAbstractType = mapAbstractType(deserializationConfig, javaType)) != null && !mapAbstractType.hasRawClass(javaType.getRawClass())) {
            findTypeResolver = findTypeResolver.defaultImpl(mapAbstractType.getRawClass());
        }
        try {
            return findTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, collectAndResolveSubtypesByTypeId);
        } catch (IllegalArgumentException e2) {
            InvalidDefinitionException from = InvalidDefinitionException.from((JsonParser) null, ClassUtil.exceptionMessage(e2), javaType);
            from.initCause(e2);
            throw from;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public ValueInstantiator findValueInstantiator(DeserializationContext deserializationContext, BeanDescription beanDescription) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotatedClass classInfo = beanDescription.getClassInfo();
        Object findValueInstantiator = deserializationContext.getAnnotationIntrospector().findValueInstantiator(classInfo);
        ValueInstantiator _valueInstantiatorInstance = findValueInstantiator != null ? _valueInstantiatorInstance(config, classInfo, findValueInstantiator) : null;
        if (_valueInstantiatorInstance == null && (_valueInstantiatorInstance = JDKValueInstantiators.findStdValueInstantiator(config, beanDescription.getBeanClass())) == null) {
            _valueInstantiatorInstance = _constructDefaultValueInstantiator(deserializationContext, beanDescription);
        }
        if (this._factoryConfig.hasValueInstantiators()) {
            for (ValueInstantiators valueInstantiators : this._factoryConfig.valueInstantiators()) {
                _valueInstantiatorInstance = valueInstantiators.findValueInstantiator(config, beanDescription, _valueInstantiatorInstance);
                if (_valueInstantiatorInstance == null) {
                    deserializationContext.reportBadTypeDefinition(beanDescription, "Broken registered ValueInstantiators (of type %s): returned null ValueInstantiator", valueInstantiators.getClass().getName());
                }
            }
        }
        if (_valueInstantiatorInstance.getIncompleteParameter() == null) {
            return _valueInstantiatorInstance;
        }
        AnnotatedParameter incompleteParameter = _valueInstantiatorInstance.getIncompleteParameter();
        AnnotatedWithParams owner = incompleteParameter.getOwner();
        StringBuilder m24u = C0000a.m24u("Argument #");
        m24u.append(incompleteParameter.getIndex());
        m24u.append(" of constructor ");
        m24u.append(owner);
        m24u.append(" has no property name annotation; must have name when multiple-parameter constructor annotated as Creator");
        throw new IllegalArgumentException(m24u.toString());
    }

    public DeserializerFactoryConfig getFactoryConfig() {
        return this._factoryConfig;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JavaType mapAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        JavaType _mapAbstractType2;
        while (true) {
            _mapAbstractType2 = _mapAbstractType2(deserializationConfig, javaType);
            if (_mapAbstractType2 == null) {
                return javaType;
            }
            Class<?> rawClass = javaType.getRawClass();
            Class<?> rawClass2 = _mapAbstractType2.getRawClass();
            if (rawClass == rawClass2 || !rawClass.isAssignableFrom(rawClass2)) {
                break;
            }
            javaType = _mapAbstractType2;
        }
        throw new IllegalArgumentException("Invalid abstract type resolution from " + javaType + " to " + _mapAbstractType2 + ": latter is not a subtype of former");
    }

    @Deprecated
    public JavaType modifyTypeByAnnotation(DeserializationContext deserializationContext, Annotated annotated, JavaType javaType) throws JsonMappingException {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        return annotationIntrospector == null ? javaType : annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), annotated, javaType);
    }

    public JavaType resolveMemberAndTypeAnnotations(DeserializationContext deserializationContext, AnnotatedMember annotatedMember, JavaType javaType) throws JsonMappingException {
        KeyDeserializer keyDeserializerInstance;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return javaType;
        }
        if (javaType.isMapLikeType() && javaType.getKeyType() != null && (keyDeserializerInstance = deserializationContext.keyDeserializerInstance(annotatedMember, annotationIntrospector.findKeyDeserializer(annotatedMember))) != null) {
            javaType = ((MapLikeType) javaType).withKeyValueHandler(keyDeserializerInstance);
            javaType.getKeyType();
        }
        if (javaType.hasContentType()) {
            JsonDeserializer<Object> deserializerInstance = deserializationContext.deserializerInstance(annotatedMember, annotationIntrospector.findContentDeserializer(annotatedMember));
            if (deserializerInstance != null) {
                javaType = javaType.withContentValueHandler(deserializerInstance);
            }
            TypeDeserializer findPropertyContentTypeDeserializer = findPropertyContentTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
            if (findPropertyContentTypeDeserializer != null) {
                javaType = javaType.withContentTypeHandler(findPropertyContentTypeDeserializer);
            }
        }
        TypeDeserializer findPropertyTypeDeserializer = findPropertyTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
        if (findPropertyTypeDeserializer != null) {
            javaType = javaType.withTypeHandler(findPropertyTypeDeserializer);
        }
        return annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), annotatedMember, javaType);
    }

    @Deprecated
    public JavaType resolveType(DeserializationContext deserializationContext, BeanDescription beanDescription, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        return resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, javaType);
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final DeserializerFactory withAbstractTypeResolver(AbstractTypeResolver abstractTypeResolver) {
        return withConfig(this._factoryConfig.withAbstractTypeResolver(abstractTypeResolver));
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final DeserializerFactory withAdditionalDeserializers(Deserializers deserializers) {
        return withConfig(this._factoryConfig.withAdditionalDeserializers(deserializers));
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final DeserializerFactory withAdditionalKeyDeserializers(KeyDeserializers keyDeserializers) {
        return withConfig(this._factoryConfig.withAdditionalKeyDeserializers(keyDeserializers));
    }

    public abstract DeserializerFactory withConfig(DeserializerFactoryConfig deserializerFactoryConfig);

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final DeserializerFactory withDeserializerModifier(BeanDeserializerModifier beanDeserializerModifier) {
        return withConfig(this._factoryConfig.withDeserializerModifier(beanDeserializerModifier));
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final DeserializerFactory withValueInstantiators(ValueInstantiators valueInstantiators) {
        return withConfig(this._factoryConfig.withValueInstantiators(valueInstantiators));
    }
}
