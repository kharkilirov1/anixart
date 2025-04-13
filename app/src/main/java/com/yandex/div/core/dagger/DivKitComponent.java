package com.yandex.div.core.dagger;

import android.content.Context;
import com.yandex.div.core.DivKitConfiguration;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.histogram.HistogramRecordConfiguration;
import dagger.BindsInstance;
import dagger.Component;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivKitComponent.kt */
@Component
@Singleton
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/core/dagger/DivKitComponent;", "", "Builder", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface DivKitComponent {

    /* compiled from: DivKitComponent.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/core/dagger/DivKitComponent$Builder;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    @Component.Builder
    public interface Builder {
        @NotNull
        /* renamed from: A */
        DivKitComponent mo16620A();

        @NotNull
        /* renamed from: a */
        Builder mo16621a(@NotNull DivKitConfiguration divKitConfiguration);

        @BindsInstance
        @NotNull
        /* renamed from: b */
        Builder mo16622b(@Named @NotNull Context context);
    }

    @NotNull
    /* renamed from: a */
    HistogramRecordConfiguration mo16618a();

    @NotNull
    /* renamed from: b */
    Div2Component.Builder mo16619b();
}
