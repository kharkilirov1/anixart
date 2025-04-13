package com.yandex.div.internal.template;

import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.ExpressionList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: Field.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*^\u0010\b\u001a\u0004\b\u0000\u0010\u0000\")\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u00012)\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\t"}, m31884d2 = {"T", "Lkotlin/Function3;", "", "Lorg/json/JSONObject;", "Lcom/yandex/div/json/ParsingEnvironment;", "Lkotlin/ParameterName;", "name", "env", "Reader", "div-json_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class FieldKt {
    @NotNull
    /* renamed from: a */
    public static final <T> Field<T> m17375a(@Nullable Field<T> field, boolean z) {
        if (Intrinsics.m32174c(field, Field.Null.f33878c) || Intrinsics.m32174c(field, Field.Placeholder.f33879c)) {
            return Field.f33876b.m17374a(z);
        }
        if (field instanceof Field.Value) {
            return new Field.Value(z, ((Field.Value) field).f33881c);
        }
        if (field instanceof Field.Reference) {
            return new Field.Reference(z, ((Field.Reference) field).f33880c);
        }
        throw new IllegalStateException("Unknown field type");
    }

    /* renamed from: b */
    public static final <T> T m17376b(@NotNull Field<T> field, @NotNull ParsingEnvironment parsingEnvironment, @NotNull String str, @NotNull JSONObject jSONObject, @NotNull Function3<? super String, ? super JSONObject, ? super ParsingEnvironment, ? extends T> reader) {
        Intrinsics.m32179h(field, "<this>");
        Intrinsics.m32179h(reader, "reader");
        if (field.f33877a && jSONObject.has(str)) {
            return reader.mo16505k(str, jSONObject, parsingEnvironment);
        }
        if (field instanceof Field.Value) {
            return ((Field.Value) field).f33881c;
        }
        if (field instanceof Field.Reference) {
            return reader.mo16505k(((Field.Reference) field).f33880c, jSONObject, parsingEnvironment);
        }
        throw ParsingExceptionKt.m17523h(jSONObject, str);
    }

    @NotNull
    /* renamed from: c */
    public static final <T> ExpressionList<T> m17377c(@NotNull Field<ExpressionList<T>> field, @NotNull ParsingEnvironment parsingEnvironment, @NotNull String str, @NotNull JSONObject jSONObject, @NotNull Function3<? super String, ? super JSONObject, ? super ParsingEnvironment, ? extends ExpressionList<T>> reader) {
        Intrinsics.m32179h(field, "<this>");
        Intrinsics.m32179h(reader, "reader");
        if (field.f33877a && jSONObject.has(str)) {
            return reader.mo16505k(str, jSONObject, parsingEnvironment);
        }
        if (field instanceof Field.Value) {
            return (ExpressionList) ((Field.Value) field).f33881c;
        }
        if (field instanceof Field.Reference) {
            return reader.mo16505k(((Field.Reference) field).f33880c, jSONObject, parsingEnvironment);
        }
        throw ParsingExceptionKt.m17523h(jSONObject, str);
    }

    @Nullable
    /* renamed from: d */
    public static final <T> T m17378d(@NotNull Field<T> field, @NotNull ParsingEnvironment parsingEnvironment, @NotNull String str, @NotNull JSONObject jSONObject, @NotNull Function3<? super String, ? super JSONObject, ? super ParsingEnvironment, ? extends T> reader) {
        Intrinsics.m32179h(field, "<this>");
        Intrinsics.m32179h(reader, "reader");
        if (field.f33877a && jSONObject.has(str)) {
            return reader.mo16505k(str, jSONObject, parsingEnvironment);
        }
        if (field instanceof Field.Value) {
            return ((Field.Value) field).f33881c;
        }
        if (field instanceof Field.Reference) {
            return reader.mo16505k(((Field.Reference) field).f33880c, jSONObject, parsingEnvironment);
        }
        return null;
    }

    @PublishedApi
    @Nullable
    /* renamed from: e */
    public static final <T extends JSONSerializable> T m17379e(@NotNull JsonTemplate<T> jsonTemplate, @NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
        Intrinsics.m32179h(jsonTemplate, "<this>");
        try {
            return jsonTemplate.mo17514a(parsingEnvironment, jSONObject);
        } catch (ParsingException e2) {
            parsingEnvironment.getF34328a().mo17368a(e2);
            return null;
        }
    }

    @Nullable
    /* renamed from: f */
    public static final <T> List<T> m17380f(@NotNull Field<? extends List<? extends T>> field, @NotNull ParsingEnvironment parsingEnvironment, @NotNull String str, @NotNull JSONObject jSONObject, @NotNull ListValidator<T> validator, @NotNull Function3<? super String, ? super JSONObject, ? super ParsingEnvironment, ? extends List<? extends T>> reader) {
        Intrinsics.m32179h(field, "<this>");
        Intrinsics.m32179h(validator, "validator");
        Intrinsics.m32179h(reader, "reader");
        List<? extends T> mo16505k = (field.f33877a && jSONObject.has(str)) ? reader.mo16505k(str, jSONObject, parsingEnvironment) : field instanceof Field.Value ? (List) ((Field.Value) field).f33881c : field instanceof Field.Reference ? reader.mo16505k(((Field.Reference) field).f33880c, jSONObject, parsingEnvironment) : null;
        if (mo16505k == null) {
            return null;
        }
        if (validator.isValid(mo16505k)) {
            return (List<T>) mo16505k;
        }
        parsingEnvironment.getF34328a().mo17368a(ParsingExceptionKt.m17520e(jSONObject, str, mo16505k));
        return null;
    }

    @Nullable
    /* renamed from: g */
    public static final <T extends JSONSerializable> T m17381g(@NotNull Field<? extends JsonTemplate<T>> field, @NotNull ParsingEnvironment parsingEnvironment, @NotNull String str, @NotNull JSONObject jSONObject, @NotNull Function3<? super String, ? super JSONObject, ? super ParsingEnvironment, ? extends T> reader) {
        Intrinsics.m32179h(field, "<this>");
        Intrinsics.m32179h(reader, "reader");
        if (field.f33877a && jSONObject.has(str)) {
            return reader.mo16505k(str, jSONObject, parsingEnvironment);
        }
        if (field instanceof Field.Value) {
            return (T) m17379e((JsonTemplate) ((Field.Value) field).f33881c, parsingEnvironment, jSONObject);
        }
        if (field instanceof Field.Reference) {
            return reader.mo16505k(((Field.Reference) field).f33880c, jSONObject, parsingEnvironment);
        }
        return null;
    }

    @Nullable
    /* renamed from: h */
    public static final <T extends JSONSerializable> List<T> m17382h(@NotNull Field<? extends List<? extends JsonTemplate<T>>> field, @NotNull ParsingEnvironment parsingEnvironment, @NotNull String str, @NotNull JSONObject jSONObject, @NotNull ListValidator<T> validator, @NotNull Function3<? super String, ? super JSONObject, ? super ParsingEnvironment, ? extends List<? extends T>> reader) {
        List<? extends T> mo16505k;
        Intrinsics.m32179h(field, "<this>");
        Intrinsics.m32179h(validator, "validator");
        Intrinsics.m32179h(reader, "reader");
        if (field.f33877a && jSONObject.has(str)) {
            mo16505k = reader.mo16505k(str, jSONObject, parsingEnvironment);
        } else if (field instanceof Field.Value) {
            Iterable iterable = (Iterable) ((Field.Value) field).f33881c;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                JSONSerializable m17379e = m17379e((JsonTemplate) it.next(), parsingEnvironment, jSONObject);
                if (m17379e != null) {
                    arrayList.add(m17379e);
                }
            }
            mo16505k = arrayList;
        } else {
            mo16505k = field instanceof Field.Reference ? reader.mo16505k(((Field.Reference) field).f33880c, jSONObject, parsingEnvironment) : null;
        }
        if (mo16505k == null) {
            return null;
        }
        if (validator.isValid(mo16505k)) {
            return (List<T>) mo16505k;
        }
        parsingEnvironment.getF34328a().mo17368a(ParsingExceptionKt.m17520e(jSONObject, str, mo16505k));
        return null;
    }

    @NotNull
    /* renamed from: i */
    public static final <T extends JSONSerializable> T m17383i(@NotNull Field<? extends JsonTemplate<T>> field, @NotNull ParsingEnvironment parsingEnvironment, @NotNull String str, @NotNull JSONObject jSONObject, @NotNull Function3<? super String, ? super JSONObject, ? super ParsingEnvironment, ? extends T> reader) {
        Intrinsics.m32179h(field, "<this>");
        Intrinsics.m32179h(reader, "reader");
        if (field.f33877a && jSONObject.has(str)) {
            return reader.mo16505k(str, jSONObject, parsingEnvironment);
        }
        if (!(field instanceof Field.Value)) {
            if (field instanceof Field.Reference) {
                return reader.mo16505k(((Field.Reference) field).f33880c, jSONObject, parsingEnvironment);
            }
            throw ParsingExceptionKt.m17523h(jSONObject, str);
        }
        JsonTemplate jsonTemplate = (JsonTemplate) ((Field.Value) field).f33881c;
        Intrinsics.m32179h(jsonTemplate, "<this>");
        try {
            return (T) jsonTemplate.mo17514a(parsingEnvironment, jSONObject);
        } catch (ParsingException e2) {
            throw ParsingExceptionKt.m17516a(jSONObject, str, e2);
        }
    }

    @NotNull
    /* renamed from: j */
    public static final <T extends JSONSerializable> List<T> m17384j(@NotNull Field<? extends List<? extends JsonTemplate<T>>> field, @NotNull ParsingEnvironment parsingEnvironment, @NotNull String str, @NotNull JSONObject jSONObject, @NotNull ListValidator<T> validator, @NotNull Function3<? super String, ? super JSONObject, ? super ParsingEnvironment, ? extends List<? extends T>> reader) {
        List<? extends T> mo16505k;
        Intrinsics.m32179h(field, "<this>");
        Intrinsics.m32179h(validator, "validator");
        Intrinsics.m32179h(reader, "reader");
        if (field.f33877a && jSONObject.has(str)) {
            mo16505k = reader.mo16505k(str, jSONObject, parsingEnvironment);
        } else if (field instanceof Field.Value) {
            Iterable iterable = (Iterable) ((Field.Value) field).f33881c;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                JSONSerializable m17379e = m17379e((JsonTemplate) it.next(), parsingEnvironment, jSONObject);
                if (m17379e != null) {
                    arrayList.add(m17379e);
                }
            }
            mo16505k = arrayList;
        } else {
            if (!(field instanceof Field.Reference)) {
                throw ParsingExceptionKt.m17523h(jSONObject, str);
            }
            mo16505k = reader.mo16505k(((Field.Reference) field).f33880c, jSONObject, parsingEnvironment);
        }
        if (validator.isValid(mo16505k)) {
            return mo16505k;
        }
        throw ParsingExceptionKt.m17520e(jSONObject, str, mo16505k);
    }
}
