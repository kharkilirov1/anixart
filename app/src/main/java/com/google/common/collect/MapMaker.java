package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.MapMakerInternalMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class MapMaker {

    /* renamed from: a */
    public boolean f21216a;

    /* renamed from: b */
    @NullableDecl
    public MapMakerInternalMap.Strength f21217b;

    public enum Dummy {
        VALUE
    }

    /* renamed from: a */
    public MapMakerInternalMap.Strength m11746a() {
        return (MapMakerInternalMap.Strength) MoreObjects.m11165a(this.f21217b, MapMakerInternalMap.Strength.STRONG);
    }

    /* renamed from: b */
    public MapMakerInternalMap.Strength m11747b() {
        return (MapMakerInternalMap.Strength) MoreObjects.m11165a(null, MapMakerInternalMap.Strength.STRONG);
    }

    /* renamed from: c */
    public <K, V> ConcurrentMap<K, V> m11748c() {
        if (!this.f21216a) {
            return new ConcurrentHashMap(16, 0.75f, 4);
        }
        MapMakerInternalMap.WeakValueReference<Object, Object, MapMakerInternalMap.DummyInternalEntry> weakValueReference = MapMakerInternalMap.f21220k;
        MapMakerInternalMap.Strength strength = MapMakerInternalMap.Strength.WEAK;
        MapMakerInternalMap.Strength m11746a = m11746a();
        MapMakerInternalMap.Strength strength2 = MapMakerInternalMap.Strength.STRONG;
        if (m11746a == strength2 && m11747b() == strength2) {
            return new MapMakerInternalMap(this, MapMakerInternalMap.StrongKeyStrongValueEntry.Helper.f21257a);
        }
        if (m11746a() == strength2 && m11747b() == strength) {
            return new MapMakerInternalMap(this, MapMakerInternalMap.StrongKeyWeakValueEntry.Helper.f21259a);
        }
        if (m11746a() == strength && m11747b() == strength2) {
            return new MapMakerInternalMap(this, MapMakerInternalMap.WeakKeyStrongValueEntry.Helper.f21264a);
        }
        if (m11746a() == strength && m11747b() == strength) {
            return new MapMakerInternalMap(this, MapMakerInternalMap.WeakKeyWeakValueEntry.Helper.f21267a);
        }
        throw new AssertionError();
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    /* renamed from: d */
    public MapMaker m11749d() {
        MapMakerInternalMap.Strength strength = MapMakerInternalMap.Strength.WEAK;
        MapMakerInternalMap.Strength strength2 = this.f21217b;
        Preconditions.m11194r(strength2 == null, "Key strength was already set to %s", strength2);
        this.f21217b = strength;
        this.f21216a = true;
        return this;
    }

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        MapMakerInternalMap.Strength strength = this.f21217b;
        if (strength != null) {
            m11166b.m11171e("keyStrength", Ascii.m11123c(strength.toString()));
        }
        return m11166b.toString();
    }
}
