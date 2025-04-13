package com.skydoves.balloon;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.Px;
import com.skydoves.balloon.extensions.ContextExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: IconForm.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/skydoves/balloon/IconForm;", "", "Builder", "balloon_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class IconForm {

    /* renamed from: a */
    @Nullable
    public final Drawable f24715a;

    /* renamed from: b */
    @NotNull
    public final IconGravity f24716b;

    /* renamed from: c */
    @Px
    public final int f24717c;

    /* renamed from: d */
    @Px
    public final int f24718d;

    /* renamed from: e */
    @ColorInt
    public final int f24719e;

    /* compiled from: IconForm.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/skydoves/balloon/IconForm$Builder;", "", "balloon_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    @IconFormDsl
    public static final class Builder {

        /* renamed from: a */
        @JvmField
        @Nullable
        public Drawable f24720a;

        /* renamed from: c */
        @Px
        @JvmField
        public int f24722c;

        /* renamed from: d */
        @Px
        @JvmField
        public int f24723d;

        /* renamed from: b */
        @JvmField
        @NotNull
        public IconGravity f24721b = IconGravity.LEFT;

        /* renamed from: e */
        @ColorInt
        @JvmField
        public int f24724e = -1;

        public Builder(@NotNull Context context) {
            this.f24722c = ContextExtensionKt.m13875c(context, 28);
            this.f24723d = ContextExtensionKt.m13875c(context, 8);
        }
    }

    public IconForm(@NotNull Builder builder) {
        this.f24715a = builder.f24720a;
        this.f24716b = builder.f24721b;
        this.f24717c = builder.f24722c;
        this.f24718d = builder.f24723d;
        this.f24719e = builder.f24724e;
    }
}
