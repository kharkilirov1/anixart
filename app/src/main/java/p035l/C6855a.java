package p035l;

import com.yandex.div.core.C2814a;
import com.yandex.div.core.Disposable;
import com.yandex.div.internal.core.ExpressionSubscriber;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ExpressionSubscriber.kt */
/* renamed from: l.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6855a {
    /* renamed from: a */
    public static void m34405a(ExpressionSubscriber expressionSubscriber, @NotNull Disposable subscription) {
        Intrinsics.m32179h(subscription, "subscription");
        if (subscription != C2814a.f31000b) {
            expressionSubscriber.getSubscriptions().add(subscription);
        }
    }

    /* renamed from: b */
    public static void m34406b(ExpressionSubscriber expressionSubscriber) {
        Iterator<T> it = expressionSubscriber.getSubscriptions().iterator();
        while (it.hasNext()) {
            ((Disposable) it.next()).close();
        }
        expressionSubscriber.getSubscriptions().clear();
    }
}
