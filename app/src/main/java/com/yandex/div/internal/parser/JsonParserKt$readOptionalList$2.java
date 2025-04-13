package com.yandex.div.internal.parser;

import com.yandex.div.json.ParsingExceptionKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;

/* compiled from: JsonParser.kt */
@Metadata(m31883d1 = {"\u0000\u0018\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, m31884d2 = {"<anonymous>", "T", "R", "", "jsonArray", "Lorg/json/JSONArray;", "i", "", "invoke", "(Lorg/json/JSONArray;I)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
final class JsonParserKt$readOptionalList$2 extends Lambda implements Function2<JSONArray, Integer, Object> {
    @Override // kotlin.jvm.functions.Function2
    public Object invoke(JSONArray jSONArray, Integer num) {
        JSONArray jsonArray = jSONArray;
        int intValue = num.intValue();
        Intrinsics.m32179h(jsonArray, "jsonArray");
        Object m17335a = JsonParserInternalsKt.m17335a(jsonArray, intValue);
        if (m17335a == null) {
            return null;
        }
        try {
            throw null;
        } catch (Exception unused) {
            ParsingExceptionKt.m17520e(null, null, m17335a);
            throw null;
        }
    }
}
