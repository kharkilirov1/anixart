package com.skydoves.balloon;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.ColorInt;
import com.skydoves.balloon.annotations.InterfaceC2453Sp;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextForm.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/skydoves/balloon/TextForm;", "", "Builder", "balloon_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class TextForm {

    /* renamed from: a */
    @NotNull
    public final CharSequence f24728a;

    /* renamed from: b */
    @InterfaceC2453Sp
    public final float f24729b;

    /* renamed from: c */
    @ColorInt
    public final int f24730c;

    /* renamed from: d */
    public final boolean f24731d;

    /* renamed from: e */
    public final int f24732e;

    /* renamed from: f */
    @Nullable
    public final Typeface f24733f;

    /* renamed from: g */
    public final int f24734g;

    /* compiled from: TextForm.kt */
    @TextFormDsl
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/skydoves/balloon/TextForm$Builder;", "", "balloon_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Builder {

        /* renamed from: d */
        @JvmField
        public boolean f24738d;

        /* renamed from: e */
        @JvmField
        public int f24739e;

        /* renamed from: f */
        @JvmField
        @Nullable
        public Typeface f24740f;

        /* renamed from: a */
        @JvmField
        @NotNull
        public CharSequence f24735a = "";

        /* renamed from: b */
        @JvmField
        @InterfaceC2453Sp
        public float f24736b = 12.0f;

        /* renamed from: c */
        @ColorInt
        @JvmField
        public int f24737c = -1;

        /* renamed from: g */
        @JvmField
        public int f24741g = 17;

        public Builder(@NotNull Context context) {
        }
    }

    public TextForm(@NotNull Builder builder) {
        this.f24728a = builder.f24735a;
        this.f24729b = builder.f24736b;
        this.f24730c = builder.f24737c;
        this.f24731d = builder.f24738d;
        this.f24732e = builder.f24739e;
        this.f24733f = builder.f24740f;
        this.f24734g = builder.f24741g;
    }
}
