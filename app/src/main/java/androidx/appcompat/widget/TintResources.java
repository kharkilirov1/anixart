package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ResourceManagerInternal;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class TintResources extends ResourcesWrapper {

    /* renamed from: b */
    public final WeakReference<Context> f1580b;

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public Drawable getDrawable(int i2) throws Resources.NotFoundException {
        ResourceManagerInternal.ResourceManagerHooks resourceManagerHooks;
        Drawable m896a = m896a(i2);
        Context context = this.f1580b.get();
        if (m896a != null && context != null && (resourceManagerHooks = ResourceManagerInternal.m883d().f1408g) != null) {
            resourceManagerHooks.mo732a(context, i2, m896a);
        }
        return m896a;
    }
}
