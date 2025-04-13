package com.yandex.div2;

import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivActionTemplate;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivBackgroundTemplate;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivBorderTemplate;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivFocusTemplate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivFocusTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivFocusTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivFocus;", "Companion", "NextFocusIdsTemplate", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivFocusTemplate implements JSONSerializable, JsonTemplate<DivFocus> {

    /* renamed from: f */
    @NotNull
    public static final Companion f35833f = new Companion(null);

    /* renamed from: g */
    @NotNull
    public static final DivBorder f35834g = new DivBorder(null, null, null, null, null, 31);

    /* renamed from: h */
    @NotNull
    public static final ListValidator<DivBackground> f35835h = C3053k.f41593h;

    /* renamed from: i */
    @NotNull
    public static final ListValidator<DivBackgroundTemplate> f35836i = C3053k.f41594i;

    /* renamed from: j */
    @NotNull
    public static final ListValidator<DivAction> f35837j = C3053k.f41595j;

    /* renamed from: k */
    @NotNull
    public static final ListValidator<DivActionTemplate> f35838k = C3053k.f41596k;

    /* renamed from: l */
    @NotNull
    public static final ListValidator<DivAction> f35839l = C3053k.f41597l;

    /* renamed from: m */
    @NotNull
    public static final ListValidator<DivActionTemplate> f35840m = C3053k.f41598m;

    /* renamed from: n */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>> f35841n = new Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>>() { // from class: com.yandex.div2.DivFocusTemplate$Companion$BACKGROUND_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public List<DivBackground> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivBackground.Companion companion = DivBackground.f34750a;
            return JsonParser.m17333y(jSONObject2, str2, DivBackground.f34751b, DivFocusTemplate.f35835h, parsingEnvironment2.getF34328a(), parsingEnvironment2);
        }
    };

    /* renamed from: o */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivBorder> f35842o = new Function3<String, JSONObject, ParsingEnvironment, DivBorder>() { // from class: com.yandex.div2.DivFocusTemplate$Companion$BORDER_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public DivBorder mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivBorder.Companion companion = DivBorder.f34785f;
            DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject2, str2, DivBorder.f34788i, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            return divBorder == null ? DivFocusTemplate.f35834g : divBorder;
        }
    };

    /* renamed from: p */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFocus.NextFocusIds> f35843p = new Function3<String, JSONObject, ParsingEnvironment, DivFocus.NextFocusIds>() { // from class: com.yandex.div2.DivFocusTemplate$Companion$NEXT_FOCUS_IDS_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public DivFocus.NextFocusIds mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivFocus.NextFocusIds.Companion companion = DivFocus.NextFocusIds.f35825f;
            return (DivFocus.NextFocusIds) JsonParser.m17322n(jSONObject2, str2, DivFocus.NextFocusIds.f35826g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
        }
    };

    /* renamed from: q */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f35844q = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivFocusTemplate$Companion$ON_BLUR_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivAction.Companion companion = DivAction.f34546g;
            return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivFocusTemplate.f35837j, parsingEnvironment2.getF34328a(), parsingEnvironment2);
        }
    };

    /* renamed from: r */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f35845r = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivFocusTemplate$Companion$ON_FOCUS_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivAction.Companion companion = DivAction.f34546g;
            return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivFocusTemplate.f35839l, parsingEnvironment2.getF34328a(), parsingEnvironment2);
        }
    };

    /* renamed from: s */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivFocusTemplate> f35846s = new Function2<ParsingEnvironment, JSONObject, DivFocusTemplate>() { // from class: com.yandex.div2.DivFocusTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivFocusTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            return new DivFocusTemplate(env, null, false, it, 6);
        }
    };

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f35847a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<DivBorderTemplate> f35848b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<NextFocusIdsTemplate> f35849c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f35850d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f35851e;

    /* compiled from: DivFocusTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005¨\u0006\u0011"}, m31884d2 = {"Lcom/yandex/div2/DivFocusTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackgroundTemplate;", "BACKGROUND_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "Lcom/yandex/div2/DivActionTemplate;", "ON_BLUR_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivAction;", "ON_BLUR_VALIDATOR", "ON_FOCUS_TEMPLATE_VALIDATOR", "ON_FOCUS_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivFocusTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivFocusTemplate$NextFocusIdsTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivFocus$NextFocusIds;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class NextFocusIdsTemplate implements JSONSerializable, JsonTemplate<DivFocus.NextFocusIds> {

        /* renamed from: f */
        @NotNull
        public static final Companion f35858f = new Companion(null);

        /* renamed from: g */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f35859g = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivFocusTemplate$NextFocusIdsTemplate$Companion$DOWN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivFocusTemplate.NextFocusIdsTemplate.Companion companion = DivFocusTemplate.NextFocusIdsTemplate.f35858f;
                return JsonParser.m17325q(jSONObject2, str2, C3055l.f41635i, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33850c);
            }
        };

        /* renamed from: h */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f35860h = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivFocusTemplate$NextFocusIdsTemplate$Companion$FORWARD_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivFocusTemplate.NextFocusIdsTemplate.Companion companion = DivFocusTemplate.NextFocusIdsTemplate.f35858f;
                return JsonParser.m17325q(jSONObject2, str2, C3055l.f41637k, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33850c);
            }
        };

        /* renamed from: i */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f35861i = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivFocusTemplate$NextFocusIdsTemplate$Companion$LEFT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivFocusTemplate.NextFocusIdsTemplate.Companion companion = DivFocusTemplate.NextFocusIdsTemplate.f35858f;
                return JsonParser.m17325q(jSONObject2, str2, C3055l.f41639m, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33850c);
            }
        };

        /* renamed from: j */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f35862j = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivFocusTemplate$NextFocusIdsTemplate$Companion$RIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivFocusTemplate.NextFocusIdsTemplate.Companion companion = DivFocusTemplate.NextFocusIdsTemplate.f35858f;
                return JsonParser.m17325q(jSONObject2, str2, C3055l.f41641o, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33850c);
            }
        };

        /* renamed from: k */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f35863k = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivFocusTemplate$NextFocusIdsTemplate$Companion$UP_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivFocusTemplate.NextFocusIdsTemplate.Companion companion = DivFocusTemplate.NextFocusIdsTemplate.f35858f;
                return JsonParser.m17325q(jSONObject2, str2, C3055l.f41643q, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33850c);
            }
        };

        /* renamed from: l */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, NextFocusIdsTemplate> f35864l = new Function2<ParsingEnvironment, JSONObject, NextFocusIdsTemplate>() { // from class: com.yandex.div2.DivFocusTemplate$NextFocusIdsTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivFocusTemplate.NextFocusIdsTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivFocusTemplate.NextFocusIdsTemplate(env, null, false, it, 6);
            }
        };

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Field<Expression<String>> f35865a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Field<Expression<String>> f35866b;

        /* renamed from: c */
        @JvmField
        @NotNull
        public final Field<Expression<String>> f35867c;

        /* renamed from: d */
        @JvmField
        @NotNull
        public final Field<Expression<String>> f35868d;

        /* renamed from: e */
        @JvmField
        @NotNull
        public final Field<Expression<String>> f35869e;

        /* compiled from: DivFocusTemplate.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005¨\u0006\u000f"}, m31884d2 = {"Lcom/yandex/div2/DivFocusTemplate$NextFocusIdsTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "DOWN_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "DOWN_VALIDATOR", "FORWARD_TEMPLATE_VALIDATOR", "FORWARD_VALIDATOR", "LEFT_TEMPLATE_VALIDATOR", "LEFT_VALIDATOR", "RIGHT_TEMPLATE_VALIDATOR", "RIGHT_VALIDATOR", "UP_TEMPLATE_VALIDATOR", "UP_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        public NextFocusIdsTemplate(ParsingEnvironment parsingEnvironment, NextFocusIdsTemplate nextFocusIdsTemplate, boolean z, JSONObject jSONObject, int i2) {
            z = (i2 & 4) != 0 ? false : z;
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            C3055l c3055l = C3055l.f41634h;
            TypeHelper<String> typeHelper = TypeHelpersKt.f33850c;
            this.f35865a = JsonTemplateParser.m17355p(jSONObject, "down", z, null, c3055l, f34328a, parsingEnvironment, typeHelper);
            this.f35866b = JsonTemplateParser.m17355p(jSONObject, "forward", z, null, C3055l.f41636j, f34328a, parsingEnvironment, typeHelper);
            this.f35867c = JsonTemplateParser.m17355p(jSONObject, "left", z, null, C3055l.f41638l, f34328a, parsingEnvironment, typeHelper);
            this.f35868d = JsonTemplateParser.m17355p(jSONObject, "right", z, null, C3055l.f41640n, f34328a, parsingEnvironment, typeHelper);
            this.f35869e = JsonTemplateParser.m17355p(jSONObject, "up", z, null, C3055l.f41642p, f34328a, parsingEnvironment, typeHelper);
        }

        @Override // com.yandex.div.json.JsonTemplate
        /* renamed from: a */
        public DivFocus.NextFocusIds mo17514a(ParsingEnvironment env, JSONObject data) {
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(data, "data");
            return new DivFocus.NextFocusIds((Expression) FieldKt.m17378d(this.f35865a, env, "down", data, f35859g), (Expression) FieldKt.m17378d(this.f35866b, env, "forward", data, f35860h), (Expression) FieldKt.m17378d(this.f35867c, env, "left", data, f35861i), (Expression) FieldKt.m17378d(this.f35868d, env, "right", data, f35862j), (Expression) FieldKt.m17378d(this.f35869e, env, "up", data, f35863k));
        }
    }

    public DivFocusTemplate(ParsingEnvironment parsingEnvironment, DivFocusTemplate divFocusTemplate, boolean z, JSONObject jSONObject, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
        DivBackgroundTemplate.Companion companion = DivBackgroundTemplate.f34758a;
        this.f35847a = JsonTemplateParser.m17360u(jSONObject, "background", z, null, DivBackgroundTemplate.f34759b, f35836i, f34328a, parsingEnvironment);
        DivBorderTemplate.Companion companion2 = DivBorderTemplate.f34795f;
        this.f35848b = JsonTemplateParser.m17354o(jSONObject, "border", z, null, DivBorderTemplate.f34804o, f34328a, parsingEnvironment);
        NextFocusIdsTemplate.Companion companion3 = NextFocusIdsTemplate.f35858f;
        this.f35849c = JsonTemplateParser.m17354o(jSONObject, "next_focus_ids", z, null, NextFocusIdsTemplate.f35864l, f34328a, parsingEnvironment);
        DivActionTemplate.Companion companion4 = DivActionTemplate.f34572i;
        Function2<ParsingEnvironment, JSONObject, DivActionTemplate> function2 = DivActionTemplate.f34586w;
        this.f35850d = JsonTemplateParser.m17360u(jSONObject, "on_blur", z, null, function2, f35838k, f34328a, parsingEnvironment);
        this.f35851e = JsonTemplateParser.m17360u(jSONObject, "on_focus", z, null, function2, f35840m, f34328a, parsingEnvironment);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivFocus mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        List m17382h = FieldKt.m17382h(this.f35847a, env, "background", data, f35835h, f35841n);
        DivBorder divBorder = (DivBorder) FieldKt.m17381g(this.f35848b, env, "border", data, f35842o);
        if (divBorder == null) {
            divBorder = f35834g;
        }
        return new DivFocus(m17382h, divBorder, (DivFocus.NextFocusIds) FieldKt.m17381g(this.f35849c, env, "next_focus_ids", data, f35843p), FieldKt.m17382h(this.f35850d, env, "on_blur", data, f35837j, f35844q), FieldKt.m17382h(this.f35851e, env, "on_focus", data, f35839l, f35845r));
    }
}
