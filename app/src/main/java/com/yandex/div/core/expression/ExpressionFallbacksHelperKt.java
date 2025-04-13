package com.yandex.div.core.expression;

import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import kotlin.Metadata;

/* compiled from: ExpressionFallbacksHelper.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ExpressionFallbacksHelperKt {
    /* renamed from: a */
    public static final boolean m16669a(ParsingException parsingException) {
        ParsingExceptionReason parsingExceptionReason = parsingException.f34318b;
        return parsingExceptionReason == ParsingExceptionReason.MISSING_VARIABLE || parsingExceptionReason == ParsingExceptionReason.INVALID_VALUE || parsingExceptionReason == ParsingExceptionReason.TYPE_MISMATCH;
    }
}
