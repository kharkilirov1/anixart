package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import java.util.Locale;

@RequiresApi
/* loaded from: classes.dex */
final class LocaleListPlatformWrapper implements LocaleListInterface {

    /* renamed from: a */
    public final LocaleList f3465a;

    public LocaleListPlatformWrapper(Object obj) {
        this.f3465a = (LocaleList) obj;
    }

    @Override // androidx.core.os.LocaleListInterface
    /* renamed from: a */
    public Object mo1961a() {
        return this.f3465a;
    }

    public boolean equals(Object obj) {
        return this.f3465a.equals(((LocaleListInterface) obj).mo1961a());
    }

    @Override // androidx.core.os.LocaleListInterface
    public Locale get(int i2) {
        return this.f3465a.get(i2);
    }

    public int hashCode() {
        return this.f3465a.hashCode();
    }

    public String toString() {
        return this.f3465a.toString();
    }
}
