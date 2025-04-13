package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeTemplate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivSizeTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0004\u0004\u0005\u0006\u0007\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m31884d2 = {"Lcom/yandex/div2/DivSizeTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivSize;", "Companion", "Fixed", "MatchParent", "WrapContent", "Lcom/yandex/div2/DivSizeTemplate$Fixed;", "Lcom/yandex/div2/DivSizeTemplate$MatchParent;", "Lcom/yandex/div2/DivSizeTemplate$WrapContent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivSizeTemplate implements JSONSerializable, JsonTemplate<DivSize> {

    /* renamed from: a */
    @NotNull
    public static final Companion f38839a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivSizeTemplate> f38840b = new Function2<ParsingEnvironment, JSONObject, DivSizeTemplate>() { // from class: com.yandex.div2.DivSizeTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivSizeTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            DivSizeTemplate fixed;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivSizeTemplate.Companion companion = DivSizeTemplate.f38839a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            JsonTemplate<?> jsonTemplate = env.mo17207b().get(str);
            DivSizeTemplate divSizeTemplate = jsonTemplate instanceof DivSizeTemplate ? (DivSizeTemplate) jsonTemplate : null;
            if (divSizeTemplate != null) {
                if (divSizeTemplate instanceof DivSizeTemplate.Fixed) {
                    str = "fixed";
                } else if (divSizeTemplate instanceof DivSizeTemplate.MatchParent) {
                    str = "match_parent";
                } else {
                    if (!(divSizeTemplate instanceof DivSizeTemplate.WrapContent)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "wrap_content";
                }
            }
            int hashCode = str.hashCode();
            if (hashCode == 97445748) {
                if (str.equals("fixed")) {
                    fixed = new DivSizeTemplate.Fixed(new DivFixedSizeTemplate(env, (DivFixedSizeTemplate) (divSizeTemplate != null ? divSizeTemplate.m17699c() : null), false, it));
                    return fixed;
                }
                throw ParsingExceptionKt.m17528m(it, "type", str);
            }
            if (hashCode == 343327108) {
                if (str.equals("wrap_content")) {
                    fixed = new DivSizeTemplate.WrapContent(new DivWrapContentSizeTemplate(env, (DivWrapContentSizeTemplate) (divSizeTemplate != null ? divSizeTemplate.m17699c() : null), false, it));
                    return fixed;
                }
                throw ParsingExceptionKt.m17528m(it, "type", str);
            }
            if (hashCode == 1386124388 && str.equals("match_parent")) {
                fixed = new DivSizeTemplate.MatchParent(new DivMatchParentSizeTemplate(env, (DivMatchParentSizeTemplate) (divSizeTemplate != null ? divSizeTemplate.m17699c() : null), false, it));
                return fixed;
            }
            throw ParsingExceptionKt.m17528m(it, "type", str);
        }
    };

    /* compiled from: DivSizeTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivSizeTemplate$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivSizeTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivSizeTemplate$Fixed;", "Lcom/yandex/div2/DivSizeTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Fixed extends DivSizeTemplate {

        /* renamed from: c */
        @NotNull
        public final DivFixedSizeTemplate f38842c;

        public Fixed(@NotNull DivFixedSizeTemplate divFixedSizeTemplate) {
            super(null);
            this.f38842c = divFixedSizeTemplate;
        }
    }

    /* compiled from: DivSizeTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivSizeTemplate$MatchParent;", "Lcom/yandex/div2/DivSizeTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class MatchParent extends DivSizeTemplate {

        /* renamed from: c */
        @NotNull
        public final DivMatchParentSizeTemplate f38843c;

        public MatchParent(@NotNull DivMatchParentSizeTemplate divMatchParentSizeTemplate) {
            super(null);
            this.f38843c = divMatchParentSizeTemplate;
        }
    }

    /* compiled from: DivSizeTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivSizeTemplate$WrapContent;", "Lcom/yandex/div2/DivSizeTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class WrapContent extends DivSizeTemplate {

        /* renamed from: c */
        @NotNull
        public final DivWrapContentSizeTemplate f38844c;

        public WrapContent(@NotNull DivWrapContentSizeTemplate divWrapContentSizeTemplate) {
            super(null);
            this.f38844c = divWrapContentSizeTemplate;
        }
    }

    public DivSizeTemplate() {
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivSize mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        if (this instanceof Fixed) {
            return new DivSize.Fixed(((Fixed) this).f38842c.mo17514a(env, data));
        }
        if (this instanceof MatchParent) {
            return new DivSize.MatchParent(((MatchParent) this).f38843c.mo17514a(env, data));
        }
        if (this instanceof WrapContent) {
            return new DivSize.WrapContent(((WrapContent) this).f38844c.mo17514a(env, data));
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* renamed from: c */
    public Object m17699c() {
        if (this instanceof Fixed) {
            return ((Fixed) this).f38842c;
        }
        if (this instanceof MatchParent) {
            return ((MatchParent) this).f38843c;
        }
        if (this instanceof WrapContent) {
            return ((WrapContent) this).f38844c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public DivSizeTemplate(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
