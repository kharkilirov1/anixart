package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.cache.LocalCache;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: classes.dex */
interface ReferenceEntry<K, V> {
    @NullableDecl
    /* renamed from: a */
    ReferenceEntry<K, V> mo11257a();

    /* renamed from: b */
    LocalCache.ValueReference<K, V> mo11258b();

    /* renamed from: c */
    int mo11259c();

    /* renamed from: d */
    ReferenceEntry<K, V> mo11260d();

    /* renamed from: e */
    void mo11261e(LocalCache.ValueReference<K, V> valueReference);

    /* renamed from: f */
    long mo11262f();

    @NullableDecl
    K getKey();

    /* renamed from: h */
    void mo11263h(long j2);

    /* renamed from: i */
    ReferenceEntry<K, V> mo11264i();

    /* renamed from: j */
    long mo11265j();

    /* renamed from: k */
    void mo11266k(long j2);

    /* renamed from: l */
    ReferenceEntry<K, V> mo11267l();

    /* renamed from: m */
    void mo11268m(ReferenceEntry<K, V> referenceEntry);

    /* renamed from: n */
    void mo11269n(ReferenceEntry<K, V> referenceEntry);

    /* renamed from: o */
    void mo11270o(ReferenceEntry<K, V> referenceEntry);

    /* renamed from: p */
    void mo11271p(ReferenceEntry<K, V> referenceEntry);

    /* renamed from: q */
    ReferenceEntry<K, V> mo11272q();
}
