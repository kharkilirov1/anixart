package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.nio.charset.Charset;

@GwtCompatible
/* loaded from: classes.dex */
public final class Charsets {

    /* renamed from: a */
    @GwtIncompatible
    public static final Charset f20502a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f20503b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final Charset f20504c = Charset.forName("UTF-8");

    /* renamed from: d */
    @GwtIncompatible
    public static final Charset f20505d;

    /* renamed from: e */
    @GwtIncompatible
    public static final Charset f20506e;

    static {
        Charset.forName("UTF-16BE");
        f20505d = Charset.forName("UTF-16LE");
        f20506e = Charset.forName("UTF-16");
    }
}
