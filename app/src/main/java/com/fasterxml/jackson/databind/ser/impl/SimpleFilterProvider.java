package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.ser.BeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p000a.C0000a;

/* loaded from: classes.dex */
public class SimpleFilterProvider extends FilterProvider implements Serializable {
    private static final long serialVersionUID = 1;
    public boolean _cfgFailOnUnknownId;
    public PropertyFilter _defaultFilter;
    public final Map<String, PropertyFilter> _filtersById;

    public SimpleFilterProvider() {
        this(new HashMap());
    }

    private static final Map<String, PropertyFilter> _convert(Map<String, ?> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof PropertyFilter) {
                hashMap.put(entry.getKey(), (PropertyFilter) value);
            } else {
                if (!(value instanceof BeanPropertyFilter)) {
                    StringBuilder m24u = C0000a.m24u("Unrecognized filter type (");
                    m24u.append(value.getClass().getName());
                    m24u.append(")");
                    throw new IllegalArgumentException(m24u.toString());
                }
                hashMap.put(entry.getKey(), _convert((BeanPropertyFilter) value));
            }
        }
        return hashMap;
    }

    @Deprecated
    public SimpleFilterProvider addFilter(String str, BeanPropertyFilter beanPropertyFilter) {
        this._filtersById.put(str, _convert(beanPropertyFilter));
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.FilterProvider
    @Deprecated
    public BeanPropertyFilter findFilter(Object obj) {
        throw new UnsupportedOperationException("Access to deprecated filters not supported");
    }

    @Override // com.fasterxml.jackson.databind.ser.FilterProvider
    public PropertyFilter findPropertyFilter(Object obj, Object obj2) {
        PropertyFilter propertyFilter = this._filtersById.get(obj);
        if (propertyFilter != null || (propertyFilter = this._defaultFilter) != null || !this._cfgFailOnUnknownId) {
            return propertyFilter;
        }
        throw new IllegalArgumentException("No filter configured with id '" + obj + "' (type " + obj.getClass().getName() + ")");
    }

    public PropertyFilter getDefaultFilter() {
        return this._defaultFilter;
    }

    public PropertyFilter removeFilter(String str) {
        return this._filtersById.remove(str);
    }

    @Deprecated
    public SimpleFilterProvider setDefaultFilter(BeanPropertyFilter beanPropertyFilter) {
        this._defaultFilter = SimpleBeanPropertyFilter.from(beanPropertyFilter);
        return this;
    }

    public SimpleFilterProvider setFailOnUnknownId(boolean z) {
        this._cfgFailOnUnknownId = z;
        return this;
    }

    public boolean willFailOnUnknownId() {
        return this._cfgFailOnUnknownId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleFilterProvider(Map<String, ?> map) {
        this._cfgFailOnUnknownId = true;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof PropertyFilter)) {
                this._filtersById = _convert(map);
                return;
            }
        }
        this._filtersById = map;
    }

    public SimpleFilterProvider addFilter(String str, PropertyFilter propertyFilter) {
        this._filtersById.put(str, propertyFilter);
        return this;
    }

    public SimpleFilterProvider setDefaultFilter(PropertyFilter propertyFilter) {
        this._defaultFilter = propertyFilter;
        return this;
    }

    public SimpleFilterProvider addFilter(String str, SimpleBeanPropertyFilter simpleBeanPropertyFilter) {
        this._filtersById.put(str, simpleBeanPropertyFilter);
        return this;
    }

    public SimpleFilterProvider setDefaultFilter(SimpleBeanPropertyFilter simpleBeanPropertyFilter) {
        this._defaultFilter = simpleBeanPropertyFilter;
        return this;
    }

    private static final PropertyFilter _convert(BeanPropertyFilter beanPropertyFilter) {
        return SimpleBeanPropertyFilter.from(beanPropertyFilter);
    }
}
