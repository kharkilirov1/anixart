package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import java.util.List;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class JsonTemplateParser {

    /* renamed from: a */
    public static final ValueValidator<String> f33825a = C2904b.f33861h;

    @NonNull
    /* renamed from: a */
    public static <R, T> Field<ExpressionList<T>> m17340a(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<ExpressionList<T>> field, @NonNull Function1<R, T> function1, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        ExpressionList<?> expressionList = JsonParser.f33823a;
        ExpressionList m17318j = JsonParser.m17318j(jSONObject, str, function1, listValidator, C2904b.f33858e, parsingErrorLogger, parsingEnvironment, typeHelper, C2904b.f33857d);
        if (m17318j != null) {
            return new Field.Value(z, m17318j);
        }
        String m17361v = m17361v(jSONObject, str, parsingErrorLogger, parsingEnvironment);
        return m17361v != null ? new Field.Reference(z, m17361v) : field != null ? FieldKt.m17375a(field, z) : Field.f33876b.m17374a(z);
    }

    @NonNull
    /* renamed from: b */
    public static <T> Field<T> m17341b(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<T> field, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        ExpressionList<?> expressionList = JsonParser.f33823a;
        return m17343d(jSONObject, str, z, field, C2903a.f33855b, valueValidator, parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    /* renamed from: c */
    public static <T> Field<T> m17342c(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<T> field, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        ExpressionList<?> expressionList = JsonParser.f33823a;
        return m17343d(jSONObject, str, z, field, C2903a.f33855b, C2904b.f33858e, parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    /* renamed from: d */
    public static <R, T> Field<T> m17343d(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<T> field, @NonNull Function1<R, T> function1, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        try {
            return new Field.Value(z, JsonParser.m17312d(jSONObject, str, function1, valueValidator));
        } catch (ParsingException e2) {
            JsonTemplateParserKt.m17364a(e2);
            Field<T> m17363x = m17363x(z, m17361v(jSONObject, str, parsingErrorLogger, parsingEnvironment), field);
            if (m17363x != null) {
                return m17363x;
            }
            throw e2;
        }
    }

    @NonNull
    /* renamed from: e */
    public static <R, T> Field<T> m17344e(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<T> field, @NonNull Function1<R, T> function1, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        ExpressionList<?> expressionList = JsonParser.f33823a;
        return m17343d(jSONObject, str, z, field, function1, C2904b.f33858e, parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    /* renamed from: f */
    public static <T> Field<T> m17345f(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<T> field, @NonNull Function2<ParsingEnvironment, JSONObject, T> function2, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        ExpressionList<?> expressionList = JsonParser.f33823a;
        try {
            return new Field.Value(z, JsonParser.m17313e(jSONObject, str, function2, C2904b.f33858e, parsingEnvironment));
        } catch (ParsingException e2) {
            JsonTemplateParserKt.m17364a(e2);
            Field<T> m17363x = m17363x(z, m17361v(jSONObject, str, parsingErrorLogger, parsingEnvironment), field);
            if (m17363x != null) {
                return m17363x;
            }
            throw e2;
        }
    }

    @NonNull
    /* renamed from: g */
    public static <T> Field<Expression<T>> m17346g(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<Expression<T>> field, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        ExpressionList<?> expressionList = JsonParser.f33823a;
        return m17348i(jSONObject, str, z, field, C2903a.f33855b, valueValidator, parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @NonNull
    /* renamed from: h */
    public static <T> Field<Expression<T>> m17347h(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<Expression<T>> field, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        ExpressionList<?> expressionList = JsonParser.f33823a;
        return m17348i(jSONObject, str, z, field, C2903a.f33855b, C2904b.f33858e, parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @NonNull
    /* renamed from: i */
    public static <R, T> Field<Expression<T>> m17348i(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<Expression<T>> field, @NonNull Function1<R, T> function1, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        try {
            return new Field.Value(z, JsonParser.m17316h(jSONObject, str, function1, valueValidator, parsingErrorLogger, typeHelper));
        } catch (ParsingException e2) {
            JsonTemplateParserKt.m17364a(e2);
            Field<Expression<T>> m17363x = m17363x(z, m17361v(jSONObject, str, parsingErrorLogger, parsingEnvironment), field);
            if (m17363x != null) {
                return m17363x;
            }
            throw e2;
        }
    }

    @NonNull
    /* renamed from: j */
    public static <R, T> Field<Expression<T>> m17349j(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<Expression<T>> field, @NonNull Function1<R, T> function1, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        ExpressionList<?> expressionList = JsonParser.f33823a;
        return m17348i(jSONObject, str, z, field, function1, C2904b.f33858e, parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @NonNull
    /* renamed from: k */
    public static <T> Field<List<T>> m17350k(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<List<T>> field, @NonNull Function2<ParsingEnvironment, JSONObject, T> function2, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        ExpressionList<?> expressionList = JsonParser.f33823a;
        try {
            return new Field.Value(z, JsonParser.m17320l(jSONObject, str, function2, listValidator, C2904b.f33858e, parsingErrorLogger, parsingEnvironment));
        } catch (ParsingException e2) {
            JsonTemplateParserKt.m17364a(e2);
            Field<List<T>> m17363x = m17363x(z, m17361v(jSONObject, str, parsingErrorLogger, parsingEnvironment), field);
            if (m17363x != null) {
                return m17363x;
            }
            throw e2;
        }
    }

    @NonNull
    /* renamed from: l */
    public static <T> Field<T> m17351l(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<T> field, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        ExpressionList<?> expressionList = JsonParser.f33823a;
        return m17353n(jSONObject, str, z, field, C2903a.f33855b, valueValidator, parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    /* renamed from: m */
    public static <T> Field<T> m17352m(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<T> field, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        ExpressionList<?> expressionList = JsonParser.f33823a;
        return m17353n(jSONObject, str, z, field, C2903a.f33855b, C2904b.f33858e, parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    /* renamed from: n */
    public static <R, T> Field<T> m17353n(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<T> field, @NonNull Function1<R, T> function1, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        Object m17324p = JsonParser.m17324p(jSONObject, str, function1, valueValidator, parsingErrorLogger);
        if (m17324p != null) {
            return new Field.Value(z, m17324p);
        }
        String m17361v = m17361v(jSONObject, str, parsingErrorLogger, parsingEnvironment);
        return m17361v != null ? new Field.Reference(z, m17361v) : field != null ? FieldKt.m17375a(field, z) : Field.f33876b.m17374a(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    @androidx.annotation.NonNull
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.yandex.div.internal.template.Field<T> m17354o(@androidx.annotation.NonNull org.json.JSONObject r1, @androidx.annotation.NonNull java.lang.String r2, boolean r3, @androidx.annotation.Nullable com.yandex.div.internal.template.Field<T> r4, @androidx.annotation.NonNull kotlin.jvm.functions.Function2<com.yandex.div.json.ParsingEnvironment, org.json.JSONObject, T> r5, @androidx.annotation.NonNull com.yandex.div.json.ParsingErrorLogger r6, @androidx.annotation.NonNull com.yandex.div.json.ParsingEnvironment r7) {
        /*
            com.yandex.div.json.expressions.ExpressionList<?> r0 = com.yandex.div.internal.parser.JsonParser.f33823a
            org.json.JSONObject r0 = r1.optJSONObject(r2)
            if (r0 != 0) goto L9
            goto L27
        L9:
            java.lang.Object r5 = r5.invoke(r7, r0)     // Catch: java.lang.Exception -> L17 java.lang.ClassCastException -> L20
            if (r5 != 0) goto L28
            com.yandex.div.json.ParsingException r5 = com.yandex.div.json.ParsingExceptionKt.m17520e(r1, r2, r0)
            r6.mo17368a(r5)
            goto L27
        L17:
            r5 = move-exception
            com.yandex.div.json.ParsingException r5 = com.yandex.div.json.ParsingExceptionKt.m17521f(r1, r2, r0, r5)
            r6.mo17368a(r5)
            goto L27
        L20:
            com.yandex.div.json.ParsingException r5 = com.yandex.div.json.ParsingExceptionKt.m17528m(r1, r2, r0)
            r6.mo17368a(r5)
        L27:
            r5 = 0
        L28:
            if (r5 == 0) goto L30
            com.yandex.div.internal.template.Field$Value r1 = new com.yandex.div.internal.template.Field$Value
            r1.<init>(r3, r5)
            goto L4a
        L30:
            java.lang.String r1 = m17361v(r1, r2, r6, r7)
            if (r1 == 0) goto L3d
            com.yandex.div.internal.template.Field$Reference r2 = new com.yandex.div.internal.template.Field$Reference
            r2.<init>(r3, r1)
            r1 = r2
            goto L4a
        L3d:
            if (r4 == 0) goto L44
            com.yandex.div.internal.template.Field r1 = com.yandex.div.internal.template.FieldKt.m17375a(r4, r3)
            goto L4a
        L44:
            com.yandex.div.internal.template.Field$Companion r1 = com.yandex.div.internal.template.Field.f33876b
            com.yandex.div.internal.template.Field r1 = r1.m17374a(r3)
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.parser.JsonTemplateParser.m17354o(org.json.JSONObject, java.lang.String, boolean, com.yandex.div.internal.template.Field, kotlin.jvm.functions.Function2, com.yandex.div.json.ParsingErrorLogger, com.yandex.div.json.ParsingEnvironment):com.yandex.div.internal.template.Field");
    }

    @NonNull
    /* renamed from: p */
    public static <T> Field<Expression<T>> m17355p(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<Expression<T>> field, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        ExpressionList<?> expressionList = JsonParser.f33823a;
        return m17357r(jSONObject, str, z, field, C2903a.f33855b, valueValidator, parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @NonNull
    /* renamed from: q */
    public static <T> Field<Expression<T>> m17356q(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<Expression<T>> field, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        ExpressionList<?> expressionList = JsonParser.f33823a;
        return m17357r(jSONObject, str, z, field, C2903a.f33855b, C2904b.f33858e, parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @NonNull
    /* renamed from: r */
    public static <R, T> Field<Expression<T>> m17357r(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<Expression<T>> field, @NonNull Function1<R, T> function1, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        Expression m17328t = JsonParser.m17328t(jSONObject, str, function1, valueValidator, parsingErrorLogger, null, typeHelper);
        if (m17328t != null) {
            return new Field.Value(z, m17328t);
        }
        String m17361v = m17361v(jSONObject, str, parsingErrorLogger, parsingEnvironment);
        return m17361v != null ? new Field.Reference(z, m17361v) : field != null ? FieldKt.m17375a(field, z) : Field.f33876b.m17374a(z);
    }

    @NonNull
    /* renamed from: s */
    public static <R, T> Field<Expression<T>> m17358s(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<Expression<T>> field, @NonNull Function1<R, T> function1, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        ExpressionList<?> expressionList = JsonParser.f33823a;
        return m17357r(jSONObject, str, z, field, function1, C2904b.f33858e, parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @NonNull
    /* renamed from: t */
    public static <R, T> Field<List<T>> m17359t(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<List<T>> field, @NonNull Function1<R, T> function1, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        ExpressionList<?> expressionList = JsonParser.f33823a;
        List m17331w = JsonParser.m17331w(jSONObject, str, function1, listValidator, C2904b.f33858e, parsingErrorLogger);
        if (m17331w != null) {
            return new Field.Value(z, m17331w);
        }
        String m17361v = m17361v(jSONObject, str, parsingErrorLogger, parsingEnvironment);
        return m17361v != null ? new Field.Reference(z, m17361v) : field != null ? FieldKt.m17375a(field, z) : Field.f33876b.m17374a(z);
    }

    @NonNull
    /* renamed from: u */
    public static <R, T> Field<List<T>> m17360u(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<List<T>> field, @NonNull Function2<ParsingEnvironment, R, T> function2, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        List m17333y = JsonParser.m17333y(jSONObject, str, function2, listValidator, parsingErrorLogger, parsingEnvironment);
        if (m17333y != null) {
            return new Field.Value(z, m17333y);
        }
        String m17361v = m17361v(jSONObject, str, parsingErrorLogger, parsingEnvironment);
        return m17361v != null ? new Field.Reference(z, m17361v) : field != null ? FieldKt.m17375a(field, z) : Field.f33876b.m17374a(z);
    }

    @Nullable
    @PublishedApi
    /* renamed from: v */
    public static String m17361v(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return (String) JsonParser.m17323o(jSONObject, '$' + str, f33825a, parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    /* renamed from: w */
    public static <T> Field<List<T>> m17362w(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<List<T>> field, @NonNull Function2<ParsingEnvironment, JSONObject, T> function2, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        ExpressionList<?> expressionList = JsonParser.f33823a;
        try {
            return new Field.Value(z, JsonParser.m17334z(jSONObject, str, function2, listValidator, C2904b.f33858e, parsingErrorLogger, parsingEnvironment));
        } catch (ParsingException e2) {
            JsonTemplateParserKt.m17364a(e2);
            Field<List<T>> m17363x = m17363x(z, m17361v(jSONObject, str, parsingErrorLogger, parsingEnvironment), field);
            if (m17363x != null) {
                return m17363x;
            }
            throw e2;
        }
    }

    @Nullable
    @PublishedApi
    /* renamed from: x */
    public static <T> Field<T> m17363x(boolean z, @Nullable String str, @Nullable Field<T> field) {
        if (str != null) {
            return new Field.Reference(z, str);
        }
        if (field != null) {
            return FieldKt.m17375a(field, z);
        }
        if (z) {
            return Field.f33876b.m17374a(z);
        }
        return null;
    }
}
