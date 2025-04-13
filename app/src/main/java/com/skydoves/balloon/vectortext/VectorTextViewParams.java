package com.skydoves.balloon.vectortext;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: VectorTextViewParams.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/skydoves/balloon/vectortext/VectorTextViewParams;", "", "balloon_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final /* data */ class VectorTextViewParams {

    /* renamed from: a */
    @Nullable
    public Integer f24755a;

    /* renamed from: b */
    @Nullable
    public Integer f24756b;

    /* renamed from: c */
    @Nullable
    public Integer f24757c;

    /* renamed from: d */
    @Nullable
    public Integer f24758d;

    /* renamed from: e */
    @Nullable
    public Drawable f24759e;

    /* renamed from: f */
    @Nullable
    public Drawable f24760f;

    /* renamed from: g */
    @Nullable
    public Drawable f24761g;

    /* renamed from: h */
    @Nullable
    public Drawable f24762h;

    /* renamed from: i */
    @Nullable
    public final Integer f24763i;

    /* renamed from: j */
    @Nullable
    public final Integer f24764j;

    /* renamed from: k */
    @Nullable
    public Integer f24765k;

    /* renamed from: l */
    @Nullable
    public Integer f24766l;

    /* renamed from: m */
    @Nullable
    public Integer f24767m;

    /* renamed from: n */
    @Nullable
    public Integer f24768n;

    /* renamed from: o */
    @Nullable
    public Integer f24769o;

    public VectorTextViewParams() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767);
    }

    public VectorTextViewParams(Integer num, Integer num2, Integer num3, Integer num4, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, int i2) {
        Integer num12 = (i2 & 1) != 0 ? null : num;
        Integer num13 = (i2 & 2) != 0 ? null : num2;
        Integer num14 = (i2 & 4) != 0 ? null : num3;
        Integer num15 = (i2 & 8) != 0 ? null : num4;
        Integer num16 = (i2 & 256) != 0 ? null : num5;
        Integer num17 = (i2 & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? null : num6;
        Integer num18 = (i2 & RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE) != 0 ? null : num7;
        Integer num19 = (i2 & RecyclerView.ViewHolder.FLAG_MOVED) != 0 ? null : num8;
        Integer num20 = (i2 & RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : num9;
        Integer num21 = (i2 & RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST) != 0 ? null : num10;
        Integer num22 = (i2 & 16384) != 0 ? null : num11;
        this.f24755a = num12;
        this.f24756b = num13;
        this.f24757c = num14;
        this.f24758d = num15;
        this.f24759e = null;
        this.f24760f = null;
        this.f24761g = null;
        this.f24762h = null;
        this.f24763i = num16;
        this.f24764j = num17;
        this.f24765k = num18;
        this.f24766l = num19;
        this.f24767m = num20;
        this.f24768n = num21;
        this.f24769o = num22;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VectorTextViewParams)) {
            return false;
        }
        VectorTextViewParams vectorTextViewParams = (VectorTextViewParams) obj;
        return Intrinsics.m32174c(this.f24755a, vectorTextViewParams.f24755a) && Intrinsics.m32174c(this.f24756b, vectorTextViewParams.f24756b) && Intrinsics.m32174c(this.f24757c, vectorTextViewParams.f24757c) && Intrinsics.m32174c(this.f24758d, vectorTextViewParams.f24758d) && Intrinsics.m32174c(this.f24759e, vectorTextViewParams.f24759e) && Intrinsics.m32174c(this.f24760f, vectorTextViewParams.f24760f) && Intrinsics.m32174c(this.f24761g, vectorTextViewParams.f24761g) && Intrinsics.m32174c(this.f24762h, vectorTextViewParams.f24762h) && Intrinsics.m32174c(this.f24763i, vectorTextViewParams.f24763i) && Intrinsics.m32174c(this.f24764j, vectorTextViewParams.f24764j) && Intrinsics.m32174c(this.f24765k, vectorTextViewParams.f24765k) && Intrinsics.m32174c(this.f24766l, vectorTextViewParams.f24766l) && Intrinsics.m32174c(this.f24767m, vectorTextViewParams.f24767m) && Intrinsics.m32174c(this.f24768n, vectorTextViewParams.f24768n) && Intrinsics.m32174c(this.f24769o, vectorTextViewParams.f24769o);
    }

    public int hashCode() {
        Integer num = this.f24755a;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f24756b;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f24757c;
        int hashCode3 = (hashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.f24758d;
        int hashCode4 = (hashCode3 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Drawable drawable = this.f24759e;
        int hashCode5 = (hashCode4 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f24760f;
        int hashCode6 = (hashCode5 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f24761g;
        int hashCode7 = (hashCode6 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31;
        Drawable drawable4 = this.f24762h;
        int hashCode8 = (hashCode7 + (drawable4 != null ? drawable4.hashCode() : 0)) * 31;
        Integer num5 = this.f24763i;
        int hashCode9 = (hashCode8 + (num5 != null ? num5.hashCode() : 0)) * 31;
        Integer num6 = this.f24764j;
        int hashCode10 = (hashCode9 + (num6 != null ? num6.hashCode() : 0)) * 31;
        Integer num7 = this.f24765k;
        int hashCode11 = (hashCode10 + (num7 != null ? num7.hashCode() : 0)) * 31;
        Integer num8 = this.f24766l;
        int hashCode12 = (hashCode11 + (num8 != null ? num8.hashCode() : 0)) * 31;
        Integer num9 = this.f24767m;
        int hashCode13 = (hashCode12 + (num9 != null ? num9.hashCode() : 0)) * 31;
        Integer num10 = this.f24768n;
        int hashCode14 = (hashCode13 + (num10 != null ? num10.hashCode() : 0)) * 31;
        Integer num11 = this.f24769o;
        return hashCode14 + (num11 != null ? num11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("VectorTextViewParams(drawableLeftRes=");
        m24u.append(this.f24755a);
        m24u.append(", drawableRightRes=");
        m24u.append(this.f24756b);
        m24u.append(", drawableBottomRes=");
        m24u.append(this.f24757c);
        m24u.append(", drawableTopRes=");
        m24u.append(this.f24758d);
        m24u.append(", drawableLeft=");
        m24u.append(this.f24759e);
        m24u.append(", drawableRight=");
        m24u.append(this.f24760f);
        m24u.append(", drawableBottom=");
        m24u.append(this.f24761g);
        m24u.append(", drawableTop=");
        m24u.append(this.f24762h);
        m24u.append(", compoundDrawablePadding=");
        m24u.append(this.f24763i);
        m24u.append(", iconSize=");
        m24u.append(this.f24764j);
        m24u.append(", compoundDrawablePaddingRes=");
        m24u.append(this.f24765k);
        m24u.append(", tintColorRes=");
        m24u.append(this.f24766l);
        m24u.append(", widthRes=");
        m24u.append(this.f24767m);
        m24u.append(", heightRes=");
        m24u.append(this.f24768n);
        m24u.append(", squareSizeRes=");
        m24u.append(this.f24769o);
        m24u.append(")");
        return m24u.toString();
    }
}
