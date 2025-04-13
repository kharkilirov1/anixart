package com.yandex.div.json.expressions;

import com.yandex.div.core.Disposable;
import com.yandex.div.json.ParsingException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: ExpressionList.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001\u0082\u0001\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/json/expressions/ExpressionList;", "", "T", "Lcom/yandex/div/json/expressions/ConstantExpressionList;", "Lcom/yandex/div/json/expressions/MutableExpressionList;", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface ExpressionList<T> {
    @NotNull
    /* renamed from: a */
    List<T> mo17531a(@NotNull ExpressionResolver expressionResolver) throws ParsingException;

    @NotNull
    /* renamed from: b */
    Disposable mo17532b(@NotNull ExpressionResolver expressionResolver, @NotNull Function1<? super List<? extends T>, Unit> function1);
}
