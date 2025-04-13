package com.yandex.div.core.view2.divs;

import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.view2.DivAccessibilityBinder;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivBaseBinder_Factory implements Factory<DivBaseBinder> {

    /* renamed from: a */
    public final Provider<DivBackgroundBinder> f32002a;

    /* renamed from: b */
    public final Provider<DivTooltipController> f32003b;

    /* renamed from: c */
    public final Provider<DivExtensionController> f32004c;

    /* renamed from: d */
    public final Provider<DivFocusBinder> f32005d;

    /* renamed from: e */
    public final Provider<DivAccessibilityBinder> f32006e;

    public DivBaseBinder_Factory(Provider<DivBackgroundBinder> provider, Provider<DivTooltipController> provider2, Provider<DivExtensionController> provider3, Provider<DivFocusBinder> provider4, Provider<DivAccessibilityBinder> provider5) {
        this.f32002a = provider;
        this.f32003b = provider2;
        this.f32004c = provider3;
        this.f32005d = provider4;
        this.f32006e = provider5;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivBaseBinder(this.f32002a.get(), this.f32003b.get(), this.f32004c.get(), this.f32005d.get(), this.f32006e.get());
    }
}
