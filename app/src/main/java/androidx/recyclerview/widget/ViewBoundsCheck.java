package androidx.recyclerview.widget;

import android.view.View;
import com.yandex.mobile.ads.C4632R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
class ViewBoundsCheck {

    /* renamed from: a */
    public final Callback f5707a;

    /* renamed from: b */
    public BoundFlags f5708b = new BoundFlags();

    public static class BoundFlags {

        /* renamed from: a */
        public int f5709a = 0;

        /* renamed from: b */
        public int f5710b;

        /* renamed from: c */
        public int f5711c;

        /* renamed from: d */
        public int f5712d;

        /* renamed from: e */
        public int f5713e;

        /* renamed from: a */
        public boolean m4015a() {
            int i2 = this.f5709a;
            if ((i2 & 7) != 0 && (i2 & (m4016b(this.f5712d, this.f5710b) << 0)) == 0) {
                return false;
            }
            int i3 = this.f5709a;
            if ((i3 & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != 0 && (i3 & (m4016b(this.f5712d, this.f5711c) << 4)) == 0) {
                return false;
            }
            int i4 = this.f5709a;
            if ((i4 & 1792) != 0 && (i4 & (m4016b(this.f5713e, this.f5710b) << 8)) == 0) {
                return false;
            }
            int i5 = this.f5709a;
            return (i5 & 28672) == 0 || (i5 & (m4016b(this.f5713e, this.f5711c) << 12)) != 0;
        }

        /* renamed from: b */
        public int m4016b(int i2, int i3) {
            if (i2 > i3) {
                return 1;
            }
            return i2 == i3 ? 2 : 4;
        }
    }

    public interface Callback {
        /* renamed from: a */
        View mo3905a(int i2);

        /* renamed from: b */
        int mo3906b(View view);

        /* renamed from: c */
        int mo3907c();

        /* renamed from: d */
        int mo3908d();

        /* renamed from: e */
        int mo3909e(View view);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewBounds {
    }

    public ViewBoundsCheck(Callback callback) {
        this.f5707a = callback;
    }

    /* renamed from: a */
    public View m4013a(int i2, int i3, int i4, int i5) {
        int mo3907c = this.f5707a.mo3907c();
        int mo3908d = this.f5707a.mo3908d();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            View mo3905a = this.f5707a.mo3905a(i2);
            int mo3906b = this.f5707a.mo3906b(mo3905a);
            int mo3909e = this.f5707a.mo3909e(mo3905a);
            BoundFlags boundFlags = this.f5708b;
            boundFlags.f5710b = mo3907c;
            boundFlags.f5711c = mo3908d;
            boundFlags.f5712d = mo3906b;
            boundFlags.f5713e = mo3909e;
            if (i4 != 0) {
                boundFlags.f5709a = 0;
                boundFlags.f5709a = i4 | 0;
                if (boundFlags.m4015a()) {
                    return mo3905a;
                }
            }
            if (i5 != 0) {
                BoundFlags boundFlags2 = this.f5708b;
                boundFlags2.f5709a = 0;
                boundFlags2.f5709a = i5 | 0;
                if (boundFlags2.m4015a()) {
                    view = mo3905a;
                }
            }
            i2 += i6;
        }
        return view;
    }

    /* renamed from: b */
    public boolean m4014b(View view, int i2) {
        BoundFlags boundFlags = this.f5708b;
        int mo3907c = this.f5707a.mo3907c();
        int mo3908d = this.f5707a.mo3908d();
        int mo3906b = this.f5707a.mo3906b(view);
        int mo3909e = this.f5707a.mo3909e(view);
        boundFlags.f5710b = mo3907c;
        boundFlags.f5711c = mo3908d;
        boundFlags.f5712d = mo3906b;
        boundFlags.f5713e = mo3909e;
        if (i2 == 0) {
            return false;
        }
        BoundFlags boundFlags2 = this.f5708b;
        boundFlags2.f5709a = 0;
        boundFlags2.f5709a = 0 | i2;
        return boundFlags2.m4015a();
    }
}
