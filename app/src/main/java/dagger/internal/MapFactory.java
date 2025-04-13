package dagger.internal;

import dagger.internal.AbstractMapFactory;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class MapFactory<K, V> extends AbstractMapFactory<K, V, V> {

    /* renamed from: a */
    public static final Provider<Map<Object, Object>> f58006a = InstanceFactory.m30792a(Collections.emptyMap());

    public static final class Builder<K, V> extends AbstractMapFactory.Builder<K, V, V> {
    }

    @Override // javax.inject.Provider
    public Object get() {
        throw null;
    }
}
