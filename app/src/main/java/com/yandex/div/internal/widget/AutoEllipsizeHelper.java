package com.yandex.div.internal.widget;

import android.view.ViewTreeObserver;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AutoEllipsizeHelper.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/internal/widget/AutoEllipsizeHelper;", "", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class AutoEllipsizeHelper {

    /* renamed from: a */
    @NotNull
    public final EllipsizedTextView f33953a;

    /* renamed from: b */
    public boolean f33954b;

    /* renamed from: c */
    @Nullable
    public ViewTreeObserver.OnPreDrawListener f33955c;

    /* compiled from: AutoEllipsizeHelper.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/internal/widget/AutoEllipsizeHelper$Companion;", "", "", "ALLOWED_TEXT_OVERFLOW_PX", "I", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    public AutoEllipsizeHelper(@NotNull EllipsizedTextView ellipsizedTextView) {
        this.f33953a = ellipsizedTextView;
    }
}
