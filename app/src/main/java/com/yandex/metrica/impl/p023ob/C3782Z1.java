package com.yandex.metrica.impl.p023ob;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.Z1 */
/* loaded from: classes2.dex */
public class C3782Z1 {

    /* renamed from: a */
    private final int f44599a;

    /* renamed from: b */
    private final int f44600b;

    /* renamed from: c */
    private final int f44601c;

    public C3782Z1(int i2, int i3, int i4) {
        this.f44599a = i2;
        this.f44600b = i3;
        this.f44601c = i4;
    }

    /* renamed from: a */
    public final int m19491a(@Nullable Boolean bool) {
        if (bool == null) {
            return this.f44599a;
        }
        if (Intrinsics.m32174c(bool, Boolean.FALSE)) {
            return this.f44600b;
        }
        if (Intrinsics.m32174c(bool, Boolean.TRUE)) {
            return this.f44601c;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    /* renamed from: a */
    public final Boolean m19492a(int i2) {
        if (i2 == this.f44600b) {
            return Boolean.FALSE;
        }
        if (i2 == this.f44601c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
