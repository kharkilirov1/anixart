package com.yandex.div.internal.parser;

import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: JsonTemplateParser.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div-json_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class JsonTemplateParserKt {
    /* renamed from: a */
    public static final void m17364a(@NotNull ParsingException parsingException) {
        if (parsingException.f34318b != ParsingExceptionReason.MISSING_VALUE) {
            throw parsingException;
        }
    }
}
