package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivActionTemplate;
import com.yandex.div2.DivDownloadCallbacks;
import com.yandex.div2.DivDownloadCallbacksTemplate;
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

/* compiled from: DivActionTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivActionTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivAction;", "Companion", "MenuItemTemplate", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivActionTemplate implements JSONSerializable, JsonTemplate<DivAction> {

    /* renamed from: i */
    @NotNull
    public static final Companion f34572i = new Companion(null);

    /* renamed from: j */
    @NotNull
    public static final TypeHelper<DivAction.Target> f34573j;

    /* renamed from: k */
    @NotNull
    public static final ValueValidator<String> f34574k;

    /* renamed from: l */
    @NotNull
    public static final ValueValidator<String> f34575l;

    /* renamed from: m */
    @NotNull
    public static final ListValidator<DivAction.MenuItem> f34576m;

    /* renamed from: n */
    @NotNull
    public static final ListValidator<MenuItemTemplate> f34577n;

    /* renamed from: o */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivDownloadCallbacks> f34578o;

    /* renamed from: p */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f34579p;

    /* renamed from: q */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>> f34580q;

    /* renamed from: r */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction.MenuItem>> f34581r;

    /* renamed from: s */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, JSONObject> f34582s;

    /* renamed from: t */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>> f34583t;

    /* renamed from: u */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAction.Target>> f34584u;

    /* renamed from: v */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>> f34585v;

    /* renamed from: w */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivActionTemplate> f34586w;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivDownloadCallbacksTemplate> f34587a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<String> f34588b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<Uri>> f34589c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<List<MenuItemTemplate>> f34590d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<JSONObject> f34591e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<Expression<Uri>> f34592f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Field<Expression<DivAction.Target>> f34593g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public final Field<Expression<Uri>> f34594h;

    /* compiled from: DivActionTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31884d2 = {"Lcom/yandex/div2/DivActionTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "LOG_ID_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "LOG_ID_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivActionTemplate$MenuItemTemplate;", "MENU_ITEMS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction$MenuItem;", "MENU_ITEMS_VALIDATOR", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAction$Target;", "TYPE_HELPER_TARGET", "Lcom/yandex/div/internal/parser/TypeHelper;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivActionTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivActionTemplate$MenuItemTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivAction$MenuItem;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class MenuItemTemplate implements JSONSerializable, JsonTemplate<DivAction.MenuItem> {

        /* renamed from: d */
        @NotNull
        public static final Companion f34605d = new Companion(null);

        /* renamed from: e */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, DivAction> f34606e = new Function3<String, JSONObject, ParsingEnvironment, DivAction>() { // from class: com.yandex.div2.DivActionTemplate$MenuItemTemplate$Companion$ACTION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAction mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion = DivAction.f34546g;
                return (DivAction) JsonParser.m17322n(jSONObject2, str2, DivAction.f34550k, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };

        /* renamed from: f */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f34607f = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivActionTemplate$MenuItemTemplate$Companion$ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion = DivAction.f34546g;
                Function2<ParsingEnvironment, JSONObject, DivAction> function2 = DivAction.f34550k;
                DivActionTemplate.MenuItemTemplate.Companion companion2 = DivActionTemplate.MenuItemTemplate.f34605d;
                return JsonParser.m17333y(jSONObject2, str2, function2, C3037c.f41161f, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };

        /* renamed from: g */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f34608g = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivActionTemplate$MenuItemTemplate$Companion$TEXT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivActionTemplate.MenuItemTemplate.Companion companion = DivActionTemplate.MenuItemTemplate.f34605d;
                return JsonParser.m17314f(jSONObject2, str2, C3035b.f41118q, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33850c);
            }
        };

        /* renamed from: h */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, MenuItemTemplate> f34609h = new Function2<ParsingEnvironment, JSONObject, MenuItemTemplate>() { // from class: com.yandex.div2.DivActionTemplate$MenuItemTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivActionTemplate.MenuItemTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivActionTemplate.MenuItemTemplate(env, null, false, it, 6);
            }
        };

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Field<DivActionTemplate> f34610a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Field<List<DivActionTemplate>> f34611b;

        /* renamed from: c */
        @JvmField
        @NotNull
        public final Field<Expression<String>> f34612c;

        /* compiled from: DivActionTemplate.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, m31884d2 = {"Lcom/yandex/div2/DivActionTemplate$MenuItemTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivActionTemplate;", "ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "TEXT_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "TEXT_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        public MenuItemTemplate(ParsingEnvironment parsingEnvironment, MenuItemTemplate menuItemTemplate, boolean z, JSONObject jSONObject, int i2) {
            z = (i2 & 4) != 0 ? false : z;
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            Companion companion = DivActionTemplate.f34572i;
            Function2<ParsingEnvironment, JSONObject, DivActionTemplate> function2 = DivActionTemplate.f34586w;
            this.f34610a = JsonTemplateParser.m17354o(jSONObject, "action", z, null, function2, f34328a, parsingEnvironment);
            this.f34611b = JsonTemplateParser.m17360u(jSONObject, "actions", z, null, function2, C3037c.f41162g, f34328a, parsingEnvironment);
            this.f34612c = JsonTemplateParser.m17346g(jSONObject, "text", z, null, C3035b.f41117p, f34328a, parsingEnvironment, TypeHelpersKt.f33850c);
        }

        @Override // com.yandex.div.json.JsonTemplate
        /* renamed from: a */
        public DivAction.MenuItem mo17514a(ParsingEnvironment env, JSONObject data) {
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(data, "data");
            return new DivAction.MenuItem((DivAction) FieldKt.m17381g(this.f34610a, env, "action", data, f34606e), FieldKt.m17382h(this.f34611b, env, "actions", data, C3037c.f41161f, f34607f), (Expression) FieldKt.m17376b(this.f34612c, env, "text", data, f34608g));
        }
    }

    static {
        int i2 = TypeHelper.f33843a;
        f34573j = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivAction.Target.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivActionTemplate$Companion$TYPE_HELPER_TARGET$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAction.Target);
            }
        });
        f34574k = C3035b.f41115n;
        f34575l = C3035b.f41116o;
        f34576m = C3037c.f41159d;
        f34577n = C3037c.f41160e;
        f34578o = new Function3<String, JSONObject, ParsingEnvironment, DivDownloadCallbacks>() { // from class: com.yandex.div2.DivActionTemplate$Companion$DOWNLOAD_CALLBACKS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivDownloadCallbacks mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivDownloadCallbacks.Companion companion = DivDownloadCallbacks.f35585c;
                return (DivDownloadCallbacks) JsonParser.m17322n(jSONObject2, str2, DivDownloadCallbacks.f35586d, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f34579p = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivActionTemplate$Companion$LOG_ID_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17311c(jSONObject2, str2, DivActionTemplate.f34575l, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f34580q = new Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>>() { // from class: com.yandex.div2.DivActionTemplate$Companion$LOG_URL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Uri> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17329u(jSONObject2, str2, ParsingConvertersKt.f33828b, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33852e);
            }
        };
        f34581r = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction.MenuItem>>() { // from class: com.yandex.div2.DivActionTemplate$Companion$MENU_ITEMS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction.MenuItem> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.MenuItem.Companion companion = DivAction.MenuItem.f34559d;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.MenuItem.f34560e, DivActionTemplate.f34576m, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f34582s = new Function3<String, JSONObject, ParsingEnvironment, JSONObject>() { // from class: com.yandex.div2.DivActionTemplate$Companion$PAYLOAD_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public JSONObject mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                Object m17742d = C3033a.m17742d(str2, "key", jSONObject2, "json", parsingEnvironment, "env", jSONObject2, str2);
                if (m17742d == null) {
                    m17742d = null;
                }
                return (JSONObject) m17742d;
            }
        };
        f34583t = new Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>>() { // from class: com.yandex.div2.DivActionTemplate$Companion$REFERER_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Uri> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17329u(jSONObject2, str2, ParsingConvertersKt.f33828b, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33852e);
            }
        };
        f34584u = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAction.Target>>() { // from class: com.yandex.div2.DivActionTemplate$Companion$TARGET_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAction.Target> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Target.Converter converter = DivAction.Target.f34565c;
                return JsonParser.m17329u(jSONObject2, str2, DivAction.Target.f34566d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivActionTemplate.f34573j);
            }
        };
        f34585v = new Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>>() { // from class: com.yandex.div2.DivActionTemplate$Companion$URL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Uri> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17329u(jSONObject2, str2, ParsingConvertersKt.f33828b, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33852e);
            }
        };
        f34586w = new Function2<ParsingEnvironment, JSONObject, DivActionTemplate>() { // from class: com.yandex.div2.DivActionTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivActionTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivActionTemplate(env, null, false, it, 6);
            }
        };
    }

    public DivActionTemplate(ParsingEnvironment parsingEnvironment, DivActionTemplate divActionTemplate, boolean z, JSONObject jSONObject, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
        DivDownloadCallbacksTemplate.Companion companion = DivDownloadCallbacksTemplate.f35590c;
        this.f34587a = JsonTemplateParser.m17354o(jSONObject, "download_callbacks", z, null, DivDownloadCallbacksTemplate.f35593f, f34328a, parsingEnvironment);
        this.f34588b = JsonTemplateParser.m17341b(jSONObject, "log_id", z, null, f34574k, f34328a, parsingEnvironment);
        Function1<String, Uri> function1 = ParsingConvertersKt.f33828b;
        TypeHelper<Uri> typeHelper = TypeHelpersKt.f33852e;
        this.f34589c = JsonTemplateParser.m17358s(jSONObject, "log_url", z, null, function1, f34328a, parsingEnvironment, typeHelper);
        MenuItemTemplate.Companion companion2 = MenuItemTemplate.f34605d;
        this.f34590d = JsonTemplateParser.m17360u(jSONObject, "menu_items", z, null, MenuItemTemplate.f34609h, f34577n, f34328a, parsingEnvironment);
        this.f34591e = JsonTemplateParser.m17352m(jSONObject, "payload", z, null, f34328a, parsingEnvironment);
        this.f34592f = JsonTemplateParser.m17358s(jSONObject, "referer", z, null, function1, f34328a, parsingEnvironment, typeHelper);
        DivAction.Target.Converter converter = DivAction.Target.f34565c;
        this.f34593g = JsonTemplateParser.m17358s(jSONObject, "target", z, null, DivAction.Target.f34566d, f34328a, parsingEnvironment, f34573j);
        this.f34594h = JsonTemplateParser.m17358s(jSONObject, "url", z, null, function1, f34328a, parsingEnvironment, typeHelper);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivAction mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        return new DivAction((DivDownloadCallbacks) FieldKt.m17381g(this.f34587a, env, "download_callbacks", data, f34578o), (String) FieldKt.m17376b(this.f34588b, env, "log_id", data, f34579p), (Expression) FieldKt.m17378d(this.f34589c, env, "log_url", data, f34580q), FieldKt.m17382h(this.f34590d, env, "menu_items", data, f34576m, f34581r), (JSONObject) FieldKt.m17378d(this.f34591e, env, "payload", data, f34582s), (Expression) FieldKt.m17378d(this.f34592f, env, "referer", data, f34583t), (Expression) FieldKt.m17378d(this.f34593g, env, "target", data, f34584u), (Expression) FieldKt.m17378d(this.f34594h, env, "url", data, f34585v));
    }
}
