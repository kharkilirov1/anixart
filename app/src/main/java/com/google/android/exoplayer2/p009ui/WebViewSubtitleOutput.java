package com.google.android.exoplayer2.p009ui;

import android.content.Context;
import android.text.Layout;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.p009ui.SubtitleView;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.Output {

    /* renamed from: b */
    public final CanvasSubtitleOutput f14310b;

    /* renamed from: c */
    public final WebView f14311c;

    /* renamed from: d */
    public List<Cue> f14312d;

    /* renamed from: e */
    public CaptionStyleCompat f14313e;

    /* renamed from: f */
    public float f14314f;

    /* renamed from: g */
    public int f14315g;

    /* renamed from: h */
    public float f14316h;

    /* renamed from: com.google.android.exoplayer2.ui.WebViewSubtitleOutput$2 */
    public static /* synthetic */ class C11542 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14317a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f14317a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14317a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14317a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewSubtitleOutput(Context context) {
        super(context, null);
        this.f14312d = Collections.emptyList();
        this.f14313e = CaptionStyleCompat.f14079g;
        this.f14314f = 0.0533f;
        this.f14315g = 0;
        this.f14316h = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, null);
        this.f14310b = canvasSubtitleOutput;
        WebView webView = new WebView(context, null) { // from class: com.google.android.exoplayer2.ui.WebViewSubtitleOutput.1
            @Override // android.webkit.WebView, android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                super.onTouchEvent(motionEvent);
                return false;
            }

            @Override // android.view.View
            public boolean performClick() {
                super.performClick();
                return false;
            }
        };
        this.f14311c = webView;
        webView.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(webView);
    }

    /* renamed from: b */
    public static int m7417b(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? 0 : -100;
        }
        return -50;
    }

    /* renamed from: c */
    public static String m7418c(@Nullable Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i2 = C11542.f14317a[alignment.ordinal()];
        return i2 != 1 ? i2 != 2 ? "center" : "end" : "start";
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.Output
    /* renamed from: a */
    public void mo7344a(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f2, int i2, float f3) {
        this.f14313e = captionStyleCompat;
        this.f14314f = f2;
        this.f14315g = i2;
        this.f14316h = f3;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            Cue cue = list.get(i3);
            if (cue.f13440e != null) {
                arrayList.add(cue);
            } else {
                arrayList2.add(cue);
            }
        }
        if (!this.f14312d.isEmpty() || !arrayList2.isEmpty()) {
            this.f14312d = arrayList2;
            m7420e();
        }
        this.f14310b.mo7344a(arrayList, captionStyleCompat, f2, i2, f3);
        invalidate();
    }

    /* renamed from: d */
    public final String m7419d(int i2, float f2) {
        float m7414b = SubtitleViewUtils.m7414b(i2, f2, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return m7414b == -3.4028235E38f ? "unset" : Util.m7747p("%.2fpx", Float.valueOf(m7414b / getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x045b, code lost:
    
        if (((android.text.style.TypefaceSpan) r9).getFamily() != null) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x01b0, code lost:
    
        if (r5 != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x01b5, code lost:
    
        r20 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x01b7, code lost:
    
        r3 = 2;
        r21 = "top";
        r22 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x01b3, code lost:
    
        if (r5 != 0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0622  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m7420e() {
        /*
            Method dump skipped, instructions count: 1760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p009ui.WebViewSubtitleOutput.m7420e():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (!z || this.f14312d.isEmpty()) {
            return;
        }
        m7420e();
    }
}
