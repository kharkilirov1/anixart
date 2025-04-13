package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.c51;
import com.yandex.mobile.ads.impl.tr0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.b0 */
/* loaded from: classes2.dex */
final class C4671b0<K, V> extends AbstractC4672c<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: f */
    public transient c51<? extends List<V>> f47820f;

    public C4671b0(Map<K, Collection<V>> map, c51<? extends List<V>> c51Var) {
        super(map);
        this.f47820f = (c51) tr0.m28727a(c51Var);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f47820f = (c51) objectInputStream.readObject();
        m21994a((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f47820f);
        objectOutputStream.writeObject(m21995c());
    }
}
