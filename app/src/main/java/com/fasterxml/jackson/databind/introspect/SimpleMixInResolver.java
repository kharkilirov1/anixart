package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SimpleMixInResolver implements ClassIntrospector.MixInResolver, Serializable {
    private static final long serialVersionUID = 1;
    public Map<ClassKey, Class<?>> _localMixIns;
    public final ClassIntrospector.MixInResolver _overrides;

    public SimpleMixInResolver(ClassIntrospector.MixInResolver mixInResolver) {
        this._overrides = mixInResolver;
    }

    public void addLocalDefinition(Class<?> cls, Class<?> cls2) {
        if (this._localMixIns == null) {
            this._localMixIns = new HashMap();
        }
        this._localMixIns.put(new ClassKey(cls), cls2);
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver
    public Class<?> findMixInClassFor(Class<?> cls) {
        Map<ClassKey, Class<?>> map;
        ClassIntrospector.MixInResolver mixInResolver = this._overrides;
        Class<?> findMixInClassFor = mixInResolver == null ? null : mixInResolver.findMixInClassFor(cls);
        return (findMixInClassFor != null || (map = this._localMixIns) == null) ? findMixInClassFor : map.get(new ClassKey(cls));
    }

    public boolean hasMixIns() {
        if (this._localMixIns != null) {
            return true;
        }
        ClassIntrospector.MixInResolver mixInResolver = this._overrides;
        if (mixInResolver == null) {
            return false;
        }
        if (mixInResolver instanceof SimpleMixInResolver) {
            return ((SimpleMixInResolver) mixInResolver).hasMixIns();
        }
        return true;
    }

    public int localSize() {
        Map<ClassKey, Class<?>> map = this._localMixIns;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public void setLocalDefinitions(Map<Class<?>, Class<?>> map) {
        if (map == null || map.isEmpty()) {
            this._localMixIns = null;
            return;
        }
        HashMap hashMap = new HashMap(map.size());
        for (Map.Entry<Class<?>, Class<?>> entry : map.entrySet()) {
            hashMap.put(new ClassKey(entry.getKey()), entry.getValue());
        }
        this._localMixIns = hashMap;
    }

    public SimpleMixInResolver withOverrides(ClassIntrospector.MixInResolver mixInResolver) {
        return new SimpleMixInResolver(mixInResolver, this._localMixIns);
    }

    public SimpleMixInResolver withoutLocalDefinitions() {
        return new SimpleMixInResolver(this._overrides, null);
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver
    public SimpleMixInResolver copy() {
        ClassIntrospector.MixInResolver mixInResolver = this._overrides;
        return new SimpleMixInResolver(mixInResolver == null ? null : mixInResolver.copy(), this._localMixIns != null ? new HashMap(this._localMixIns) : null);
    }

    public SimpleMixInResolver(ClassIntrospector.MixInResolver mixInResolver, Map<ClassKey, Class<?>> map) {
        this._overrides = mixInResolver;
        this._localMixIns = map;
    }
}
