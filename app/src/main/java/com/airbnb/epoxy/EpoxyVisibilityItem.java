package com.airbnb.epoxy;

import android.graphics.Rect;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: EpoxyVisibilityItem.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/airbnb/epoxy/EpoxyVisibilityItem;", "", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
@VisibleForTesting
/* loaded from: classes.dex */
public final class EpoxyVisibilityItem {

    /* renamed from: a */
    public final Rect f6968a;

    /* renamed from: b */
    public int f6969b;

    /* renamed from: c */
    @Px
    public int f6970c;

    /* renamed from: d */
    @Px
    public int f6971d;

    /* renamed from: e */
    @Px
    public int f6972e;

    /* renamed from: f */
    @Px
    public int f6973f;

    /* renamed from: g */
    @Px
    public int f6974g;

    /* renamed from: h */
    @Px
    public int f6975h;

    /* renamed from: i */
    public boolean f6976i;

    /* renamed from: j */
    public boolean f6977j;

    /* renamed from: k */
    public boolean f6978k;

    /* renamed from: l */
    public boolean f6979l;

    /* renamed from: m */
    public int f6980m;

    /* renamed from: n */
    public Integer f6981n;

    /* renamed from: o */
    public Integer f6982o;

    /* renamed from: p */
    public Integer f6983p;

    public EpoxyVisibilityItem() {
        this(null);
    }

    /* renamed from: a */
    public final void m4580a(int i2) {
        this.f6969b += i2;
    }

    public EpoxyVisibilityItem(@Nullable Integer num) {
        this.f6968a = new Rect();
        this.f6969b = -1;
        this.f6980m = 8;
        if (num != null) {
            int intValue = num.intValue();
            this.f6977j = false;
            this.f6978k = false;
            this.f6979l = false;
            this.f6969b = intValue;
            this.f6981n = null;
            this.f6982o = null;
            this.f6983p = null;
        }
    }
}
