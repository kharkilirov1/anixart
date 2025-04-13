package com.yandex.div.core.expression;

import com.yandex.div2.DivVariable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ExpressionsRuntimeProvider.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ExpressionsRuntimeProviderKt {
    /* renamed from: a */
    public static final String m16676a(DivVariable divVariable) {
        if (divVariable instanceof DivVariable.Bool) {
            return ((DivVariable.Bool) divVariable).f40626c.f34383a;
        }
        if (divVariable instanceof DivVariable.Integer) {
            return ((DivVariable.Integer) divVariable).f40630c.f41034a;
        }
        if (divVariable instanceof DivVariable.Number) {
            return ((DivVariable.Number) divVariable).f40631c.f41046a;
        }
        if (divVariable instanceof DivVariable.Str) {
            return ((DivVariable.Str) divVariable).f40632c.f41058a;
        }
        if (divVariable instanceof DivVariable.Color) {
            return ((DivVariable.Color) divVariable).f40627c.f34395a;
        }
        if (divVariable instanceof DivVariable.Url) {
            return ((DivVariable.Url) divVariable).f40633c.f41070a;
        }
        if (divVariable instanceof DivVariable.Dict) {
            return ((DivVariable.Dict) divVariable).f40629c.f34407a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
