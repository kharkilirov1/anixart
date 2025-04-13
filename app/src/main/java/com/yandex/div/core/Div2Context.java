package com.yandex.div.core;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.view2.Div2View;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Div2Context.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/Div2Context;", "Landroid/content/ContextWrapper;", "Div2InflaterFactory", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class Div2Context extends ContextWrapper {

    /* renamed from: a */
    @NotNull
    public final Div2Component f30874a;

    /* renamed from: b */
    @Nullable
    public LayoutInflater f30875b;

    /* compiled from: Div2Context.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/Div2Context$Div2InflaterFactory;", "Landroid/view/LayoutInflater$Factory2;", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Div2InflaterFactory implements LayoutInflater.Factory2 {

        /* renamed from: b */
        @NotNull
        public final Div2Context f30876b;

        /* compiled from: Div2Context.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div/core/Div2Context$Div2InflaterFactory$Companion;", "", "", "DIV_VIEW_CLASS_NAME", "Ljava/lang/String;", "DIV_VIEW_SIMPLE_CLASS_NAME", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
        }

        public Div2InflaterFactory(@NotNull Div2Context div2Context) {
            this.f30876b = div2Context;
        }

        @Override // android.view.LayoutInflater.Factory2
        @Nullable
        public View onCreateView(@Nullable View view, @NotNull String name, @NotNull Context context, @NotNull AttributeSet attrs) {
            Intrinsics.m32179h(name, "name");
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(attrs, "attrs");
            return onCreateView(name, context, attrs);
        }

        @Override // android.view.LayoutInflater.Factory
        @Nullable
        public View onCreateView(@NotNull String name, @NotNull Context context, @NotNull AttributeSet attrs) {
            Intrinsics.m32179h(name, "name");
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(attrs, "attrs");
            if (Intrinsics.m32174c("com.yandex.div.core.view2.Div2View", name) || Intrinsics.m32174c("Div2View", name)) {
                return new Div2View(this.f30876b, attrs, 0, 4);
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Div2Context(@NotNull ContextThemeWrapper contextThemeWrapper, @NotNull DivConfiguration configuration) {
        super(contextThemeWrapper);
        Intrinsics.m32179h(configuration, "configuration");
        Div2Component mo16623A = DivKit.f30958b.m16587a(contextThemeWrapper).f30961a.mo16619b().mo16628e(contextThemeWrapper).mo16626c(configuration).mo16624a(2132017478).mo16627d(new DivCreationTracker(SystemClock.uptimeMillis())).mo16625b(configuration.f30900r).mo16623A();
        Intrinsics.m32178g(mo16623A, "DivKit.getInstance(baseC…ler)\n            .build()");
        this.f30874a = mo16623A;
        DivCreationTracker mo16632d = mo16623A.mo16632d();
        if (mo16632d.f30952b >= 0) {
            return;
        }
        mo16632d.f30952b = SystemClock.uptimeMillis();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @Nullable
    public Object getSystemService(@NotNull String name) {
        LayoutInflater layoutInflater;
        Intrinsics.m32179h(name, "name");
        if (!Intrinsics.m32174c("layout_inflater", name)) {
            return getBaseContext().getSystemService(name);
        }
        LayoutInflater layoutInflater2 = this.f30875b;
        if (layoutInflater2 != null) {
            return layoutInflater2;
        }
        synchronized (this) {
            layoutInflater = this.f30875b;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getBaseContext()).cloneInContext(this);
                if (layoutInflater == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
                }
                layoutInflater.setFactory2(new Div2InflaterFactory(this));
                this.f30875b = layoutInflater;
            }
        }
        return layoutInflater;
    }
}
