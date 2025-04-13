package moxy.compiler.viewstate.entity;

import com.squareup.javapoet.ParameterSpec;
import java.util.Iterator;
import java.util.List;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.type.DeclaredType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moxy.compiler.ExtensionsKt;
import moxy.compiler.viewstate.ViewMethodParameters;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: ViewInterfaceMethod.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010 \u001a\u00020\u0003HÂ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\t\u0010*\u001a\u00020\u000bHÖ\u0001J\u0006\u0010+\u001a\u00020,J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\bR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006."}, m31884d2 = {"Lmoxy/compiler/viewstate/entity/ViewInterfaceMethod;", "", "rootInterfaceElement", "Ljavax/lang/model/type/DeclaredType;", "enclosingInterfaceElement", "methodElement", "Ljavax/lang/model/element/ExecutableElement;", "strategy", "Lmoxy/compiler/viewstate/entity/StrategyWithTag;", "(Ljavax/lang/model/type/DeclaredType;Ljavax/lang/model/type/DeclaredType;Ljavax/lang/model/element/ExecutableElement;Lmoxy/compiler/viewstate/entity/StrategyWithTag;)V", "arguments", "", "getEnclosingInterfaceElement", "()Ljavax/lang/model/type/DeclaredType;", "getMethodElement", "()Ljavax/lang/model/element/ExecutableElement;", "name", "parameters", "", "Lcom/squareup/javapoet/ParameterSpec;", "getParameters", "()Ljava/util/List;", "signature", "getSignature", "()Ljava/lang/String;", "getStrategy", "()Lmoxy/compiler/viewstate/entity/StrategyWithTag;", "superInterfaceClash", "getSuperInterfaceClash", "()Lmoxy/compiler/viewstate/entity/ViewInterfaceMethod;", "setSuperInterfaceClash", "(Lmoxy/compiler/viewstate/entity/ViewInterfaceMethod;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "toViewMethod", "Lmoxy/compiler/viewstate/entity/ViewStateMethod;", "defaultStrategy", "moxy-compiler"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final /* data */ class ViewInterfaceMethod {
    private final String arguments;

    @NotNull
    private final DeclaredType enclosingInterfaceElement;

    @NotNull
    private final ExecutableElement methodElement;
    private final String name;

    @NotNull
    private final List<ParameterSpec> parameters;
    private final DeclaredType rootInterfaceElement;

    @NotNull
    private final String signature;

    @Nullable
    private final StrategyWithTag strategy;

    @Nullable
    private ViewInterfaceMethod superInterfaceClash;

    public ViewInterfaceMethod(@NotNull DeclaredType rootInterfaceElement, @NotNull DeclaredType enclosingInterfaceElement, @NotNull ExecutableElement methodElement, @Nullable StrategyWithTag strategyWithTag) {
        Intrinsics.m32179h(rootInterfaceElement, "rootInterfaceElement");
        Intrinsics.m32179h(enclosingInterfaceElement, "enclosingInterfaceElement");
        Intrinsics.m32179h(methodElement, "methodElement");
        this.rootInterfaceElement = rootInterfaceElement;
        this.enclosingInterfaceElement = enclosingInterfaceElement;
        this.methodElement = methodElement;
        this.strategy = strategyWithTag;
        List<ParameterSpec> createParameters = ViewMethodParameters.INSTANCE.createParameters(enclosingInterfaceElement, methodElement);
        this.parameters = createParameters;
        String m31989B = CollectionsKt.m31989B(createParameters, null, null, null, 0, null, new Function1<ParameterSpec, CharSequence>() { // from class: moxy.compiler.viewstate.entity.ViewInterfaceMethod$arguments$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull ParameterSpec it) {
                Intrinsics.m32179h(it, "it");
                String typeName = it.type.toString();
                Intrinsics.m32178g(typeName, "it.type.toString()");
                return typeName;
            }
        }, 31, null);
        this.arguments = m31989B;
        String obj = methodElement.getSimpleName().toString();
        this.name = obj;
        this.signature = obj + '(' + m31989B + ')';
    }

    /* renamed from: component1, reason: from getter */
    private final DeclaredType getRootInterfaceElement() {
        return this.rootInterfaceElement;
    }

    public static /* synthetic */ ViewInterfaceMethod copy$default(ViewInterfaceMethod viewInterfaceMethod, DeclaredType declaredType, DeclaredType declaredType2, ExecutableElement executableElement, StrategyWithTag strategyWithTag, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            declaredType = viewInterfaceMethod.rootInterfaceElement;
        }
        if ((i2 & 2) != 0) {
            declaredType2 = viewInterfaceMethod.enclosingInterfaceElement;
        }
        if ((i2 & 4) != 0) {
            executableElement = viewInterfaceMethod.methodElement;
        }
        if ((i2 & 8) != 0) {
            strategyWithTag = viewInterfaceMethod.strategy;
        }
        return viewInterfaceMethod.copy(declaredType, declaredType2, executableElement, strategyWithTag);
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final DeclaredType getEnclosingInterfaceElement() {
        return this.enclosingInterfaceElement;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ExecutableElement getMethodElement() {
        return this.methodElement;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final StrategyWithTag getStrategy() {
        return this.strategy;
    }

    @NotNull
    public final ViewInterfaceMethod copy(@NotNull DeclaredType rootInterfaceElement, @NotNull DeclaredType enclosingInterfaceElement, @NotNull ExecutableElement methodElement, @Nullable StrategyWithTag strategy) {
        Intrinsics.m32179h(rootInterfaceElement, "rootInterfaceElement");
        Intrinsics.m32179h(enclosingInterfaceElement, "enclosingInterfaceElement");
        Intrinsics.m32179h(methodElement, "methodElement");
        return new ViewInterfaceMethod(rootInterfaceElement, enclosingInterfaceElement, methodElement, strategy);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || (!Intrinsics.m32174c(ViewInterfaceMethod.class, other.getClass()))) {
            return false;
        }
        ViewInterfaceMethod viewInterfaceMethod = (ViewInterfaceMethod) other;
        return Intrinsics.m32174c(this.name, viewInterfaceMethod.name) && ExtensionsKt.equalsByType(this.parameters, viewInterfaceMethod.parameters);
    }

    @NotNull
    public final DeclaredType getEnclosingInterfaceElement() {
        return this.enclosingInterfaceElement;
    }

    @NotNull
    public final ExecutableElement getMethodElement() {
        return this.methodElement;
    }

    @NotNull
    public final List<ParameterSpec> getParameters() {
        return this.parameters;
    }

    @NotNull
    public final String getSignature() {
        return this.signature;
    }

    @Nullable
    public final StrategyWithTag getStrategy() {
        return this.strategy;
    }

    @Nullable
    public final ViewInterfaceMethod getSuperInterfaceClash() {
        return this.superInterfaceClash;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() + 31;
        Iterator<ParameterSpec> it = this.parameters.iterator();
        while (it.hasNext()) {
            hashCode = (hashCode * 31) + it.next().type.hashCode();
        }
        return hashCode;
    }

    public final void setSuperInterfaceClash(@Nullable ViewInterfaceMethod viewInterfaceMethod) {
        this.superInterfaceClash = viewInterfaceMethod;
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ViewInterfaceMethod(rootInterfaceElement=");
        m24u.append(this.rootInterfaceElement);
        m24u.append(", enclosingInterfaceElement=");
        m24u.append(this.enclosingInterfaceElement);
        m24u.append(", methodElement=");
        m24u.append(this.methodElement);
        m24u.append(", strategy=");
        m24u.append(this.strategy);
        m24u.append(")");
        return m24u.toString();
    }

    @NotNull
    public final ViewStateMethod toViewMethod() {
        DeclaredType declaredType = this.rootInterfaceElement;
        ExecutableElement executableElement = this.methodElement;
        StrategyWithTag strategyWithTag = this.strategy;
        Intrinsics.m32176e(strategyWithTag);
        return new ViewStateMethod(declaredType, executableElement, strategyWithTag);
    }

    @NotNull
    public final ViewStateMethod toViewMethod(@NotNull StrategyWithTag defaultStrategy) {
        Intrinsics.m32179h(defaultStrategy, "defaultStrategy");
        return new ViewStateMethod(this.rootInterfaceElement, this.methodElement, defaultStrategy);
    }
}
