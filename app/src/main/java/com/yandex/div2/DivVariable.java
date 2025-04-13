package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivVariable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivVariable.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, m31884d2 = {"Lcom/yandex/div2/DivVariable;", "Lcom/yandex/div/json/JSONSerializable;", "Bool", "Color", "Companion", "Dict", "Integer", "Number", "Str", "Url", "Lcom/yandex/div2/DivVariable$Str;", "Lcom/yandex/div2/DivVariable$Number;", "Lcom/yandex/div2/DivVariable$Integer;", "Lcom/yandex/div2/DivVariable$Bool;", "Lcom/yandex/div2/DivVariable$Color;", "Lcom/yandex/div2/DivVariable$Url;", "Lcom/yandex/div2/DivVariable$Dict;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivVariable implements JSONSerializable {

    /* renamed from: a */
    @NotNull
    public static final Companion f40624a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivVariable> f40625b = new Function2<ParsingEnvironment, JSONObject, DivVariable>() { // from class: com.yandex.div2.DivVariable$Companion$CREATOR$1
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
        public DivVariable invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivVariable.Companion companion = DivVariable.f40624a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            switch (str.hashCode()) {
                case -1034364087:
                    if (str.equals("number")) {
                        return new DivVariable.Number(NumberVariable.f41045c.m17733a(env, it));
                    }
                    break;
                case -891985903:
                    if (str.equals("string")) {
                        return new DivVariable.Str(StrVariable.f41057c.m17735a(env, it));
                    }
                    break;
                case 116079:
                    if (str.equals("url")) {
                        return new DivVariable.Url(UrlVariable.f41069c.m17737a(env, it));
                    }
                    break;
                case 3083190:
                    if (str.equals("dict")) {
                        return new DivVariable.Dict(DictVariable.f34406c.m17555a(env, it));
                    }
                    break;
                case 64711720:
                    if (str.equals("boolean")) {
                        return new DivVariable.Bool(BoolVariable.f34382c.m17551a(env, it));
                    }
                    break;
                case 94842723:
                    if (str.equals("color")) {
                        return new DivVariable.Color(ColorVariable.f34394c.m17553a(env, it));
                    }
                    break;
                case 1958052158:
                    if (str.equals("integer")) {
                        return new DivVariable.Integer(IntegerVariable.f41033c.m17731a(env, it));
                    }
                    break;
            }
            JsonTemplate<?> mo17515a = env.mo17207b().mo17515a(str, it);
            DivVariableTemplate divVariableTemplate = mo17515a instanceof DivVariableTemplate ? (DivVariableTemplate) mo17515a : null;
            if (divVariableTemplate != null) {
                return divVariableTemplate.m17724b(env, it);
            }
            throw ParsingExceptionKt.m17528m(it, "type", str);
        }
    };

    /* compiled from: DivVariable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivVariable$Bool;", "Lcom/yandex/div2/DivVariable;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Bool extends DivVariable {

        /* renamed from: c */
        @NotNull
        public final BoolVariable f40626c;

        public Bool(@NotNull BoolVariable boolVariable) {
            super(null);
            this.f40626c = boolVariable;
        }
    }

    /* compiled from: DivVariable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivVariable$Color;", "Lcom/yandex/div2/DivVariable;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Color extends DivVariable {

        /* renamed from: c */
        @NotNull
        public final ColorVariable f40627c;

        public Color(@NotNull ColorVariable colorVariable) {
            super(null);
            this.f40627c = colorVariable;
        }
    }

    /* compiled from: DivVariable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivVariable$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivVariable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivVariable$Dict;", "Lcom/yandex/div2/DivVariable;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Dict extends DivVariable {

        /* renamed from: c */
        @NotNull
        public final DictVariable f40629c;

        public Dict(@NotNull DictVariable dictVariable) {
            super(null);
            this.f40629c = dictVariable;
        }
    }

    /* compiled from: DivVariable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivVariable$Integer;", "Lcom/yandex/div2/DivVariable;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Integer extends DivVariable {

        /* renamed from: c */
        @NotNull
        public final IntegerVariable f40630c;

        public Integer(@NotNull IntegerVariable integerVariable) {
            super(null);
            this.f40630c = integerVariable;
        }
    }

    /* compiled from: DivVariable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivVariable$Number;", "Lcom/yandex/div2/DivVariable;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Number extends DivVariable {

        /* renamed from: c */
        @NotNull
        public final NumberVariable f40631c;

        public Number(@NotNull NumberVariable numberVariable) {
            super(null);
            this.f40631c = numberVariable;
        }
    }

    /* compiled from: DivVariable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivVariable$Str;", "Lcom/yandex/div2/DivVariable;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Str extends DivVariable {

        /* renamed from: c */
        @NotNull
        public final StrVariable f40632c;

        public Str(@NotNull StrVariable strVariable) {
            super(null);
            this.f40632c = strVariable;
        }
    }

    /* compiled from: DivVariable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivVariable$Url;", "Lcom/yandex/div2/DivVariable;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Url extends DivVariable {

        /* renamed from: c */
        @NotNull
        public final UrlVariable f40633c;

        public Url(@NotNull UrlVariable urlVariable) {
            super(null);
            this.f40633c = urlVariable;
        }
    }

    public DivVariable() {
    }

    public DivVariable(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
