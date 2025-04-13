package com.yandex.div.core.view2;

import androidx.collection.ArrayMap;
import androidx.core.view.ViewCompat;
import com.yandex.div.core.dagger.DivViewScope;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivViewIdProvider.kt */
@DivViewScope
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/DivViewIdProvider;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivViewIdProvider {

    /* renamed from: a */
    @NotNull
    public final Map<String, Integer> f31681a = new ArrayMap();

    @Inject
    public DivViewIdProvider() {
    }

    /* renamed from: a */
    public final int m16870a(@Nullable String str) {
        if (str == null) {
            return -1;
        }
        Map<String, Integer> map = this.f31681a;
        Integer num = map.get(str);
        if (num == null) {
            num = Integer.valueOf(ViewCompat.m2203i());
            map.put(str, num);
        }
        return num.intValue();
    }
}
