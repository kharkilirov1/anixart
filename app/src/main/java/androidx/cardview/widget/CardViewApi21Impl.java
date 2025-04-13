package androidx.cardview.widget;

import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes.dex */
class CardViewApi21Impl implements CardViewImpl {
    /* renamed from: a */
    public final RoundRectDrawable m1057a(CardViewDelegate cardViewDelegate) {
        return (RoundRectDrawable) cardViewDelegate.mo1053d();
    }

    /* renamed from: b */
    public float m1058b(CardViewDelegate cardViewDelegate) {
        return m1057a(cardViewDelegate).f1773e;
    }

    /* renamed from: c */
    public float m1059c(CardViewDelegate cardViewDelegate) {
        return m1057a(cardViewDelegate).f1769a;
    }

    /* renamed from: d */
    public void m1060d(CardViewDelegate cardViewDelegate, float f2) {
        RoundRectDrawable m1057a = m1057a(cardViewDelegate);
        boolean mo1052c = cardViewDelegate.mo1052c();
        boolean mo1051b = cardViewDelegate.mo1051b();
        if (f2 != m1057a.f1773e || m1057a.f1774f != mo1052c || m1057a.f1775g != mo1051b) {
            m1057a.f1773e = f2;
            m1057a.f1774f = mo1052c;
            m1057a.f1775g = mo1051b;
            m1057a.m1064c(null);
            m1057a.invalidateSelf();
        }
        m1061e(cardViewDelegate);
    }

    /* renamed from: e */
    public void m1061e(CardViewDelegate cardViewDelegate) {
        if (!cardViewDelegate.mo1052c()) {
            cardViewDelegate.mo1050a(0, 0, 0, 0);
            return;
        }
        float f2 = m1057a(cardViewDelegate).f1773e;
        float f3 = m1057a(cardViewDelegate).f1769a;
        int ceil = (int) Math.ceil(RoundRectDrawableWithShadow.m1065a(f2, f3, cardViewDelegate.mo1051b()));
        int ceil2 = (int) Math.ceil(RoundRectDrawableWithShadow.m1066b(f2, f3, cardViewDelegate.mo1051b()));
        cardViewDelegate.mo1050a(ceil, ceil2, ceil, ceil2);
    }
}
