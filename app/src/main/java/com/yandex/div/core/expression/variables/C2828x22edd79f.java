package com.yandex.div.core.expression.variables;

import com.yandex.div.internal.parser.ListValidator;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivVariablesParser.kt */
@Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
/* renamed from: com.yandex.div.core.expression.variables.DivVariablesParserKt$sam$com_yandex_div_internal_parser_ListValidator$0 */
/* loaded from: classes2.dex */
public final class C2828x22edd79f implements ListValidator, FunctionAdapter {
    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof ListValidator) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.m32174c(null, ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    @NotNull
    public final Function<?> getFunctionDelegate() {
        return null;
    }

    public final int hashCode() {
        throw null;
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public final /* synthetic */ boolean isValid(List list) {
        throw null;
    }
}
