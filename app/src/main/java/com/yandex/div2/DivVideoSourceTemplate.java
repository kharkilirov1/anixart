package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivVideoSource;
import com.yandex.div2.DivVideoSourceTemplate;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivVideoSourceTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivVideoSourceTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivVideoSource;", "Companion", "ResolutionTemplate", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivVideoSourceTemplate implements JSONSerializable, JsonTemplate<DivVideoSource> {

    /* renamed from: e */
    @NotNull
    public static final Companion f40732e = new Companion(null);

    /* renamed from: f */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f40733f = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivVideoSourceTemplate$Companion$BITRATE_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            return JsonParser.m17329u(jSONObject2, str2, ParsingConvertersKt.f33831e, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
        }
    };

    /* renamed from: g */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f40734g = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivVideoSourceTemplate$Companion$MIME_TYPE_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String key = str;
            JSONObject json = jSONObject;
            ParsingEnvironment env = parsingEnvironment;
            Intrinsics.m32179h(key, "key");
            Intrinsics.m32179h(json, "json");
            Intrinsics.m32179h(env, "env");
            return JsonParser.m17315g(json, key, env.getF34328a(), env, TypeHelpersKt.f33850c);
        }
    };

    /* renamed from: h */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivVideoSource.Resolution> f40735h = new Function3<String, JSONObject, ParsingEnvironment, DivVideoSource.Resolution>() { // from class: com.yandex.div2.DivVideoSourceTemplate$Companion$RESOLUTION_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public DivVideoSource.Resolution mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivVideoSource.Resolution.Companion companion = DivVideoSource.Resolution.f40727c;
            return (DivVideoSource.Resolution) JsonParser.m17322n(jSONObject2, str2, DivVideoSource.Resolution.f40728d, parsingEnvironment2.getF34328a(), parsingEnvironment2);
        }
    };

    /* renamed from: i */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>> f40736i;

    /* renamed from: j */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivVideoSourceTemplate> f40737j;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f40738a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<String>> f40739b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<ResolutionTemplate> f40740c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<Expression<Uri>> f40741d;

    /* compiled from: DivVideoSourceTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivVideoSourceTemplate$Companion;", "", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivVideoSourceTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivVideoSourceTemplate$ResolutionTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivVideoSource$Resolution;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class ResolutionTemplate implements JSONSerializable, JsonTemplate<DivVideoSource.Resolution> {

        /* renamed from: c */
        @NotNull
        public static final Companion f40748c = new Companion(null);

        /* renamed from: d */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f40749d = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivVideoSourceTemplate$ResolutionTemplate$Companion$HEIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                DivVideoSourceTemplate.ResolutionTemplate.Companion companion = DivVideoSourceTemplate.ResolutionTemplate.f40748c;
                return JsonParser.m17316h(jSONObject2, str2, function1, C3064p0.f41888m, parsingEnvironment2.getF34328a(), TypeHelpersKt.f33849b);
            }
        };

        /* renamed from: e */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f40750e;

        /* renamed from: f */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, ResolutionTemplate> f40751f;

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Field<Expression<Long>> f40752a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Field<Expression<Long>> f40753b;

        /* compiled from: DivVideoSourceTemplate.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005¨\u0006\f"}, m31884d2 = {"Lcom/yandex/div2/DivVideoSourceTemplate$ResolutionTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "HEIGHT_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "HEIGHT_VALIDATOR", "", "TYPE", "Ljava/lang/String;", "WIDTH_TEMPLATE_VALIDATOR", "WIDTH_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        static {
            C3024xb53e6de4 c3024xb53e6de4 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivVideoSourceTemplate$ResolutionTemplate$Companion$TYPE_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    Object m17742d = C3033a.m17742d(str2, "key", jSONObject2, "json", parsingEnvironment, "env", jSONObject2, str2);
                    if (m17742d != null) {
                        return (String) m17742d;
                    }
                    throw ParsingExceptionKt.m17523h(jSONObject2, str2);
                }
            };
            f40750e = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivVideoSourceTemplate$ResolutionTemplate$Companion$WIDTH_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                    DivVideoSourceTemplate.ResolutionTemplate.Companion companion = DivVideoSourceTemplate.ResolutionTemplate.f40748c;
                    return JsonParser.m17316h(jSONObject2, str2, function1, C3064p0.f41890o, parsingEnvironment2.getF34328a(), TypeHelpersKt.f33849b);
                }
            };
            f40751f = new Function2<ParsingEnvironment, JSONObject, ResolutionTemplate>() { // from class: com.yandex.div2.DivVideoSourceTemplate$ResolutionTemplate$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                public DivVideoSourceTemplate.ResolutionTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    ParsingEnvironment env = parsingEnvironment;
                    JSONObject it = jSONObject;
                    Intrinsics.m32179h(env, "env");
                    Intrinsics.m32179h(it, "it");
                    return new DivVideoSourceTemplate.ResolutionTemplate(env, null, false, it, 6);
                }
            };
        }

        public ResolutionTemplate(ParsingEnvironment parsingEnvironment, ResolutionTemplate resolutionTemplate, boolean z, JSONObject jSONObject, int i2) {
            z = (i2 & 4) != 0 ? false : z;
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
            C3064p0 c3064p0 = C3064p0.f41887l;
            TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
            this.f40752a = JsonTemplateParser.m17348i(jSONObject, "height", z, null, function1, c3064p0, f34328a, parsingEnvironment, typeHelper);
            this.f40753b = JsonTemplateParser.m17348i(jSONObject, "width", z, null, function1, C3064p0.f41889n, f34328a, parsingEnvironment, typeHelper);
        }

        @Override // com.yandex.div.json.JsonTemplate
        /* renamed from: a */
        public DivVideoSource.Resolution mo17514a(ParsingEnvironment env, JSONObject data) {
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(data, "data");
            return new DivVideoSource.Resolution((Expression) FieldKt.m17376b(this.f40752a, env, "height", data, f40749d), (Expression) FieldKt.m17376b(this.f40753b, env, "width", data, f40750e));
        }
    }

    static {
        DivVideoSourceTemplate$Companion$TYPE_READER$1 divVideoSourceTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivVideoSourceTemplate$Companion$TYPE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                Object m17742d = C3033a.m17742d(str2, "key", jSONObject2, "json", parsingEnvironment, "env", jSONObject2, str2);
                if (m17742d != null) {
                    return (String) m17742d;
                }
                throw ParsingExceptionKt.m17523h(jSONObject2, str2);
            }
        };
        f40736i = new Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>>() { // from class: com.yandex.div2.DivVideoSourceTemplate$Companion$URL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Uri> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17317i(jSONObject2, str2, ParsingConvertersKt.f33828b, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33852e);
            }
        };
        f40737j = new Function2<ParsingEnvironment, JSONObject, DivVideoSourceTemplate>() { // from class: com.yandex.div2.DivVideoSourceTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivVideoSourceTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivVideoSourceTemplate(env, null, false, it, 6);
            }
        };
    }

    public DivVideoSourceTemplate(ParsingEnvironment parsingEnvironment, DivVideoSourceTemplate divVideoSourceTemplate, boolean z, JSONObject jSONObject, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
        this.f40738a = JsonTemplateParser.m17358s(jSONObject, "bitrate", z, null, ParsingConvertersKt.f33831e, f34328a, parsingEnvironment, TypeHelpersKt.f33849b);
        this.f40739b = JsonTemplateParser.m17347h(jSONObject, "mime_type", z, null, f34328a, parsingEnvironment, TypeHelpersKt.f33850c);
        ResolutionTemplate.Companion companion = ResolutionTemplate.f40748c;
        this.f40740c = JsonTemplateParser.m17354o(jSONObject, "resolution", z, null, ResolutionTemplate.f40751f, f34328a, parsingEnvironment);
        this.f40741d = JsonTemplateParser.m17349j(jSONObject, "url", z, null, ParsingConvertersKt.f33828b, f34328a, parsingEnvironment, TypeHelpersKt.f33852e);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivVideoSource mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        return new DivVideoSource((Expression) FieldKt.m17378d(this.f40738a, env, "bitrate", data, f40733f), (Expression) FieldKt.m17376b(this.f40739b, env, "mime_type", data, f40734g), (DivVideoSource.Resolution) FieldKt.m17381g(this.f40740c, env, "resolution", data, f40735h), (Expression) FieldKt.m17376b(this.f40741d, env, "url", data, f40736i));
    }
}
