package com.yandex.div.core.expression.variables;

import com.yandex.div.data.Variable;
import com.yandex.div2.BoolVariable;
import com.yandex.div2.ColorVariable;
import com.yandex.div2.DictVariable;
import com.yandex.div2.DivVariable;
import com.yandex.div2.IntegerVariable;
import com.yandex.div2.NumberVariable;
import com.yandex.div2.StrVariable;
import com.yandex.div2.UrlVariable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivVariablesParser.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivVariablesParserKt {
    @NotNull
    /* renamed from: a */
    public static final Variable m16681a(@NotNull DivVariable divVariable) {
        Intrinsics.m32179h(divVariable, "<this>");
        if (divVariable instanceof DivVariable.Bool) {
            BoolVariable boolVariable = ((DivVariable.Bool) divVariable).f40626c;
            return new Variable.BooleanVariable(boolVariable.f34383a, boolVariable.f34384b);
        }
        if (divVariable instanceof DivVariable.Integer) {
            IntegerVariable integerVariable = ((DivVariable.Integer) divVariable).f40630c;
            return new Variable.IntegerVariable(integerVariable.f41034a, integerVariable.f41035b);
        }
        if (divVariable instanceof DivVariable.Number) {
            NumberVariable numberVariable = ((DivVariable.Number) divVariable).f40631c;
            return new Variable.DoubleVariable(numberVariable.f41046a, numberVariable.f41047b);
        }
        if (divVariable instanceof DivVariable.Str) {
            StrVariable strVariable = ((DivVariable.Str) divVariable).f40632c;
            return new Variable.StringVariable(strVariable.f41058a, strVariable.f41059b);
        }
        if (divVariable instanceof DivVariable.Color) {
            ColorVariable colorVariable = ((DivVariable.Color) divVariable).f40627c;
            return new Variable.ColorVariable(colorVariable.f34395a, colorVariable.f34396b);
        }
        if (divVariable instanceof DivVariable.Url) {
            UrlVariable urlVariable = ((DivVariable.Url) divVariable).f40633c;
            return new Variable.UrlVariable(urlVariable.f41070a, urlVariable.f41071b);
        }
        if (!(divVariable instanceof DivVariable.Dict)) {
            throw new NoWhenBranchMatchedException();
        }
        DictVariable dictVariable = ((DivVariable.Dict) divVariable).f40629c;
        return new Variable.DictVariable(dictVariable.f34407a, dictVariable.f34408b);
    }
}
