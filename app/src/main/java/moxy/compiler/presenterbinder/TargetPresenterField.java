package moxy.compiler.presenterbinder;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import java.util.Objects;
import javax.lang.model.type.TypeMirror;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import moxy.MvpProcessor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TargetPresenterField.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bR\u0011\u0010\t\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m31884d2 = {"Lmoxy/compiler/presenterbinder/TargetPresenterField;", "", "type", "Ljavax/lang/model/type/TypeMirror;", "name", "", "tag", "presenterId", "(Ljavax/lang/model/type/TypeMirror;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "generatedClassName", "getGeneratedClassName", "()Ljava/lang/String;", "isParametrized", "", "getName", "getPresenterId", "presenterProviderMethodName", "getPresenterProviderMethodName", "setPresenterProviderMethodName", "(Ljava/lang/String;)V", "presenterTagProviderMethodName", "getPresenterTagProviderMethodName", "setPresenterTagProviderMethodName", "getTag", "getType", "()Ljavax/lang/model/type/TypeMirror;", "typeName", "Lcom/squareup/javapoet/TypeName;", "getTypeName", "()Lcom/squareup/javapoet/TypeName;", "moxy-compiler"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class TargetPresenterField {
    private final boolean isParametrized;

    @NotNull
    private final String name;

    @Nullable
    private final String presenterId;

    @Nullable
    private String presenterProviderMethodName;

    @Nullable
    private String presenterTagProviderMethodName;

    @Nullable
    private final String tag;

    @NotNull
    private final TypeMirror type;

    @NotNull
    private final TypeName typeName;

    public TargetPresenterField(@NotNull TypeMirror type, @NotNull String name, @Nullable String str, @Nullable String str2) {
        TypeName typeName;
        Intrinsics.m32179h(type, "type");
        Intrinsics.m32179h(name, "name");
        this.type = type;
        this.name = name;
        this.tag = str;
        this.presenterId = str2;
        boolean z = TypeName.get(type) instanceof ParameterizedTypeName;
        this.isParametrized = z;
        if (z) {
            ParameterizedTypeName parameterizedTypeName = TypeName.get(type);
            Objects.requireNonNull(parameterizedTypeName, "null cannot be cast to non-null type com.squareup.javapoet.ParameterizedTypeName");
            ClassName className = parameterizedTypeName.rawType;
            Intrinsics.m32178g(className, "(TypeName.get(type) as P…eterizedTypeName).rawType");
            typeName = (TypeName) className;
        } else {
            typeName = TypeName.get(type);
            Intrinsics.m32178g(typeName, "TypeName.get(type)");
        }
        this.typeName = typeName;
    }

    @NotNull
    public final String getGeneratedClassName() {
        return StringsKt.m33919q(this.name) + MvpProcessor.PRESENTER_BINDER_INNER_SUFFIX;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPresenterId() {
        return this.presenterId;
    }

    @Nullable
    public final String getPresenterProviderMethodName() {
        return this.presenterProviderMethodName;
    }

    @Nullable
    public final String getPresenterTagProviderMethodName() {
        return this.presenterTagProviderMethodName;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final TypeMirror getType() {
        return this.type;
    }

    @NotNull
    public final TypeName getTypeName() {
        return this.typeName;
    }

    public final void setPresenterProviderMethodName(@Nullable String str) {
        this.presenterProviderMethodName = str;
    }

    public final void setPresenterTagProviderMethodName(@Nullable String str) {
        this.presenterTagProviderMethodName = str;
    }
}
