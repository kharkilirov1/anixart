package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: classes.dex */
class CompactLinkedHashMap<K, V> extends CompactHashMap<K, V> {

    /* renamed from: l */
    @VisibleForTesting
    @NullableDecl
    public transient long[] f20919l;

    /* renamed from: m */
    public transient int f20920m;

    /* renamed from: n */
    public transient int f20921n;

    /* renamed from: o */
    public final boolean f20922o;

    public CompactLinkedHashMap() {
        super(3);
        this.f20922o = false;
    }

    @Override // com.google.common.collect.CompactHashMap
    /* renamed from: a */
    public void mo11435a(int i2) {
        if (this.f20922o) {
            long[] jArr = this.f20919l;
            m11477u(((int) (jArr[i2] >>> 32)) - 1, ((int) jArr[i2]) - 1);
            m11477u(this.f20921n, i2);
            m11477u(i2, -2);
            m11444k();
        }
    }

    @Override // com.google.common.collect.CompactHashMap
    /* renamed from: b */
    public int mo11436b(int i2, int i3) {
        return i2 >= size() ? i3 : i2;
    }

    @Override // com.google.common.collect.CompactHashMap
    /* renamed from: c */
    public int mo11437c() {
        int mo11437c = super.mo11437c();
        this.f20919l = new long[mo11437c];
        return mo11437c;
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (m11449p()) {
            return;
        }
        this.f20920m = -2;
        this.f20921n = -2;
        long[] jArr = this.f20919l;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashMap
    @CanIgnoreReturnValue
    /* renamed from: d */
    public Map<K, V> mo11438d() {
        Map<K, V> mo11438d = super.mo11438d();
        this.f20919l = null;
        return mo11438d;
    }

    @Override // com.google.common.collect.CompactHashMap
    /* renamed from: f */
    public Map<K, V> mo11439f(int i2) {
        return new LinkedHashMap(i2, 1.0f, this.f20922o);
    }

    @Override // com.google.common.collect.CompactHashMap
    /* renamed from: h */
    public int mo11441h() {
        return this.f20920m;
    }

    @Override // com.google.common.collect.CompactHashMap
    /* renamed from: i */
    public int mo11442i(int i2) {
        return ((int) this.f20919l[i2]) - 1;
    }

    @Override // com.google.common.collect.CompactHashMap
    /* renamed from: m */
    public void mo11446m(int i2) {
        super.mo11446m(i2);
        this.f20920m = -2;
        this.f20921n = -2;
    }

    @Override // com.google.common.collect.CompactHashMap
    /* renamed from: n */
    public void mo11447n(int i2, @NullableDecl K k2, @NullableDecl V v, int i3, int i4) {
        this.f20889c[i2] = CompactHashing.m11470b(i3, 0, i4);
        this.f20890d[i2] = k2;
        this.f20891e[i2] = v;
        m11477u(this.f20921n, i2);
        m11477u(i2, -2);
    }

    @Override // com.google.common.collect.CompactHashMap
    /* renamed from: o */
    public void mo11448o(int i2, int i3) {
        int size = size() - 1;
        super.mo11448o(i2, i3);
        long[] jArr = this.f20919l;
        m11477u(((int) (jArr[i2] >>> 32)) - 1, ((int) jArr[i2]) - 1);
        if (i2 < size) {
            m11477u(m11476t(size), i2);
            m11477u(i2, mo11442i(size));
        }
        this.f20919l[size] = 0;
    }

    @Override // com.google.common.collect.CompactHashMap
    /* renamed from: r */
    public void mo11451r(int i2) {
        super.mo11451r(i2);
        this.f20919l = Arrays.copyOf(this.f20919l, i2);
    }

    /* renamed from: t */
    public final int m11476t(int i2) {
        return ((int) (this.f20919l[i2] >>> 32)) - 1;
    }

    /* renamed from: u */
    public final void m11477u(int i2, int i3) {
        if (i2 == -2) {
            this.f20920m = i3;
        } else {
            long[] jArr = this.f20919l;
            jArr[i2] = (jArr[i2] & (-4294967296L)) | ((i3 + 1) & 4294967295L);
        }
        if (i3 == -2) {
            this.f20921n = i2;
        } else {
            long[] jArr2 = this.f20919l;
            jArr2[i3] = (4294967295L & jArr2[i3]) | ((i2 + 1) << 32);
        }
    }

    public CompactLinkedHashMap(int i2) {
        super(i2);
        this.f20922o = false;
    }
}
