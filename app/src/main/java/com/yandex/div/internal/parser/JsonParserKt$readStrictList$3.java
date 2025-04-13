package com.yandex.div.internal.parser;

import com.yandex.div.json.ParsingExceptionKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;

/* compiled from: JsonParser.kt */
@Metadata(m31883d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, m31884d2 = {"<anonymous>", "T", "", "jsonArray", "Lorg/json/JSONArray;", "i", "", "invoke", "(Lorg/json/JSONArray;I)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
final class JsonParserKt$readStrictList$3 extends Lambda implements Function2<JSONArray, Integer, Object> {
    @Override // kotlin.jvm.functions.Function2
    public Object invoke(JSONArray jSONArray, Integer num) {
        JSONArray jsonArray = jSONArray;
        int intValue = num.intValue();
        Intrinsics.m32179h(jsonArray, "jsonArray");
        if (JsonParserInternalsKt.m17335a(jsonArray, intValue) != null) {
            throw null;
        }
        throw ParsingExceptionKt.m17522g(jsonArray, null, intValue);
    }
}
