package moxy.compiler.viewstate.entity;

import javax.lang.model.element.TypeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: StrategyWithTag.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m31884d2 = {"Lmoxy/compiler/viewstate/entity/StrategyWithTag;", "", "strategyClass", "Ljavax/lang/model/element/TypeElement;", "tag", "", "(Ljavax/lang/model/element/TypeElement;Ljava/lang/String;)V", "getStrategyClass", "()Ljavax/lang/model/element/TypeElement;", "getTag", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "moxy-compiler"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final /* data */ class StrategyWithTag {

    @NotNull
    private final TypeElement strategyClass;

    @NotNull
    private final String tag;

    public StrategyWithTag(@NotNull TypeElement strategyClass, @NotNull String tag) {
        Intrinsics.m32179h(strategyClass, "strategyClass");
        Intrinsics.m32179h(tag, "tag");
        this.strategyClass = strategyClass;
        this.tag = tag;
    }

    public static /* synthetic */ StrategyWithTag copy$default(StrategyWithTag strategyWithTag, TypeElement typeElement, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            typeElement = strategyWithTag.strategyClass;
        }
        if ((i2 & 2) != 0) {
            str = strategyWithTag.tag;
        }
        return strategyWithTag.copy(typeElement, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TypeElement getStrategyClass() {
        return this.strategyClass;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final StrategyWithTag copy(@NotNull TypeElement strategyClass, @NotNull String tag) {
        Intrinsics.m32179h(strategyClass, "strategyClass");
        Intrinsics.m32179h(tag, "tag");
        return new StrategyWithTag(strategyClass, tag);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrategyWithTag)) {
            return false;
        }
        StrategyWithTag strategyWithTag = (StrategyWithTag) other;
        return Intrinsics.m32174c(this.strategyClass, strategyWithTag.strategyClass) && Intrinsics.m32174c(this.tag, strategyWithTag.tag);
    }

    @NotNull
    public final TypeElement getStrategyClass() {
        return this.strategyClass;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        TypeElement typeElement = this.strategyClass;
        int hashCode = (typeElement != null ? typeElement.hashCode() : 0) * 31;
        String str = this.tag;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("StrategyWithTag(strategyClass=");
        m24u.append(this.strategyClass);
        m24u.append(", tag=");
        return C0000a.m20q(m24u, this.tag, ")");
    }
}
