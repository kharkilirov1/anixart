package com.fasterxml.jackson.annotation;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import java.util.HashMap;
import java.util.Map;
import p000a.C0000a;

/* loaded from: classes.dex */
public class SimpleObjectIdResolver implements ObjectIdResolver {
    public Map<ObjectIdGenerator.IdKey, Object> _items;

    @Override // com.fasterxml.jackson.annotation.ObjectIdResolver
    public void bindItem(ObjectIdGenerator.IdKey idKey, Object obj) {
        Map<ObjectIdGenerator.IdKey, Object> map = this._items;
        if (map == null) {
            this._items = new HashMap();
        } else if (map.containsKey(idKey)) {
            StringBuilder m24u = C0000a.m24u("Already had POJO for id (");
            m24u.append(idKey.key.getClass().getName());
            m24u.append(") [");
            m24u.append(idKey);
            m24u.append("]");
            throw new IllegalStateException(m24u.toString());
        }
        this._items.put(idKey, obj);
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdResolver
    public boolean canUseFor(ObjectIdResolver objectIdResolver) {
        return objectIdResolver.getClass() == getClass();
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdResolver
    public ObjectIdResolver newForDeserialization(Object obj) {
        return new SimpleObjectIdResolver();
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdResolver
    public Object resolveId(ObjectIdGenerator.IdKey idKey) {
        Map<ObjectIdGenerator.IdKey, Object> map = this._items;
        if (map == null) {
            return null;
        }
        return map.get(idKey);
    }
}
