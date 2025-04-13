package moxy.compiler;

import javax.lang.model.element.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface ElementProcessor<E extends Element, R> {
    @Nullable
    R process(@NotNull E e2);
}
