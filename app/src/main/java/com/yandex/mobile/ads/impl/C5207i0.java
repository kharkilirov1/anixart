package com.yandex.mobile.ads.impl;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.C4900c2;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.i0 */
/* loaded from: classes3.dex */
public final class C5207i0 implements InterfaceC5370l0, C4900c2.c {

    /* renamed from: a */
    @NonNull
    private final RelativeLayout f51165a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC5896v0 f51166b;

    /* renamed from: c */
    @NonNull
    private final Window f51167c;

    /* renamed from: d */
    @NonNull
    private final Context f51168d;

    /* renamed from: e */
    @NonNull
    private final C4900c2 f51169e;

    /* renamed from: f */
    @NonNull
    private final String f51170f;

    /* renamed from: g */
    @NonNull
    private final LinearLayout f51171g;

    /* renamed from: h */
    @NonNull
    private final TextView f51172h;

    /* renamed from: i */
    @NonNull
    private final ProgressBar f51173i;

    /* renamed from: j */
    @NonNull
    private final k91 f51174j;

    public C5207i0(@NonNull Context context, @NonNull RelativeLayout relativeLayout, @NonNull C4788a1 c4788a1, @NonNull Window window, @NonNull String str) throws mi1 {
        this.f51168d = context;
        this.f51165a = relativeLayout;
        this.f51166b = c4788a1;
        this.f51167c = window;
        this.f51170f = str;
        this.f51169e = new C4900c2(context);
        this.f51171g = C6105z4.m30052a(context);
        this.f51172h = C4793a5.m22378a(context);
        this.f51173i = C4793a5.m22379b(context);
        this.f51174j = new k91();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5370l0
    /* renamed from: e */
    public final boolean mo25418e() {
        boolean z;
        if (this.f51169e.canGoBack()) {
            C4900c2 c4900c2 = this.f51169e;
            if (c4900c2.canGoBack()) {
                c4900c2.goBack();
            }
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5370l0
    /* renamed from: f */
    public final void mo25419f() {
        this.f51167c.requestFeature(1);
        if (C5474n6.m26805a(16)) {
            this.f51167c.getDecorView().setSystemUiVisibility(256);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5370l0
    /* renamed from: g */
    public final void mo25420g() {
        this.f51165a.setBackgroundDrawable(C6056y4.f56665a);
        LinearLayout linearLayout = this.f51171g;
        Context context = this.f51168d;
        EnumC4841b5 enumC4841b5 = EnumC4841b5.f48756b;
        int i2 = tg1.f55120b;
        int m26789a = n11.m26789a(context, 1, enumC4841b5.m22720a(context) - 2);
        ImageView imageView = new ImageView(context);
        imageView.setImageBitmap(C5427m6.m26574a("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA3NpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNS1jMDIxIDc5LjE1NDkxMSwgMjAxMy8xMC8yOS0xMTo0NzoxNiAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDplYTU1MjZhNi03OTE2LTRmMTgtODYzMS0yNzhhZDExMmYzZTEiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6NjU5RTY2QUVFRkQ5MTFFMzhDMDlBNTRBQThBMUNENDAiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6NjU5RTY2QURFRkQ5MTFFMzhDMDlBNTRBQThBMUNENDAiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6OTI2NGYzMTUtN2UxOS00ZmMzLWEwMTMtMTk4Y2FmMzE3ODYyIiBzdFJlZjpkb2N1bWVudElEPSJ4bXAuZGlkOmVhNTUyNmE2LTc5MTYtNGYxOC04NjMxLTI3OGFkMTEyZjNlMSIvPiA8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"));
        imageView.setAdjustViewBounds(true);
        imageView.setPadding(m26789a, m26789a, m26789a, m26789a);
        int i3 = C6006x4.f56360a;
        ColorDrawable colorDrawable = new ColorDrawable(i3);
        ColorDrawable colorDrawable2 = new ColorDrawable(0);
        int[] iArr = {R.attr.state_pressed};
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(iArr, colorDrawable);
        stateListDrawable.addState(new int[0], colorDrawable2);
        imageView.setBackgroundDrawable(stateListDrawable);
        Context context2 = this.f51168d;
        int m26789a2 = n11.m26789a(context2, 1, enumC4841b5.m22720a(context2));
        ImageView imageView2 = new ImageView(context2);
        imageView2.setImageBitmap(C5427m6.m26574a("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2tpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNS1jMDIxIDc5LjE1NDkxMSwgMjAxMy8xMC8yOS0xMTo0NzoxNiAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDo1OGQxOWE2NS0yODhhLTQ2MjctODllMi01ZGQyMzkxZjc5OTYiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6NjU5RTY2QjJFRkQ5MTFFMzhDMDlBNTRBQThBMUNENDAiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6NjU5RTY2QjFFRkQ5MTFFMzhDMDlBNTRBQThBMUNENDAiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6QkM1NDk2MENFRkQ3MTFFMzhDMDlBNTRBQThBMUNENDAiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6QkM1NDk2MERFRkQ3MTFFMzhDMDlBNTRBQThBMUNENDAiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4i7sDRAAACLElEQVR42uTbPU4CQRTA8fHRkRgLQkMCsbCw4QqeSTkDhQVR46X0HJhQkFDoBfRNnImbDbCzs+9j5jnJI1F3i/8vrMAA4P7WFOcVZ+7srnlonMZfQCP+BWeJ82wUYR7alqF1GgFi/CwcODGIEOMn4edZRBjhzSPOTeuEMc4dzhvOl7H4uC5xbv09YINzOHKihXvCqXgXmjceYIuzMojQFe+bt/GfoDWEpPjmo4AlhOT4NoAFhF7xxwBqRugdfwqgRoSs+HMANSFkx3cB1IAwKD4FoGSEwfGpACUikMT3ASgJgSy+L0AJCKTxOQCaCOTxuQAaCCzxQwAkEdjihwJIILDGUwBwIrDHUwFwIIjEUwJQIojFUwNQIIjGcwAMQRCP5wLIQVCJ92vE+LT1E+fd/b6/MG79rfm+w5VWvF8XAi9eFjhPZwKdVjznJdDnclCLlwLoQlCLlwRIRRCNlwbw65vomCoBzj3UaewsiQKkxKsggHL8wSnvMYJy/Mopb7SCcvzWKW+0gnI896aKCkDuCxsVBCgkXg0BCopXQYDC4sURoMB4UQQoNF4MAQqOF0GAwuPZEaCCeFYEqCSeDQEqimdBAKL4Bye4jUWJAETxH05+kSBApfFkCFBxPAkCVB4/GAEMxA9CACPx2QhgKD4LAYzF90YYGYyPK+nzCR5gjXNtLD4V4QYCwM5gfNfl4JvXHmCPc99AsBR/CmEXmvfNg/7D1+cXrvX1+R8BBgCgYlliXOirewAAAABJRU5ErkJggg=="));
        imageView2.setAdjustViewBounds(true);
        imageView2.setPadding(m26789a2, m26789a2, m26789a2, m26789a2);
        ColorDrawable colorDrawable3 = new ColorDrawable(i3);
        ColorDrawable colorDrawable4 = new ColorDrawable(0);
        int[] iArr2 = {R.attr.state_pressed};
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        stateListDrawable2.addState(iArr2, colorDrawable3);
        stateListDrawable2.addState(new int[0], colorDrawable4);
        imageView2.setBackgroundDrawable(stateListDrawable2);
        imageView2.setTag(sg1.m28248a("browser_close_button"));
        imageView.setOnClickListener(new ViewOnClickListenerC5099g0(this));
        imageView2.setOnClickListener(new ViewOnClickListenerC5156h0(this));
        linearLayout.addView(this.f51172h, new LinearLayout.LayoutParams(0, -1, 1.0f));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(-2, -1));
        linearLayout.addView(imageView2, new LinearLayout.LayoutParams(-2, -1));
        RelativeLayout relativeLayout = this.f51165a;
        LinearLayout linearLayout2 = this.f51171g;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, n11.m26789a(this.f51168d, 1, EnumC4841b5.f48755a.m22720a(r2)));
        layoutParams.addRule(10);
        relativeLayout.addView(linearLayout2, layoutParams);
        Context context3 = this.f51168d;
        LinearLayout linearLayout3 = this.f51171g;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, n11.m26789a(context3, 1, 2.0f));
        layoutParams2.addRule(3, linearLayout3.getId());
        this.f51165a.addView(this.f51173i, layoutParams2);
        m25411a(8);
        RelativeLayout relativeLayout2 = this.f51165a;
        C4900c2 c4900c2 = this.f51169e;
        LinearLayout linearLayout4 = this.f51171g;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(3, linearLayout4.getId());
        relativeLayout2.addView(c4900c2, layoutParams3);
        this.f51169e.loadUrl(this.f51170f);
        ((C4788a1) this.f51166b).m22360a(6, null);
        n60.m26811d("Browser is being displayed", new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.C4900c2.c
    /* renamed from: h */
    public final void mo23009h() {
        m25411a(0);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5370l0
    public final void onAdClosed() {
        ((C4788a1) this.f51166b).m22360a(8, null);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5370l0
    /* renamed from: a */
    public final void mo25415a() {
        C4900c2 c4900c2 = this.f51169e;
        Objects.requireNonNull(c4900c2);
        int i2 = C5427m6.f52583b;
        try {
            WebView.class.getDeclaredMethod("onResume", new Class[0]).invoke(c4900c2, new Object[0]);
        } catch (Exception unused) {
        }
        n60.m26811d("WebView component <%s> was resumed", C4900c2.class.toString());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5370l0
    /* renamed from: b */
    public final void mo25416b() {
        C4900c2 c4900c2 = this.f51169e;
        Objects.requireNonNull(c4900c2);
        int i2 = C5427m6.f52583b;
        try {
            WebView.class.getDeclaredMethod("onPause", new Class[0]).invoke(c4900c2, new Object[0]);
        } catch (Exception unused) {
        }
        n60.m26811d("WebView component <%s> was paused", C4900c2.class.toString());
    }

    @Override // com.yandex.mobile.ads.impl.C4900c2.c
    /* renamed from: c */
    public final void mo23008c() {
        m25411a(8);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5370l0
    /* renamed from: d */
    public final void mo25417d() {
        this.f51169e.mo25136e();
    }

    @Override // com.yandex.mobile.ads.impl.C4900c2.c
    /* renamed from: a */
    public final void mo23007a(WebView webView, int i2) {
        int i3 = i2 * 100;
        this.f51173i.setProgress(i3);
        if (10000 > i3) {
            m25411a(0);
        } else {
            this.f51172h.setText(webView.getTitle());
            m25411a(8);
        }
    }

    /* renamed from: a */
    private void m25411a(int i2) {
        if (i2 == 0 && this.f51173i.getVisibility() != 0) {
            this.f51173i.bringToFront();
            this.f51165a.requestLayout();
            this.f51165a.invalidate();
        }
        this.f51173i.setVisibility(i2);
    }
}
