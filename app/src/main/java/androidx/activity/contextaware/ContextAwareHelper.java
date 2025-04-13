package androidx.activity.contextaware;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class ContextAwareHelper {

    /* renamed from: a */
    public final Set<OnContextAvailableListener> f237a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public volatile Context f238b;
}
