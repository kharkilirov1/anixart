package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class ReadableObjectId {
    public Object _item;
    public final ObjectIdGenerator.IdKey _key;
    public LinkedList<Referring> _referringProperties;
    public ObjectIdResolver _resolver;

    public ReadableObjectId(ObjectIdGenerator.IdKey idKey) {
        this._key = idKey;
    }

    public void appendReferring(Referring referring) {
        if (this._referringProperties == null) {
            this._referringProperties = new LinkedList<>();
        }
        this._referringProperties.add(referring);
    }

    public void bindItem(Object obj) throws IOException {
        this._resolver.bindItem(this._key, obj);
        this._item = obj;
        Object obj2 = this._key.key;
        LinkedList<Referring> linkedList = this._referringProperties;
        if (linkedList != null) {
            Iterator<Referring> it = linkedList.iterator();
            this._referringProperties = null;
            while (it.hasNext()) {
                it.next().handleResolvedForwardReference(obj2, obj);
            }
        }
    }

    public ObjectIdGenerator.IdKey getKey() {
        return this._key;
    }

    public ObjectIdResolver getResolver() {
        return this._resolver;
    }

    public boolean hasReferringProperties() {
        LinkedList<Referring> linkedList = this._referringProperties;
        return (linkedList == null || linkedList.isEmpty()) ? false : true;
    }

    public Iterator<Referring> referringProperties() {
        LinkedList<Referring> linkedList = this._referringProperties;
        return linkedList == null ? Collections.emptyList().iterator() : linkedList.iterator();
    }

    public Object resolve() {
        Object resolveId = this._resolver.resolveId(this._key);
        this._item = resolveId;
        return resolveId;
    }

    public void setResolver(ObjectIdResolver objectIdResolver) {
        this._resolver = objectIdResolver;
    }

    public String toString() {
        return String.valueOf(this._key);
    }

    public boolean tryToResolveUnresolved(DeserializationContext deserializationContext) {
        return false;
    }

    public static abstract class Referring {
        private final Class<?> _beanType;
        private final UnresolvedForwardReference _reference;

        public Referring(UnresolvedForwardReference unresolvedForwardReference, Class<?> cls) {
            this._reference = unresolvedForwardReference;
            this._beanType = cls;
        }

        public Class<?> getBeanType() {
            return this._beanType;
        }

        public JsonLocation getLocation() {
            return this._reference.getLocation();
        }

        public abstract void handleResolvedForwardReference(Object obj, Object obj2) throws IOException;

        public boolean hasId(Object obj) {
            return obj.equals(this._reference.getUnresolvedId());
        }

        public Referring(UnresolvedForwardReference unresolvedForwardReference, JavaType javaType) {
            this._reference = unresolvedForwardReference;
            this._beanType = javaType.getRawClass();
        }
    }
}
