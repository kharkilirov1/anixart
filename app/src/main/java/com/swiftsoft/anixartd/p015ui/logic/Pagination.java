package com.swiftsoft.anixartd.p015ui.logic;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Pagination.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/Pagination;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Pagination {

    /* renamed from: b */
    public int f28952b;

    /* renamed from: c */
    public int f28953c;

    /* renamed from: e */
    public boolean f28955e;

    /* renamed from: a */
    @NotNull
    public Boolean[] f28951a = new Boolean[0];

    /* renamed from: d */
    public int f28954d = -1;

    /* renamed from: a */
    public final void m15661a(int i2, int i3) {
        Boolean[] boolArr = new Boolean[i2];
        this.f28951a = boolArr;
        this.f28952b = i2;
        this.f28953c = i3;
        this.f28954d = i3;
        if (i3 > 0) {
            boolArr[i3] = Boolean.TRUE;
        }
        this.f28955e = true;
    }

    /* renamed from: b */
    public final void m15662b() {
        int i2 = this.f28952b;
        if (i2 != 0) {
            int i3 = this.f28953c;
            this.f28954d = i3;
            int i4 = (i3 + 1) % i2;
            Boolean bool = (Boolean) ArraysKt.m31931G(this.f28951a, i4);
            if (bool != null && bool.booleanValue()) {
                i4 = ArraysKt.m31935K(this.f28951a, null);
            }
            if (i4 != -1) {
                this.f28951a[i4] = Boolean.TRUE;
            } else {
                i4 = this.f28952b;
            }
            this.f28953c = i4;
        }
    }
}
