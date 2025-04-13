package com.google.android.exoplayer2.p009ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.p009ui.SubtitleView;
import com.google.android.exoplayer2.text.Cue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class CanvasSubtitleOutput extends View implements SubtitleView.Output {

    /* renamed from: b */
    public final List<SubtitlePainter> f14073b;

    /* renamed from: c */
    public List<Cue> f14074c;

    /* renamed from: d */
    public int f14075d;

    /* renamed from: e */
    public float f14076e;

    /* renamed from: f */
    public CaptionStyleCompat f14077f;

    /* renamed from: g */
    public float f14078g;

    public CanvasSubtitleOutput(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14073b = new ArrayList();
        this.f14074c = Collections.emptyList();
        this.f14075d = 0;
        this.f14076e = 0.0533f;
        this.f14077f = CaptionStyleCompat.f14079g;
        this.f14078g = 0.08f;
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.Output
    /* renamed from: a */
    public void mo7344a(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f2, int i2, float f3) {
        this.f14074c = list;
        this.f14077f = captionStyleCompat;
        this.f14076e = f2;
        this.f14075d = i2;
        this.f14078g = f3;
        while (this.f14073b.size() < list.size()) {
            this.f14073b.add(new SubtitlePainter(getContext()));
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x03e8, code lost:
    
        if (r3 < r6) goto L178;
     */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04a9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void dispatchDraw(android.graphics.Canvas r40) {
        /*
            Method dump skipped, instructions count: 1247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p009ui.CanvasSubtitleOutput.dispatchDraw(android.graphics.Canvas):void");
    }
}
