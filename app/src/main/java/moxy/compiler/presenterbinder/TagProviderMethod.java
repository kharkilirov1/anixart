package moxy.compiler.presenterbinder;

import javax.lang.model.type.TypeMirror;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TagProviderMethod.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, m31884d2 = {"Lmoxy/compiler/presenterbinder/TagProviderMethod;", "", "presenterClass", "Ljavax/lang/model/type/TypeMirror;", "methodName", "", "presenterId", "(Ljavax/lang/model/type/TypeMirror;Ljava/lang/String;Ljava/lang/String;)V", "getMethodName", "()Ljava/lang/String;", "getPresenterClass", "()Ljavax/lang/model/type/TypeMirror;", "getPresenterId", "moxy-compiler"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class TagProviderMethod {

    @NotNull
    private final String methodName;

    @NotNull
    private final TypeMirror presenterClass;

    @Nullable
    private final String presenterId;

    public TagProviderMethod(@NotNull TypeMirror presenterClass, @NotNull String methodName, @Nullable String str) {
        Intrinsics.m32179h(presenterClass, "presenterClass");
        Intrinsics.m32179h(methodName, "methodName");
        this.presenterClass = presenterClass;
        this.methodName = methodName;
        this.presenterId = str;
    }

    @NotNull
    public final String getMethodName() {
        return this.methodName;
    }

    @NotNull
    public final TypeMirror getPresenterClass() {
        return this.presenterClass;
    }

    @Nullable
    public final String getPresenterId() {
        return this.presenterId;
    }
}
