package com.yandex.div.core.view2;

import android.graphics.Typeface;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div2.DivFontFamily;
import com.yandex.div2.DivFontWeight;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivTypefaceResolver.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/DivTypefaceResolver;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public class DivTypefaceResolver {

    /* renamed from: a */
    @NotNull
    public final DivTypefaceProvider f31669a;

    /* renamed from: b */
    @NotNull
    public final DivTypefaceProvider f31670b;

    /* compiled from: DivTypefaceResolver.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31671a;

        static {
            int[] iArr = new int[DivFontFamily.values().length];
            DivFontFamily divFontFamily = DivFontFamily.DISPLAY;
            iArr[1] = 1;
            f31671a = iArr;
        }
    }

    @Inject
    public DivTypefaceResolver(@NotNull DivTypefaceProvider regularTypefaceProvider, @Named @NotNull DivTypefaceProvider displayTypefaceProvider) {
        Intrinsics.m32179h(regularTypefaceProvider, "regularTypefaceProvider");
        Intrinsics.m32179h(displayTypefaceProvider, "displayTypefaceProvider");
        this.f31669a = regularTypefaceProvider;
        this.f31670b = displayTypefaceProvider;
    }

    @NotNull
    /* renamed from: a */
    public Typeface m16865a(@NotNull DivFontFamily fontFamily, @NotNull DivFontWeight fontWeight) {
        Intrinsics.m32179h(fontFamily, "fontFamily");
        Intrinsics.m32179h(fontWeight, "fontWeight");
        return BaseDivViewExtensionsKt.m16914D(fontWeight, WhenMappings.f31671a[fontFamily.ordinal()] == 1 ? this.f31670b : this.f31669a);
    }
}
