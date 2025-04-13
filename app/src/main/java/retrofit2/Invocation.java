package retrofit2;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class Invocation {

    /* renamed from: a */
    public final Method f69431a;

    /* renamed from: b */
    public final List<?> f69432b;

    public Invocation(Method method, List<?> list) {
        this.f69431a = method;
        this.f69432b = Collections.unmodifiableList(list);
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f69431a.getDeclaringClass().getName(), this.f69431a.getName(), this.f69432b);
    }
}
