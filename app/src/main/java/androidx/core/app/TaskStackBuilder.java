package androidx.core.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class TaskStackBuilder implements Iterable<Intent> {

    /* renamed from: b */
    public final ArrayList<Intent> f3282b = new ArrayList<>();

    /* renamed from: c */
    public final Context f3283c;

    @RequiresApi
    public static class Api16Impl {
        @DoNotInline
        /* renamed from: a */
        public static PendingIntent m1662a(Context context, int i2, Intent[] intentArr, int i3, Bundle bundle) {
            return PendingIntent.getActivities(context, i2, intentArr, i3, bundle);
        }
    }

    public interface SupportParentable {
        @Nullable
        Intent getSupportParentActivityIntent();
    }

    public TaskStackBuilder(Context context) {
        this.f3283c = context;
    }

    @Override // java.lang.Iterable
    @NonNull
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f3282b.iterator();
    }
}
