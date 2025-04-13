package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivVariable;
import com.yandex.div2.DivVariableTemplate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivVariableTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\b\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, m31884d2 = {"Lcom/yandex/div2/DivVariableTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivVariable;", "Bool", "Color", "Companion", "Dict", "Integer", "Number", "Str", "Url", "Lcom/yandex/div2/DivVariableTemplate$Str;", "Lcom/yandex/div2/DivVariableTemplate$Number;", "Lcom/yandex/div2/DivVariableTemplate$Integer;", "Lcom/yandex/div2/DivVariableTemplate$Bool;", "Lcom/yandex/div2/DivVariableTemplate$Color;", "Lcom/yandex/div2/DivVariableTemplate$Url;", "Lcom/yandex/div2/DivVariableTemplate$Dict;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivVariableTemplate implements JSONSerializable, JsonTemplate<DivVariable> {

    /* renamed from: a */
    @NotNull
    public static final Companion f40634a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivVariableTemplate> f40635b = new Function2<ParsingEnvironment, JSONObject, DivVariableTemplate>() { // from class: com.yandex.div2.DivVariableTemplate$Companion$CREATOR$1
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
         */
        @Override // kotlin.jvm.functions.Function2
        public DivVariableTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            DivVariableTemplate number;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivVariableTemplate.Companion companion = DivVariableTemplate.f40634a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            JsonTemplate<?> jsonTemplate = env.mo17207b().get(str);
            DivVariableTemplate divVariableTemplate = jsonTemplate instanceof DivVariableTemplate ? (DivVariableTemplate) jsonTemplate : null;
            if (divVariableTemplate != null) {
                if (divVariableTemplate instanceof DivVariableTemplate.Str) {
                    str = "string";
                } else if (divVariableTemplate instanceof DivVariableTemplate.Number) {
                    str = "number";
                } else if (divVariableTemplate instanceof DivVariableTemplate.Integer) {
                    str = "integer";
                } else if (divVariableTemplate instanceof DivVariableTemplate.Bool) {
                    str = "boolean";
                } else if (divVariableTemplate instanceof DivVariableTemplate.Color) {
                    str = "color";
                } else if (divVariableTemplate instanceof DivVariableTemplate.Url) {
                    str = "url";
                } else {
                    if (!(divVariableTemplate instanceof DivVariableTemplate.Dict)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "dict";
                }
            }
            switch (str.hashCode()) {
                case -1034364087:
                    if (str.equals("number")) {
                        number = new DivVariableTemplate.Number(new NumberVariableTemplate(env, (NumberVariableTemplate) (divVariableTemplate != null ? divVariableTemplate.m17725c() : null), false, it));
                        return number;
                    }
                    break;
                case -891985903:
                    if (str.equals("string")) {
                        number = new DivVariableTemplate.Str(new StrVariableTemplate(env, (StrVariableTemplate) (divVariableTemplate != null ? divVariableTemplate.m17725c() : null), false, it));
                        return number;
                    }
                    break;
                case 116079:
                    if (str.equals("url")) {
                        number = new DivVariableTemplate.Url(new UrlVariableTemplate(env, (UrlVariableTemplate) (divVariableTemplate != null ? divVariableTemplate.m17725c() : null), false, it));
                        return number;
                    }
                    break;
                case 3083190:
                    if (str.equals("dict")) {
                        number = new DivVariableTemplate.Dict(new DictVariableTemplate(env, (DictVariableTemplate) (divVariableTemplate != null ? divVariableTemplate.m17725c() : null), false, it));
                        return number;
                    }
                    break;
                case 64711720:
                    if (str.equals("boolean")) {
                        number = new DivVariableTemplate.Bool(new BoolVariableTemplate(env, (BoolVariableTemplate) (divVariableTemplate != null ? divVariableTemplate.m17725c() : null), false, it));
                        return number;
                    }
                    break;
                case 94842723:
                    if (str.equals("color")) {
                        number = new DivVariableTemplate.Color(new ColorVariableTemplate(env, (ColorVariableTemplate) (divVariableTemplate != null ? divVariableTemplate.m17725c() : null), false, it));
                        return number;
                    }
                    break;
                case 1958052158:
                    if (str.equals("integer")) {
                        number = new DivVariableTemplate.Integer(new IntegerVariableTemplate(env, (IntegerVariableTemplate) (divVariableTemplate != null ? divVariableTemplate.m17725c() : null), false, it));
                        return number;
                    }
                    break;
            }
            throw ParsingExceptionKt.m17528m(it, "type", str);
        }
    };

    /* compiled from: DivVariableTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivVariableTemplate$Bool;", "Lcom/yandex/div2/DivVariableTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Bool extends DivVariableTemplate {

        /* renamed from: c */
        @NotNull
        public final BoolVariableTemplate f40636c;

        public Bool(@NotNull BoolVariableTemplate boolVariableTemplate) {
            super(null);
            this.f40636c = boolVariableTemplate;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivVariableTemplate$Color;", "Lcom/yandex/div2/DivVariableTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Color extends DivVariableTemplate {

        /* renamed from: c */
        @NotNull
        public final ColorVariableTemplate f40637c;

        public Color(@NotNull ColorVariableTemplate colorVariableTemplate) {
            super(null);
            this.f40637c = colorVariableTemplate;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivVariableTemplate$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivVariableTemplate$Dict;", "Lcom/yandex/div2/DivVariableTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Dict extends DivVariableTemplate {

        /* renamed from: c */
        @NotNull
        public final DictVariableTemplate f40639c;

        public Dict(@NotNull DictVariableTemplate dictVariableTemplate) {
            super(null);
            this.f40639c = dictVariableTemplate;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivVariableTemplate$Integer;", "Lcom/yandex/div2/DivVariableTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Integer extends DivVariableTemplate {

        /* renamed from: c */
        @NotNull
        public final IntegerVariableTemplate f40640c;

        public Integer(@NotNull IntegerVariableTemplate integerVariableTemplate) {
            super(null);
            this.f40640c = integerVariableTemplate;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivVariableTemplate$Number;", "Lcom/yandex/div2/DivVariableTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Number extends DivVariableTemplate {

        /* renamed from: c */
        @NotNull
        public final NumberVariableTemplate f40641c;

        public Number(@NotNull NumberVariableTemplate numberVariableTemplate) {
            super(null);
            this.f40641c = numberVariableTemplate;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivVariableTemplate$Str;", "Lcom/yandex/div2/DivVariableTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Str extends DivVariableTemplate {

        /* renamed from: c */
        @NotNull
        public final StrVariableTemplate f40642c;

        public Str(@NotNull StrVariableTemplate strVariableTemplate) {
            super(null);
            this.f40642c = strVariableTemplate;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivVariableTemplate$Url;", "Lcom/yandex/div2/DivVariableTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Url extends DivVariableTemplate {

        /* renamed from: c */
        @NotNull
        public final UrlVariableTemplate f40643c;

        public Url(@NotNull UrlVariableTemplate urlVariableTemplate) {
            super(null);
            this.f40643c = urlVariableTemplate;
        }
    }

    public DivVariableTemplate() {
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivVariable mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        if (this instanceof Str) {
            return new DivVariable.Str(((Str) this).f40642c.mo17514a(env, data));
        }
        if (this instanceof Number) {
            return new DivVariable.Number(((Number) this).f40641c.mo17514a(env, data));
        }
        if (this instanceof Integer) {
            return new DivVariable.Integer(((Integer) this).f40640c.mo17514a(env, data));
        }
        if (this instanceof Bool) {
            return new DivVariable.Bool(((Bool) this).f40636c.mo17514a(env, data));
        }
        if (this instanceof Color) {
            return new DivVariable.Color(((Color) this).f40637c.mo17514a(env, data));
        }
        if (this instanceof Url) {
            return new DivVariable.Url(((Url) this).f40643c.mo17514a(env, data));
        }
        if (this instanceof Dict) {
            return new DivVariable.Dict(((Dict) this).f40639c.mo17514a(env, data));
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* renamed from: c */
    public Object m17725c() {
        if (this instanceof Str) {
            return ((Str) this).f40642c;
        }
        if (this instanceof Number) {
            return ((Number) this).f40641c;
        }
        if (this instanceof Integer) {
            return ((Integer) this).f40640c;
        }
        if (this instanceof Bool) {
            return ((Bool) this).f40636c;
        }
        if (this instanceof Color) {
            return ((Color) this).f40637c;
        }
        if (this instanceof Url) {
            return ((Url) this).f40643c;
        }
        if (this instanceof Dict) {
            return ((Dict) this).f40639c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public DivVariableTemplate(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
