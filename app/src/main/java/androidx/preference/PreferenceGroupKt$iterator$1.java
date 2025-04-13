package androidx.preference;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

/* compiled from: PreferenceGroup.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"androidx/preference/PreferenceGroupKt$iterator$1", "", "Landroidx/preference/Preference;", "preference-ktx_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PreferenceGroupKt$iterator$1 implements Iterator<Preference>, KMutableIterator {

    /* renamed from: b */
    public int f5067b;

    /* renamed from: c */
    public final /* synthetic */ PreferenceGroup f5068c;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5067b < this.f5068c.m3427U();
    }

    @Override // java.util.Iterator
    public Preference next() {
        PreferenceGroup preferenceGroup = this.f5068c;
        int i2 = this.f5067b;
        this.f5067b = i2 + 1;
        Preference m3426T = preferenceGroup.m3426T(i2);
        Intrinsics.m32178g(m3426T, "getPreference(index++)");
        return m3426T;
    }

    @Override // java.util.Iterator
    public void remove() {
        PreferenceGroup preferenceGroup = this.f5068c;
        int i2 = this.f5067b - 1;
        this.f5067b = i2;
        preferenceGroup.m3428V(preferenceGroup.m3426T(i2));
    }
}
