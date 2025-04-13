package moxy.compiler.viewstate.entity;

import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: MigrationMethod.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m31884d2 = {"Lmoxy/compiler/viewstate/entity/MigrationMethod;", "", "viewInterface", "Ljavax/lang/model/element/TypeElement;", "method", "Ljavax/lang/model/element/ExecutableElement;", "(Ljavax/lang/model/element/TypeElement;Ljavax/lang/model/element/ExecutableElement;)V", "getMethod", "()Ljavax/lang/model/element/ExecutableElement;", "getViewInterface", "()Ljavax/lang/model/element/TypeElement;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "moxy-compiler"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final /* data */ class MigrationMethod {

    @NotNull
    private final ExecutableElement method;

    @NotNull
    private final TypeElement viewInterface;

    public MigrationMethod(@NotNull TypeElement viewInterface, @NotNull ExecutableElement method) {
        Intrinsics.m32179h(viewInterface, "viewInterface");
        Intrinsics.m32179h(method, "method");
        this.viewInterface = viewInterface;
        this.method = method;
    }

    public static /* synthetic */ MigrationMethod copy$default(MigrationMethod migrationMethod, TypeElement typeElement, ExecutableElement executableElement, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            typeElement = migrationMethod.viewInterface;
        }
        if ((i2 & 2) != 0) {
            executableElement = migrationMethod.method;
        }
        return migrationMethod.copy(typeElement, executableElement);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TypeElement getViewInterface() {
        return this.viewInterface;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ExecutableElement getMethod() {
        return this.method;
    }

    @NotNull
    public final MigrationMethod copy(@NotNull TypeElement viewInterface, @NotNull ExecutableElement method) {
        Intrinsics.m32179h(viewInterface, "viewInterface");
        Intrinsics.m32179h(method, "method");
        return new MigrationMethod(viewInterface, method);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MigrationMethod)) {
            return false;
        }
        MigrationMethod migrationMethod = (MigrationMethod) other;
        return Intrinsics.m32174c(this.viewInterface, migrationMethod.viewInterface) && Intrinsics.m32174c(this.method, migrationMethod.method);
    }

    @NotNull
    public final ExecutableElement getMethod() {
        return this.method;
    }

    @NotNull
    public final TypeElement getViewInterface() {
        return this.viewInterface;
    }

    public int hashCode() {
        TypeElement typeElement = this.viewInterface;
        int hashCode = (typeElement != null ? typeElement.hashCode() : 0) * 31;
        ExecutableElement executableElement = this.method;
        return hashCode + (executableElement != null ? executableElement.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("MigrationMethod(viewInterface=");
        m24u.append(this.viewInterface);
        m24u.append(", method=");
        m24u.append(this.method);
        m24u.append(")");
        return m24u.toString();
    }
}
