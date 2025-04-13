package com.google.android.gms.internal.auth;

import java.util.Map;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzgi implements Map.Entry, Comparable<zzgi> {

    /* renamed from: b */
    public final Comparable f16155b;

    /* renamed from: c */
    public Object f16156c;

    /* renamed from: d */
    public final /* synthetic */ zzgl f16157d;

    public zzgi(zzgl zzglVar, Comparable comparable, Object obj) {
        this.f16157d = zzglVar;
        this.f16155b = comparable;
        this.f16156c = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(zzgi zzgiVar) {
        return this.f16155b.compareTo(zzgiVar.f16155b);
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
        Comparable comparable = this.f16155b;
        Object key = entry.getKey();
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f16156c;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f16155b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f16156c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f16155b;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f16156c;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzgl zzglVar = this.f16157d;
        int i2 = zzgl.f16163h;
        zzglVar.m8482i();
        Object obj2 = this.f16156c;
        this.f16156c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f16155b);
        String valueOf2 = String.valueOf(this.f16156c);
        return C0000a.m21r(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}
