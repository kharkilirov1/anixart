package moxy.compiler.viewstate.entity;

import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeVariableName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeMirror;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import moxy.compiler.ExtensionsKt;
import moxy.compiler.viewstate.ViewMethodParameters;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: ViewStateMethod.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010'\u001a\u00020(H\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u001a\u0010 \u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010#¨\u0006)"}, m31884d2 = {"Lmoxy/compiler/viewstate/entity/ViewStateMethod;", "", "targetInterfaceElement", "Ljavax/lang/model/type/DeclaredType;", "element", "Ljavax/lang/model/element/ExecutableElement;", "strategy", "Lmoxy/compiler/viewstate/entity/StrategyWithTag;", "(Ljavax/lang/model/type/DeclaredType;Ljavax/lang/model/element/ExecutableElement;Lmoxy/compiler/viewstate/entity/StrategyWithTag;)V", "argumentsString", "", "getArgumentsString", "()Ljava/lang/String;", "commandClassName", "getCommandClassName", "getElement", "()Ljavax/lang/model/element/ExecutableElement;", "exceptions", "", "Lcom/squareup/javapoet/TypeName;", "getExceptions", "()Ljava/util/List;", "name", "getName", "parameters", "Lcom/squareup/javapoet/ParameterSpec;", "getParameters", "getStrategy", "()Lmoxy/compiler/viewstate/entity/StrategyWithTag;", "typeVariables", "Lcom/squareup/javapoet/TypeVariableName;", "getTypeVariables", "uniqueSuffix", "getUniqueSuffix", "setUniqueSuffix", "(Ljava/lang/String;)V", "equals", "", "other", "hashCode", "", "moxy-compiler"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ViewStateMethod {

    @NotNull
    private final String argumentsString;

    @NotNull
    private final ExecutableElement element;

    @NotNull
    private final List<TypeName> exceptions;

    @NotNull
    private final String name;

    @NotNull
    private final List<ParameterSpec> parameters;

    @NotNull
    private final StrategyWithTag strategy;

    @NotNull
    private final List<TypeVariableName> typeVariables;

    @NotNull
    private String uniqueSuffix;

    public ViewStateMethod(@NotNull DeclaredType targetInterfaceElement, @NotNull ExecutableElement element, @NotNull StrategyWithTag strategy) {
        Intrinsics.m32179h(targetInterfaceElement, "targetInterfaceElement");
        Intrinsics.m32179h(element, "element");
        Intrinsics.m32179h(strategy, "strategy");
        this.element = element;
        this.strategy = strategy;
        List parameters = element.getParameters();
        Intrinsics.m32178g(parameters, "element.parameters");
        this.argumentsString = CollectionsKt.m31989B(parameters, null, null, null, 0, null, new Function1<VariableElement, CharSequence>() { // from class: moxy.compiler.viewstate.entity.ViewStateMethod$argumentsString$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(VariableElement it) {
                Intrinsics.m32178g(it, "it");
                CharSequence simpleName = it.getSimpleName();
                Intrinsics.m32178g(simpleName, "it.simpleName");
                return simpleName;
            }
        }, 31, null);
        this.name = element.getSimpleName().toString();
        List thrownTypes = element.getThrownTypes();
        Intrinsics.m32178g(thrownTypes, "element.thrownTypes");
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(thrownTypes, 10));
        Iterator it = thrownTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(TypeName.get((TypeMirror) it.next()));
        }
        this.exceptions = arrayList;
        List typeParameters = this.element.getTypeParameters();
        Intrinsics.m32178g(typeParameters, "element.typeParameters");
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(typeParameters, 10));
        Iterator it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            arrayList2.add(TypeVariableName.get((TypeParameterElement) it2.next()));
        }
        this.typeVariables = arrayList2;
        this.parameters = ViewMethodParameters.INSTANCE.createParameters(targetInterfaceElement, this.element);
        this.uniqueSuffix = "";
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || (!Intrinsics.m32174c(ViewStateMethod.class, other.getClass()))) {
            return false;
        }
        ViewStateMethod viewStateMethod = (ViewStateMethod) other;
        return Intrinsics.m32174c(this.name, viewStateMethod.name) && ExtensionsKt.equalsByType(this.parameters, viewStateMethod.parameters);
    }

    @NotNull
    public final String getArgumentsString() {
        return this.argumentsString;
    }

    @NotNull
    public final String getCommandClassName() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringsKt.m33919q(this.name));
        return C0000a.m20q(sb, this.uniqueSuffix, "Command");
    }

    @NotNull
    public final ExecutableElement getElement() {
        return this.element;
    }

    @NotNull
    public final List<TypeName> getExceptions() {
        return this.exceptions;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<ParameterSpec> getParameters() {
        return this.parameters;
    }

    @NotNull
    public final StrategyWithTag getStrategy() {
        return this.strategy;
    }

    @NotNull
    public final List<TypeVariableName> getTypeVariables() {
        return this.typeVariables;
    }

    @NotNull
    public final String getUniqueSuffix() {
        return this.uniqueSuffix;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() + 31;
        Iterator<ParameterSpec> it = this.parameters.iterator();
        while (it.hasNext()) {
            hashCode = (hashCode * 31) + it.next().type.hashCode();
        }
        return hashCode;
    }

    public final void setUniqueSuffix(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.uniqueSuffix = str;
    }
}
