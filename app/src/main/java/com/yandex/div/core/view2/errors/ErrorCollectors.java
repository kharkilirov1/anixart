package com.yandex.div.core.view2.errors;

import com.yandex.div.DivDataTag;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div2.DivData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ErrorCollectors.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public class ErrorCollectors {

    /* renamed from: a */
    @NotNull
    public final Map<String, ErrorCollector> f32880a = new LinkedHashMap();

    @Inject
    public ErrorCollectors() {
    }

    @NotNull
    /* renamed from: a */
    public ErrorCollector m17115a(@NotNull DivDataTag tag, @Nullable DivData divData) {
        ErrorCollector errorCollector;
        Intrinsics.m32179h(tag, "tag");
        synchronized (this.f32880a) {
            Map<String, ErrorCollector> map = this.f32880a;
            String str = tag.f30859a;
            Intrinsics.m32178g(str, "tag.id");
            ErrorCollector errorCollector2 = map.get(str);
            if (errorCollector2 == null) {
                errorCollector2 = new ErrorCollector();
                map.put(str, errorCollector2);
            }
            ErrorCollector errorCollector3 = errorCollector2;
            errorCollector3.f32877c.clear();
            List<Throwable> list = errorCollector3.f32877c;
            List<Exception> list2 = divData == null ? null : divData.f35458g;
            if (list2 == null) {
                list2 = EmptyList.f63144b;
            }
            list.addAll(list2);
            errorCollector3.m17114c();
            errorCollector = errorCollector2;
        }
        return errorCollector;
    }
}
