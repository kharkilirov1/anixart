package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;

/* compiled from: Menu.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"androidx/core/view/MenuKt$iterator$1", "", "Landroid/view/MenuItem;", "core-ktx_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class MenuKt$iterator$1 implements Iterator<MenuItem>, KMutableIterator {

    /* renamed from: b */
    public int f3625b;

    /* renamed from: c */
    public final /* synthetic */ Menu f3626c;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3625b < this.f3626c.size();
    }

    @Override // java.util.Iterator
    public MenuItem next() {
        Menu menu = this.f3626c;
        int i2 = this.f3625b;
        this.f3625b = i2 + 1;
        MenuItem item = menu.getItem(i2);
        if (item != null) {
            return item;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public void remove() {
        Menu menu = this.f3626c;
        int i2 = this.f3625b - 1;
        this.f3625b = i2;
        menu.removeItem(i2);
    }
}
