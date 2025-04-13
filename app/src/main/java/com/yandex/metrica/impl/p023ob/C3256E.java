package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.common.CoreConstants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.yandex.metrica.impl.ob.E */
/* loaded from: classes2.dex */
public class C3256E implements InterfaceC3284F2 {

    /* renamed from: a */
    private final Set<Integer> f42749a = new HashSet();

    /* renamed from: b */
    private final Set<Integer> f42750b = new HashSet();

    /* renamed from: c */
    @NonNull
    private volatile a f42751c = a.UNKNOWN;

    /* renamed from: d */
    private final Set<b> f42752d = new CopyOnWriteArraySet();

    /* renamed from: com.yandex.metrica.impl.ob.E$a */
    public enum a {
        UNKNOWN(CoreConstants.Transport.UNKNOWN),
        BACKGROUND("background"),
        VISIBLE("visible");

        a(String str) {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.E$b */
    public interface b {
        /* renamed from: a */
        void mo17994a(@NonNull a aVar);
    }

    /* renamed from: d */
    private void m17986d() {
        a aVar = a.UNKNOWN;
        if (!this.f42749a.isEmpty()) {
            aVar = a.VISIBLE;
        } else if (!this.f42750b.isEmpty()) {
            aVar = a.BACKGROUND;
        }
        if (this.f42751c != aVar) {
            this.f42751c = aVar;
            Iterator<b> it = this.f42752d.iterator();
            while (it.hasNext()) {
                it.next().mo17994a(this.f42751c);
            }
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3284F2
    /* renamed from: a */
    public void mo17988a() {
        m17986d();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3284F2
    /* renamed from: b */
    public void mo17990b() {
        if (this.f42751c == a.VISIBLE) {
            this.f42751c = a.BACKGROUND;
        }
    }

    @NonNull
    /* renamed from: c */
    public a m17992c() {
        return this.f42751c;
    }

    @NonNull
    /* renamed from: a */
    public a m17987a(@Nullable b bVar) {
        this.f42752d.add(bVar);
        return this.f42751c;
    }

    /* renamed from: c */
    public void m17993c(int i2) {
        this.f42749a.add(Integer.valueOf(i2));
        this.f42750b.remove(Integer.valueOf(i2));
        m17986d();
    }

    /* renamed from: b */
    public void m17991b(int i2) {
        this.f42750b.add(Integer.valueOf(i2));
        this.f42749a.remove(Integer.valueOf(i2));
        m17986d();
    }

    /* renamed from: a */
    public void m17989a(int i2) {
        this.f42749a.remove(Integer.valueOf(i2));
        m17986d();
    }
}
