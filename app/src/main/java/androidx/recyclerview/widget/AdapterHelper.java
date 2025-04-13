package androidx.recyclerview.widget;

import androidx.core.util.Pools;
import androidx.recyclerview.widget.OpReorderer;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class AdapterHelper implements OpReorderer.Callback {

    /* renamed from: d */
    public final Callback f5169d;

    /* renamed from: a */
    public Pools.Pool<UpdateOp> f5166a = new Pools.SimplePool(30);

    /* renamed from: b */
    public final ArrayList<UpdateOp> f5167b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<UpdateOp> f5168c = new ArrayList<>();

    /* renamed from: g */
    public int f5172g = 0;

    /* renamed from: e */
    public final boolean f5170e = false;

    /* renamed from: f */
    public final OpReorderer f5171f = new OpReorderer(this);

    public interface Callback {
        /* renamed from: a */
        void mo3480a(int i2, int i3);

        /* renamed from: b */
        void mo3481b(UpdateOp updateOp);

        /* renamed from: c */
        void mo3482c(int i2, int i3, Object obj);

        /* renamed from: d */
        void mo3483d(UpdateOp updateOp);

        /* renamed from: e */
        RecyclerView.ViewHolder mo3484e(int i2);

        /* renamed from: f */
        void mo3485f(int i2, int i3);

        /* renamed from: g */
        void mo3486g(int i2, int i3);

        /* renamed from: h */
        void mo3487h(int i2, int i3);
    }

    public static final class UpdateOp {

        /* renamed from: a */
        public int f5173a;

        /* renamed from: b */
        public int f5174b;

        /* renamed from: c */
        public Object f5175c;

        /* renamed from: d */
        public int f5176d;

        public UpdateOp(int i2, int i3, int i4, Object obj) {
            this.f5173a = i2;
            this.f5174b = i3;
            this.f5176d = i4;
            this.f5175c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateOp)) {
                return false;
            }
            UpdateOp updateOp = (UpdateOp) obj;
            int i2 = this.f5173a;
            if (i2 != updateOp.f5173a) {
                return false;
            }
            if (i2 == 8 && Math.abs(this.f5176d - this.f5174b) == 1 && this.f5176d == updateOp.f5174b && this.f5174b == updateOp.f5176d) {
                return true;
            }
            if (this.f5176d != updateOp.f5176d || this.f5174b != updateOp.f5174b) {
                return false;
            }
            Object obj2 = this.f5175c;
            if (obj2 != null) {
                if (!obj2.equals(updateOp.f5175c)) {
                    return false;
                }
            } else if (updateOp.f5175c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f5173a * 31) + this.f5174b) * 31) + this.f5176d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i2 = this.f5173a;
            sb.append(i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.f5174b);
            sb.append("c:");
            sb.append(this.f5176d);
            sb.append(",p:");
            sb.append(this.f5175c);
            sb.append("]");
            return sb.toString();
        }
    }

    public AdapterHelper(Callback callback) {
        this.f5169d = callback;
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    /* renamed from: a */
    public void mo3467a(UpdateOp updateOp) {
        if (this.f5170e) {
            return;
        }
        updateOp.f5175c = null;
        this.f5166a.mo2026a(updateOp);
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    /* renamed from: b */
    public UpdateOp mo3468b(int i2, int i3, int i4, Object obj) {
        UpdateOp mo2027b = this.f5166a.mo2027b();
        if (mo2027b == null) {
            return new UpdateOp(i2, i3, i4, obj);
        }
        mo2027b.f5173a = i2;
        mo2027b.f5174b = i3;
        mo2027b.f5176d = i4;
        mo2027b.f5175c = obj;
        return mo2027b;
    }

    /* renamed from: c */
    public final boolean m3469c(int i2) {
        int size = this.f5168c.size();
        for (int i3 = 0; i3 < size; i3++) {
            UpdateOp updateOp = this.f5168c.get(i3);
            int i4 = updateOp.f5173a;
            if (i4 == 8) {
                if (m3474h(updateOp.f5176d, i3 + 1) == i2) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = updateOp.f5174b;
                int i6 = updateOp.f5176d + i5;
                while (i5 < i6) {
                    if (m3474h(i5, i3 + 1) == i2) {
                        return true;
                    }
                    i5++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: d */
    public void m3470d() {
        int size = this.f5168c.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f5169d.mo3483d(this.f5168c.get(i2));
        }
        m3478l(this.f5168c);
        this.f5172g = 0;
    }

    /* renamed from: e */
    public void m3471e() {
        m3470d();
        int size = this.f5167b.size();
        for (int i2 = 0; i2 < size; i2++) {
            UpdateOp updateOp = this.f5167b.get(i2);
            int i3 = updateOp.f5173a;
            if (i3 == 1) {
                this.f5169d.mo3483d(updateOp);
                this.f5169d.mo3486g(updateOp.f5174b, updateOp.f5176d);
            } else if (i3 == 2) {
                this.f5169d.mo3483d(updateOp);
                this.f5169d.mo3487h(updateOp.f5174b, updateOp.f5176d);
            } else if (i3 == 4) {
                this.f5169d.mo3483d(updateOp);
                this.f5169d.mo3482c(updateOp.f5174b, updateOp.f5176d, updateOp.f5175c);
            } else if (i3 == 8) {
                this.f5169d.mo3483d(updateOp);
                this.f5169d.mo3480a(updateOp.f5174b, updateOp.f5176d);
            }
        }
        m3478l(this.f5167b);
        this.f5172g = 0;
    }

    /* renamed from: f */
    public final void m3472f(UpdateOp updateOp) {
        int i2;
        int i3 = updateOp.f5173a;
        if (i3 == 1 || i3 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m3479m = m3479m(updateOp.f5174b, i3);
        int i4 = updateOp.f5174b;
        int i5 = updateOp.f5173a;
        if (i5 == 2) {
            i2 = 0;
        } else {
            if (i5 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + updateOp);
            }
            i2 = 1;
        }
        int i6 = 1;
        for (int i7 = 1; i7 < updateOp.f5176d; i7++) {
            int m3479m2 = m3479m((i2 * i7) + updateOp.f5174b, updateOp.f5173a);
            int i8 = updateOp.f5173a;
            if (i8 == 2 ? m3479m2 == m3479m : i8 == 4 && m3479m2 == m3479m + 1) {
                i6++;
            } else {
                UpdateOp mo3468b = mo3468b(i8, m3479m, i6, updateOp.f5175c);
                m3473g(mo3468b, i4);
                if (!this.f5170e) {
                    mo3468b.f5175c = null;
                    this.f5166a.mo2026a(mo3468b);
                }
                if (updateOp.f5173a == 4) {
                    i4 += i6;
                }
                m3479m = m3479m2;
                i6 = 1;
            }
        }
        Object obj = updateOp.f5175c;
        if (!this.f5170e) {
            updateOp.f5175c = null;
            this.f5166a.mo2026a(updateOp);
        }
        if (i6 > 0) {
            UpdateOp mo3468b2 = mo3468b(updateOp.f5173a, m3479m, i6, obj);
            m3473g(mo3468b2, i4);
            if (this.f5170e) {
                return;
            }
            mo3468b2.f5175c = null;
            this.f5166a.mo2026a(mo3468b2);
        }
    }

    /* renamed from: g */
    public void m3473g(UpdateOp updateOp, int i2) {
        this.f5169d.mo3481b(updateOp);
        int i3 = updateOp.f5173a;
        if (i3 == 2) {
            this.f5169d.mo3487h(i2, updateOp.f5176d);
        } else {
            if (i3 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f5169d.mo3482c(i2, updateOp.f5176d, updateOp.f5175c);
        }
    }

    /* renamed from: h */
    public int m3474h(int i2, int i3) {
        int size = this.f5168c.size();
        while (i3 < size) {
            UpdateOp updateOp = this.f5168c.get(i3);
            int i4 = updateOp.f5173a;
            if (i4 == 8) {
                int i5 = updateOp.f5174b;
                if (i5 == i2) {
                    i2 = updateOp.f5176d;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (updateOp.f5176d <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = updateOp.f5174b;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = updateOp.f5176d;
                    if (i2 < i6 + i7) {
                        return -1;
                    }
                    i2 -= i7;
                } else if (i4 == 1) {
                    i2 += updateOp.f5176d;
                }
            }
            i3++;
        }
        return i2;
    }

    /* renamed from: i */
    public boolean m3475i() {
        return this.f5167b.size() > 0;
    }

    /* renamed from: j */
    public final void m3476j(UpdateOp updateOp) {
        this.f5168c.add(updateOp);
        int i2 = updateOp.f5173a;
        if (i2 == 1) {
            this.f5169d.mo3486g(updateOp.f5174b, updateOp.f5176d);
            return;
        }
        if (i2 == 2) {
            this.f5169d.mo3485f(updateOp.f5174b, updateOp.f5176d);
            return;
        }
        if (i2 == 4) {
            this.f5169d.mo3482c(updateOp.f5174b, updateOp.f5176d, updateOp.f5175c);
        } else {
            if (i2 == 8) {
                this.f5169d.mo3480a(updateOp.f5174b, updateOp.f5176d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + updateOp);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00cc A[SYNTHETIC] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m3477k() {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.AdapterHelper.m3477k():void");
    }

    /* renamed from: l */
    public void m3478l(List<UpdateOp> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            mo3467a(list.get(i2));
        }
        list.clear();
    }

    /* renamed from: m */
    public final int m3479m(int i2, int i3) {
        int i4;
        int i5;
        for (int size = this.f5168c.size() - 1; size >= 0; size--) {
            UpdateOp updateOp = this.f5168c.get(size);
            int i6 = updateOp.f5173a;
            if (i6 == 8) {
                int i7 = updateOp.f5174b;
                int i8 = updateOp.f5176d;
                if (i7 < i8) {
                    i5 = i7;
                    i4 = i8;
                } else {
                    i4 = i7;
                    i5 = i8;
                }
                if (i2 < i5 || i2 > i4) {
                    if (i2 < i7) {
                        if (i3 == 1) {
                            updateOp.f5174b = i7 + 1;
                            updateOp.f5176d = i8 + 1;
                        } else if (i3 == 2) {
                            updateOp.f5174b = i7 - 1;
                            updateOp.f5176d = i8 - 1;
                        }
                    }
                } else if (i5 == i7) {
                    if (i3 == 1) {
                        updateOp.f5176d = i8 + 1;
                    } else if (i3 == 2) {
                        updateOp.f5176d = i8 - 1;
                    }
                    i2++;
                } else {
                    if (i3 == 1) {
                        updateOp.f5174b = i7 + 1;
                    } else if (i3 == 2) {
                        updateOp.f5174b = i7 - 1;
                    }
                    i2--;
                }
            } else {
                int i9 = updateOp.f5174b;
                if (i9 <= i2) {
                    if (i6 == 1) {
                        i2 -= updateOp.f5176d;
                    } else if (i6 == 2) {
                        i2 += updateOp.f5176d;
                    }
                } else if (i3 == 1) {
                    updateOp.f5174b = i9 + 1;
                } else if (i3 == 2) {
                    updateOp.f5174b = i9 - 1;
                }
            }
        }
        for (int size2 = this.f5168c.size() - 1; size2 >= 0; size2--) {
            UpdateOp updateOp2 = this.f5168c.get(size2);
            if (updateOp2.f5173a == 8) {
                int i10 = updateOp2.f5176d;
                if (i10 == updateOp2.f5174b || i10 < 0) {
                    this.f5168c.remove(size2);
                    if (!this.f5170e) {
                        updateOp2.f5175c = null;
                        this.f5166a.mo2026a(updateOp2);
                    }
                }
            } else if (updateOp2.f5176d <= 0) {
                this.f5168c.remove(size2);
                if (!this.f5170e) {
                    updateOp2.f5175c = null;
                    this.f5166a.mo2026a(updateOp2);
                }
            }
        }
        return i2;
    }
}
