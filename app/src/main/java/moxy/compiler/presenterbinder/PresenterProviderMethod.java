package moxy.compiler.presenterbinder;

import javax.lang.model.type.DeclaredType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PresenterProviderMethod.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, m31884d2 = {"Lmoxy/compiler/presenterbinder/PresenterProviderMethod;", "", "returnType", "Ljavax/lang/model/type/DeclaredType;", "methodName", "", "tag", "presenterId", "(Ljavax/lang/model/type/DeclaredType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMethodName", "()Ljava/lang/String;", "getPresenterId", "getReturnType", "()Ljavax/lang/model/type/DeclaredType;", "getTag", "moxy-compiler"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class PresenterProviderMethod {

    @NotNull
    private final String methodName;

    @Nullable
    private final String presenterId;

    @NotNull
    private final DeclaredType returnType;

    @Nullable
    private final String tag;

    public PresenterProviderMethod(@NotNull DeclaredType returnType, @NotNull String methodName, @Nullable String str, @Nullable String str2) {
        Intrinsics.m32179h(returnType, "returnType");
        Intrinsics.m32179h(methodName, "methodName");
        this.returnType = returnType;
        this.methodName = methodName;
        this.tag = str;
        this.presenterId = str2;
    }

    @NotNull
    public final String getMethodName() {
        return this.methodName;
    }

    @Nullable
    public final String getPresenterId() {
        return this.presenterId;
    }

    @NotNull
    public final DeclaredType getReturnType() {
        return this.returnType;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }
}
