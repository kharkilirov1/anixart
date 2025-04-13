package com.yandex.div.json.expressions;

import com.yandex.div.core.C2814a;
import com.yandex.div.core.Disposable;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExpressionResolver.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/json/expressions/ExpressionResolver;", "", "Companion", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface ExpressionResolver {

    /* renamed from: a */
    @JvmField
    @NotNull
    public static final ExpressionResolver f34350a = new ExpressionResolver() { // from class: com.yandex.div.json.expressions.ExpressionResolver$Companion$EMPTY$1
        @Override // com.yandex.div.json.expressions.ExpressionResolver
        @Nullable
        /* renamed from: a */
        public <R, T> T mo16670a(@NotNull String expressionKey, @NotNull String rawExpression, @NotNull Evaluable evaluable, @Nullable Function1<? super R, ? extends T> function1, @NotNull ValueValidator<T> validator, @NotNull TypeHelper<T> fieldType, @NotNull ParsingErrorLogger logger) {
            Intrinsics.m32179h(expressionKey, "expressionKey");
            Intrinsics.m32179h(rawExpression, "rawExpression");
            Intrinsics.m32179h(validator, "validator");
            Intrinsics.m32179h(fieldType, "fieldType");
            Intrinsics.m32179h(logger, "logger");
            return null;
        }

        @Override // com.yandex.div.json.expressions.ExpressionResolver
        @NotNull
        /* renamed from: b */
        public Disposable mo16671b(@NotNull String rawExpression, @NotNull List<String> list, @NotNull Function0<Unit> function0) {
            Intrinsics.m32179h(rawExpression, "rawExpression");
            return C2814a.f31000b;
        }

        @Override // com.yandex.div.json.expressions.ExpressionResolver
        /* renamed from: c */
        public void mo16672c(ParsingException e2) {
            Intrinsics.m32179h(e2, "e");
        }
    };

    /* compiled from: ExpressionResolver.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/json/expressions/ExpressionResolver$Companion;", "", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "EMPTY", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    @Nullable
    /* renamed from: a */
    <R, T> T mo16670a(@NotNull String str, @NotNull String str2, @NotNull Evaluable evaluable, @Nullable Function1<? super R, ? extends T> function1, @NotNull ValueValidator<T> valueValidator, @NotNull TypeHelper<T> typeHelper, @NotNull ParsingErrorLogger parsingErrorLogger);

    @NotNull
    /* renamed from: b */
    Disposable mo16671b(@NotNull String str, @NotNull List<String> list, @NotNull Function0<Unit> function0);

    /* renamed from: c */
    void mo16672c(@NotNull ParsingException parsingException);
}
