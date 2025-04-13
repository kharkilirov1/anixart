package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes.dex */
public class ParserException extends IOException {

    /* renamed from: b */
    public final boolean f9922b;

    /* renamed from: c */
    public final int f9923c;

    public ParserException(@Nullable String str, @Nullable Throwable th, boolean z, int i2) {
        super(str, th);
        this.f9922b = z;
        this.f9923c = i2;
    }

    /* renamed from: a */
    public static ParserException m5907a(@Nullable String str, @Nullable Throwable th) {
        return new ParserException(str, th, true, 1);
    }

    /* renamed from: b */
    public static ParserException m5908b(@Nullable String str, @Nullable Throwable th) {
        return new ParserException(str, th, true, 4);
    }

    /* renamed from: c */
    public static ParserException m5909c(@Nullable String str) {
        return new ParserException(str, null, false, 1);
    }
}
