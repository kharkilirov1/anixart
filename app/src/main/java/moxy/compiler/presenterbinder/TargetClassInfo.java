package moxy.compiler.presenterbinder;

import com.squareup.javapoet.ClassName;
import java.util.List;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TargetClassInfo.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m31884d2 = {"Lmoxy/compiler/presenterbinder/TargetClassInfo;", "", "element", "Ljavax/lang/model/element/Element;", "name", "Lcom/squareup/javapoet/ClassName;", "fields", "", "Lmoxy/compiler/presenterbinder/TargetPresenterField;", "superPresenterBinder", "Ljavax/lang/model/element/TypeElement;", "(Ljavax/lang/model/element/Element;Lcom/squareup/javapoet/ClassName;Ljava/util/List;Ljavax/lang/model/element/TypeElement;)V", "getElement", "()Ljavax/lang/model/element/Element;", "getFields", "()Ljava/util/List;", "getName", "()Lcom/squareup/javapoet/ClassName;", "getSuperPresenterBinder", "()Ljavax/lang/model/element/TypeElement;", "moxy-compiler"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class TargetClassInfo {

    @NotNull
    private final Element element;

    @NotNull
    private final List<TargetPresenterField> fields;

    @NotNull
    private final ClassName name;

    @Nullable
    private final TypeElement superPresenterBinder;

    public TargetClassInfo(@NotNull Element element, @NotNull ClassName name, @NotNull List<TargetPresenterField> fields, @Nullable TypeElement typeElement) {
        Intrinsics.m32179h(element, "element");
        Intrinsics.m32179h(name, "name");
        Intrinsics.m32179h(fields, "fields");
        this.element = element;
        this.name = name;
        this.fields = fields;
        this.superPresenterBinder = typeElement;
    }

    @NotNull
    public final Element getElement() {
        return this.element;
    }

    @NotNull
    public final List<TargetPresenterField> getFields() {
        return this.fields;
    }

    @NotNull
    public final ClassName getName() {
        return this.name;
    }

    @Nullable
    public final TypeElement getSuperPresenterBinder() {
        return this.superPresenterBinder;
    }
}
