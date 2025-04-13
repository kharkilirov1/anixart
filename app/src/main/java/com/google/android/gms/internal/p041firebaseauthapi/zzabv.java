package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Map;
import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzabv implements Map.Entry, Comparable {

    /* renamed from: b */
    public final Comparable f16329b;

    /* renamed from: c */
    public Object f16330c;

    /* renamed from: d */
    public final /* synthetic */ zzacb f16331d;

    public zzabv(zzacb zzacbVar, Comparable comparable, Object obj) {
        this.f16331d = zzacbVar;
        this.f16329b = comparable;
        this.f16330c = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f16329b.compareTo(((zzabv) obj).f16329b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.f16329b;
        Object key = entry.getKey();
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f16330c;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f16329b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f16330c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f16329b;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f16330c;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzacb zzacbVar = this.f16331d;
        int i2 = zzacb.f16338h;
        zzacbVar.m8739i();
        Object obj2 = this.f16330c;
        this.f16330c = obj;
        return obj2;
    }

    public final String toString() {
        return C0000a.m16m(String.valueOf(this.f16329b), "=", String.valueOf(this.f16330c));
    }
}
