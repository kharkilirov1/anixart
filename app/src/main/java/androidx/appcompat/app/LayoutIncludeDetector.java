package androidx.appcompat.app;

import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
class LayoutIncludeDetector {

    /* renamed from: a */
    @NonNull
    public final Deque<WeakReference<XmlPullParser>> f533a = new ArrayDeque();
}
