package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;

@RestrictTo
/* loaded from: classes.dex */
public class VectorEnabledTintResources extends ResourcesWrapper {

    /* renamed from: c */
    public static boolean f1676c = false;

    /* renamed from: b */
    public final WeakReference<Context> f1677b;

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public Drawable getDrawable(int i2) throws Resources.NotFoundException {
        Drawable m894l;
        Context context = this.f1677b.get();
        if (context == null) {
            return m896a(i2);
        }
        ResourceManagerInternal m883d = ResourceManagerInternal.m883d();
        synchronized (m883d) {
            Drawable m893k = m883d.m893k(context, i2);
            if (m893k == null) {
                m893k = m896a(i2);
            }
            m894l = m893k != null ? m883d.m894l(context, i2, false, m893k) : null;
        }
        return m894l;
    }
}
