package com.yandex.div2;

import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.Div;
import com.yandex.div2.DivPatch;
import com.yandex.div2.DivPatchTemplate;
import com.yandex.div2.DivTemplate;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivPatchTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivPatchTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivPatch;", "ChangeTemplate", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivPatchTemplate implements JSONSerializable, JsonTemplate<DivPatch> {

    /* renamed from: c */
    @NotNull
    public static final Expression<DivPatch.Mode> f37996c = Expression.f34334a.m17539a(DivPatch.Mode.PARTIAL);

    /* renamed from: d */
    @NotNull
    public static final TypeHelper<DivPatch.Mode> f37997d;

    /* renamed from: e */
    @NotNull
    public static final ListValidator<DivPatch.Change> f37998e;

    /* renamed from: f */
    @NotNull
    public static final ListValidator<ChangeTemplate> f37999f;

    /* renamed from: g */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivPatch.Change>> f38000g;

    /* renamed from: h */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivPatch.Mode>> f38001h;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<List<ChangeTemplate>> f38002a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<DivPatch.Mode>> f38003b;

    /* compiled from: DivPatchTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivPatchTemplate$ChangeTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivPatch$Change;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class ChangeTemplate implements JSONSerializable, JsonTemplate<DivPatch.Change> {

        /* renamed from: c */
        @NotNull
        public static final Companion f38004c = new Companion(null);

        /* renamed from: d */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, String> f38005d = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivPatchTemplate$ChangeTemplate$Companion$ID_READER$1
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

        /* renamed from: e */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, List<Div>> f38006e = new Function3<String, JSONObject, ParsingEnvironment, List<Div>>() { // from class: com.yandex.div2.DivPatchTemplate$ChangeTemplate$Companion$ITEMS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<Div> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Div.Companion companion = Div.f34418a;
                Function2<ParsingEnvironment, JSONObject, Div> function2 = Div.f34419b;
                DivPatchTemplate.ChangeTemplate.Companion companion2 = DivPatchTemplate.ChangeTemplate.f38004c;
                return JsonParser.m17333y(jSONObject2, str2, function2, C3077z.f42201c, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };

        /* renamed from: f */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, ChangeTemplate> f38007f = new Function2<ParsingEnvironment, JSONObject, ChangeTemplate>() { // from class: com.yandex.div2.DivPatchTemplate$ChangeTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivPatchTemplate.ChangeTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivPatchTemplate.ChangeTemplate(env, null, false, it, 6);
            }
        };

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Field<String> f38008a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Field<List<DivTemplate>> f38009b;

        /* compiled from: DivPatchTemplate.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005¨\u0006\b"}, m31884d2 = {"Lcom/yandex/div2/DivPatchTemplate$ChangeTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivTemplate;", "ITEMS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/Div;", "ITEMS_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        public ChangeTemplate(ParsingEnvironment parsingEnvironment, ChangeTemplate changeTemplate, boolean z, JSONObject jSONObject, int i2) {
            z = (i2 & 4) != 0 ? false : z;
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            this.f38008a = JsonTemplateParser.m17342c(jSONObject, "id", z, null, f34328a, parsingEnvironment);
            DivTemplate.Companion companion = DivTemplate.f39864a;
            this.f38009b = JsonTemplateParser.m17360u(jSONObject, "items", z, null, DivTemplate.f39865b, C3077z.f42202d, f34328a, parsingEnvironment);
        }

        @Override // com.yandex.div.json.JsonTemplate
        /* renamed from: a */
        public DivPatch.Change mo17514a(ParsingEnvironment env, JSONObject data) {
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(data, "data");
            return new DivPatch.Change((String) FieldKt.m17376b(this.f38008a, env, "id", data, f38005d), FieldKt.m17382h(this.f38009b, env, "items", data, C3077z.f42201c, f38006e));
        }
    }

    /* compiled from: DivPatchTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31884d2 = {"Lcom/yandex/div2/DivPatchTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivPatchTemplate$ChangeTemplate;", "CHANGES_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivPatch$Change;", "CHANGES_VALIDATOR", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div2/DivPatch$Mode;", "MODE_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_MODE", "Lcom/yandex/div/internal/parser/TypeHelper;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        int i2 = TypeHelper.f33843a;
        f37997d = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivPatch.Mode.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivPatchTemplate$Companion$TYPE_HELPER_MODE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivPatch.Mode);
            }
        });
        f37998e = C3075x.f42145E;
        f37999f = C3077z.f42200b;
        f38000g = new Function3<String, JSONObject, ParsingEnvironment, List<DivPatch.Change>>() { // from class: com.yandex.div2.DivPatchTemplate$Companion$CHANGES_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivPatch.Change> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivPatch.Change.Companion companion = DivPatch.Change.f37983b;
                List<DivPatch.Change> m17321m = JsonParser.m17321m(jSONObject2, str2, DivPatch.Change.f37984c, DivPatchTemplate.f37998e, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                Intrinsics.m32178g(m17321m, "readList(json, key, DivP…LIDATOR, env.logger, env)");
                return m17321m;
            }
        };
        f38001h = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivPatch.Mode>>() { // from class: com.yandex.div2.DivPatchTemplate$Companion$MODE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivPatch.Mode> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivPatch.Mode.Converter converter = DivPatch.Mode.f37989c;
                Function1<String, DivPatch.Mode> function1 = DivPatch.Mode.f37990d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivPatch.Mode> expression = DivPatchTemplate.f37996c;
                Expression<DivPatch.Mode> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivPatchTemplate.f37997d);
                return m17330v == null ? expression : m17330v;
            }
        };
        DivPatchTemplate$Companion$CREATOR$1 divPatchTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivPatchTemplate>() { // from class: com.yandex.div2.DivPatchTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivPatchTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivPatchTemplate(env, null, false, it, 6);
            }
        };
    }

    public DivPatchTemplate(ParsingEnvironment parsingEnvironment, DivPatchTemplate divPatchTemplate, boolean z, JSONObject jSONObject, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
        ChangeTemplate.Companion companion = ChangeTemplate.f38004c;
        this.f38002a = JsonTemplateParser.m17350k(jSONObject, "changes", z, null, ChangeTemplate.f38007f, f37999f, f34328a, parsingEnvironment);
        DivPatch.Mode.Converter converter = DivPatch.Mode.f37989c;
        this.f38003b = JsonTemplateParser.m17358s(jSONObject, "mode", z, null, DivPatch.Mode.f37990d, f34328a, parsingEnvironment, f37997d);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivPatch mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        List m17384j = FieldKt.m17384j(this.f38002a, env, "changes", data, f37998e, f38000g);
        Expression<DivPatch.Mode> expression = (Expression) FieldKt.m17378d(this.f38003b, env, "mode", data, f38001h);
        if (expression == null) {
            expression = f37996c;
        }
        return new DivPatch(m17384j, expression);
    }
}
