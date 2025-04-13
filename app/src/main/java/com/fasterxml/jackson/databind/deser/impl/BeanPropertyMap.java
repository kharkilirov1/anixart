package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import p000a.C0000a;

/* loaded from: classes.dex */
public class BeanPropertyMap implements Iterable<SettableBeanProperty>, Serializable {
    private static final long serialVersionUID = 2;
    private final Map<String, List<PropertyName>> _aliasDefs;
    private final Map<String, String> _aliasMapping;
    public final boolean _caseInsensitive;
    private Object[] _hashArea;
    private int _hashMask;
    private final SettableBeanProperty[] _propsInOrder;
    private int _size;
    private int _spillCount;

    public BeanPropertyMap(boolean z, Collection<SettableBeanProperty> collection, Map<String, List<PropertyName>> map) {
        this._caseInsensitive = z;
        this._propsInOrder = (SettableBeanProperty[]) collection.toArray(new SettableBeanProperty[collection.size()]);
        this._aliasDefs = map;
        this._aliasMapping = _buildAliasMapping(map);
        init(collection);
    }

    private Map<String, String> _buildAliasMapping(Map<String, List<PropertyName>> map) {
        if (map == null || map.isEmpty()) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<PropertyName>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (this._caseInsensitive) {
                key = key.toLowerCase();
            }
            Iterator<PropertyName> it = entry.getValue().iterator();
            while (it.hasNext()) {
                String simpleName = it.next().getSimpleName();
                if (this._caseInsensitive) {
                    simpleName = simpleName.toLowerCase();
                }
                hashMap.put(simpleName, key);
            }
        }
        return hashMap;
    }

    private final SettableBeanProperty _find2(String str, int i2, Object obj) {
        if (obj == null) {
            return _findWithAlias(this._aliasMapping.get(str));
        }
        int i3 = this._hashMask + 1;
        int i4 = ((i2 >> 1) + i3) << 1;
        Object obj2 = this._hashArea[i4];
        if (str.equals(obj2)) {
            return (SettableBeanProperty) this._hashArea[i4 + 1];
        }
        if (obj2 != null) {
            int i5 = (i3 + (i3 >> 1)) << 1;
            int i6 = this._spillCount + i5;
            while (i5 < i6) {
                Object obj3 = this._hashArea[i5];
                if (obj3 == str || str.equals(obj3)) {
                    return (SettableBeanProperty) this._hashArea[i5 + 1];
                }
                i5 += 2;
            }
        }
        return _findWithAlias(this._aliasMapping.get(str));
    }

    private SettableBeanProperty _find2ViaAlias(String str, int i2, Object obj) {
        int i3 = this._hashMask + 1;
        int i4 = ((i2 >> 1) + i3) << 1;
        Object obj2 = this._hashArea[i4];
        if (str.equals(obj2)) {
            return (SettableBeanProperty) this._hashArea[i4 + 1];
        }
        if (obj2 == null) {
            return null;
        }
        int i5 = (i3 + (i3 >> 1)) << 1;
        int i6 = this._spillCount + i5;
        while (i5 < i6) {
            Object obj3 = this._hashArea[i5];
            if (obj3 == str || str.equals(obj3)) {
                return (SettableBeanProperty) this._hashArea[i5 + 1];
            }
            i5 += 2;
        }
        return null;
    }

    private final int _findFromOrdered(SettableBeanProperty settableBeanProperty) {
        int length = this._propsInOrder.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this._propsInOrder[i2] == settableBeanProperty) {
                return i2;
            }
        }
        StringBuilder m24u = C0000a.m24u("Illegal state: property '");
        m24u.append(settableBeanProperty.getName());
        m24u.append("' missing from _propsInOrder");
        throw new IllegalStateException(m24u.toString());
    }

    private final int _findIndexInHash(String str) {
        int _hashCode = _hashCode(str);
        int i2 = _hashCode << 1;
        if (str.equals(this._hashArea[i2])) {
            return i2 + 1;
        }
        int i3 = this._hashMask + 1;
        int i4 = ((_hashCode >> 1) + i3) << 1;
        if (str.equals(this._hashArea[i4])) {
            return i4 + 1;
        }
        int i5 = (i3 + (i3 >> 1)) << 1;
        int i6 = this._spillCount + i5;
        while (i5 < i6) {
            if (str.equals(this._hashArea[i5])) {
                return i5 + 1;
            }
            i5 += 2;
        }
        return -1;
    }

    private SettableBeanProperty _findWithAlias(String str) {
        if (str == null) {
            return null;
        }
        int _hashCode = _hashCode(str);
        int i2 = _hashCode << 1;
        Object obj = this._hashArea[i2];
        if (str.equals(obj)) {
            return (SettableBeanProperty) this._hashArea[i2 + 1];
        }
        if (obj == null) {
            return null;
        }
        return _find2ViaAlias(str, _hashCode, obj);
    }

    private final int _hashCode(String str) {
        return str.hashCode() & this._hashMask;
    }

    private List<SettableBeanProperty> _properties() {
        ArrayList arrayList = new ArrayList(this._size);
        int length = this._hashArea.length;
        for (int i2 = 1; i2 < length; i2 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this._hashArea[i2];
            if (settableBeanProperty != null) {
                arrayList.add(settableBeanProperty);
            }
        }
        return arrayList;
    }

    public static BeanPropertyMap construct(Collection<SettableBeanProperty> collection, boolean z, Map<String, List<PropertyName>> map) {
        return new BeanPropertyMap(z, collection, map);
    }

    private static final int findSize(int i2) {
        if (i2 <= 5) {
            return 8;
        }
        if (i2 <= 12) {
            return 16;
        }
        int i3 = 32;
        while (i3 < i2 + (i2 >> 2)) {
            i3 += i3;
        }
        return i3;
    }

    public SettableBeanProperty _rename(SettableBeanProperty settableBeanProperty, NameTransformer nameTransformer) {
        JsonDeserializer<Object> unwrappingDeserializer;
        if (settableBeanProperty == null) {
            return settableBeanProperty;
        }
        SettableBeanProperty withSimpleName = settableBeanProperty.withSimpleName(nameTransformer.transform(settableBeanProperty.getName()));
        JsonDeserializer<Object> valueDeserializer = withSimpleName.getValueDeserializer();
        return (valueDeserializer == null || (unwrappingDeserializer = valueDeserializer.unwrappingDeserializer(nameTransformer)) == valueDeserializer) ? withSimpleName : withSimpleName.withValueDeserializer(unwrappingDeserializer);
    }

    public BeanPropertyMap assignIndexes() {
        int length = this._hashArea.length;
        int i2 = 0;
        for (int i3 = 1; i3 < length; i3 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this._hashArea[i3];
            if (settableBeanProperty != null) {
                settableBeanProperty.assignIndex(i2);
                i2++;
            }
        }
        return this;
    }

    public SettableBeanProperty find(int i2) {
        int length = this._hashArea.length;
        for (int i3 = 1; i3 < length; i3 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this._hashArea[i3];
            if (settableBeanProperty != null && i2 == settableBeanProperty.getPropertyIndex()) {
                return settableBeanProperty;
            }
        }
        return null;
    }

    public boolean findDeserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        SettableBeanProperty find = find(str);
        if (find == null) {
            return false;
        }
        try {
            find.deserializeAndSet(jsonParser, deserializationContext, obj);
            return true;
        } catch (Exception e2) {
            wrapAndThrow(e2, obj, str, deserializationContext);
            return true;
        }
    }

    public SettableBeanProperty[] getPropertiesInInsertionOrder() {
        return this._propsInOrder;
    }

    public final String getPropertyName(SettableBeanProperty settableBeanProperty) {
        boolean z = this._caseInsensitive;
        String name = settableBeanProperty.getName();
        return z ? name.toLowerCase() : name;
    }

    public boolean hasAliases() {
        return !this._aliasDefs.isEmpty();
    }

    public void init(Collection<SettableBeanProperty> collection) {
        int size = collection.size();
        this._size = size;
        int findSize = findSize(size);
        this._hashMask = findSize - 1;
        int i2 = (findSize >> 1) + findSize;
        Object[] objArr = new Object[i2 * 2];
        int i3 = 0;
        for (SettableBeanProperty settableBeanProperty : collection) {
            if (settableBeanProperty != null) {
                String propertyName = getPropertyName(settableBeanProperty);
                int _hashCode = _hashCode(propertyName);
                int i4 = _hashCode << 1;
                if (objArr[i4] != null) {
                    i4 = ((_hashCode >> 1) + findSize) << 1;
                    if (objArr[i4] != null) {
                        i4 = (i2 << 1) + i3;
                        i3 += 2;
                        if (i4 >= objArr.length) {
                            objArr = Arrays.copyOf(objArr, objArr.length + 4);
                        }
                    }
                }
                objArr[i4] = propertyName;
                objArr[i4 + 1] = settableBeanProperty;
            }
        }
        this._hashArea = objArr;
        this._spillCount = i3;
    }

    public boolean isCaseInsensitive() {
        return this._caseInsensitive;
    }

    @Override // java.lang.Iterable
    public Iterator<SettableBeanProperty> iterator() {
        return _properties().iterator();
    }

    public void remove(SettableBeanProperty settableBeanProperty) {
        ArrayList arrayList = new ArrayList(this._size);
        String propertyName = getPropertyName(settableBeanProperty);
        int length = this._hashArea.length;
        boolean z = false;
        for (int i2 = 1; i2 < length; i2 += 2) {
            Object[] objArr = this._hashArea;
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) objArr[i2];
            if (settableBeanProperty2 != null) {
                if (z || !(z = propertyName.equals(objArr[i2 - 1]))) {
                    arrayList.add(settableBeanProperty2);
                } else {
                    this._propsInOrder[_findFromOrdered(settableBeanProperty2)] = null;
                }
            }
        }
        if (z) {
            init(arrayList);
            return;
        }
        StringBuilder m24u = C0000a.m24u("No entry '");
        m24u.append(settableBeanProperty.getName());
        m24u.append("' found, can't remove");
        throw new NoSuchElementException(m24u.toString());
    }

    public BeanPropertyMap renameAll(NameTransformer nameTransformer) {
        if (nameTransformer == null || nameTransformer == NameTransformer.NOP) {
            return this;
        }
        int length = this._propsInOrder.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            SettableBeanProperty settableBeanProperty = this._propsInOrder[i2];
            if (settableBeanProperty == null) {
                arrayList.add(settableBeanProperty);
            } else {
                arrayList.add(_rename(settableBeanProperty, nameTransformer));
            }
        }
        return new BeanPropertyMap(this._caseInsensitive, arrayList, this._aliasDefs);
    }

    @Deprecated
    public void replace(SettableBeanProperty settableBeanProperty) {
        String propertyName = getPropertyName(settableBeanProperty);
        int _findIndexInHash = _findIndexInHash(propertyName);
        if (_findIndexInHash < 0) {
            throw new NoSuchElementException(C0000a.m16m("No entry '", propertyName, "' found, can't replace"));
        }
        Object[] objArr = this._hashArea;
        SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) objArr[_findIndexInHash];
        objArr[_findIndexInHash] = settableBeanProperty;
        this._propsInOrder[_findFromOrdered(settableBeanProperty2)] = settableBeanProperty;
    }

    public int size() {
        return this._size;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("Properties=[");
        Iterator<SettableBeanProperty> it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            SettableBeanProperty next = it.next();
            int i3 = i2 + 1;
            if (i2 > 0) {
                m24u.append(", ");
            }
            m24u.append(next.getName());
            m24u.append('(');
            m24u.append(next.getType());
            m24u.append(')');
            i2 = i3;
        }
        m24u.append(']');
        if (!this._aliasDefs.isEmpty()) {
            m24u.append("(aliases: ");
            m24u.append(this._aliasDefs);
            m24u.append(")");
        }
        return m24u.toString();
    }

    public BeanPropertyMap withCaseInsensitivity(boolean z) {
        return this._caseInsensitive == z ? this : new BeanPropertyMap(this, z);
    }

    public BeanPropertyMap withProperty(SettableBeanProperty settableBeanProperty) {
        String propertyName = getPropertyName(settableBeanProperty);
        int length = this._hashArea.length;
        for (int i2 = 1; i2 < length; i2 += 2) {
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) this._hashArea[i2];
            if (settableBeanProperty2 != null && settableBeanProperty2.getName().equals(propertyName)) {
                return new BeanPropertyMap(this, settableBeanProperty, i2, _findFromOrdered(settableBeanProperty2));
            }
        }
        return new BeanPropertyMap(this, settableBeanProperty, propertyName, _hashCode(propertyName));
    }

    public BeanPropertyMap withoutProperties(Collection<String> collection) {
        if (collection.isEmpty()) {
            return this;
        }
        int length = this._propsInOrder.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            SettableBeanProperty settableBeanProperty = this._propsInOrder[i2];
            if (settableBeanProperty != null && !collection.contains(settableBeanProperty.getName())) {
                arrayList.add(settableBeanProperty);
            }
        }
        return new BeanPropertyMap(this._caseInsensitive, arrayList, this._aliasDefs);
    }

    public void wrapAndThrow(Throwable th, Object obj, String str, DeserializationContext deserializationContext) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        ClassUtil.throwIfError(th);
        boolean z = deserializationContext == null || deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof JsonProcessingException)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            ClassUtil.throwIfRTE(th);
        }
        throw JsonMappingException.wrapWithPath(th, obj, str);
    }

    @Deprecated
    public static BeanPropertyMap construct(Collection<SettableBeanProperty> collection, boolean z) {
        return construct(collection, z, Collections.emptyMap());
    }

    public SettableBeanProperty find(String str) {
        if (str != null) {
            if (this._caseInsensitive) {
                str = str.toLowerCase();
            }
            int hashCode = str.hashCode() & this._hashMask;
            int i2 = hashCode << 1;
            Object obj = this._hashArea[i2];
            if (obj != str && !str.equals(obj)) {
                return _find2(str, hashCode, obj);
            }
            return (SettableBeanProperty) this._hashArea[i2 + 1];
        }
        throw new IllegalArgumentException("Cannot pass null property name");
    }

    private BeanPropertyMap(BeanPropertyMap beanPropertyMap, SettableBeanProperty settableBeanProperty, int i2, int i3) {
        this._caseInsensitive = beanPropertyMap._caseInsensitive;
        this._hashMask = beanPropertyMap._hashMask;
        this._size = beanPropertyMap._size;
        this._spillCount = beanPropertyMap._spillCount;
        this._aliasDefs = beanPropertyMap._aliasDefs;
        this._aliasMapping = beanPropertyMap._aliasMapping;
        Object[] objArr = beanPropertyMap._hashArea;
        this._hashArea = Arrays.copyOf(objArr, objArr.length);
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap._propsInOrder;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, settableBeanPropertyArr.length);
        this._propsInOrder = settableBeanPropertyArr2;
        this._hashArea[i2] = settableBeanProperty;
        settableBeanPropertyArr2[i3] = settableBeanProperty;
    }

    public void replace(SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2) {
        int length = this._hashArea.length;
        for (int i2 = 1; i2 <= length; i2 += 2) {
            Object[] objArr = this._hashArea;
            if (objArr[i2] == settableBeanProperty) {
                objArr[i2] = settableBeanProperty2;
                this._propsInOrder[_findFromOrdered(settableBeanProperty)] = settableBeanProperty2;
                return;
            }
        }
        StringBuilder m24u = C0000a.m24u("No entry '");
        m24u.append(settableBeanProperty.getName());
        m24u.append("' found, can't replace");
        throw new NoSuchElementException(m24u.toString());
    }

    private BeanPropertyMap(BeanPropertyMap beanPropertyMap, SettableBeanProperty settableBeanProperty, String str, int i2) {
        this._caseInsensitive = beanPropertyMap._caseInsensitive;
        this._hashMask = beanPropertyMap._hashMask;
        this._size = beanPropertyMap._size;
        this._spillCount = beanPropertyMap._spillCount;
        this._aliasDefs = beanPropertyMap._aliasDefs;
        this._aliasMapping = beanPropertyMap._aliasMapping;
        Object[] objArr = beanPropertyMap._hashArea;
        this._hashArea = Arrays.copyOf(objArr, objArr.length);
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap._propsInOrder;
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, length + 1);
        this._propsInOrder = settableBeanPropertyArr2;
        settableBeanPropertyArr2[length] = settableBeanProperty;
        int i3 = this._hashMask + 1;
        int i4 = i2 << 1;
        Object[] objArr2 = this._hashArea;
        if (objArr2[i4] != null) {
            i4 = ((i2 >> 1) + i3) << 1;
            if (objArr2[i4] != null) {
                int i5 = this._spillCount;
                i4 = ((i3 + (i3 >> 1)) << 1) + i5;
                this._spillCount = i5 + 2;
                if (i4 >= objArr2.length) {
                    this._hashArea = Arrays.copyOf(objArr2, objArr2.length + 4);
                }
            }
        }
        Object[] objArr3 = this._hashArea;
        objArr3[i4] = str;
        objArr3[i4 + 1] = settableBeanProperty;
    }

    @Deprecated
    public BeanPropertyMap(boolean z, Collection<SettableBeanProperty> collection) {
        this(z, collection, Collections.emptyMap());
    }

    public BeanPropertyMap(BeanPropertyMap beanPropertyMap, boolean z) {
        this._caseInsensitive = z;
        this._aliasDefs = beanPropertyMap._aliasDefs;
        this._aliasMapping = beanPropertyMap._aliasMapping;
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap._propsInOrder;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, settableBeanPropertyArr.length);
        this._propsInOrder = settableBeanPropertyArr2;
        init(Arrays.asList(settableBeanPropertyArr2));
    }
}
