package com.yandex.div.core.view2;

import androidx.room.util.C0576a;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CompositeLogId.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/CompositeLogId;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class CompositeLogId {

    /* renamed from: a */
    @NotNull
    public final String f31532a;

    /* renamed from: b */
    @NotNull
    public final String f31533b;

    /* renamed from: c */
    @NotNull
    public final String f31534c;

    /* renamed from: d */
    @NotNull
    public final Lazy f31535d;

    public CompositeLogId(@NotNull String scopeLogId, @NotNull String str, @NotNull String actionLogId) {
        Intrinsics.m32179h(scopeLogId, "scopeLogId");
        Intrinsics.m32179h(actionLogId, "actionLogId");
        this.f31532a = scopeLogId;
        this.f31533b = str;
        this.f31534c = actionLogId;
        this.f31535d = LazyKt.m31881b(new Function0<String>() { // from class: com.yandex.div.core.view2.CompositeLogId$compositeLogId$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public String invoke() {
                return CompositeLogId.this.f31532a + '#' + CompositeLogId.this.f31533b + '#' + CompositeLogId.this.f31534c;
            }
        });
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.m32174c(CompositeLogId.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yandex.div.core.view2.CompositeLogId");
        CompositeLogId compositeLogId = (CompositeLogId) obj;
        return Intrinsics.m32174c(this.f31532a, compositeLogId.f31532a) && Intrinsics.m32174c(this.f31534c, compositeLogId.f31534c) && Intrinsics.m32174c(this.f31533b, compositeLogId.f31533b);
    }

    public int hashCode() {
        return this.f31533b.hashCode() + C0576a.m4107f(this.f31534c, this.f31532a.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return (String) this.f31535d.getValue();
    }
}
