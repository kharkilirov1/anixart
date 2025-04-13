package com.yandex.div.internal.parser;

import android.net.Uri;
import com.yandex.div.evaluable.types.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ParsingConverters.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*.\u0010\u0003\u001a\u0004\b\u0000\u0010\u0000\u001a\u0004\b\u0001\u0010\u0001\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0004"}, m31884d2 = {"T", "R", "Lkotlin/Function1;", "Converter", "div-json_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ParsingConvertersKt {

    /* renamed from: a */
    @NotNull
    public static final Function1<Object, Integer> f33827a;

    /* renamed from: b */
    @NotNull
    public static final Function1<String, Uri> f33828b;

    /* renamed from: c */
    @NotNull
    public static final Function1<Object, Boolean> f33829c;

    /* renamed from: d */
    @NotNull
    public static final Function1<Number, Double> f33830d;

    /* renamed from: e */
    @NotNull
    public static final Function1<Number, Long> f33831e;

    static {
        ParsingConvertersKt$COLOR_INT_TO_STRING$1 parsingConvertersKt$COLOR_INT_TO_STRING$1 = new Function1<Integer, String>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$COLOR_INT_TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            public String invoke(Integer num) {
                return Color.m17272a(num.intValue());
            }
        };
        f33827a = new Function1<Object, Integer>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$STRING_TO_COLOR_INT$1
            @Override // kotlin.jvm.functions.Function1
            public Integer invoke(Object obj) {
                if (obj instanceof String) {
                    return Integer.valueOf(Color.f33641b.m17274b((String) obj));
                }
                if (obj instanceof Color) {
                    return Integer.valueOf(((Color) obj).f33642a);
                }
                if (obj == null) {
                    return null;
                }
                throw new ClassCastException("Received value of wrong type");
            }
        };
        ParsingConvertersKt$URI_TO_STRING$1 parsingConvertersKt$URI_TO_STRING$1 = new Function1<Uri, String>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$URI_TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            public String invoke(Uri uri) {
                Uri uri2 = uri;
                Intrinsics.m32179h(uri2, "uri");
                String uri3 = uri2.toString();
                Intrinsics.m32178g(uri3, "uri.toString()");
                return uri3;
            }
        };
        f33828b = new Function1<String, Uri>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$STRING_TO_URI$1
            @Override // kotlin.jvm.functions.Function1
            public Uri invoke(String str) {
                String value = str;
                Intrinsics.m32179h(value, "value");
                Uri parse = Uri.parse(value);
                Intrinsics.m32178g(parse, "parse(value)");
                return parse;
            }
        };
        f33829c = new Function1<Object, Boolean>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$ANY_TO_BOOLEAN$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object value) {
                Intrinsics.m32179h(value, "value");
                if (!(value instanceof Number)) {
                    if (value instanceof Boolean) {
                        return (Boolean) value;
                    }
                    throw new ClassCastException("Received value of wrong type");
                }
                Function1<Object, Integer> function1 = ParsingConvertersKt.f33827a;
                int intValue = ((Number) value).intValue();
                if (intValue == 0) {
                    return Boolean.FALSE;
                }
                if (intValue != 1) {
                    return null;
                }
                return Boolean.TRUE;
            }
        };
        f33830d = new Function1<Number, Double>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$NUMBER_TO_DOUBLE$1
            @Override // kotlin.jvm.functions.Function1
            public Double invoke(Number number) {
                Number n = number;
                Intrinsics.m32179h(n, "n");
                return Double.valueOf(n.doubleValue());
            }
        };
        f33831e = new Function1<Number, Long>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$NUMBER_TO_INT$1
            @Override // kotlin.jvm.functions.Function1
            public Long invoke(Number number) {
                Number n = number;
                Intrinsics.m32179h(n, "n");
                return Long.valueOf(n.longValue());
            }
        };
    }
}
