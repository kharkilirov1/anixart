package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class p00 {

    /* renamed from: a */
    private final int f53362a;

    /* renamed from: b */
    private final List<C5049ey> f53363b;

    /* renamed from: c */
    private final int f53364c;

    /* renamed from: d */
    @Nullable
    private final InputStream f53365d;

    /* renamed from: e */
    @Nullable
    private final byte[] f53366e;

    public p00(int i2, ArrayList arrayList) {
        this(i2, arrayList, -1, null);
    }

    @Nullable
    /* renamed from: a */
    public final InputStream m27135a() {
        InputStream inputStream = this.f53365d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f53366e != null) {
            return new ByteArrayInputStream(this.f53366e);
        }
        return null;
    }

    /* renamed from: b */
    public final int m27136b() {
        return this.f53364c;
    }

    /* renamed from: c */
    public final List<C5049ey> m27137c() {
        return Collections.unmodifiableList(this.f53363b);
    }

    /* renamed from: d */
    public final int m27138d() {
        return this.f53362a;
    }

    public p00(int i2, ArrayList arrayList, int i3, InputStream inputStream) {
        this.f53362a = i2;
        this.f53363b = arrayList;
        this.f53364c = i3;
        this.f53365d = inputStream;
        this.f53366e = null;
    }

    public p00(int i2, ArrayList arrayList, byte[] bArr) {
        this.f53362a = i2;
        this.f53363b = arrayList;
        this.f53364c = bArr.length;
        this.f53366e = bArr;
        this.f53365d = null;
    }
}
