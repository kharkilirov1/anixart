package com.yandex.div.core.view2.divs;

import android.view.View;
import com.yandex.div.core.DivCustomViewAdapter;
import com.yandex.div.core.DivCustomViewFactory;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div2.DivCustom;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivCustomBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivCustomBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/DivCustom;", "Landroid/view/View;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivCustomBinder implements DivViewBinder<DivCustom, View> {

    /* renamed from: a */
    @NotNull
    public final DivBaseBinder f32049a;

    /* renamed from: b */
    @NotNull
    public final DivCustomViewFactory f32050b;

    /* renamed from: c */
    @Nullable
    public final DivCustomViewAdapter f32051c;

    /* renamed from: d */
    @NotNull
    public final DivExtensionController f32052d;

    @Inject
    public DivCustomBinder(@NotNull DivBaseBinder baseBinder, @NotNull DivCustomViewFactory divCustomViewFactory, @Nullable DivCustomViewAdapter divCustomViewAdapter, @NotNull DivExtensionController extensionController) {
        Intrinsics.m32179h(baseBinder, "baseBinder");
        Intrinsics.m32179h(divCustomViewFactory, "divCustomViewFactory");
        Intrinsics.m32179h(extensionController, "extensionController");
        this.f32049a = baseBinder;
        this.f32050b = divCustomViewFactory;
        this.f32051c = divCustomViewAdapter;
        this.f32052d = extensionController;
    }
}
