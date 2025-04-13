package androidx.recyclerview.widget;

import p000a.C0000a;

/* loaded from: classes.dex */
class LayoutState {

    /* renamed from: b */
    public int f5398b;

    /* renamed from: c */
    public int f5399c;

    /* renamed from: d */
    public int f5400d;

    /* renamed from: e */
    public int f5401e;

    /* renamed from: h */
    public boolean f5404h;

    /* renamed from: i */
    public boolean f5405i;

    /* renamed from: a */
    public boolean f5397a = true;

    /* renamed from: f */
    public int f5402f = 0;

    /* renamed from: g */
    public int f5403g = 0;

    public String toString() {
        StringBuilder m24u = C0000a.m24u("LayoutState{mAvailable=");
        m24u.append(this.f5398b);
        m24u.append(", mCurrentPosition=");
        m24u.append(this.f5399c);
        m24u.append(", mItemDirection=");
        m24u.append(this.f5400d);
        m24u.append(", mLayoutDirection=");
        m24u.append(this.f5401e);
        m24u.append(", mStartLine=");
        m24u.append(this.f5402f);
        m24u.append(", mEndLine=");
        return C0000a.m17n(m24u, this.f5403g, '}');
    }
}
