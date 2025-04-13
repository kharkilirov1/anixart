package com.yandex.div.core.downloader;

import android.view.View;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.view2.Div2Builder;
import com.yandex.div.core.view2.Div2View;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivPatchManager.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/downloader/DivPatchManager;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public class DivPatchManager {

    /* renamed from: a */
    @NotNull
    public final DivPatchCache f31160a;

    /* renamed from: b */
    @NotNull
    public final Provider<Div2Builder> f31161b;

    @Inject
    public DivPatchManager(@NotNull DivPatchCache divPatchCache, @NotNull Provider<Div2Builder> divViewCreator) {
        Intrinsics.m32179h(divPatchCache, "divPatchCache");
        Intrinsics.m32179h(divViewCreator, "divViewCreator");
        this.f31160a = divPatchCache;
        this.f31161b = divViewCreator;
    }

    @Nullable
    /* renamed from: a */
    public List<View> m16668a(@NotNull Div2View div2View, @NotNull String str) {
        this.f31160a.m16666a(div2View.getDataTag(), str);
        return null;
    }
}
