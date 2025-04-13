package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivSize;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivSize.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div2/DivSize;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "Fixed", "MatchParent", "WrapContent", "Lcom/yandex/div2/DivSize$Fixed;", "Lcom/yandex/div2/DivSize$MatchParent;", "Lcom/yandex/div2/DivSize$WrapContent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivSize implements JSONSerializable {

    /* renamed from: a */
    @NotNull
    public static final Companion f38833a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivSize> f38834b = new Function2<ParsingEnvironment, JSONObject, DivSize>() { // from class: com.yandex.div2.DivSize$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivSize invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivSize.Companion companion = DivSize.f38833a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            int hashCode = str.hashCode();
            if (hashCode != 97445748) {
                if (hashCode != 343327108) {
                    if (hashCode == 1386124388 && str.equals("match_parent")) {
                        return new DivSize.MatchParent(DivMatchParentSize.f37710b.m17653a(env, it));
                    }
                } else if (str.equals("wrap_content")) {
                    return new DivSize.WrapContent(DivWrapContentSize.f40994d.m17729a(env, it));
                }
            } else if (str.equals("fixed")) {
                return new DivSize.Fixed(DivFixedSize.f35789c.m17620a(env, it));
            }
            JsonTemplate<?> mo17515a = env.mo17207b().mo17515a(str, it);
            DivSizeTemplate divSizeTemplate = mo17515a instanceof DivSizeTemplate ? (DivSizeTemplate) mo17515a : null;
            if (divSizeTemplate != null) {
                return divSizeTemplate.m17698b(env, it);
            }
            throw ParsingExceptionKt.m17528m(it, "type", str);
        }
    };

    /* compiled from: DivSize.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivSize$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivSize.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivSize$Fixed;", "Lcom/yandex/div2/DivSize;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Fixed extends DivSize {

        /* renamed from: c */
        @NotNull
        public final DivFixedSize f38836c;

        public Fixed(@NotNull DivFixedSize divFixedSize) {
            super(null);
            this.f38836c = divFixedSize;
        }
    }

    /* compiled from: DivSize.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivSize$MatchParent;", "Lcom/yandex/div2/DivSize;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class MatchParent extends DivSize {

        /* renamed from: c */
        @NotNull
        public final DivMatchParentSize f38837c;

        public MatchParent(@NotNull DivMatchParentSize divMatchParentSize) {
            super(null);
            this.f38837c = divMatchParentSize;
        }
    }

    /* compiled from: DivSize.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivSize$WrapContent;", "Lcom/yandex/div2/DivSize;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class WrapContent extends DivSize {

        /* renamed from: c */
        @NotNull
        public final DivWrapContentSize f38838c;

        public WrapContent(@NotNull DivWrapContentSize divWrapContentSize) {
            super(null);
            this.f38838c = divWrapContentSize;
        }
    }

    public DivSize() {
    }

    @NotNull
    /* renamed from: a */
    public Object m17697a() {
        if (this instanceof Fixed) {
            return ((Fixed) this).f38836c;
        }
        if (this instanceof MatchParent) {
            return ((MatchParent) this).f38837c;
        }
        if (this instanceof WrapContent) {
            return ((WrapContent) this).f38838c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public DivSize(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
