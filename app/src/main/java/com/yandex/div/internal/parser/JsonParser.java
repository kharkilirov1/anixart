package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.ConstantExpressionList;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.MutableExpressionList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class JsonParser {

    /* renamed from: a */
    public static final ExpressionList<?> f33823a = new ConstantExpressionList(Collections.emptyList());

    public interface ErrorHandler {

        /* renamed from: E1 */
        public static final /* synthetic */ int f33824E1 = 0;
    }

    @NonNull
    /* renamed from: A */
    public static <T> List<T> m17308A(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function2<ParsingEnvironment, JSONObject, T> function2, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return m17334z(jSONObject, str, function2, listValidator, C2904b.f33858e, parsingErrorLogger, parsingEnvironment);
    }

    @Nullable
    /* renamed from: a */
    public static <T> T m17309a(@Nullable T t) {
        if (t == null || t == JSONObject.NULL) {
            return null;
        }
        return t;
    }

    @Nullable
    /* renamed from: b */
    public static Object m17310b(JSONObject jSONObject, String str) {
        Object opt = jSONObject.opt(str);
        if (opt == null || opt == JSONObject.NULL) {
            return null;
        }
        return opt;
    }

    @NonNull
    /* renamed from: c */
    public static <T> T m17311c(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        T t = (T) m17310b(jSONObject, str);
        if (t == null) {
            throw ParsingExceptionKt.m17523h(jSONObject, str);
        }
        try {
            if (valueValidator.mo17302a(t)) {
                return t;
            }
            throw ParsingExceptionKt.m17520e(jSONObject, str, t);
        } catch (ClassCastException unused) {
            throw ParsingExceptionKt.m17528m(jSONObject, str, t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* renamed from: d */
    public static Object m17312d(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ValueValidator valueValidator) {
        Object m17310b = m17310b(jSONObject, str);
        if (m17310b == null) {
            throw ParsingExceptionKt.m17523h(jSONObject, str);
        }
        try {
            Object invoke = function1.invoke(m17310b);
            if (invoke == null) {
                throw ParsingExceptionKt.m17520e(jSONObject, str, m17310b);
            }
            try {
                if (valueValidator.mo17302a(invoke)) {
                    return invoke;
                }
                throw ParsingExceptionKt.m17520e(jSONObject, str, invoke);
            } catch (ClassCastException unused) {
                throw ParsingExceptionKt.m17528m(jSONObject, str, invoke);
            }
        } catch (ClassCastException unused2) {
            throw ParsingExceptionKt.m17528m(jSONObject, str, m17310b);
        } catch (Exception e2) {
            throw ParsingExceptionKt.m17521f(jSONObject, str, m17310b, e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* renamed from: e */
    public static Object m17313e(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function2 function2, @NonNull ValueValidator valueValidator, @NonNull ParsingEnvironment parsingEnvironment) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            throw ParsingExceptionKt.m17523h(jSONObject, str);
        }
        try {
            Object invoke = function2.invoke(parsingEnvironment, optJSONObject);
            if (invoke == null) {
                throw ParsingExceptionKt.m17520e(jSONObject, str, null);
            }
            try {
                if (valueValidator.mo17302a(invoke)) {
                    return invoke;
                }
                throw ParsingExceptionKt.m17520e(jSONObject, str, invoke);
            } catch (ClassCastException unused) {
                throw ParsingExceptionKt.m17528m(jSONObject, str, invoke);
            }
        } catch (ParsingException e2) {
            throw ParsingExceptionKt.m17516a(jSONObject, str, e2);
        }
    }

    @NonNull
    /* renamed from: f */
    public static <T> Expression<T> m17314f(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return m17316h(jSONObject, str, C2903a.f33855b, valueValidator, parsingErrorLogger, typeHelper);
    }

    @NonNull
    /* renamed from: g */
    public static Expression<String> m17315g(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<String> typeHelper) {
        return m17316h(jSONObject, str, C2903a.f33855b, C2904b.f33859f, parsingErrorLogger, typeHelper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* renamed from: h */
    public static Expression m17316h(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ValueValidator valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull TypeHelper typeHelper) {
        Object m17310b = m17310b(jSONObject, str);
        if (m17310b == null) {
            throw ParsingExceptionKt.m17523h(jSONObject, str);
        }
        if (Expression.m17534d(m17310b)) {
            return new Expression.MutableExpression(str, m17310b.toString(), function1, valueValidator, parsingErrorLogger, typeHelper, null);
        }
        try {
            Object invoke = function1.invoke(m17310b);
            if (invoke == null) {
                throw ParsingExceptionKt.m17520e(jSONObject, str, m17310b);
            }
            try {
                if (valueValidator.mo17302a(invoke)) {
                    return Expression.m17533a(invoke);
                }
                throw ParsingExceptionKt.m17520e(jSONObject, str, m17310b);
            } catch (ClassCastException unused) {
                throw ParsingExceptionKt.m17528m(jSONObject, str, m17310b);
            }
        } catch (ClassCastException unused2) {
            throw ParsingExceptionKt.m17528m(jSONObject, str, m17310b);
        } catch (Exception e2) {
            throw ParsingExceptionKt.m17521f(jSONObject, str, m17310b, e2);
        }
    }

    @NonNull
    /* renamed from: i */
    public static <R, T> Expression<T> m17317i(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, T> function1, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return m17316h(jSONObject, str, function1, C2904b.f33858e, parsingErrorLogger, typeHelper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: j */
    public static <R, T> ExpressionList m17318j(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, T> function1, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper, @NonNull ErrorHandler errorHandler) {
        int i2;
        int i3;
        ArrayList arrayList;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            ((C2904b) errorHandler).m17373b(ParsingExceptionKt.m17523h(jSONObject, str));
            return null;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            List<? extends T> emptyList = Collections.emptyList();
            try {
                if (listValidator.isValid(emptyList)) {
                    return f33823a;
                }
                parsingErrorLogger.mo17368a(ParsingExceptionKt.m17520e(jSONObject, str, emptyList));
                return f33823a;
            } catch (ClassCastException unused) {
                parsingErrorLogger.mo17368a(ParsingExceptionKt.m17528m(jSONObject, str, emptyList));
                return f33823a;
            }
        }
        ArrayList arrayList2 = new ArrayList(length);
        boolean z = false;
        int i4 = 0;
        while (i4 < length) {
            Object m17309a = m17309a(optJSONArray.opt(i4));
            if (m17309a == null) {
                i2 = i4;
                i3 = length;
                arrayList = arrayList2;
            } else if (Expression.m17534d(m17309a)) {
                i2 = i4;
                i3 = length;
                arrayList = arrayList2;
                arrayList.add(new Expression.MutableExpression(str + "[" + i4 + "]", m17309a.toString(), function1, valueValidator, parsingErrorLogger, typeHelper, null));
                z = true;
            } else {
                i2 = i4;
                i3 = length;
                arrayList = arrayList2;
                try {
                    T invoke = function1.invoke(m17309a);
                    if (invoke != null) {
                        try {
                            if (valueValidator.mo17302a(invoke)) {
                                arrayList.add(invoke);
                            } else {
                                parsingErrorLogger.mo17368a(ParsingExceptionKt.m17518c(optJSONArray, str, i2, invoke));
                            }
                        } catch (ClassCastException unused2) {
                            parsingErrorLogger.mo17368a(ParsingExceptionKt.m17527l(optJSONArray, str, i2, invoke));
                        }
                    }
                } catch (ClassCastException unused3) {
                    parsingErrorLogger.mo17368a(ParsingExceptionKt.m17527l(optJSONArray, str, i2, m17309a));
                } catch (Exception e2) {
                    parsingErrorLogger.mo17368a(ParsingExceptionKt.m17519d(optJSONArray, str, i2, m17309a, e2));
                }
            }
            i4 = i2 + 1;
            arrayList2 = arrayList;
            length = i3;
        }
        ArrayList arrayList3 = arrayList2;
        if (z) {
            for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                Object obj = arrayList3.get(i5);
                if (!(obj instanceof Expression)) {
                    arrayList3.set(i5, Expression.m17533a(obj));
                }
            }
            return new MutableExpressionList(str, arrayList3, listValidator, parsingEnvironment.getF33840b());
        }
        try {
            if (listValidator.isValid(arrayList3)) {
                return new ConstantExpressionList(arrayList3);
            }
            ((C2904b) errorHandler).m17373b(ParsingExceptionKt.m17520e(jSONObject, str, arrayList3));
            return null;
        } catch (ClassCastException unused4) {
            ((C2904b) errorHandler).m17373b(ParsingExceptionKt.m17528m(jSONObject, str, arrayList3));
            return null;
        }
    }

    @NonNull
    /* renamed from: k */
    public static <R, T> ExpressionList<T> m17319k(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, T> function1, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        ExpressionList<T> m17318j = m17318j(jSONObject, str, function1, listValidator, C2904b.f33858e, parsingErrorLogger, parsingEnvironment, typeHelper, C2904b.f33856c);
        if (m17318j != null) {
            return m17318j;
        }
        throw ParsingExceptionKt.m17517b(str, jSONObject);
    }

    @NonNull
    /* renamed from: l */
    public static <T> List<T> m17320l(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function2<ParsingEnvironment, JSONObject, T> function2, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            throw ParsingExceptionKt.m17523h(jSONObject, str);
        }
        int length = optJSONArray.length();
        if (length == 0) {
            List<T> emptyList = Collections.emptyList();
            try {
                if (!listValidator.isValid(emptyList)) {
                    parsingErrorLogger.mo17368a(ParsingExceptionKt.m17520e(jSONObject, str, emptyList));
                }
                return emptyList;
            } catch (ClassCastException unused) {
                parsingErrorLogger.mo17368a(ParsingExceptionKt.m17528m(jSONObject, str, emptyList));
                return emptyList;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject2 = (JSONObject) m17309a(optJSONArray.optJSONObject(i2));
            if (jSONObject2 != null) {
                try {
                    T invoke = function2.invoke(parsingEnvironment, jSONObject2);
                    if (invoke != null) {
                        try {
                            if (valueValidator.mo17302a(invoke)) {
                                arrayList.add(invoke);
                            } else {
                                parsingErrorLogger.mo17368a(ParsingExceptionKt.m17518c(optJSONArray, str, i2, invoke));
                            }
                        } catch (ClassCastException unused2) {
                            parsingErrorLogger.mo17368a(ParsingExceptionKt.m17527l(optJSONArray, str, i2, invoke));
                        }
                    }
                } catch (ClassCastException unused3) {
                    parsingErrorLogger.mo17368a(ParsingExceptionKt.m17527l(optJSONArray, str, i2, jSONObject2));
                } catch (Exception e2) {
                    parsingErrorLogger.mo17368a(ParsingExceptionKt.m17519d(optJSONArray, str, i2, jSONObject2, e2));
                }
            }
        }
        try {
            if (listValidator.isValid(arrayList)) {
                return arrayList;
            }
            throw ParsingExceptionKt.m17520e(jSONObject, str, arrayList);
        } catch (ClassCastException unused4) {
            throw ParsingExceptionKt.m17528m(jSONObject, str, arrayList);
        }
    }

    @NonNull
    /* renamed from: m */
    public static <T> List<T> m17321m(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function2<ParsingEnvironment, JSONObject, T> function2, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return m17320l(jSONObject, str, function2, listValidator, C2904b.f33858e, parsingErrorLogger, parsingEnvironment);
    }

    @Nullable
    /* renamed from: n */
    public static <T extends JSONSerializable> T m17322n(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function2<ParsingEnvironment, JSONObject, T> function2, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        try {
            return function2.invoke(parsingEnvironment, optJSONObject);
        } catch (ParsingException e2) {
            parsingErrorLogger.mo17368a(e2);
            return null;
        }
    }

    @Nullable
    /* renamed from: o */
    public static <T> T m17323o(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        T t = (T) m17310b(jSONObject, str);
        if (t != null) {
            try {
                if (valueValidator.mo17302a(t)) {
                    return t;
                }
                parsingErrorLogger.mo17368a(ParsingExceptionKt.m17520e(jSONObject, str, t));
            } catch (ClassCastException unused) {
                parsingErrorLogger.mo17368a(ParsingExceptionKt.m17528m(jSONObject, str, t));
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: p */
    public static Object m17324p(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ValueValidator valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger) {
        Object m17310b = m17310b(jSONObject, str);
        if (m17310b == null) {
            return null;
        }
        try {
            Object invoke = function1.invoke(m17310b);
            if (invoke == null) {
                parsingErrorLogger.mo17368a(ParsingExceptionKt.m17520e(jSONObject, str, m17310b));
                return null;
            }
            try {
                if (valueValidator.mo17302a(invoke)) {
                    return invoke;
                }
                parsingErrorLogger.mo17368a(ParsingExceptionKt.m17520e(jSONObject, str, m17310b));
                return null;
            } catch (ClassCastException unused) {
                parsingErrorLogger.mo17368a(ParsingExceptionKt.m17528m(jSONObject, str, m17310b));
                return null;
            }
        } catch (ClassCastException unused2) {
            parsingErrorLogger.mo17368a(ParsingExceptionKt.m17528m(jSONObject, str, m17310b));
            return null;
        } catch (Exception e2) {
            parsingErrorLogger.mo17368a(ParsingExceptionKt.m17521f(jSONObject, str, m17310b, e2));
            return null;
        }
    }

    @Nullable
    /* renamed from: q */
    public static <T> Expression<T> m17325q(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return m17327s(jSONObject, str, C2903a.f33855b, valueValidator, parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @Nullable
    /* renamed from: r */
    public static Expression<String> m17326r(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<String> typeHelper) {
        return m17327s(jSONObject, str, C2903a.f33855b, C2904b.f33859f, parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @Nullable
    /* renamed from: s */
    public static <R, T> Expression<T> m17327s(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, T> function1, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return m17328t(jSONObject, str, function1, valueValidator, parsingErrorLogger, null, typeHelper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: t */
    public static Expression m17328t(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ValueValidator valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @Nullable Expression expression, @NonNull TypeHelper typeHelper) {
        Object m17310b = m17310b(jSONObject, str);
        if (m17310b == null) {
            return null;
        }
        if (Expression.m17534d(m17310b)) {
            return new Expression.MutableExpression(str, m17310b.toString(), function1, valueValidator, parsingErrorLogger, typeHelper, expression);
        }
        try {
            Object invoke = function1.invoke(m17310b);
            if (invoke == null) {
                parsingErrorLogger.mo17368a(ParsingExceptionKt.m17520e(jSONObject, str, m17310b));
                return null;
            }
            try {
                if (valueValidator.mo17302a(invoke)) {
                    return Expression.m17533a(invoke);
                }
                parsingErrorLogger.mo17368a(ParsingExceptionKt.m17520e(jSONObject, str, m17310b));
                return null;
            } catch (ClassCastException unused) {
                parsingErrorLogger.mo17368a(ParsingExceptionKt.m17528m(jSONObject, str, m17310b));
                return null;
            }
        } catch (ClassCastException unused2) {
            parsingErrorLogger.mo17368a(ParsingExceptionKt.m17528m(jSONObject, str, m17310b));
            return null;
        } catch (Exception e2) {
            parsingErrorLogger.mo17368a(ParsingExceptionKt.m17521f(jSONObject, str, m17310b, e2));
            return null;
        }
    }

    @Nullable
    /* renamed from: u */
    public static <R, T> Expression<T> m17329u(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, T> function1, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return m17327s(jSONObject, str, function1, C2904b.f33858e, parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @Nullable
    /* renamed from: v */
    public static <R, T> Expression<T> m17330v(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, T> function1, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @Nullable Expression<T> expression, @NonNull TypeHelper<T> typeHelper) {
        return m17328t(jSONObject, str, function1, C2904b.f33858e, parsingErrorLogger, expression, typeHelper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: w */
    public static List m17331w(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ListValidator listValidator, @NonNull ValueValidator valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            List<? extends T> emptyList = Collections.emptyList();
            try {
                if (listValidator.isValid(emptyList)) {
                    return emptyList;
                }
                parsingErrorLogger.mo17368a(ParsingExceptionKt.m17520e(jSONObject, str, emptyList));
                return null;
            } catch (ClassCastException unused) {
                parsingErrorLogger.mo17368a(ParsingExceptionKt.m17528m(jSONObject, str, emptyList));
                return null;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            Object opt = optJSONArray.opt(i2);
            if (Intrinsics.m32174c(opt, JSONObject.NULL)) {
                opt = null;
            }
            if (opt != null) {
                try {
                    Object invoke = function1.invoke(opt);
                    if (invoke != null) {
                        try {
                            if (valueValidator.mo17302a(invoke)) {
                                arrayList.add(invoke);
                            } else {
                                parsingErrorLogger.mo17368a(ParsingExceptionKt.m17518c(optJSONArray, str, i2, invoke));
                            }
                        } catch (ClassCastException unused2) {
                            parsingErrorLogger.mo17368a(ParsingExceptionKt.m17527l(optJSONArray, str, i2, invoke));
                        }
                    }
                } catch (ClassCastException unused3) {
                    parsingErrorLogger.mo17368a(ParsingExceptionKt.m17527l(optJSONArray, str, i2, opt));
                } catch (Exception e2) {
                    parsingErrorLogger.mo17368a(ParsingExceptionKt.m17519d(optJSONArray, str, i2, opt, e2));
                }
            }
        }
        try {
            if (listValidator.isValid(arrayList)) {
                return arrayList;
            }
            parsingErrorLogger.mo17368a(ParsingExceptionKt.m17520e(jSONObject, str, arrayList));
            return null;
        } catch (ClassCastException unused4) {
            parsingErrorLogger.mo17368a(ParsingExceptionKt.m17528m(jSONObject, str, arrayList));
            return null;
        }
    }

    @Nullable
    /* renamed from: x */
    public static <R, T> List<T> m17332x(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, T> function1, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return m17331w(jSONObject, str, function1, listValidator, C2904b.f33858e, parsingErrorLogger);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: y */
    public static <R, T> List<T> m17333y(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function2<ParsingEnvironment, R, T> function2, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        Object invoke;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            List<T> emptyList = Collections.emptyList();
            try {
                if (listValidator.isValid(emptyList)) {
                    return emptyList;
                }
                parsingErrorLogger.mo17368a(ParsingExceptionKt.m17520e(jSONObject, str, emptyList));
                return null;
            } catch (ClassCastException unused) {
                parsingErrorLogger.mo17368a(ParsingExceptionKt.m17528m(jSONObject, str, emptyList));
                return null;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            Object m17309a = m17309a(optJSONArray.optJSONObject(i2));
            if (m17309a != null && (invoke = function2.invoke(parsingEnvironment, m17309a)) != null) {
                arrayList.add(invoke);
            }
        }
        try {
            if (listValidator.isValid(arrayList)) {
                return arrayList;
            }
            parsingErrorLogger.mo17368a(ParsingExceptionKt.m17520e(jSONObject, str, arrayList));
            return null;
        } catch (ClassCastException unused2) {
            parsingErrorLogger.mo17368a(ParsingExceptionKt.m17528m(jSONObject, str, arrayList));
            return null;
        }
    }

    @NonNull
    /* renamed from: z */
    public static <T> List<T> m17334z(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function2<ParsingEnvironment, JSONObject, T> function2, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            throw ParsingExceptionKt.m17523h(jSONObject, str);
        }
        int length = optJSONArray.length();
        if (length == 0) {
            List<T> emptyList = Collections.emptyList();
            try {
                if (!listValidator.isValid(emptyList)) {
                    parsingErrorLogger.mo17368a(ParsingExceptionKt.m17520e(jSONObject, str, emptyList));
                }
                return emptyList;
            } catch (ClassCastException unused) {
                parsingErrorLogger.mo17368a(ParsingExceptionKt.m17528m(jSONObject, str, emptyList));
                return emptyList;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject2 = (JSONObject) m17309a(optJSONArray.optJSONObject(i2));
            if (jSONObject2 == null) {
                throw ParsingExceptionKt.m17522g(optJSONArray, str, i2);
            }
            try {
                T invoke = function2.invoke(parsingEnvironment, jSONObject2);
                if (invoke == null) {
                    throw ParsingExceptionKt.m17518c(optJSONArray, str, i2, jSONObject2);
                }
                try {
                    if (!valueValidator.mo17302a(invoke)) {
                        throw ParsingExceptionKt.m17518c(optJSONArray, str, i2, jSONObject2);
                    }
                    arrayList.add(invoke);
                } catch (ClassCastException unused2) {
                    throw ParsingExceptionKt.m17527l(optJSONArray, str, i2, invoke);
                }
            } catch (ClassCastException unused3) {
                throw ParsingExceptionKt.m17527l(optJSONArray, str, i2, jSONObject2);
            } catch (Exception e2) {
                throw ParsingExceptionKt.m17519d(optJSONArray, str, i2, jSONObject2, e2);
            }
        }
        try {
            if (listValidator.isValid(arrayList)) {
                return arrayList;
            }
            throw ParsingExceptionKt.m17520e(jSONObject, str, arrayList);
        } catch (ClassCastException unused4) {
            throw ParsingExceptionKt.m17528m(jSONObject, str, arrayList);
        }
    }
}
