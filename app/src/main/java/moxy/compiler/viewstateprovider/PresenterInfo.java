package moxy.compiler.viewstateprovider;

import com.squareup.javapoet.ClassName;
import javax.lang.model.element.TypeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PresenterInfo.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, m31884d2 = {"Lmoxy/compiler/viewstateprovider/PresenterInfo;", "", "element", "Ljavax/lang/model/element/TypeElement;", "viewStateName", "", "(Ljavax/lang/model/element/TypeElement;Ljava/lang/String;)V", "getElement", "()Ljavax/lang/model/element/TypeElement;", "name", "Lcom/squareup/javapoet/ClassName;", "getName", "()Lcom/squareup/javapoet/ClassName;", "getViewStateName", "moxy-compiler"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class PresenterInfo {

    @NotNull
    private final TypeElement element;

    @NotNull
    private final ClassName name;

    @NotNull
    private final ClassName viewStateName;

    public PresenterInfo(@NotNull TypeElement element, @NotNull String viewStateName) {
        Intrinsics.m32179h(element, "element");
        Intrinsics.m32179h(viewStateName, "viewStateName");
        this.element = element;
        ClassName className = ClassName.get(element);
        Intrinsics.m32178g(className, "ClassName.get(element)");
        this.name = className;
        ClassName bestGuess = ClassName.bestGuess(viewStateName);
        Intrinsics.m32178g(bestGuess, "ClassName.bestGuess(viewStateName)");
        this.viewStateName = bestGuess;
    }

    @NotNull
    public final TypeElement getElement() {
        return this.element;
    }

    @NotNull
    public final ClassName getName() {
        return this.name;
    }

    @NotNull
    public final ClassName getViewStateName() {
        return this.viewStateName;
    }
}
