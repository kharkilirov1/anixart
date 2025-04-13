package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class PagerAdapter {

    /* renamed from: a */
    public final DataSetObservable f6504a = new DataSetObservable();

    /* renamed from: b */
    public DataSetObserver f6505b;

    /* renamed from: a */
    public void mo3073a(@NonNull ViewGroup viewGroup, int i2, @NonNull Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* renamed from: b */
    public void mo3074b(@NonNull ViewGroup viewGroup) {
    }

    /* renamed from: c */
    public abstract int mo4336c();

    /* renamed from: d */
    public int mo4337d(@NonNull Object obj) {
        return -1;
    }

    @Nullable
    /* renamed from: e */
    public CharSequence mo4338e(int i2) {
        return null;
    }

    @NonNull
    /* renamed from: f */
    public Object mo3075f(@NonNull ViewGroup viewGroup, int i2) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    /* renamed from: g */
    public abstract boolean mo3076g(@NonNull View view, @NonNull Object obj);

    /* renamed from: h */
    public void mo3077h(@Nullable Parcelable parcelable, @Nullable ClassLoader classLoader) {
    }

    @Nullable
    /* renamed from: i */
    public Parcelable mo3078i() {
        return null;
    }

    /* renamed from: j */
    public void mo3079j(@NonNull ViewGroup viewGroup, int i2, @NonNull Object obj) {
    }

    /* renamed from: k */
    public void mo3080k(@NonNull ViewGroup viewGroup) {
    }
}
