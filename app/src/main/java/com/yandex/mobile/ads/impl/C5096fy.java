package com.yandex.mobile.ads.impl;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Header;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.fy */
/* loaded from: classes3.dex */
public final class C5096fy {

    /* renamed from: d */
    @JvmField
    @NotNull
    public static final ByteString f50450d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public static final ByteString f50451e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public static final ByteString f50452f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public static final ByteString f50453g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public static final ByteString f50454h;

    /* renamed from: i */
    @JvmField
    @NotNull
    public static final ByteString f50455i;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final ByteString f50456a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final ByteString f50457b;

    /* renamed from: c */
    @JvmField
    public final int f50458c;

    static {
        ByteString.Companion companion = ByteString.f68753f;
        f50450d = companion.m34592d(":");
        f50451e = companion.m34592d(Header.RESPONSE_STATUS_UTF8);
        f50452f = companion.m34592d(Header.TARGET_METHOD_UTF8);
        f50453g = companion.m34592d(Header.TARGET_PATH_UTF8);
        f50454h = companion.m34592d(Header.TARGET_SCHEME_UTF8);
        f50455i = companion.m34592d(Header.TARGET_AUTHORITY_UTF8);
    }

    public C5096fy(@NotNull ByteString name, @NotNull ByteString value) {
        Intrinsics.m32179h(name, "name");
        Intrinsics.m32179h(value, "value");
        this.f50456a = name;
        this.f50457b = value;
        this.f50458c = value.mo34576d() + name.mo34576d() + 32;
    }

    @NotNull
    /* renamed from: a */
    public final ByteString m24753a() {
        return this.f50456a;
    }

    @NotNull
    /* renamed from: b */
    public final ByteString m24754b() {
        return this.f50457b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5096fy)) {
            return false;
        }
        C5096fy c5096fy = (C5096fy) obj;
        return Intrinsics.m32174c(this.f50456a, c5096fy.f50456a) && Intrinsics.m32174c(this.f50457b, c5096fy.f50457b);
    }

    public final int hashCode() {
        return this.f50457b.hashCode() + (this.f50456a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return this.f50456a.m34586p() + ": " + this.f50457b.m34586p();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C5096fy(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.m32179h(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.m32179h(r3, r0)
            okio.ByteString$Companion r0 = okio.ByteString.f68753f
            okio.ByteString r2 = r0.m34592d(r2)
            okio.ByteString r3 = r0.m34592d(r3)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5096fy.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5096fy(@NotNull ByteString name, @NotNull String value) {
        this(name, ByteString.f68753f.m34592d(value));
        Intrinsics.m32179h(name, "name");
        Intrinsics.m32179h(value, "value");
    }
}
