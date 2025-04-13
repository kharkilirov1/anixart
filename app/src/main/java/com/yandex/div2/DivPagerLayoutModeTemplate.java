package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivPagerLayoutMode;
import com.yandex.div2.DivPagerLayoutModeTemplate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivPagerLayoutModeTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0004\u0005\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div2/DivPagerLayoutModeTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivPagerLayoutMode;", "Companion", "NeighbourPageSize", "PageSize", "Lcom/yandex/div2/DivPagerLayoutModeTemplate$PageSize;", "Lcom/yandex/div2/DivPagerLayoutModeTemplate$NeighbourPageSize;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivPagerLayoutModeTemplate implements JSONSerializable, JsonTemplate<DivPagerLayoutMode> {

    /* renamed from: a */
    @NotNull
    public static final Companion f37828a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivPagerLayoutModeTemplate> f37829b = new Function2<ParsingEnvironment, JSONObject, DivPagerLayoutModeTemplate>() { // from class: com.yandex.div2.DivPagerLayoutModeTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivPagerLayoutModeTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            DivPagerLayoutModeTemplate neighbourPageSize;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivPagerLayoutModeTemplate.Companion companion = DivPagerLayoutModeTemplate.f37828a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            JsonTemplate<?> jsonTemplate = env.mo17207b().get(str);
            DivPagerLayoutModeTemplate divPagerLayoutModeTemplate = jsonTemplate instanceof DivPagerLayoutModeTemplate ? (DivPagerLayoutModeTemplate) jsonTemplate : null;
            if (divPagerLayoutModeTemplate != null) {
                if (divPagerLayoutModeTemplate instanceof DivPagerLayoutModeTemplate.PageSize) {
                    str = "percentage";
                } else {
                    if (!(divPagerLayoutModeTemplate instanceof DivPagerLayoutModeTemplate.NeighbourPageSize)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "fixed";
                }
            }
            if (Intrinsics.m32174c(str, "percentage")) {
                neighbourPageSize = new DivPagerLayoutModeTemplate.PageSize(new DivPageSizeTemplate(env, (DivPageSizeTemplate) (divPagerLayoutModeTemplate != null ? divPagerLayoutModeTemplate.m17663c() : null), false, it));
            } else {
                if (!Intrinsics.m32174c(str, "fixed")) {
                    throw ParsingExceptionKt.m17528m(it, "type", str);
                }
                neighbourPageSize = new DivPagerLayoutModeTemplate.NeighbourPageSize(new DivNeighbourPageSizeTemplate(env, (DivNeighbourPageSizeTemplate) (divPagerLayoutModeTemplate != null ? divPagerLayoutModeTemplate.m17663c() : null), false, it));
            }
            return neighbourPageSize;
        }
    };

    /* compiled from: DivPagerLayoutModeTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivPagerLayoutModeTemplate$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivPagerLayoutModeTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivPagerLayoutModeTemplate$NeighbourPageSize;", "Lcom/yandex/div2/DivPagerLayoutModeTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class NeighbourPageSize extends DivPagerLayoutModeTemplate {

        /* renamed from: c */
        @NotNull
        public final DivNeighbourPageSizeTemplate f37831c;

        public NeighbourPageSize(@NotNull DivNeighbourPageSizeTemplate divNeighbourPageSizeTemplate) {
            super(null);
            this.f37831c = divNeighbourPageSizeTemplate;
        }
    }

    /* compiled from: DivPagerLayoutModeTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivPagerLayoutModeTemplate$PageSize;", "Lcom/yandex/div2/DivPagerLayoutModeTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class PageSize extends DivPagerLayoutModeTemplate {

        /* renamed from: c */
        @NotNull
        public final DivPageSizeTemplate f37832c;

        public PageSize(@NotNull DivPageSizeTemplate divPageSizeTemplate) {
            super(null);
            this.f37832c = divPageSizeTemplate;
        }
    }

    public DivPagerLayoutModeTemplate() {
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivPagerLayoutMode mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        if (this instanceof PageSize) {
            return new DivPagerLayoutMode.PageSize(((PageSize) this).f37832c.mo17514a(env, data));
        }
        if (this instanceof NeighbourPageSize) {
            return new DivPagerLayoutMode.NeighbourPageSize(((NeighbourPageSize) this).f37831c.mo17514a(env, data));
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* renamed from: c */
    public Object m17663c() {
        if (this instanceof PageSize) {
            return ((PageSize) this).f37832c;
        }
        if (this instanceof NeighbourPageSize) {
            return ((NeighbourPageSize) this).f37831c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public DivPagerLayoutModeTemplate(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
