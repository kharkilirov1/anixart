package com.yandex.div.json.expressions;

import com.yandex.div.core.C2814a;
import com.yandex.div.core.Disposable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExpressionList.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/json/expressions/ConstantExpressionList;", "", "T", "Lcom/yandex/div/json/expressions/ExpressionList;", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ConstantExpressionList<T> implements ExpressionList<T> {

    /* renamed from: a */
    @NotNull
    public final List<T> f34333a;

    /* JADX WARN: Multi-variable type inference failed */
    public ConstantExpressionList(@NotNull List<? extends T> valuesList) {
        Intrinsics.m32179h(valuesList, "valuesList");
        this.f34333a = valuesList;
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    @NotNull
    /* renamed from: a */
    public List<T> mo17531a(@NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(resolver, "resolver");
        return this.f34333a;
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    @NotNull
    /* renamed from: b */
    public Disposable mo17532b(@NotNull ExpressionResolver resolver, @NotNull Function1<? super List<? extends T>, Unit> callback) {
        Intrinsics.m32179h(resolver, "resolver");
        Intrinsics.m32179h(callback, "callback");
        int i2 = Disposable.f30873B1;
        return C2814a.f31000b;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ConstantExpressionList) && Intrinsics.m32174c(this.f34333a, ((ConstantExpressionList) obj).f34333a);
    }
}
